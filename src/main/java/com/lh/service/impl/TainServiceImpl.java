package com.lh.service.impl;

import com.lh.dao.MainTainMapper;
import com.lh.pojo.Grate;
import com.lh.pojo.MainTain;
import com.lh.service.TainService;
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
public class TainServiceImpl implements TainService {
    @Autowired
    private MainTainMapper mainTainMapper;

    @Override
    public List<MainTain> list(Map<String, Object> map) {
        return mainTainMapper.list(map);
    }

    @Override
    public Integer getTotal(Map<String, Object> map) {
        return mainTainMapper.getTotal(map);
    }

    @Override
    public int add(MainTain mainTain) {
        mainTain.setState(1);
        mainTain.setUpdateTime(new Date());
        return mainTainMapper.insertSelective(mainTain);
    }

    @Override
    public MainTain findById(int i) {
        return mainTainMapper.selectByPrimaryKey(i);
    }

    @Override
    public int update(MainTain mainTain) {
        return mainTainMapper.updateByPrimaryKeySelective(mainTain);
    }

    @Override
    public void delete(String ids) {
        mainTainMapper.updateList(StringIds(ids));
    }

    @Override
    public List<MainTain> selectAll() {
        return mainTainMapper.selectByExample(null);
    }
}
