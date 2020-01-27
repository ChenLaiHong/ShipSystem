package com.lh.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
@Component
public class GoodsOperate {
    private Integer operateId;

    @Excel(name = "类型",replace ={"客船_1","干货船_2","液货船_3","滚装船_4"})
    private Integer operateType;

    @Excel(name = "承载重量")
    private BigDecimal bearingWeight;

    @Excel(name = "货物价格")
    private BigDecimal operatePrice;

    private Integer state;

    @Excel(name = "更新时间",exportFormat ="yyyy-MM-dd")
    private Date updateTime;

    private Integer shipId;

    private ShipInfo shipInfo;

    public Integer getOperateId() {
        return operateId;
    }

    public void setOperateId(Integer operateId) {
        this.operateId = operateId;
    }

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public BigDecimal getBearingWeight() {
        return bearingWeight;
    }

    public void setBearingWeight(BigDecimal bearingWeight) {
        this.bearingWeight = bearingWeight;
    }

    public BigDecimal getOperatePrice() {
        return operatePrice;
    }

    public void setOperatePrice(BigDecimal operatePrice) {
        this.operatePrice = operatePrice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public ShipInfo getShipInfo() {
        return shipInfo;
    }

    public void setShipInfo(ShipInfo shipInfo) {
        this.shipInfo = shipInfo;
    }

    public GoodsOperate() {
    }

    public GoodsOperate(Integer operateId, Integer operateType, BigDecimal bearingWeight, BigDecimal operatePrice, Integer state, Date updateTime, Integer shipId, ShipInfo shipInfo) {
        this.operateId = operateId;
        this.operateType = operateType;
        this.bearingWeight = bearingWeight;
        this.operatePrice = operatePrice;
        this.state = state;
        this.updateTime = updateTime;
        this.shipId = shipId;
        this.shipInfo = shipInfo;
    }
}