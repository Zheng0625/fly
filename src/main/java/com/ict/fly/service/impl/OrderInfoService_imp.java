package com.ict.fly.service.impl;

import com.ict.fly.dao.*;
import com.ict.fly.domain.entity.*;
import com.ict.fly.domain.input.MoreOrderInput;
import com.ict.fly.domain.input.SearchSeatInput;
import com.ict.fly.domain.input.SeatTypeSel;
import com.ict.fly.domain.result.Result;
import com.ict.fly.service.OrderInfoService;
import org.junit.Test;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

@Service
public class OrderInfoService_imp implements OrderInfoService {

    @Resource
    private FAirplaneMapper fAirplaneMapper;
    @Resource
    private FOrderinfoMapper fOrderinfoMapper;
    @Resource
    private FSeattypeMapper fSeattypeMapper;
    @Resource
    private FPersonDemandMapper fPersonDemandMapper;
    @Resource
    private FUserinfoMapper fUserinfoMapper;

    private int planeId;
    private List<FSeattype> fs;
    private long count;
    private long yuanrenshu = 0;
    private ArrayList<FOrderinfo> folist = new ArrayList<>();
    private long orderCount;

    @Override
    public Result addOrder(Map<String, String> map) {
        Result result = new Result();
        String username = map.get("username");
        //查询用户名
        FUserinfo fUserinfo = fUserinfoMapper.findByUsername(username);
        String planeType = map.get("plane_type");
        FAirplane fA = fAirplaneMapper.findByName(planeType);  //根据plane_type查询飞机id
        count = fSeattypeMapper.findSeatCount(fA.getPlaneId());  //根据飞机id查询飞机总座位数
        orderCount = fOrderinfoMapper.findOrderCount(planeType);
        if (orderCount == count) {
            result.setStatus(-1);
            result.setMsg("该航班已无座位");
            return result;
        }
        FAirplane fAirplane = fAirplaneMapper.findByName(map.get("plane_type"));
        map.remove("plane_type");
        map.remove("username");
        planeId = fAirplane.getPlaneId();
        List<FSeattype> fSeattype = fSeattypeMapper.findByPlaneId(planeId);
        if (fSeattype.isEmpty()) {
            result.setStatus(-1);
            result.setMsg("该航班暂未设置座位");
            return result;
        }
        ArrayList<String> list = new ArrayList<>();
        Set<String> set = map.keySet();
        for (String in : set) {
            String str = map.get(in);
            list.add(str);
        }
        //默认用户需求都为1（不需要）
        Integer demandWomen = 1;
        Integer demandMen = 1;
        Integer demandNobaby = 1;
        Integer demandWindow = 1;
        Integer demandAisle = 1;
        Integer demandFront = 1;
        Integer demandExit = 1;
        Integer demandSpacious = 1;
        Integer demandGate = 1;
        Integer demandBaby = 1;
        for (String s : list) {
            switch (s) {
                case "靠窗":
                    demandWindow = 0;
                    break;
                case "靠过道":
                    demandAisle = 0;
                    break;
                case "登机口":
                    demandGate = 0;
                    break;
                case "婴儿挂载":
                    demandBaby = 0;
                    break;
                case "紧急出口":
                    demandExit = 0;
                    break;
                case "前排":
                    demandFront = 0;
                    break;
                case "腿部宽敞":
                    demandSpacious = 0;
                    break;
                case "四周无婴儿":
                    demandNobaby = 0;
                    break;
                case "四周有男性":
                    demandMen = 0;
                    break;
                case "四周有女性":
                    demandWomen = 0;
                    break;
            }
        }

        search(list);
        if (fs.size() != 0) {
            FOrderinfo fOrderinfo = new FOrderinfo();
            for (FSeattype f : fs) {
                fOrderinfo.setPlaneType(planeType);
                fOrderinfo.setSeatId(f.getSeatId());
            }
            FOrderinfo findfo = fOrderinfoMapper.selectOrder(fOrderinfo);
            if (findfo != null) {
                result.setStatus(-1);
                result.setMsg("订单信息已存在");
                result.setData(findfo);
            } else {
                fOrderinfo.setuName(username);
                fOrderinfoMapper.insert(fOrderinfo);
                //添加用户需求
                FPersonDemand fPersonDemand = new FPersonDemand();
                fPersonDemand.setUserinfoId(fUserinfo.getUserinfoId());
                fPersonDemand.setOrderId(fOrderinfo.getOrderId());
                fPersonDemand.setPlaneId(fA.getPlaneId());
                fPersonDemand.setDemandRenshu(1);
                fPersonDemand.setDemandWomen(demandWomen);
                fPersonDemand.setDemandMen(demandMen);
                fPersonDemand.setDemandNobaby(demandNobaby);
                fPersonDemand.setDemandWindow(demandWindow);
                fPersonDemand.setDemandAisle(demandAisle);
                fPersonDemand.setDemandFront(demandFront);
                fPersonDemand.setDemandExit(demandExit);
                fPersonDemand.setDemandSpacious(demandSpacious);
                fPersonDemand.setDemandGate(demandGate);
                fPersonDemand.setDemandBaby(demandBaby);
                fPersonDemandMapper.insert(fPersonDemand);
                result.setStatus(0);
                result.setMsg("订单新增成功");
                result.setData(fOrderinfo);
            }
        } else {
            //没有满足任一条件随机分配
            SearchSeat(planeType, username);
//            result.setData();
            result.setStatus(0);
            result.setMsg("座位分配成功，但并未找到满足您需求的座位");
        }
        return result;
    }

