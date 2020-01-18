package com.lh.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Equipment {
    private Integer eid;

    private BigDecimal poissonRatio;

    private String elasticModulus;

    private String equipmentModel;

    private BigDecimal equipmentPrice;

    private Integer shipId;

    private Integer state;

    private Date updateTime;

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
}