package com.lh.service.impl;

import com.lh.dao.TainItemsMapper;
import com.lh.pojo.TainItems;
import com.lh.service.ItemsService;
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
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private TainItemsMapper itemsMapper;


    @Override
    public List<TainItems> pageList(Map<String, Object> map) {
        return itemsMapper.pageList(map);
    }

    @Override
    public Integer getTotal(Map<String, Object> map) {
        return itemsMapper.getTotal(map);
    }

    @Override
    public int add(TainItems tainItems) {
        tainItems.setState(1);
        tainItems.setUpdateTime(new Date());
        return itemsMapper.insertSelective(tainItems);
    }

    @Override
    public TainItems findById(Integer itemId) {
        return itemsMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public int update(TainItems tainItems) {
        tainItems.setUpdateTime(new Date());
        return itemsMapper.updateByPrimaryKeySelective(tainItems);
    }

    @Override
    public void delete(String ids) {
        itemsMapper.updateList(StringIds(ids));
    }
}
