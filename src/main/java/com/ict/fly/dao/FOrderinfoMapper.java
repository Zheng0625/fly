package com.ict.fly.dao;

import com.ict.fly.domain.entity.FOrderinfo;
import com.ict.fly.domain.entity.FOrderinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FOrderinfoMapper {
    long countByExample(FOrderinfoExample example);

    int deleteByExample(FOrderinfoExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(FOrderinfo record);

    int insertSelective(FOrderinfo record);

    List<FOrderinfo> selectByExample(FOrderinfoExample example);

    FOrderinfo selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") FOrderinfo record, @Param("example") FOrderinfoExample example);

    int updateByExample(@Param("record") FOrderinfo record, @Param("example") FOrderinfoExample example);

    int updateByPrimaryKeySelective(FOrderinfo record);

    int updateByPrimaryKey(FOrderinfo record);

    FOrderinfo selectOrder(FOrderinfo record);

    FOrderinfo findBySeatId(Integer seat_id);

    List<FOrderinfo> findByPlaneType(String planeType);

    long findOrderCount(String plane_type);
}