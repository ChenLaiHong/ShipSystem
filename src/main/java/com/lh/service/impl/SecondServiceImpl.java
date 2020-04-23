package com.lh.service.impl;

import com.lh.dao.SecondGradeMapper;
import com.lh.pojo.SecondGrade;
import com.lh.service.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.lh.utils.CommentUtils.StringIds;

/**
 * Created by laiHom on 2020/4/18.
 */
@Service
public class SecondServiceImpl implements SecondService {
    @Autowired
    private SecondGradeMapper secondGradeMapper;

    @Override
    public List<SecondGrade> pageList(Map<String, Object> map) {
        return secondGradeMapper.pageList(map);
    }

    @Override
    public Integer getTotal(Map<String, Object> map) {
        return secondGradeMapper.getTotal(map);
    }

    @Override
    public int add(SecondGrade secondGrade) {
        secondGrade.setState(1);
        secondGrade.setUpdateTime(new Date());
        return secondGradeMapper.insertSelective(secondGrade);
    }

    @Override
    public SecondGrade findById(Integer secondId) {
        return secondGradeMapper.selectByPrimaryKey(secondId);
    }

    @Override
    public int update(SecondGrade secondGrade) {
        secondGrade.setUpdateTime(new Date());
        return secondGradeMapper.updateByPrimaryKeySelective(secondGrade);
    }

    @Override
    public void delete(String ids) {
        secondGradeMapper.updateList(StringIds(ids));
    }
}
