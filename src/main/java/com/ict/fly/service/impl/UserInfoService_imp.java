package com.ict.fly.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ict.fly.dao.FPersonDemandMapper;
import com.ict.fly.dao.FUserinfoMapper;
import com.ict.fly.domain.entity.FPersonDemand;
import com.ict.fly.domain.entity.FUserinfo;
import com.ict.fly.domain.input.RegisterInput;
import com.ict.fly.domain.input.SelectOrderResultMap;
import com.ict.fly.domain.result.Result;
import com.ict.fly.service.UserInfoService;
import com.ict.fly.util.MSUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserInfoService_imp implements UserInfoService {

    @Resource
    private FUserinfoMapper fUserinfoMapper;
    @Resource
    private FPersonDemandMapper fPersonDemandMapper;

    @Transactional   //数据库事物管理
    @Override
    public Result addUser(RegisterInput input) {
        Result result = new Result();
        String s = input.getUsername();
        FUserinfo fUserinfo = fUserinfoMapper.findByUsername(input.getUsername());
        if (fUserinfo != null) {
            result.setStatus(-1);
            result.setMsg("该用户名已存在");
            return result;
        }
        FUserinfo fu = new FUserinfo();
        int sex = 0;
        if (input.getSex() == "男") {
            sex = 0;
        } else {
            sex = 1;
        }
        fu.setuUsername(input.getUsername());
        fu.setuPassword(MSUtil.md5(MSUtil.md5(MSUtil.md5(input.getPassword()))));
        fu.setuAge(input.getAge());
        fu.setuSex(sex);
        fu.setuName(input.getName());
        fu.setuVip(1);//默认非vip
        Timestamp now = new Timestamp(System.currentTimeMillis());
        fu.setuCreatime(now);
        fUserinfoMapper.insert(fu);
        result.setStatus(0);
        result.setMsg("注册成功");
        result.setData(fu);
        return result;
    }

    @Override
    public Result updateUser(RegisterInput input) {
        Result result = new Result();
        String s = input.getUsername();
        FUserinfo fu = new FUserinfo();
        int sex = 0;
        if (input.getSex() == "男") {
            sex = 0;
        } else {
            sex = 1;
        }
        fu.setUserinfoId(input.getId());
        fu.setuUsername(input.getUsername());
        fu.setuPassword(input.getPassword());
        fu.setuAge(input.getAge());
        fu.setuSex(sex);
        fu.setuName(input.getName());
        fu.setuVip(input.getVip());
        Timestamp now = new Timestamp(System.currentTimeMillis());
        fu.setuCreatime(now);
        fUserinfoMapper.updateByPrimaryKeySelective(fu);
        result.setStatus(0);
        result.setMsg("用户信息修改成功");
        result.setData(fu);
        return result;
    }

    @Override
    public Result deleteUser(RegisterInput input) {
//        fUserinfoMapper.deleteByPrimaryKey(input.getId());
        return null;
    }

    //查询个人订单、分页
    @Override
    public PageInfo<Result> userOrder(String uname, Integer PageNum) {
        FUserinfo fUserinfo = fUserinfoMapper.findByUsername(uname);
        // startPage(第几页, 多少条数据)
        PageHelper.startPage(PageNum, 10);
        List<SelectOrderResultMap> selectOrderResultMaps = fUserinfoMapper.selectOrder(fUserinfo.getUserinfoId());
        PageInfo pageInfo = new PageInfo(selectOrderResultMaps);
        return pageInfo;
    }

    //查询个人信息
    @Override
    public Result selectUserInfo(String uname) {
        Result result = new Result();
        FUserinfo fUserinfo = fUserinfoMapper.findByUsername(uname);
        result.setStatus(0);
        result.setMsg("用户信息查询成功");
        result.setData(fUserinfo);
        return result;
    }

    //查询个人需求、分页
    @Override
    public PageInfo<Result> userDemand(String uname, Integer PageNum) {
        Result result = new Result();
        FUserinfo fUserinfo = fUserinfoMapper.findByUsername(uname);
        List<FPersonDemand> fPersonDemand = fPersonDemandMapper.select_Demand(fUserinfo.getUserinfoId());
        // startPage(第几页, 多少条数据)
        PageHelper.startPage(PageNum, 10);
        PageInfo pageInfo = new PageInfo(fPersonDemand);
        return pageInfo;
    }

    @Override
    public Result searchAll() {
        Result result = new Result();
        List<FUserinfo> fUserinfoList = fUserinfoMapper.selectAll();
        result.setStatus(0);
        result.setMsg("所有用户信息查询成功");
        result.setData(fUserinfoList);
        return result;
    }

    @Override
    public Result searchVIP() {
        Result result = new Result();
        List<FUserinfo> fUserinfoList = fUserinfoMapper.selectVIP(0);
        result.setStatus(0);
        result.setMsg("所有VIP用户信息查询成功");
        result.setData(fUserinfoList);
        return result;
    }

    @Override
    public Result searchnoVIP() {
        Result result = new Result();
        List<FUserinfo> fUserinfoList = fUserinfoMapper.selectVIP(1);
        result.setStatus(0);
        result.setMsg("所有普通用户信息查询成功");
        result.setData(fUserinfoList);
        return result;
    }

}
