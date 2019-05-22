package com.ict.fly.service.impl;

import com.ict.fly.dao.FAirplaneMapper;
import com.ict.fly.dao.FSeattypeMapper;
import com.ict.fly.domain.entity.FAirplane;
import com.ict.fly.domain.result.Result;
import com.ict.fly.service.AirplaneService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AirplaneService_imp implements AirplaneService {

    @Resource
    private FAirplaneMapper fAirplaneMapper;
    @Resource
    private FSeattypeMapper fSeattypeMapper;

    //新增航班
    @Override
    public Result addAirplane(String plane_type, int plane_seat, String plane_name, int plane_lx, int plane_ly) {
        Result result = new Result();
        FAirplane f = fAirplaneMapper.findByName(plane_type);
        if (f != null) {
            result.setStatus(-1);
            result.setMsg("此航班已存在");
            return result;
        }
        FAirplane fAirplane = new FAirplane();
        fAirplane.setPlaneType(plane_type);
        fAirplane.setPlaneSeat(plane_seat);
        fAirplane.setPlaneName(plane_name);
        fAirplane.setPlaneLocationx(plane_lx);
        fAirplane.setPlaneLocationy(plane_ly);
        fAirplane.setPlaneUse(0);//默认新增航班可用
        fAirplaneMapper.insert(fAirplane);
        result.setStatus(0);
        result.setMsg("航班新增成功");
        result.setData(fAirplane);
        return result;
    }

    //修改航班
    @Override
    public Result updateAirplane(String plane_type, int plane_seat, String plane_name, int plane_lx, int plane_ly, int plane_use) {
        Result result = new Result();
        FAirplane f = fAirplaneMapper.findByName(plane_type);
        if (f == null) {
            result.setStatus(-1);
            result.setMsg("此航班不存在");
            return result;
        }
        FAirplane fAirplane = new FAirplane();
        fAirplane.setPlaneId(f.getPlaneId());
        fAirplane.setPlaneType(plane_type);
        fAirplane.setPlaneSeat(plane_seat);
        fAirplane.setPlaneName(plane_name);
        fAirplane.setPlaneLocationx(plane_lx);
        fAirplane.setPlaneLocationy(plane_ly);
        fAirplane.setPlaneUse(plane_use);
        fAirplaneMapper.updateByPrimaryKeySelective(fAirplane);
        result.setStatus(0);
        result.setMsg("航班信息修改成功");
        result.setData(fAirplane);
        return result;
    }

    //删除航班
    @Override
    public Result deleteAirplane(String plane_type) {
        Result result = new Result();
        FAirplane f = fAirplaneMapper.findByName(plane_type);
        if (f == null) {
            result.setStatus(-1);
            result.setMsg("此航班不存在");
            return result;
        }
        FAirplane fAirplane = new FAirplane();
        fAirplane.setPlaneId(f.getPlaneId());
        fAirplane.setPlaneUse(1);
        fAirplaneMapper.updateByPrimaryKeySelective(fAirplane);
        result.setStatus(0);
        result.setMsg("航班删除成功");
        return result;
    }

    //查询所有航班
    @Override
    public Result selAll() {
        Result result = new Result();
        List<FAirplane> lists = fAirplaneMapper.selectAll();
        if (lists == null) {
            result.setStatus(-1);
            result.setMsg("暂无航班记录");
            return result;
        }
        result.setStatus(0);
        result.setMsg("航班查询成功");
        result.setData(lists);
        return result;
    }
}
