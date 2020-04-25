package com.lh.dao;

import com.lh.pojo.SecondGrade;
import com.lh.pojo.SecondGradeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SecondGradeMapper {
    long countByExample(SecondGradeExample example);

    int deleteByExample(SecondGradeExample example);

    int deleteByPrimaryKey(Integer secondId);

    int insert(SecondGrade record);

    int insertSelective(SecondGrade record);

    List<SecondGrade> selectByExample(SecondGradeExample example);

    SecondGrade selectByPrimaryKey(Integer secondId);

    int updateByExampleSelective(@Param("record") SecondGrade record, @Param("example") SecondGradeExample example);

    int updateByExample(@Param("record") SecondGrade record, @Param("example") SecondGradeExample example);

    int updateByPrimaryKeySelective(SecondGrade record);

    int updateByPrimaryKey(SecondGrade record);

    List<SecondGrade> pageList(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    void updateList(List list);
}