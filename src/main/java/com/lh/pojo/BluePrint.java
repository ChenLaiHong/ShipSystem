package com.lh.pojo;

import java.util.Date;

public class BluePrint {
    private Integer printId;

    private String printName;

    private String printUrl;

    private String printAliasName;

    private String printType;

    private Date updateTime;

    private Integer state;

    public Integer getPrintId() {
        return printId;
    }

    public void setPrintId(Integer printId) {
        this.printId = printId;
    }

    public String getPrintName() {
        return printName;
    }

    public void setPrintName(String printName) {
        this.printName = printName == null ? null : printName.trim();
    }

    public String getPrintUrl() {
        return printUrl;
    }

    public void setPrintUrl(String printUrl) {
        this.printUrl = printUrl == null ? null : printUrl.trim();
    }

    public String getPrintAliasName() {
        return printAliasName;
    }

    public void setPrintAliasName(String printAliasName) {
        this.printAliasName = printAliasName == null ? null : printAliasName.trim();
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType == null ? null : printType.trim();
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
}