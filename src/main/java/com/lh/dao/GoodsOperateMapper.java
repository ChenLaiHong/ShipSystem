package com.lh.dao;

import java.util.List;
import java.util.Map;

import com.lh.pojo.GoodsOperate;
import com.lh.pojo.GoodsOperateExample;
import org.apache.ibatis.annotations.Param;

public interface GoodsOperateMapper {
    long countByExample(GoodsOperateExample example);

    int deleteByExample(GoodsOperateExample example);

    int deleteByPrimaryKey(Integer operateId);

    int insert(GoodsOperate record);

    int insertSelective(GoodsOperate record);

    List<GoodsOperate> selectByExample(GoodsOperateExample example);

    GoodsOperate selectByPrimaryKey(Integer operateId);

    int updateByExampleSelective(@Param("record") GoodsOperate record, @Param("example") GoodsOperateExample example);

    int updateByExample(@Param("record") GoodsOperate record, @Param("example") GoodsOperateExample example);

    int updateByPrimaryKeySelective(GoodsOperate record);

    int updateByPrimaryKey(GoodsOperate record);

    List<GoodsOperate> list(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    void updateList(List list);
}