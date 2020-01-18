package com.lh.dao;

import com.lh.pojo.ShipInfo;
import com.lh.pojo.ShipInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipInfoMapper {
    long countByExample(ShipInfoExample example);

    int deleteByExample(ShipInfoExample example);

    int deleteByPrimaryKey(Integer shipId);

    int insert(ShipInfo record);

    int insertSelective(ShipInfo record);

    List<ShipInfo> selectByExample(ShipInfoExample example);

    ShipInfo selectByPrimaryKey(Integer shipId);

    int updateByExampleSelective(@Param("record") ShipInfo record, @Param("example") ShipInfoExample example);

    int updateByExample(@Param("record") ShipInfo record, @Param("example") ShipInfoExample example);

    int updateByPrimaryKeySelective(ShipInfo record);

    int updateByPrimaryKey(ShipInfo record);
}