package com.lh.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Component
public class ShipInfo {
    private Integer shipId;

    @Excel(name = "名称")
    private String shipName;

    @Excel(name = "总长")
    private BigDecimal totalLength;

    @Excel(name = "型宽")
    private BigDecimal typeWidth;

    @Excel(name = "型深")
    private BigDecimal typeDepth;

    @Excel(name = "排水量")
    private BigDecimal displacement;

    @Excel(name = "设计型吃水")
    private BigDecimal designDraft;

    @Excel(name = "结构型吃水")
    private BigDecimal structuralDraft;

    @Excel(name = "设计货舱个数")
    private Integer holdNumber;

    @Excel(name = "液货船设计温度")
    private String temperature;

    @Excel(name = "设计液货比重")
    private String cargoProportion;

    @Excel(name = "设计液货舱顶蒸汽压力")
    private String steamPressure;

    private String shipImage;

    private String otherFile;

    @Excel(name = "状态",replace ={"抛弃_0","正常_1"})
    private Integer state;

    private Date updateTime;

    private List<Equipment> equipmentList;

    private List<GoodsOperate> goodsOperateList;

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
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

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }

    public List<GoodsOperate> getGoodsOperateList() {
        return goodsOperateList;
    }

    public void setGoodsOperateList(List<GoodsOperate> goodsOperateList) {
        this.goodsOperateList = goodsOperateList;
    }

    public ShipInfo() {
    }

    public ShipInfo(Integer shipId, String shipName, BigDecimal totalLength, BigDecimal typeWidth, BigDecimal typeDepth, BigDecimal displacement, BigDecimal designDraft, BigDecimal structuralDraft, Integer holdNumber, String temperature, String cargoProportion, String steamPressure, String shipImage, String otherFile, Integer state, Date updateTime, List<Equipment> equipmentList, List<GoodsOperate> goodsOperateList) {
        this.shipId = shipId;
        this.shipName = shipName;
        this.totalLength = totalLength;
        this.typeWidth = typeWidth;
        this.typeDepth = typeDepth;
        this.displacement = displacement;
        this.designDraft = designDraft;
        this.structuralDraft = structuralDraft;
        this.holdNumber = holdNumber;
        this.temperature = temperature;
        this.cargoProportion = cargoProportion;
        this.steamPressure = steamPressure;
        this.shipImage = shipImage;
        this.otherFile = otherFile;
        this.state = state;
        this.updateTime = updateTime;
        this.equipmentList = equipmentList;
        this.goodsOperateList = goodsOperateList;
    }
}