package com.lh.pojo;

import java.util.Date;

public class Repair {
    private Integer repairId;

    private String useYear;

    private String manage;

    private String shipMaintenance;

    private String shipReport;

    private String consumption;

    private Integer state;

    private Date updateTime;

    private Integer shipId;

    private String equipmentUsage;

    public Integer getRepairId() {
        return repairId;
    }

    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }

    public String getUseYear() {
        return useYear;
    }

    public void setUseYear(String useYear) {
        this.useYear = useYear == null ? null : useYear.trim();
    }

    public String getManage() {
        return manage;
    }

    public void setManage(String manage) {
        this.manage = manage == null ? null : manage.trim();
    }

    public String getShipMaintenance() {
        return shipMaintenance;
    }

    public void setShipMaintenance(String shipMaintenance) {
        this.shipMaintenance = shipMaintenance == null ? null : shipMaintenance.trim();
    }

    public String getShipReport() {
        return shipReport;
    }

    public void setShipReport(String shipReport) {
        this.shipReport = shipReport == null ? null : shipReport.trim();
    }

    public String getConsumption() {
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption == null ? null : consumption.trim();
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

    public String getEquipmentUsage() {
        return equipmentUsage;
    }

    public void setEquipmentUsage(String equipmentUsage) {
        this.equipmentUsage = equipmentUsage == null ? null : equipmentUsage.trim();
    }
}