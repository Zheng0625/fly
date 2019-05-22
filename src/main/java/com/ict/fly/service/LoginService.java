package com.ict.fly.service;

import com.ict.fly.domain.input.LoginInput;
import com.ict.fly.domain.result.Result;

/**
 * @author zyb
 * @date 2019/1/21 0021 - 15:16
 */
public interface LoginService {

    //登录接口
    public Result Login(LoginInput loginInput);

}
