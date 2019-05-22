package com.ict.fly.service;

import com.ict.fly.domain.result.Result;

public interface AirplaneService {
    //新增航班
    public Result addAirplane(String plane_type, int plane_seat, String plane_name, int plane_lx, int plane_ly);

    //修改航班
    public Result updateAirplane(String plane_type, int plane_seat, String plane_name, int plane_lx, int plane_ly, int plane_use);

    //删除航班
    public Result deleteAirplane(String plane_type);

    //查询所有航班
    public Result selAll();
}
