package com.lh.service;

import com.lh.pojo.SecondGrade;

import java.util.List;
import java.util.Map;

/**
 * Created by laiHom on 2020/4/18.
 */
public interface SecondService {
    List<SecondGrade> pageList(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    int add(SecondGrade secondGrade);

    SecondGrade findById(Integer secondId);

    int update(SecondGrade secondGrade);

    void delete(String ids);
}
