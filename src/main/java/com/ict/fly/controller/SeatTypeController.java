package com.ict.fly.controller;

import com.ict.fly.domain.result.Result;
import com.ict.fly.service.SeatTypeService;
import com.ict.fly.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/index")
public class SeatTypeController {

    @Autowired
    private SeatTypeService seatTypeService;
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/p", method = RequestMethod.POST)
    @ResponseBody
    public Result search(String plane_type) {
        Result result = seatTypeService.searchAll(plane_type);
        return result;
    }
    @RequestMapping(value = "/admin")
    public String admin(Model model) {
        return "webtest/planeInfo";
    }

    @RequestMapping(value = "/plane")
    public String plane(Model model) {
        return "webtest/index";
    }

    @RequestMapping(value = "/planeInfo")
    public String planeInfo(Model model) {
        return "webtest/planeInfo";
    }

    @RequestMapping(value = "/planeOrder")
    public String planeOrder(Model model) {
        return "webtest/planeOrder";
    }

    @RequestMapping(value = "/userInfo_all")
    public String userInfo_all(Model model) {
        return "webtest/userInfo_all";
    }

    @RequestMapping(value = "/userInfo_vip")
    public String userInfo_vip(Model model) {
        return "webtest/userInfo_vip";
    }

    @RequestMapping(value = "/userInfo")
    public String userInfo(Model model) { return "webtest/userInfo"; }

    @RequestMapping(value = "/userOrder")
    public String userOrder(Model model) {
        return "webtest/userOrder";
    }

    @RequestMapping(value = "/statistics")   //统计信息可视化
    public String statistics(Model model) {
        return "webtest/statistics";
    }

    @RequestMapping("/selVIP")
    @ResponseBody
    public Result searchVIP() {
        Result result = userInfoService.searchVIP();
        return result;
    }

    @RequestMapping("/selAll")
    @ResponseBody
    public Result searchAll() {
        Result result = userInfoService.searchAll();
        return result;
    }

    @RequestMapping("/selnoVIP")
    @ResponseBody
    public Result searchnoVIP() {
        Result result = userInfoService.searchnoVIP();
        return result;
    }


}
