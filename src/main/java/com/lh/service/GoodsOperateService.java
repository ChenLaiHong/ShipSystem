package com.lh.service;

import com.lh.pojo.GoodsOperate;

import java.util.List;
import java.util.Map;

/**
 * Created by laiHom on 2020/1/26.
 */
public interface GoodsOperateService {
    List<GoodsOperate> list(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    int add(GoodsOperate goodsOperate);

    GoodsOperate findById(int i);

    int update(GoodsOperate goodsOperate);

    void delete(String ids);

    List<GoodsOperate> findAll();

    List<GoodsOperate> getTel();
}
