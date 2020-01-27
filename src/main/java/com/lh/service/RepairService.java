package com.lh.service;

import com.lh.pojo.Repair;

import java.util.List;
import java.util.Map;

/**
 * Created by laiHom on 2020/1/26.
 */
public interface RepairService {
    List<Repair> list(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    int add(Repair repair);

    Repair findById(int i);

    int update(Repair repair);

    void delete(String ids);

    List<Repair> findAll();

    List<Repair> getTel();
}
