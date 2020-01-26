package com.lh.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class GoodsOperate {
    private Integer operateId;

    private Integer operateType;

    private BigDecimal bearingWeight;

    private BigDecimal operatePrice;

    private Integer state;

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