package com.lh.dao;

import com.lh.pojo.Repair;
import com.lh.pojo.RepairExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RepairMapper {
    long countByExample(RepairExample example);

    int deleteByExample(RepairExample example);

    int deleteByPrimaryKey(Integer repairId);

    int insert(Repair record);

    int insertSelective(Repair record);

    List<Repair> selectByExampleWithBLOBs(RepairExample example);

    List<Repair> selectByExample(RepairExample example);

    Repair selectByPrimaryKey(Integer repairId);

    int updateByExampleSelective(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByExampleWithBLOBs(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByExample(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByPrimaryKeySelective(Repair record);

    int updateByPrimaryKeyWithBLOBs(Repair record);

    int updateByPrimaryKey(Repair record);

    List<Repair> list(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    void updateList(List list);
}