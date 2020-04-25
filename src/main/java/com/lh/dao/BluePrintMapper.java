package com.lh.dao;

import com.lh.pojo.BluePrint;
import com.lh.pojo.BluePrintExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface BluePrintMapper {
    long countByExample(BluePrintExample example);

    int deleteByExample(BluePrintExample example);

    int deleteByPrimaryKey(Integer printId);

    int insert(BluePrint record);

    int insertSelective(BluePrint record);

    List<BluePrint> selectByExample(BluePrintExample example);

    BluePrint selectByPrimaryKey(Integer printId);

    int updateByExampleSelective(@Param("record") BluePrint record, @Param("example") BluePrintExample example);

    int updateByExample(@Param("record") BluePrint record, @Param("example") BluePrintExample example);

    int updateByPrimaryKeySelective(BluePrint record);

    int updateByPrimaryKey(BluePrint record);

    List<BluePrint> list(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    void updateList(List list);
}