package com.ict.fly.dao;

import com.ict.fly.domain.entity.SeatState;
import com.ict.fly.domain.entity.SeatStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeatStateMapper {
    long countByExample(SeatStateExample example);

    int deleteByExample(SeatStateExample example);

    int deleteByPrimaryKey(Integer stateId);

    int insert(SeatState record);

    int insertSelective(SeatState record);

    List<SeatState> selectByExample(SeatStateExample example);

    SeatState selectByPrimaryKey(Integer stateId);

    int updateByExampleSelective(@Param("record") SeatState record, @Param("example") SeatStateExample example);

    int updateByExample(@Param("record") SeatState record, @Param("example") SeatStateExample example);

    int updateByPrimaryKeySelective(SeatState record);

    int updateByPrimaryKey(SeatState record);
}