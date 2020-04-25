package com.lh.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class GoodsOperate {
    private Integer operateId;

    private String operateName;

    private BigDecimal bearingWeight;

    private Integer thingsType;

    private Integer operateType;

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

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName == null ? null : operateName.trim();
    }

    public BigDecimal getBearingWeight() {
        return bearingWeight;
    }

    public void setBearingWeight(BigDecimal bearingWeight) {
        this.bearingWeight = bearingWeight;
    }

    public Integer getThingsType() {
        return thingsType;
    }

    public void setThingsType(Integer thingsType) {
        this.thingsType = thingsType;
    }

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
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

    public GoodsOperate(Integer operateId, String operateName, BigDecimal bearingWeight, Integer thingsType, Integer operateType, BigDecimal operatePrice, Integer state, Date updateTime, Integer shipId, ShipInfo shipInfo) {
        this.operateId = operateId;
        this.operateName = operateName;
        this.bearingWeight = bearingWeight;
        this.thingsType = thingsType;
        this.operateType = operateType;
        this.operatePrice = operatePrice;
        this.state = state;
        this.updateTime = updateTime;
        this.shipId = shipId;
        this.shipInfo = shipInfo;
    }
}