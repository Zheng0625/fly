package com.ict.fly.service;


import com.ict.fly.domain.input.MoreOrderInput;
import com.ict.fly.domain.input.SeatTypeSel;
import com.ict.fly.domain.result.Result;

import java.util.ArrayList;
import java.util.Map;

public interface OrderInfoService {

//    //新增订单
//    public Result addOrder(SeatTypeSel seatTypeSel);
    //新增订单
    public Result addOrder(Map<String,String> map);

    //多人排座
    public Result addMoreOrder(MoreOrderInput moreOrder);


}
