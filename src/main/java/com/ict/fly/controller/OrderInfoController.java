package com.ict.fly.controller;


import com.ict.fly.dao.FSeattypeMapper;
import com.ict.fly.domain.entity.FOrderinfo;
import com.ict.fly.domain.entity.FSeattype;
import com.ict.fly.domain.input.MoreOrderInput;
import com.ict.fly.domain.input.PlaneOrder;
import com.ict.fly.domain.input.SeatTypeSel;
import com.ict.fly.domain.input.ZjFenpeiEntity;
import com.ict.fly.domain.result.Result;
import com.ict.fly.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("order")
public class OrderInfoController {

    @Autowired
    private OrderInfoService orderInfoService;
    @Resource
    private FSeattypeMapper fSeattypeMapper;

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public Result add(@RequestBody Map<String,String> map) {
        Result result = orderInfoService.addOrder(map);
        ArrayList<FOrderinfo> folist  = (ArrayList<FOrderinfo>) result.getData();
        ArrayList<FSeattype> fSeattypeList = new ArrayList<>();
        for (int i = 0; i < folist.size(); i++) {
            FSeattype fSeattype = fSeattypeMapper.selectBySeatId(folist.get(i).getSeatId());
            fSeattypeList.add(fSeattype);
        }
        result.setData(fSeattypeList);
        return result;
    }
    @RequestMapping(value = "addMore",method = RequestMethod.POST)
    @ResponseBody
    public Result addMoreOrder(@RequestBody MoreOrderInput moreOrderInput) {
//        /** 获取当前系统时间*/
//        long startTime =  System.currentTimeMillis();
//        /** 程序运行 processRun();*/
//        Result result = orderInfoService.addMoreOrder(moreOrderInput);
//        /** 获取当前的系统时间，与初始时间相减就是程序运行的毫秒数，除以1000就是秒数*/
//        long endTime =  System.currentTimeMillis();
//        System.out.println(endTime-startTime);
        Result result = orderInfoService.addMoreOrder(moreOrderInput);
        ArrayList<FOrderinfo> folist  = (ArrayList<FOrderinfo>) result.getData();
        ArrayList<FSeattype> fSeattypeList = new ArrayList<>();
        for (int i = 0; i < folist.size(); i++) {
            FSeattype fSeattype = fSeattypeMapper.selectBySeatId(folist.get(i).getSeatId());
            fSeattypeList.add(fSeattype);
        }
        result.setData(fSeattypeList);
        return result;

    }
    @RequestMapping(value = "/zjfp")
    @ResponseBody
    public Result zjFenpei(@RequestBody ZjFenpeiEntity zjFenpeiEntity) {
        Result result = orderInfoService.zjFenpei(zjFenpeiEntity);
        return result;
    }


    @RequestMapping("/planeOrder")
    @ResponseBody
    public Result PlaneOrder(@RequestBody String str) {
        String plane_name  = str.replace("\"", "");
        Result result = orderInfoService.PlaneOrder(plane_name);
        return result;
    }

//    @RequestMapping(value = "addDemand",method = RequestMethod.POST)
//    @ResponseBody
//    public Result addDemand(@RequestBody Map<String,String> map) {
//        Result result = new Result();
//
//        return result;
//    }

}
