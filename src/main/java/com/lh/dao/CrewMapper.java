package com.lh.dao;

import com.lh.pojo.Crew;
import com.lh.pojo.CrewExample;
import java.util.List;
import java.util.Map;

import com.lh.pojo.NotePad;
import org.apache.ibatis.annotations.Param;

public interface CrewMapper {
    long countByExample(CrewExample example);

    int deleteByExample(CrewExample example);

    int deleteByPrimaryKey(String loginId);

    int insert(Crew record);

    int insertSelective(Crew record);

    List<Crew> selectByExample(CrewExample example);

    Crew selectByPrimaryKey(String loginId);

    int updateByExampleSelective(@Param("record") Crew record, @Param("example") CrewExample example);

    int updateByExample(@Param("record") Crew record, @Param("example") CrewExample example);

    int updateByPrimaryKeySelective(Crew record);

    int updateByPrimaryKey(Crew record);

    List<Crew> list(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    int inputAll(Map<String, Object> map);

    void updateList(List ints);


}