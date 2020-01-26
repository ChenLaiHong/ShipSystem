package com.lh.dao;

import com.lh.pojo.Equipment;
import com.lh.pojo.EquipmentExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface EquipmentMapper {
    long countByExample(EquipmentExample example);

    int deleteByExample(EquipmentExample example);

    int deleteByPrimaryKey(Integer eid);

    int insert(Equipment record);

    int insertSelective(Equipment record);

    List<Equipment> selectByExample(EquipmentExample example);

    Equipment selectByPrimaryKey(Integer eid);

    int updateByExampleSelective(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    int updateByExample(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    int updateByPrimaryKeySelective(Equipment record);

    int updateByPrimaryKey(Equipment record);

    List<Equipment> list(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    void updateList(List list);

    int inputAll(Map<String, Object> map);
}