    public List<FSeattype> search(ArrayList<String> list) {
        Integer seatWindow = null;
        Integer seatAisle = null;
        Integer seatExit = null;
        Integer seatGate = null;
        Integer seatBaby = null;
        Integer seatFront = null;
        Integer seatSpacious = null;
        for (String s : list
        ) {
            switch (s) {
                case "靠窗":
                    seatWindow = 0;
                    break;
                case "靠过道":
                    seatAisle = 0;
                    break;
                case "登机口":
                    seatGate = 0;
                    break;
                case "婴儿挂载":
                    seatBaby = 0;
                    break;
                case "紧急出口":
                    seatExit = 0;
                    break;
                case "前排":
                    seatFront = 0;
                    break;
                case "腿部宽敞":
                    seatSpacious = 0;
                    break;
            }
        }
        FSeattype Seattype = new FSeattype();
        Seattype.setPlaneId(planeId);
        Seattype.setSeatWindow(seatWindow);
        Seattype.setSeatAisle(seatAisle);
        Seattype.setSeatExit(seatExit);
        Seattype.setSeatGate(seatGate);
        Seattype.setSeatBaby(seatBaby);
        Seattype.setSeatFront(seatFront);
        Seattype.setSeatSpacious(seatSpacious);
        fs = fSeattypeMapper.selectBySeat(Seattype);
        if (fs.size() == 0 && !(list.size() == 0)) {
            list.remove(list.size() - 1);
            return search(list);
        } else {
            return fs;
        }
    }

    @Override
    public Result addMoreOrder(MoreOrderInput moreOrderInput) {
        Result result = new Result();
        yuanrenshu = moreOrderInput.getRenshu();   //保存客户需要的座位数
        FAirplane fAirplane = fAirplaneMapper.findByName(moreOrderInput.getPlane_type());  //根据plane_type查询飞机id
        count = fSeattypeMapper.findSeatCount(fAirplane.getPlaneId());  //根据飞机id查询飞机总座位数
        orderCount = fOrderinfoMapper.findOrderCount(moreOrderInput.getPlane_type());
        if (orderCount + yuanrenshu > count) {
            result.setStatus(-1);
            result.setMsg("该航班暂无多余空座");
            return result;
        }
        MoreSeat moreSeat = new MoreSeat();
        moreSeat.setOne(count - moreOrderInput.getRenshu()); //limit 的 第一个数
        moreSeat.setTwo(moreOrderInput.getRenshu());//limit 的 第二个数
        //保存用户需求
        FPersonDemand fPersonDemand = new FPersonDemand();
        FUserinfo fUserinfo = fUserinfoMapper.findByUsername(moreOrderInput.getUsername());
        fPersonDemand.setDemandRenshu((int) yuanrenshu);
        fPersonDemand.setUserinfoId(fUserinfo.getUserinfoId());
        fPersonDemand.setPlaneId(fAirplane.getPlaneId());
        fPersonDemand.setDemandWomen(1); //多人选座默认为用户无其他需求
        fPersonDemand.setDemandMen(1);
        fPersonDemand.setDemandNobaby(1);
        fPersonDemand.setDemandWindow(1);
        fPersonDemand.setDemandAisle(1);
        fPersonDemand.setDemandFront(1);
        fPersonDemand.setDemandExit(1);
        fPersonDemand.setDemandSpacious(1);
        fPersonDemand.setDemandGate(1);
        fPersonDemand.setDemandBaby(1);
        fPersonDemandMapper.insert(fPersonDemand);
        MoreSeatSet(moreOrderInput, moreSeat, result);
        return result;

    }

