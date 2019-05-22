package com.ict.fly.controller;

import com.ict.fly.domain.result.Result;
import com.ict.fly.service.SeatTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/index")
public class SeatTypeController {

    @Autowired
    private SeatTypeService seatTypeService;

    @RequestMapping(value = "/p",method = RequestMethod.POST)
    @ResponseBody
    public Result search(String plane_type) {
        Result result = seatTypeService.searchAll(plane_type);
        return result;
    }

    @RequestMapping(value = "/plane")
    public String plane(Model model) {
        return "webtest/index";
    }

}
