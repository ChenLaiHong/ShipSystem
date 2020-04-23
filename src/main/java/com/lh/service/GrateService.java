package com.lh.service;

import com.lh.pojo.Grate;
import com.lh.pojo.MainTain;

import java.util.List;
import java.util.Map;

/**
 * Created by laiHom on 2020/4/18.
 */
public interface GrateService {
    List<Grate> list(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    int add(Grate grate);

    Grate findById(int i);

    int update(Grate grate);

    void delete(String ids);
}
