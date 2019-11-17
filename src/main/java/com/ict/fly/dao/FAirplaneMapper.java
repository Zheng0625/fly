package com.ict.fly.dao;

import com.ict.fly.domain.entity.FAirplane;
import com.ict.fly.domain.entity.FAirplaneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FAirplaneMapper {
    long countByExample(FAirplaneExample example);

    int deleteByExample(FAirplaneExample example);

    int deleteByPrimaryKey(Integer planeId);

    int insert(FAirplane record);

    int insertSelective(FAirplane record);

    List<FAirplane> selectByExample(FAirplaneExample example);

    FAirplane selectByPrimaryKey(Integer planeId);

    int updateByExampleSelective(@Param("record") FAirplane record, @Param("example") FAirplaneExample example);

    int updateByExample(@Param("record") FAirplane record, @Param("example") FAirplaneExample example);

    int updateByPrimaryKeySelective(FAirplane record);

    int updateByPrimaryKey(FAirplane record);

    FAirplane findByName(String plane_name);

    List<FAirplane> selectAll();
}