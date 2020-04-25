package com.lh.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class TainItems {

    @Excel(name = "序号", width = 30)
    private Integer itemId;

    @Excel(name = "项目名称", width = 30)
    private String itemName;

    @Excel(name = "项目要求", width = 30)
    private String itemDemand;

    @Excel(name = "项目周期", width = 30)
    private String itemCycle;

    private Date updateTime;

    private Integer state;

    private Integer mainTainId;
    
    private MainTain mainTain;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemDemand() {
        return itemDemand;
    }

    public void setItemDemand(String itemDemand) {
        this.itemDemand = itemDemand == null ? null : itemDemand.trim();
    }

    public String getItemCycle() {
        return itemCycle;
    }

    public void setItemCycle(String itemCycle) {
        this.itemCycle = itemCycle == null ? null : itemCycle.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getMainTainId() {
        return mainTainId;
    }

    public void setMainTainId(Integer mainTainId) {
        this.mainTainId = mainTainId;
    }

    public MainTain getMainTain() {
        return mainTain;
    }

    public void setMainTain(MainTain mainTain) {
        this.mainTain = mainTain;
    }

    public TainItems() {
    }

    public TainItems(Integer itemId, String itemName, String itemDemand, String itemCycle, Date updateTime, Integer state, Integer mainTainId, MainTain mainTain) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDemand = itemDemand;
        this.itemCycle = itemCycle;
        this.updateTime = updateTime;
        this.state = state;
        this.mainTainId = mainTainId;
        this.mainTain = mainTain;
    }
}