package com.ict.fly.controller;


import com.ict.fly.domain.input.RegisterInput;
import com.ict.fly.domain.result.Result;
import com.ict.fly.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/userinfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/add")
    @ResponseBody
    public Result addUser(@RequestBody RegisterInput i) {
        Result result = userInfoService.addUser(i);
        return result;
    }
}
