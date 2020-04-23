package com.lh.service.impl;

import com.lh.dao.GrateMapper;
import com.lh.pojo.Grate;
import com.lh.service.GrateService;
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
public class GrateServiceImpl implements GrateService {
    @Autowired
    private GrateMapper grateMapper;

    @Override
    public List<Grate> list(Map<String, Object> map) {
        return grateMapper.list(map);
    }

    @Override
    public Integer getTotal(Map<String, Object> map) {
        return grateMapper.getTotal(map);
    }

    @Override
    public int add(Grate grate) {
        grate.setState(1);
        grate.setUpdateTime(new Date());
        return grateMapper.insertSelective(grate);
    }

    @Override
    public Grate findById(int i) {
        return grateMapper.selectByPrimaryKey(i);
    }

    @Override
    public int update(Grate grate) {
        grate.setUpdateTime(new Date());
        return grateMapper.updateByPrimaryKeySelective(grate);
    }

    @Override
    public void delete(String ids) {
        grateMapper.updateList(StringIds(ids));
    }
}
