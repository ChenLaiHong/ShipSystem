package com.lh.service;

import com.lh.pojo.Grate;
import com.lh.pojo.MainTain;

import java.util.List;
import java.util.Map;

/**
 * Created by laiHom on 2020/4/18.
 */
public interface TainService {
    List<MainTain> list(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    int add(MainTain mainTain);

    MainTain findById(int i);

    int update(MainTain mainTain);

    void delete(String ids);

    List<MainTain> selectAll();
}
