package com.lh.dao;

import com.lh.pojo.MainTain;
import com.lh.pojo.MainTainExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MainTainMapper {
    long countByExample(MainTainExample example);

    int deleteByExample(MainTainExample example);

    int deleteByPrimaryKey(Integer mainTainId);

    int insert(MainTain record);

    int insertSelective(MainTain record);

    List<MainTain> selectByExample(MainTainExample example);

    MainTain selectByPrimaryKey(Integer mainTainId);

    int updateByExampleSelective(@Param("record") MainTain record, @Param("example") MainTainExample example);

    int updateByExample(@Param("record") MainTain record, @Param("example") MainTainExample example);

    int updateByPrimaryKeySelective(MainTain record);

    int updateByPrimaryKey(MainTain record);

    List<MainTain> list(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    void updateList(List list);

    List<MainTain> selectAll();
}