package com.lh.dao;

import com.lh.pojo.Grate;
import com.lh.pojo.GrateExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface GrateMapper {
    long countByExample(GrateExample example);

    int deleteByExample(GrateExample example);

    int deleteByPrimaryKey(Integer gradeId);

    int insert(Grate record);

    int insertSelective(Grate record);

    List<Grate> selectByExample(GrateExample example);

    Grate selectByPrimaryKey(Integer gradeId);

    int updateByExampleSelective(@Param("record") Grate record, @Param("example") GrateExample example);

    int updateByExample(@Param("record") Grate record, @Param("example") GrateExample example);

    int updateByPrimaryKeySelective(Grate record);

    int updateByPrimaryKey(Grate record);

    List<Grate> list(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    void updateList(List list);
}