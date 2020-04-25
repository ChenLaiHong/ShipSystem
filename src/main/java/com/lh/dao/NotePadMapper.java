package com.lh.dao;

import com.lh.pojo.NotePad;
import com.lh.pojo.NotePadExample;
import java.util.List;

import com.lh.pojo.NotePadT;
import org.apache.ibatis.annotations.Param;

public interface NotePadMapper {
    long countByExample(NotePadExample example);

    int deleteByExample(NotePadExample example);

    int deleteByPrimaryKey(Integer noteId);

    int insert(NotePad record);

    int insertSelective(NotePad record);

    List<NotePad> selectByExample(NotePadExample example);

    NotePad selectByPrimaryKey(Integer noteId);

    int updateByExampleSelective(@Param("record") NotePad record, @Param("example") NotePadExample example);

    int updateByExample(@Param("record") NotePad record, @Param("example") NotePadExample example);

    int updateByPrimaryKeySelective(NotePad record);

    int updateByPrimaryKey(NotePad record);

    List<NotePadT> getNote(String userId);
}