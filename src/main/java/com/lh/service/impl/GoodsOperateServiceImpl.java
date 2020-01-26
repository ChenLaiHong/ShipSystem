package com.lh.service.impl;

import com.lh.dao.GoodsOperateMapper;
import com.lh.pojo.GoodsOperate;
import com.lh.pojo.GoodsOperateExample;
import com.lh.service.GoodsOperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.lh.utils.CommentUtils.StringIds;

/**
 * Created by laiHom on 2020/1/26.
 */
@Service
public class GoodsOperateServiceImpl implements GoodsOperateService {
    @Autowired
    private GoodsOperateMapper goodsOperateMapper;

    @Override
    public List<GoodsOperate> list(Map<String, Object> map) {
        return goodsOperateMapper.list(map);
    }

    @Override
    public Integer getTotal(Map<String, Object> map) {
        return goodsOperateMapper.getTotal(map);
    }

    @Override
    public int add(GoodsOperate goodsOperate) {
        goodsOperate.setState(1);
        goodsOperate.setUpdateTime(new Date());
        return goodsOperateMapper.insertSelective(goodsOperate);
    }

    @Override
    public GoodsOperate findById(int i) {
        return goodsOperateMapper.selectByPrimaryKey(i);
    }

    @Override
    public int update(GoodsOperate goodsOperate) {
        goodsOperate.setUpdateTime(new Date());
        return goodsOperateMapper.updateByPrimaryKeySelective(goodsOperate);
    }

    @Override
    public void delete(String ids) {
        goodsOperateMapper.updateList(StringIds(ids));
    }

    @Override
    public List<GoodsOperate> findAll() {
        GoodsOperateExample goodsOperateExample = new GoodsOperateExample();
        goodsOperateExample.createCriteria().andStateEqualTo(1);
        return goodsOperateMapper.selectByExample(goodsOperateExample);
    }

    @Override
    public List<GoodsOperate> getTel() {
        GoodsOperate goodsOperate = new GoodsOperate();
        goodsOperate.setUpdateTime(new Date());
        goodsOperate.setState(1);
        goodsOperate.setBearingWeight(BigDecimal.valueOf(5.6));
        goodsOperate.setOperatePrice(BigDecimal.valueOf(66.3));
        goodsOperate.setOperateType(1);
        List<GoodsOperate> goodsOperateList = new ArrayList<>();
        goodsOperateList.add(goodsOperate);
        return goodsOperateList;
    }
}
