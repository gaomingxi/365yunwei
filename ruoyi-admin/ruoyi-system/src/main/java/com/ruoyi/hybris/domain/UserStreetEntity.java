package com.ruoyi.hybris.domain;

import java.io.Serializable;

public class UserStreetEntity implements Serializable {

    private static final long serialVersionUID = -6787908401507898472L;

    /**
     * 送达方编码
     */
    private String streetCode;

    /**
     * 送达方名称
     */
    private String streetLabel;

    /**
     * 送达方地址
     */
    private String district;

    /**
     * 配送中心编码
     */
    private String warehouseCode;

    /**
     * 主辅仓标记
     */
    private String flag;

    /**
     * 主辅仓标记
     */
    private String flagLabel;

    /**
     * 工贸编码
     */
    private String tradeCode;

    /**
     * 工贸名称
     */
    private String tradeLabel;

    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }

    public String getStreetLabel() {
        return streetLabel;
    }

    public void setStreetLabel(String streetLabel) {
        this.streetLabel = streetLabel;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public String getTradeLabel() {
        return tradeLabel;
    }

    public void setTradeLabel(String tradeLabel) {
        this.tradeLabel = tradeLabel;
    }

    public String getFlagLabel() {
        return flagLabel;
    }

    public void setFlagLabel(String flagLabel) {
        this.flagLabel = flagLabel;
    }
}
