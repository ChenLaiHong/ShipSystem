package com.lh.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class Repair {

    private Integer repairId;

    @Excel(name = "使用年限")
    private String useYear;

    @Excel(name = "管理")
    private String manage;

    @Excel(name = "船舶维修")
    private String shipMaintenance;

    private String shipReport;

    @Excel(name = "消费记录")
    private String consumption;

    @Excel(name = "状态",replace ={"丢弃_0","正常_1"})
    private Integer state;

    @Excel(name = "更新时间",exportFormat ="yyyy-MM-dd")
    private Date updateTime;

    private Integer shipId;

    private String equipmentUsage;

    private ShipInfo shipInfo;

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

    public ShipInfo getShipInfo() {
        return shipInfo;
    }

    public void setShipInfo(ShipInfo shipInfo) {
        this.shipInfo = shipInfo;
    }

    public Repair() {
    }

    public Repair(Integer repairId, String useYear, String manage, String shipMaintenance, String shipReport, String consumption, Integer state, Date updateTime, Integer shipId, String equipmentUsage, ShipInfo shipInfo) {
        this.repairId = repairId;
        this.useYear = useYear;
        this.manage = manage;
        this.shipMaintenance = shipMaintenance;
        this.shipReport = shipReport;
        this.consumption = consumption;
        this.state = state;
        this.updateTime = updateTime;
        this.shipId = shipId;
        this.equipmentUsage = equipmentUsage;
        this.shipInfo = shipInfo;
    }
}