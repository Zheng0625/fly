package com.ict.fly.service;

import com.github.pagehelper.PageInfo;
import com.ict.fly.domain.input.RegisterInput;
import com.ict.fly.domain.result.Result;

public interface UserInfoService {

    public Result addUser(RegisterInput input);

    public Result updateUser(RegisterInput input);

    public Result deleteUser(RegisterInput input);

    public PageInfo<Result> userOrder(String uname, Integer pageNum);

    public Result selectUserInfo(String uname);

    public PageInfo<Result> userDemand(String uname, Integer PageNum);

    public Result searchAll();

    public Result searchVIP();

    public Result searchnoVIP();

}
