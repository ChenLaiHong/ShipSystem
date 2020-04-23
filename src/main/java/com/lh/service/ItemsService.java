package com.lh.service;

import com.lh.pojo.TainItems;

import java.util.List;
import java.util.Map;

/**
 * Created by laiHom on 2020/4/18.
 */
public interface ItemsService {
    List<TainItems> pageList(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    int add(TainItems tainItems);

    TainItems findById(Integer itemId);

    int update(TainItems tainItems);

    void delete(String ids);
}
