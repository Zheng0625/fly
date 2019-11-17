package com.ict.fly.dao;

import com.ict.fly.domain.entity.FPersonDemand;
import com.ict.fly.domain.entity.FPersonDemandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FPersonDemandMapper {
    long countByExample(FPersonDemandExample example);

    int deleteByExample(FPersonDemandExample example);

    int deleteByPrimaryKey(Integer demandId);

    int insert(FPersonDemand record);

    int insertSelective(FPersonDemand record);

    List<FPersonDemand> selectByExample(FPersonDemandExample example);

    FPersonDemand selectByPrimaryKey(Integer demandId);

    int updateByExampleSelective(@Param("record") FPersonDemand record, @Param("example") FPersonDemandExample example);

    int updateByExample(@Param("record") FPersonDemand record, @Param("example") FPersonDemandExample example);

    int updateByPrimaryKeySelective(FPersonDemand record);

    int updateByPrimaryKey(FPersonDemand record);

    List<FPersonDemand> selPersonDemand(int planeId);

    int delectByPlaneId(Integer planeId);

    List<FPersonDemand> select_Demand (int userinfo_id);
}