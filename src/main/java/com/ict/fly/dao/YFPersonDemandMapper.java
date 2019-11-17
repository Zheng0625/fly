package com.ict.fly.dao;

import com.ict.fly.domain.entity.YFPersonDemand;
import com.ict.fly.domain.entity.YFPersonDemandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YFPersonDemandMapper {
    long countByExample(YFPersonDemandExample example);

    int deleteByExample(YFPersonDemandExample example);

    int deleteByPrimaryKey(Integer yDemandId);

    int insert(YFPersonDemand record);

    int insertSelective(YFPersonDemand record);

    List<YFPersonDemand> selectByExample(YFPersonDemandExample example);

    YFPersonDemand selectByPrimaryKey(Integer yDemandId);

    int updateByExampleSelective(@Param("record") YFPersonDemand record, @Param("example") YFPersonDemandExample example);

    int updateByExample(@Param("record") YFPersonDemand record, @Param("example") YFPersonDemandExample example);

    int updateByPrimaryKeySelective(YFPersonDemand record);

    int updateByPrimaryKey(YFPersonDemand record);
}