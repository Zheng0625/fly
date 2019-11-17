package com.ict.fly.service.impl;

import com.ict.fly.dao.*;
import com.ict.fly.domain.entity.*;
import com.ict.fly.domain.input.MoreOrderInput;
import com.ict.fly.domain.input.SearchSeatInput;
import com.ict.fly.domain.input.SeatTypeSel;
import com.ict.fly.domain.input.ZjFenpeiEntity;
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

    //单人乘坐
    @Override
    public Result addOrder(Map<String, String> map) {
        Result result = new Result();
        String username = map.get("username");
        //查询用户名
        FUserinfo fUserinfo = fUserinfoMapper.findByUsername(username);
        String planeName = map.get("plane_name");
        FAirplane fA = fAirplaneMapper.findByName(planeName);  //根据plane_type查询飞机id
        count = fSeattypeMapper.findSeatCount(fA.getPlaneId());  //根据飞机id查询飞机总座位数
        orderCount = fOrderinfoMapper.findOrderCount(planeName);
        if (orderCount == count) {   //判断当前航班是否有空座
            result.setStatus(-1);
            result.setMsg("该航班已无座位");
            return result;
        }
        FAirplane fAirplane = fAirplaneMapper.findByName(map.get("plane_name"));  //获取当前航班所有信息保存在fAirplane中
        map.remove("plane_name");
        map.remove("username");   //移除map中非用户需求项
        planeId = fAirplane.getPlaneId();
        List<FSeattype> fSeattype = fSeattypeMapper.findByPlaneId(planeId);  //获取当前航班所有座位信息
        if (fSeattype.isEmpty()) {  //判断当前航班是否存在座位
            result.setStatus(-1);
            result.setMsg("该航班暂未设置座位");
            return result;
        }
        ArrayList<String> list = new ArrayList<>();
        Set<String> set = map.keySet();
        for (String in : set) {
            String str = map.get(in);
            list.add(str);   //将用户所有需求存入list
        }
        String join_demand = String.join(",", list);
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
        for (String s : list) {  //用户需求和数据库字段转换
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
        if (list.size() == 0) {
            if (folist.size() != 0) {
                folist.clear();
            }
            SearchSeat(planeName, username);
//            result.setData();
            result.setStatus(0);
            result.setMsg("座位分配成功");
            result.setData(folist);
            //添加用户需求
            FPersonDemand fPersonDemand = new FPersonDemand();
            fPersonDemand.setUserinfoId(fUserinfo.getUserinfoId());
            fPersonDemand.setOrderId(folist.get(0).getOrderId());
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
            fPersonDemand.setDemandAll(join_demand);
            fPersonDemandMapper.insert(fPersonDemand);
            result.setMsg("订单新增成功");
            result.setStatus(0);
            result.setData(folist);
            return result;
        } else {
            search(list);
        }
        FOrderinfo fOrderinfo = new FOrderinfo();
        if (fs.size() != 0) {  //根据用户需求查询到的所有满足条件的座位数是否存在
            for (int x = 0; x < fs.size(); x++) {
                if (folist.size() != 0) {
                    folist.clear();
                }
                fOrderinfo.setPlaneName(planeName);
                fOrderinfo.setSeatId(fs.get(x).getSeatId());
                FOrderinfo findfo = fOrderinfoMapper.selectOrder(fOrderinfo);
                if (findfo == null) {
                    fOrderinfo.setuName(username);
                    fOrderinfoMapper.insert(fOrderinfo);
                    folist.add(fOrderinfo);
                    result.setStatus(0);
                    result.setMsg("订单新增成功");
                    result.setData(folist);
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
                    fPersonDemand.setDemandAll(join_demand);
                    fPersonDemandMapper.insert(fPersonDemand);
                    return result;
                }
                if (x == fs.size() - 1) {
                    if (folist.size() != 0) {
                        folist.clear();
                    }
                    SearchSeat(planeName, username);
                    //添加用户需求
                    FPersonDemand fPersonDemand = new FPersonDemand();
                    fPersonDemand.setUserinfoId(fUserinfo.getUserinfoId());
                    fPersonDemand.setOrderId(folist.get(0).getOrderId());
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
                    fPersonDemand.setDemandAll(join_demand);
                    fPersonDemandMapper.insert(fPersonDemand);
                    result.setStatus(0);
                    result.setMsg("座位分配成功，但并未找到满足您需求的座位");
                    result.setData(folist);
                }
            }
        } else {
            //没有满足任一条件随机分配
            if (folist.size() != 0) {
                folist.clear();
            }
            SearchSeat(planeName, username);
            //添加用户需求
            FPersonDemand fPersonDemand = new FPersonDemand();
            fPersonDemand.setUserinfoId(fUserinfo.getUserinfoId());
            fPersonDemand.setOrderId(folist.get(0).getOrderId());
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
            fPersonDemand.setDemandAll(join_demand);
            fPersonDemandMapper.insert(fPersonDemand);
            result.setStatus(0);
            result.setMsg("座位分配成功，但并未找到满足您需求的座位");
            result.setData(folist);
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
        if (fs.size() == 0 && !(list.size() == 0)) {  //判断根据用户需求查找的座位是否存在，若不存在则移除list最后一个再次递归
            list.remove(list.size() - 1);
            return search(list);
        } else {
            return fs;
        }
    }

    //多人分配
    @Override
    public Result addMoreOrder(MoreOrderInput moreOrderInput) {
        if (folist != null) {
            folist.clear();
        }
        Result result = new Result();
        yuanrenshu = moreOrderInput.getRenshu();   //保存客户需要的座位数
        FAirplane fAirplane = fAirplaneMapper.findByName(moreOrderInput.getPlane_name());  //根据plane_type查询飞机id
        count = fSeattypeMapper.findSeatCount(fAirplane.getPlaneId());  //根据飞机id查询飞机总座位数
        orderCount = fOrderinfoMapper.findOrderCount(moreOrderInput.getPlane_name());
        if (orderCount + yuanrenshu > count) {
            result.setStatus(-1);
            result.setMsg("该航班暂无多余空座");
            return result;
        }
        MoreSeat moreSeat = new MoreSeat();
        moreSeat.setOne(count - moreOrderInput.getRenshu()); //limit 的 第一个数
        moreSeat.setTwo(moreOrderInput.getRenshu());//limit 的 第二个数
        moreSeat.setPlaneId(fAirplane.getPlaneId());
        //保存用户需求
        FPersonDemand fPersonDemand = new FPersonDemand();
        FUserinfo fUserinfo = fUserinfoMapper.findByUsername(moreOrderInput.getUsername());
        fPersonDemand.setDemandRenshu((int) yuanrenshu);
        fPersonDemand.setUserinfoId(fUserinfo.getUserinfoId());
        fPersonDemand.setOrderId(0);//多人分座为多个orderId，所有设置为 0
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
        result = MoreSeatSet(moreOrderInput, moreSeat, result, folist);
        fPersonDemandMapper.insert(fPersonDemand);
        return result;
    }

    @Transactional
    Result MoreSeatSet(MoreOrderInput moreOrderInput, MoreSeat moreSeat, Result result, ArrayList<FOrderinfo> folist) {
        int index = 0;
        ArrayList<FSeattype> seattypeArrayList = null;
        for (int i = 0; i <= count - moreSeat.getTwo(); i++) {
            moreSeat.setOne((int) i);  //循环过后，limit第一个数跟随 i 也 +1
            seattypeArrayList = fSeattypeMapper.findMoreSeat(moreSeat);   //limit限制查询
            xh(seattypeArrayList, index, moreOrderInput, result);//调用方法，判断当前数据是否全为null
            if (i == count - moreSeat.getTwo() && result.getData() == null) { //如果循环到最后一次还未满足条件 则将limit的第二个数减一
                if (moreSeat.getTwo() > 2) {    //限制limit的第二个数永远大于等于1
                    moreSeat.setTwo(moreSeat.getTwo() - 1);
                    MoreSeatSet(moreOrderInput, moreSeat, result, folist);  //递归
                }
            }
            if (i == count - moreSeat.getTwo() && result.getData() != null && yuanrenshu != moreSeat.getTwo()) { //判断当前连续分座数量是否等于客户需求
                for (int s = 0; s < yuanrenshu - moreSeat.getTwo(); s++) {    //将为连续分座的人进行随机分座
                    SearchSeat(moreOrderInput.getPlane_name(), moreOrderInput.getUsername());
                }
            }
            if (folist.size() == yuanrenshu) {
                break;
            }
        }
        result.setStatus(0);
        result.setMsg("多人分座已完成");
        result.setData(folist);
        return result;

    }

    //存入数据库
    void bl(ArrayList<FSeattype> seattypeArrayList, MoreOrderInput moreOrderInput, Result result, ArrayList<FOrderinfo> folist) {
        for (int x = 0; x < seattypeArrayList.size(); x++) {
            FOrderinfo fO = new FOrderinfo();
            fO.setSeatId(seattypeArrayList.get(x).getSeatId());
            fO.setuName(moreOrderInput.getUsername());
            fO.setPlaneName(moreOrderInput.getPlane_name());
            fOrderinfoMapper.insert(fO);
            folist.add(fO);
            result.setData(folist);
        }
    }

    //判断当前查询数据是否全为null
    void xh(ArrayList<FSeattype> seattypeArrayList, Integer index, MoreOrderInput moreOrderInput, Result result) {
        for (int j = 0; j < seattypeArrayList.size(); j++) {
            FOrderinfo fOrderinfo = fOrderinfoMapper.findBySeatId(seattypeArrayList.get(j).getSeatId());
            if (fOrderinfo == null) {
                index++;
                if (index == seattypeArrayList.size()) {  //如果空的数量满足需求人数，则直接写入
                    bl(seattypeArrayList, moreOrderInput, result, folist);  //存入数据库
                }
            } else {
                break;
            }
        }

    }

    //单独添加一条数据
    @Transactional
    void SearchSeat(String plane_name, String name) {
        FAirplane fAirplane = fAirplaneMapper.findByName(plane_name);
        List<FSeattype> fSeattypeList = fSeattypeMapper.findByPlaneId(fAirplane.getPlaneId());
        List<FOrderinfo> fOrderinfos = fOrderinfoMapper.findByPlaneName(plane_name);
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
        if (exists != null && exists.size() > 0) {
            fO.setSeatId(Integer.valueOf(((ArrayList) exists).get(0).toString()));
            fO.setuName(name);
            fO.setPlaneName(plane_name);
            fOrderinfoMapper.insert(fO);
            folist.add(fO);
        }
    }

    //整机分配
    @Override
    @Transactional
    public Result zjFenpei(ZjFenpeiEntity zjFenpeiEntity) {
        Result result = new Result();
        int firstPersonNum = 0;
        //查询第一架飞机的订单数，单人+多人  demand_renshu 之和
        FAirplane fAirplane_1 = fAirplaneMapper.findByName(zjFenpeiEntity.getPlaneName_1()); //查询第一架飞机的信息
        FAirplane fAirplane_2 = fAirplaneMapper.findByName(zjFenpeiEntity.getPlaneName_2()); //查询第二架飞机的信息
        planeId = fAirplane_2.getPlaneId();
        List<FSeattype> fSeattype = fSeattypeMapper.findByPlaneId(fAirplane_2.getPlaneId());
        List<FPersonDemand> fPersonDemandList = fPersonDemandMapper.selPersonDemand(fAirplane_1.getPlaneId()); //查询第一架飞机的所有用户需求
        for (FPersonDemand f : fPersonDemandList) {       //计算第一架飞机的总乘机人数 firstPersonNum
            firstPersonNum += f.getDemandRenshu();
        }
        //查询第二架飞机的座位数
        int secSeatNum = fSeattypeMapper.findSeatCount(fAirplane_2.getPlaneId());
        if (secSeatNum == 0) {
            result.setStatus(-1);
            result.setMsg("当前飞机暂未设置座位，无法满足换机条件");
            return result;
        }
        //查询第二架飞机的订单数是否为0
        int secOrderNum = (int) fOrderinfoMapper.findOrderCount(zjFenpeiEntity.getPlaneName_2());
        if (secOrderNum > 0) {
            result.setStatus(-1);
            result.setMsg("当前飞机已存在订单信息，无法满足换机条件");
            return result;
        }
        //判断第二架飞机能否容下第一架飞机的所有乘客
        if (secSeatNum != 0 && secSeatNum >= firstPersonNum) {
            List<FPersonDemand> fPersonDemandOne = null;
            List<FPersonDemand> fPersonDemandMore = null;
            //遍历第一架飞机所有用户需求
            for (FPersonDemand f : fPersonDemandList) {
                String username = fUserinfoMapper.selectByPrimaryKey(f.getUserinfoId()).getuUsername();
                //多人乘坐
                if (f.getDemandRenshu() > 1) {
                    MoreOrderInput moreOrderInput = new MoreOrderInput();
                    moreOrderInput.setRenshu(Long.valueOf(f.getDemandRenshu()));
                    moreOrderInput.setUsername(username);
                    moreOrderInput.setPlane_name(fAirplane_2.getPlaneName());
                    addMoreOrder(moreOrderInput);

                }
                //单人乘坐，用户未指定需求，随机分配
                if (f.getDemandRenshu() == 1 && ("").equals(f.getDemandAll())) {
                    if (folist.size() != 0) {
                        folist.clear();
                    }
                    SearchSeat(fAirplane_2.getPlaneName(), username);
                    //更改用户需求表信息
                    FPersonDemand fPersonDemand = new FPersonDemand();
                    fPersonDemand.setDemandId(f.getDemandId());
                    fPersonDemand.setPlaneId(fAirplane_2.getPlaneId());
                    fPersonDemand.setOrderId(folist.get(0).getOrderId());
                    fPersonDemandMapper.updateByPrimaryKeySelective(fPersonDemand);
                }
                //单人乘坐，用户存在需求
                if (f.getDemandRenshu() == 1 && !("").equals(f.getDemandAll())) {
                    System.out.println(f.getDemandRenshu());
                    System.out.println(f.getDemandAll());
                    List<String> list = new ArrayList<>(); //存放用户需求
                    String str[] = f.getDemandAll().split(",");  //读取用户所有需求，保存到string数组
                    list = Arrays.asList(str);   //转 list数组
                    ArrayList<String> arrayList = new ArrayList<String>(list);
                    search(arrayList);
                    if (fs.size() != 0) {  //根据用户需求查询到的所有满足条件的座位数是否存在
                        for (int x = 0; x < fs.size(); x++) {
                            if (folist.size() != 0) {
                                folist.clear();
                            }
                            FOrderinfo fOrderinfo = new FOrderinfo();
                            fOrderinfo.setPlaneName(zjFenpeiEntity.getPlaneName_2());
                            fOrderinfo.setSeatId(fs.get(x).getSeatId());
                            FOrderinfo findfo = fOrderinfoMapper.selectOrder(fOrderinfo);
                            if (findfo == null) {
                                fOrderinfo.setuName(username);
                                fOrderinfoMapper.insert(fOrderinfo);
                                folist.add(fOrderinfo);
                                //更改用户需求表信息
                                FPersonDemand fPersonDemand = new FPersonDemand();
                                fPersonDemand.setDemandId(f.getDemandId());
                                fPersonDemand.setPlaneId(fAirplane_2.getPlaneId());
                                fPersonDemand.setOrderId(fOrderinfo.getOrderId());
                                fPersonDemandMapper.updateByPrimaryKeySelective(fPersonDemand);
                                break;
                            }
                            if (x == fs.size() - 1) {
                                if (folist.size() != 0) {
                                    folist.clear();
                                }
                                SearchSeat(fAirplane_2.getPlaneName(), username);
                                //更改用户需求表信息
                                FPersonDemand fPersonDemand = new FPersonDemand();
                                fPersonDemand.setDemandId(f.getDemandId());
                                fPersonDemand.setPlaneId(fAirplane_2.getPlaneId());
                                fPersonDemand.setOrderId(folist.get(0).getOrderId());
                                fPersonDemandMapper.updateByPrimaryKeySelective(fPersonDemand);
                                break;
                            }
                        }
                    } else {
                        //没有满足任一条件随机分配
                        if (folist.size() != 0) {
                            folist.clear();
                        }
                        SearchSeat(fAirplane_2.getPlaneName(), username);
                        //更改用户需求表信息
                        FPersonDemand fPersonDemand = new FPersonDemand();
                        fPersonDemand.setDemandId(f.getDemandId());
                        fPersonDemand.setPlaneId(fAirplane_2.getPlaneId());
                        fPersonDemand.setOrderId(folist.get(0).getOrderId());
                        fPersonDemandMapper.updateByPrimaryKeySelective(fPersonDemand);
                        break;
                    }
                }
            }

        } else {
            result.setStatus(-1);
            result.setMsg("当前飞机座位数无法满足原飞机乘客人数");
            return result;
        }
        //换机完成删除原飞机所有订单
        fOrderinfoMapper.delectByPlaneName(fAirplane_1.getPlaneName());
        fPersonDemandMapper.delectByPlaneId(fAirplane_1.getPlaneId());
        result.setStatus(0);
        result.setMsg("换机座位分配成功");
        return result;
    }

    //查询航班订单
    @Override
    public Result PlaneOrder(String plane_name) {
        Result result = new Result();
        List<FOrderinfo> fOrderinfo = fOrderinfoMapper.findPlaneOrder(plane_name);
        if (fOrderinfo.size() == 0) {
            result.setStatus(-1);
            result.setMsg("该航班暂未订单");
            return result;
        }
        result.setStatus(0);
        result.setMsg("订单查询成功");
        result.setData(fOrderinfo);
        return result;
    }

}