    @Transactional
    Result MoreSeatSet(MoreOrderInput moreOrderInput, MoreSeat moreSeat, Result result) {
        int index = 0;
        ArrayList<FSeattype> seattypeArrayList = null;
        for (int i = 0; i < count - moreSeat.getTwo(); i++) {
            moreSeat.setOne((int) i);  //循环过后，limit第一个数跟随 i 也 +1
            seattypeArrayList = fSeattypeMapper.findMoreSeat(moreSeat);   //limit限制查询
            xh(seattypeArrayList, index, moreOrderInput, result);//调用方法，判断当前数据是否全为null
            if (i == count - moreSeat.getTwo() - 1 && result.getData() == null) { //如果循环到最后一次还未满足条件 则将limit的第二个数减一
                if (moreSeat.getTwo() > 2) {    //限制limit的第二个数永远大于等于1
                    moreSeat.setTwo(moreSeat.getTwo() - 1);
                    MoreSeatSet(moreOrderInput, moreSeat, result);  //递归
                }
            }
            if (i == count - moreSeat.getTwo() - 1 && result.getData() != null && yuanrenshu != moreSeat.getTwo()) { //判断当前连续分座数量是否等于客户需求
                for (int s = 0; s < yuanrenshu - moreSeat.getTwo(); s++) {    //将为连续分座的人进行随机分座
                    SearchSeat(moreOrderInput.getPlane_type(), moreOrderInput.getUsername());
                    if (folist.size() == yuanrenshu - 1) {
                        break;

                    }
                }
            }
            if (result.getData() != null && yuanrenshu == moreSeat.getTwo()) {
                break;
            }
        }
        result.setStatus(0);
        result.setMsg("");
        return result;

    }

    //存入数据库
    void bl(ArrayList<FSeattype> seattypeArrayList, MoreOrderInput moreOrderInput, Result result) {
        for (int x = 0; x < seattypeArrayList.size(); x++) {
            FOrderinfo fO = new FOrderinfo();
            fO.setSeatId(seattypeArrayList.get(x).getSeatId());
            fO.setuName(moreOrderInput.getUsername());
            fO.setPlaneType(moreOrderInput.getPlane_type());
            fOrderinfoMapper.insert(fO);
            folist.add(fO);
            result.setData(folist);
        }
    }


    //判断当前数据是否全为null
    void xh(ArrayList<FSeattype> seattypeArrayList, Integer index, MoreOrderInput moreOrderInput, Result result) {
        for (int j = 0; j < seattypeArrayList.size(); j++) {
            FOrderinfo fOrderinfo = fOrderinfoMapper.findBySeatId(seattypeArrayList.get(j).getSeatId());
            if (fOrderinfo == null) {
                index++;
                if (index == seattypeArrayList.size() - 1) {  //如果空的数量满足需求人数，则直接写入
                    bl(seattypeArrayList, moreOrderInput, result);  //存入数据库
                }
            } else {
                break;
            }
        }

    }

    //单独添加一条数据
    @Transactional
    void SearchSeat(String plane_type, String name) {
        FAirplane fAirplane = fAirplaneMapper.findByName(plane_type);
        List<FSeattype> fSeattypeList = fSeattypeMapper.findByPlaneId(fAirplane.getPlaneId());
        List<FOrderinfo> fOrderinfos = fOrderinfoMapper.findByPlaneType(plane_type);
        List<Integer> seatType_seatId = new ArrayList<>();
        List<Integer> orderInfo_seatId = new ArrayList<>();
        for (int i = 0; i < fSeattypeList.size(); i++) {    //获取plane_type飞机里seatType所有的座位id
            seatType_seatId.add(fSeattypeList.get(i).getSeatId());
        }
        for (int i = 0; i < fOrderinfos.size(); i++) {  //获取orderInfo中所有的plane_type飞机座位id
            orderInfo_seatId.add(fOrderinfos.get(i).getSeatId());
        }
        Collection exists = new ArrayList<Integer>(seatType_seatId);
        exists.removeAll(orderInfo_seatId);   //删除orderInfo已存在的订单座位号
        FOrderinfo fO = new FOrderinfo();
        fO.setSeatId(Integer.valueOf(((ArrayList) exists).get(0).toString()));
        fO.setuName(name);
        fO.setPlaneType(plane_type);
        fOrderinfoMapper.insert(fO);
        folist.add(fO);
    }


}
