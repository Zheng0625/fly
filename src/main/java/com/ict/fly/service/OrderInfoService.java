package com.ict.fly.service;


import com.ict.fly.domain.input.MoreOrderInput;
import com.ict.fly.domain.input.SeatTypeSel;
import com.ict.fly.domain.input.ZjFenpeiEntity;
import com.ict.fly.domain.result.Result;

import java.util.ArrayList;
import java.util.Map;

public interface OrderInfoService {

    //新增订单
    public Result addOrder(Map<String,String> map);

    //多人排座
    public Result addMoreOrder(MoreOrderInput moreOrder);

    //整机分配
    public Result zjFenpei(ZjFenpeiEntity zjFenpeiEntity);

    //查询飞机订单
    public Result PlaneOrder(String plane_name);

    //新增用户需求
//    public Result addDemand(Map<String,String> map);

}
