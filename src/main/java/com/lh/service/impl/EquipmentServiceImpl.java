package com.lh.service.impl;

import com.lh.dao.EquipmentMapper;
import com.lh.pojo.Equipment;
import com.lh.pojo.EquipmentExample;
import com.lh.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.lh.utils.CommentUtils.StringIds;

/**
 * Created by laiHom on 2020/1/25.
 */
@Service
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    private EquipmentMapper equipmentMapper;

    @Override
    public List<Equipment> list(Map<String, Object> map) {
        return equipmentMapper.list(map);
    }

    @Override
    public Integer getTotal(Map<String, Object> map) {
        return equipmentMapper.getTotal(map);
    }

    @Override
    public int add(Equipment equipment) {
        equipment.setUpdateTime(new Date());
        return equipmentMapper.insertSelective(equipment);
    }

    @Override
    public Equipment findById(int i) {
        return equipmentMapper.selectByPrimaryKey(i);
    }

    @Override
    public int update(Equipment equipment) {
        equipment.setUpdateTime(new Date());
        return equipmentMapper.updateByPrimaryKeySelective(equipment);
    }

    @Override
    public void delete(String ids) {
        equipmentMapper.updateList(StringIds(ids));
    }

    @Override
    public int inputAll(Map<String, Object> map) {
        return equipmentMapper.inputAll(map);
    }

    @Override
    public List<Equipment> findAll() {
        EquipmentExample equipmentExample = new EquipmentExample();
        equipmentExample.createCriteria().andStateEqualTo(1);
        return equipmentMapper.selectByExample(equipmentExample);
    }

    @Override
    public List<Equipment> getTel() {
        Equipment equipment = new Equipment();
        equipment.setElasticModulus("test");
        equipment.setEquipmentModel("test");
        equipment.setEquipmentPrice(BigDecimal.valueOf(5.6));
        equipment.setPoissonRatio(BigDecimal.valueOf(2.3));
        equipment.setState(1);
        equipment.setUpdateTime(new Date());
        List<Equipment> equipmentList = new ArrayList<>();
        equipmentList.add(equipment);
        return equipmentList;
    }
}
