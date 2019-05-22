package com.ict.fly.service;

import com.ict.fly.domain.result.Result;

public interface SeatTypeService {

    //根据飞机查询座位属性
    public Result searchAll(String planeName);
}
