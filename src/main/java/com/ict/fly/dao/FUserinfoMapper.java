package com.ict.fly.dao;

import com.ict.fly.domain.entity.FUserinfo;
import com.ict.fly.domain.entity.FUserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FUserinfoMapper {
    long countByExample(FUserinfoExample example);

    int deleteByExample(FUserinfoExample example);

    int deleteByPrimaryKey(Integer userinfoId);

    int insert(FUserinfo record);

    int insertSelective(FUserinfo record);

    List<FUserinfo> selectByExampleWithBLOBs(FUserinfoExample example);

    List<FUserinfo> selectByExample(FUserinfoExample example);

    FUserinfo selectByPrimaryKey(Integer userinfoId);

    int updateByExampleSelective(@Param("record") FUserinfo record, @Param("example") FUserinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") FUserinfo record, @Param("example") FUserinfoExample example);

    int updateByExample(@Param("record") FUserinfo record, @Param("example") FUserinfoExample example);

    int updateByPrimaryKeySelective(FUserinfo record);

    int updateByPrimaryKeyWithBLOBs(FUserinfo record);

    int updateByPrimaryKey(FUserinfo record);

    FUserinfo findByUsername(String username);
}