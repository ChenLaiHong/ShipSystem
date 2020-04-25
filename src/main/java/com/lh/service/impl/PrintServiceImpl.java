package com.lh.service.impl;

import com.lh.dao.BluePrintMapper;
import com.lh.pojo.BluePrint;
import com.lh.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.lh.utils.CommentUtils.StringIds;

/**
 * Created by laiHom on 2020/4/24.
 */
@Service
public class PrintServiceImpl implements PrintService {

    @Autowired
    private BluePrintMapper printMapper;
    @Override
    public List<BluePrint> list(Map<String, Object> map) {
        return printMapper.list(map);
    }

    @Override
    public Integer getTotal(Map<String, Object> map) {
        return printMapper.getTotal(map);
    }

    @Override
    public int add(BluePrint bluePrint) {
        String type = bluePrint.getPrintUrl().split("\\.")[1];
        bluePrint.setPrintType(type);
        bluePrint.setState(1);
        bluePrint.setUpdateTime(new Date());
        return printMapper.insertSelective(bluePrint);
    }

    @Override
    public BluePrint findById(int i) {
        return printMapper.selectByPrimaryKey(i);
    }

    @Override
    public int update(BluePrint bluePrint) {
        String type = bluePrint.getPrintUrl().split("\\.")[1];
        bluePrint.setPrintType(type);
        bluePrint.setUpdateTime(new Date());
        return printMapper.updateByPrimaryKeySelective(bluePrint);
    }

    @Override
    public void delete(String ids) {
        printMapper.updateList(StringIds(ids));
    }
}
