package com.ict.fly.service.impl;

import com.ict.fly.dao.FUserinfoMapper;
import com.ict.fly.domain.entity.FUserinfo;
import com.ict.fly.domain.input.RegisterInput;
import com.ict.fly.domain.result.Result;
import com.ict.fly.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Service
public class UserInfoService_imp implements UserInfoService {

    @Resource
    private FUserinfoMapper fUserinfoMapper;

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
        fu.setuUsername(input.getUsername());
        fu.setuPassword(input.getPassword());
        fu.setuAge(input.getAge());
        fu.setuSex(input.getSex());
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

}
