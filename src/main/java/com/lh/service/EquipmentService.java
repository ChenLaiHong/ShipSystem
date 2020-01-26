package com.lh.service;

import com.lh.pojo.Equipment;

import java.util.List;
import java.util.Map;

/**
 * Created by laiHom on 2020/1/25.
 */
public interface EquipmentService {
    List<Equipment> list(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    int add(Equipment equipment);

    Equipment findById(int i);

    int update(Equipment equipment);

    void delete(String ids);

    int inputAll(Map<String, Object> map);

    List<Equipment> findAll();

    List<Equipment> getTel();
}
