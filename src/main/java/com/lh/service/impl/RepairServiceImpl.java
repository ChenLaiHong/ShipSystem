package com.lh.service.impl;

import com.lh.dao.RepairMapper;
import com.lh.pojo.Repair;
import com.lh.pojo.RepairExample;
import com.lh.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.lh.utils.CommentUtils.StringIds;

/**
 * Created by laiHom on 2020/1/26.
 */
@Service
public class RepairServiceImpl implements RepairService {
    @Autowired
    private RepairMapper repairMapper;

    @Override
    public List<Repair> list(Map<String, Object> map) {
        return repairMapper.list(map);
    }

    @Override
    public Integer getTotal(Map<String, Object> map) {
        return repairMapper.getTotal(map);
    }

    @Override
    public int add(Repair repair) {
        repair.setState(1);
        repair.setUpdateTime(new Date());
        return repairMapper.insertSelective(repair);
    }

    @Override
    public Repair findById(int i) {
        return repairMapper.selectByPrimaryKey(i);
    }

    @Override
    public int update(Repair repair) {
        repair.setUpdateTime(new Date());
        return repairMapper.updateByPrimaryKeySelective(repair);
    }

    @Override
    public void delete(String ids) {
        repairMapper.updateList(StringIds(ids));
    }

    @Override
    public List<Repair> findAll() {
        RepairExample repairExample = new RepairExample();
        repairExample.createCriteria().andStateEqualTo(1);
        return repairMapper.selectByExample(repairExample);
    }

    @Override
    public List<Repair> getTel() {
        Repair repair = new Repair();
        repair.setUseYear("4年");
        repair.setUpdateTime(new Date());
        repair.setConsumption("test");
        repair.setEquipmentUsage("test");
        repair.setManage("mmmm");
        repair.setShipMaintenance("aaaa");
        List<Repair> repairList = new ArrayList<>();
        repairList.add(repair);
        return repairList;
    }
}
