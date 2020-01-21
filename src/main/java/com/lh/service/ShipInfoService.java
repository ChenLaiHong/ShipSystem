package com.lh.service;

import com.lh.pojo.ShipInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by lh on 2020/1/21.
 */
public interface ShipInfoService {
    List<ShipInfo> list(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    int add(ShipInfo shipInfo);

    int update(ShipInfo shipInfo);

    ShipInfo findById(Integer shipId);

    List<ShipInfo> getAll();
}
