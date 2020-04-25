package com.lh.service;

import com.lh.pojo.BluePrint;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by laiHom on 2020/4/24.
 */

public interface PrintService {
    List<BluePrint> list(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    int add(BluePrint bluePrint);

    BluePrint findById(int i);

    int update(BluePrint bluePrint);

    void delete(String ids);
}
