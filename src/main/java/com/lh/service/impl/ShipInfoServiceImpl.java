package com.lh.service.impl;

import com.lh.dao.ShipInfoMapper;
import com.lh.pojo.ShipInfo;
import com.lh.service.ShipInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.lh.utils.CommentUtils.StringIds;

/**
 * Created by lh on 2020/1/21.
 */
@Service
public class ShipInfoServiceImpl implements ShipInfoService {
    @Autowired
    private ShipInfoMapper shipInfoMapper;
    @Override
    public List<ShipInfo> list(Map<String, Object> map) {
        return shipInfoMapper.list(map);
    }

    @Override
    public Integer getTotal(Map<String, Object> map) {
        return shipInfoMapper.getTotal(map);
    }

    @Override
    public int add(ShipInfo shipInfo) {
        shipInfo.setUpdateTime(new Date());
        return shipInfoMapper.insertSelective(shipInfo);
    }

    @Override
    public int update(ShipInfo shipInfo) {
        shipInfo.setUpdateTime(new Date());
        return shipInfoMapper.updateByPrimaryKeySelective(shipInfo);
    }

    @Override
    public ShipInfo findById(Integer shipId) {
        return shipInfoMapper.selectByPrimaryKey(shipId);
    }

    @Override
    public List<ShipInfo> getAll() {
        return shipInfoMapper.selectByExample(null);
    }

    @Override
    public void delete(String ids) {
        shipInfoMapper.updateList(StringIds(ids));
    }
}
