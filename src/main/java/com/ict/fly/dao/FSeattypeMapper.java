package com.ict.fly.dao;

import com.ict.fly.domain.entity.FSeattype;
import com.ict.fly.domain.entity.FSeattypeExample;

import java.util.ArrayList;
import java.util.List;

import com.ict.fly.domain.entity.MoreSeat;
import com.ict.fly.domain.entity.SearchSeatResult;
import com.ict.fly.domain.input.SearchSeatInput;
import org.apache.ibatis.annotations.Param;

public interface FSeattypeMapper {
    long countByExample(FSeattypeExample example);

    int deleteByExample(FSeattypeExample example);

    int deleteByPrimaryKey(Integer seatId);

    int insert(FSeattype record);

    int insertSelective(FSeattype record);

    List<FSeattype> selectByExample(FSeattypeExample example);

    FSeattype selectByPrimaryKey(Integer seatId);

    int updateByExampleSelective(@Param("record") FSeattype record, @Param("example") FSeattypeExample example);

    int updateByExample(@Param("record") FSeattype record, @Param("example") FSeattypeExample example);

    int updateByPrimaryKeySelective(FSeattype record);

    int updateByPrimaryKey(FSeattype record);

    List<FSeattype> findByPlaneId(int planeId);

    List<FSeattype> selectBySeat(FSeattype record);

    Long findSeatCount(int planeId);

    ArrayList<FSeattype> findMoreSeat(MoreSeat moreSeat);

    List<FSeattype> searchOrderSeat(SearchSeatInput searchSeatInput);
}