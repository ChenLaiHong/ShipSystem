package com.lh.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class MainTain {
    private Integer mainTainId;

    @Excel(name = "保养名称", width = 30 , needMerge = true)
    private String mainTainName;

    @Excel(name = "备注", width = 30 , needMerge = true)
    private String mainTainRemark;

    private Date updateTime;

    private Integer state;

    @ExcelCollection(name = "项目信息")
    private List<TainItems> itemsList;

    public Integer getMainTainId() {
        return mainTainId;
    }

    public void setMainTainId(Integer mainTainId) {
        this.mainTainId = mainTainId;
    }

    public String getMainTainName() {
        return mainTainName;
    }

    public void setMainTainName(String mainTainName) {
        this.mainTainName = mainTainName == null ? null : mainTainName.trim();
    }

    public String getMainTainRemark() {
        return mainTainRemark;
    }

    public void setMainTainRemark(String mainTainRemark) {
        this.mainTainRemark = mainTainRemark == null ? null : mainTainRemark.trim();
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

    public List<TainItems> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<TainItems> itemsList) {
        this.itemsList = itemsList;
    }

    public MainTain() {
    }

    public MainTain(Integer mainTainId, String mainTainName, String mainTainRemark, Date updateTime, Integer state, List<TainItems> itemsList) {
        this.mainTainId = mainTainId;
        this.mainTainName = mainTainName;
        this.mainTainRemark = mainTainRemark;
        this.updateTime = updateTime;
        this.state = state;
        this.itemsList = itemsList;
    }
}