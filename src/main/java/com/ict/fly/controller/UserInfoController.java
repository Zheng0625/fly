package com.ict.fly.controller;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @RequestMapping("/add")   //新增用户
    @ResponseBody
    public Result addUser(@RequestBody RegisterInput i) {
        Result result = userInfoService.addUser(i);
        return result;
    }

    @RequestMapping("/update")   //修改用户
    @ResponseBody
    public Result updateUser(@RequestBody RegisterInput i) {
        Result result = userInfoService.updateUser(i);
        return result;
    }

    @RequestMapping("/delete")   //删除用户
    @ResponseBody
    public Result deleteUser(@RequestBody RegisterInput i) {
        Result result = userInfoService.deleteUser(i);
        return result;
    }

    @RequestMapping("/selectOrder")   //查询用户订单
    @ResponseBody
    public PageInfo<Result> userOrder(@RequestBody EntityStr str) {
        return userInfoService.userOrder(str.getStr(), str.getPageNum());
    }

    @RequestMapping("/selectUserInfo")   //查询用户信息
    @ResponseBody
    public Result selectUserInfo(@RequestBody EntityStr str) {
        Result result = userInfoService.selectUserInfo(str.getStr());
        return result;
    }

    @RequestMapping("/selectDemand")   //查询用户需求
    @ResponseBody
    public PageInfo<Result> userDemand(@RequestBody EntityStr str) {
        return userInfoService.userDemand(str.getStr(), str.getPageNum());
    }

}

class EntityStr {
    String str;
    int pageNum;

    public void setStr(String str) {
        this.str = str;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getStr() {
        return str;
    }

    public int getPageNum() {
        return pageNum;
    }
}

