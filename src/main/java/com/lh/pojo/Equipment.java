package com.lh.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
@Component
public class Equipment {
    //材料设备主键
    private Integer eid;

    //泊松比
    @Excel(name = "泊松比")
    private BigDecimal poissonRatio;

    //弹性模量
    @Excel(name = "弹性模量")
    private String elasticModulus;

    //型号
    @Excel(name = "型号")
    private String equipmentModel;

    //价格
    @Excel(name = "价格")
    private BigDecimal equipmentPrice;

    //船舶主键
    private Integer shipId;

    @Excel(name = "状态",replace ={"丢弃_0","正常_1"})
    private Integer state;

    @Excel(name = "更新时间")
    private Date updateTime;

    private ShipInfo shipInfo;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public BigDecimal getPoissonRatio() {
        return poissonRatio;
    }

    public void setPoissonRatio(BigDecimal poissonRatio) {
        this.poissonRatio = poissonRatio;
    }

    public String getElasticModulus() {
        return elasticModulus;
    }

    public void setElasticModulus(String elasticModulus) {
        this.elasticModulus = elasticModulus == null ? null : elasticModulus.trim();
    }

    public String getEquipmentModel() {
        return equipmentModel;
    }

    public void setEquipmentModel(String equipmentModel) {
        this.equipmentModel = equipmentModel == null ? null : equipmentModel.trim();
    }

    public BigDecimal getEquipmentPrice() {
        return equipmentPrice;
    }

    public void setEquipmentPrice(BigDecimal equipmentPrice) {
        this.equipmentPrice = equipmentPrice;
    }

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
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

    public ShipInfo getShipInfo() {
        return shipInfo;
    }

    public void setShipInfo(ShipInfo shipInfo) {
        this.shipInfo = shipInfo;
    }

    public Equipment() {
    }

    public Equipment(Integer eid, BigDecimal poissonRatio, String elasticModulus, String equipmentModel, BigDecimal equipmentPrice, Integer shipId, Integer state, Date updateTime, ShipInfo shipInfo) {
        this.eid = eid;
        this.poissonRatio = poissonRatio;
        this.elasticModulus = elasticModulus;
        this.equipmentModel = equipmentModel;
        this.equipmentPrice = equipmentPrice;
        this.shipId = shipId;
        this.state = state;
        this.updateTime = updateTime;
        this.shipInfo = shipInfo;
    }
}