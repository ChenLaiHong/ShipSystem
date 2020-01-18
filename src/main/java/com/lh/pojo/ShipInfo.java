package com.lh.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ShipInfo {
    private Integer shipId;

    private BigDecimal totalLength;

    private BigDecimal typeWidth;

    private BigDecimal typeDepth;

    private BigDecimal displacement;

    private BigDecimal designDraft;

    private BigDecimal structuralDraft;

    private Integer holdNumber;

    private String temperature;

    private String cargoProportion;

    private String steamPressure;

    private String shipImage;

    private String otherFile;

    private Integer state;

    private Date updateTime;

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public BigDecimal getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(BigDecimal totalLength) {
        this.totalLength = totalLength;
    }

    public BigDecimal getTypeWidth() {
        return typeWidth;
    }

    public void setTypeWidth(BigDecimal typeWidth) {
        this.typeWidth = typeWidth;
    }

    public BigDecimal getTypeDepth() {
        return typeDepth;
    }

    public void setTypeDepth(BigDecimal typeDepth) {
        this.typeDepth = typeDepth;
    }

    public BigDecimal getDisplacement() {
        return displacement;
    }

    public void setDisplacement(BigDecimal displacement) {
        this.displacement = displacement;
    }

    public BigDecimal getDesignDraft() {
        return designDraft;
    }

    public void setDesignDraft(BigDecimal designDraft) {
        this.designDraft = designDraft;
    }

    public BigDecimal getStructuralDraft() {
        return structuralDraft;
    }

    public void setStructuralDraft(BigDecimal structuralDraft) {
        this.structuralDraft = structuralDraft;
    }

    public Integer getHoldNumber() {
        return holdNumber;
    }

    public void setHoldNumber(Integer holdNumber) {
        this.holdNumber = holdNumber;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public String getCargoProportion() {
        return cargoProportion;
    }

    public void setCargoProportion(String cargoProportion) {
        this.cargoProportion = cargoProportion == null ? null : cargoProportion.trim();
    }

    public String getSteamPressure() {
        return steamPressure;
    }

    public void setSteamPressure(String steamPressure) {
        this.steamPressure = steamPressure == null ? null : steamPressure.trim();
    }

    public String getShipImage() {
        return shipImage;
    }

    public void setShipImage(String shipImage) {
        this.shipImage = shipImage == null ? null : shipImage.trim();
    }

    public String getOtherFile() {
        return otherFile;
    }

    public void setOtherFile(String otherFile) {
        this.otherFile = otherFile == null ? null : otherFile.trim();
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