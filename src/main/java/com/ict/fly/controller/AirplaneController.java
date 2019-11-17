package com.ict.fly.controller;

import com.ict.fly.domain.input.AddPlane;
import com.ict.fly.domain.input.PlaneEntity;
import com.ict.fly.domain.result.Result;
import com.ict.fly.service.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/plane")
public class AirplaneController {

    @Autowired
    private AirplaneService airplaneService;

    @RequestMapping(value = "/add")  //新增航班
    @ResponseBody
    public Result add(@RequestBody AddPlane addPlane) {
        Result result = airplaneService.addAirplane(addPlane);
        return result;
    }

    @RequestMapping(value = "/update")  //修改航班
    @ResponseBody
    public Result update(@RequestBody PlaneEntity planeEntity) {
        Result result = airplaneService.updateAirplane(planeEntity);
        return result;
    }

    @RequestMapping(value = "/delete")    //删除航班
    @ResponseBody
    public Result delete(@RequestBody String plane_name) {
        String str= plane_name.replace("\"", "");
        Result result = airplaneService.deleteAirplane(str);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET)    //查询航班
    @ResponseBody
    public Result selAll() {
        Result result = airplaneService.selAll();
        return result;
    }
}
