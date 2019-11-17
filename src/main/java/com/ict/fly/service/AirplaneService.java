package com.ict.fly.service;

import com.ict.fly.domain.input.AddPlane;
import com.ict.fly.domain.input.PlaneEntity;
import com.ict.fly.domain.result.Result;

public interface AirplaneService {
    //新增航班
    public Result addAirplane(AddPlane addPlane);

    //修改航班
    public Result updateAirplane(PlaneEntity planeEntity);

    //删除航班
    public Result deleteAirplane(String plane_type);

    //查询所有航班
    public Result selAll();
}
