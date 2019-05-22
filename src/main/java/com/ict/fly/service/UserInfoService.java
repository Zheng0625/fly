package com.ict.fly.service;

import com.ict.fly.domain.input.RegisterInput;
import com.ict.fly.domain.result.Result;

public interface UserInfoService {

    public Result addUser(RegisterInput input);
}
