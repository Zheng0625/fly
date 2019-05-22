package com.ict.fly.controller;

import com.ict.fly.domain.result.Result;
import com.ict.fly.service.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("plane")
public class AirplaneController {

    @Autowired
    private AirplaneService airplaneService;

    @RequestMapping(value = "add",method = RequestMethod.PUT)
    @ResponseBody
    public Result add(String plane_type, int plane_seat, String plane_name, int plane_lx, int plane_ly) {
        Result result = airplaneService.addAirplane(plane_type, plane_seat, plane_name, plane_lx, plane_ly);
        return result;
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    public Result update(String plane_type, int plane_seat, String plane_name, int plane_lx, int plane_ly, int plane_use) {
        Result result = airplaneService.updateAirplane(plane_type, plane_seat, plane_name, plane_lx, plane_ly, plane_use);
        return result;
    }

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    @ResponseBody
    public Result delete(String plane_type) {
        Result result = airplaneService.deleteAirplane(plane_type);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result selAll() {
        Result result = airplaneService.selAll();
        return result;
    }
}
