package com.ict.fly.service.impl;

import com.ict.fly.dao.FAirplaneMapper;
import com.ict.fly.dao.FOrderinfoMapper;
import com.ict.fly.dao.FSeattypeMapper;
import com.ict.fly.domain.entity.FAirplane;
import com.ict.fly.domain.entity.FOrderinfo;
import com.ict.fly.domain.entity.FSeattype;
import com.ict.fly.domain.input.SearchSeatInput;
import com.ict.fly.domain.result.Result;
import com.ict.fly.service.SeatTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
@Service("seatTypeService")
public class SeatTypeService_imp implements SeatTypeService {
    @Resource
    private FAirplaneMapper fAirplaneMapper;
    @Resource
    private FSeattypeMapper fSeattypeMapper;
    @Resource
    private FOrderinfoMapper fOrderinfoMapper;
    @Override
    public Result searchAll(String plane_name) {
        Result result = new Result();
        FAirplane fAirplane = fAirplaneMapper.findByName(plane_name);

        if (fAirplane == null) {
            result.setStatus(-1);
            result.setMsg("没有找到此飞机型号");
            return result;
        }
        int planeId = fAirplane.getPlaneId();
        SearchSeatInput s = new SearchSeatInput();
        s.setPlaneId(planeId);
        s.setPlaneName(plane_name);
        List<FSeattype> fSeattype = fSeattypeMapper.searchOrderSeat(s);
        if (fSeattype.isEmpty()) {
            result.setStatus(-1);
            result.setMsg("该飞机暂未设置座位");
            result.setData(fSeattype);
            return result;
        }
        ArrayList<ArrayList> allArrayList = new ArrayList<>();
        ArrayList<FSeattype> arrayList1 = new ArrayList<>();
        int x = 0;
        for (FSeattype f : fSeattype) {
            if (f.getSeatLocationx() != x) {
                allArrayList.add(arrayList1);
                arrayList1 = new ArrayList<>();
                arrayList1.add(f);
                x = f.getSeatLocationx();
            } else {
                arrayList1.add(f);
            }
        }
        allArrayList.add(arrayList1);
        for (ArrayList a : allArrayList
        ) {
            System.out.println(a);
        }
        result.setStatus(0);
        result.setMsg("查询成功");
        result.setData(allArrayList);
        return result;
    }
}
