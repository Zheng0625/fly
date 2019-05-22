package com.ict.fly.controller;


import com.ict.fly.domain.input.MoreOrderInput;
import com.ict.fly.domain.input.SeatTypeSel;
import com.ict.fly.domain.result.Result;
import com.ict.fly.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@Controller
@RequestMapping("order")
public class OrderInfoController {

    @Autowired
    private OrderInfoService orderInfoService;

//    @RequestMapping(value = "add",method = RequestMethod.POST)
//    @ResponseBody
//    public Result add(@RequestBody SeatTypeSel seatTypeSel) {
//        Result result = orderInfoService.addOrder(seatTypeSel);
//        return result;
//    }
    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public Result add(@RequestBody Map<String,String> map) {
        Result result = orderInfoService.addOrder(map);
        return result;
    }
    @RequestMapping(value = "addMore",method = RequestMethod.POST)
    @ResponseBody
    public Result addMoreOrder(@RequestBody MoreOrderInput moreOrderInput) {
        Result result = orderInfoService.addMoreOrder(moreOrderInput);
        return result;
    }
//    @RequestMapping(method = RequestMethod.POST)
//    @ResponseBody
//    public Result test() {
//        Result result = orderInfoService.test();
//        return result;
//    }

}
