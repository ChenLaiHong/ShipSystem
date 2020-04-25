package com.lh.dao;

import com.lh.pojo.TainItems;
import com.lh.pojo.TainItemsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TainItemsMapper {
    long countByExample(TainItemsExample example);

    int deleteByExample(TainItemsExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(TainItems record);

    int insertSelective(TainItems record);

    List<TainItems> selectByExample(TainItemsExample example);

    TainItems selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") TainItems record, @Param("example") TainItemsExample example);

    int updateByExample(@Param("record") TainItems record, @Param("example") TainItemsExample example);

    int updateByPrimaryKeySelective(TainItems record);

    int updateByPrimaryKey(TainItems record);

    List<TainItems> pageList(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    void updateList(List list);
}