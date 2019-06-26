package com.ruoyi.hybris.domain;

import java.io.Serializable;

/**
 * 经营总公司2000客户
 *
 * @author 高明希
 */
public class HeadOfficeCustomerEntity implements Serializable {

    private static final long serialVersionUID = -4155357603741319336L;

    /**
     * 客户编码
     */
    private String customerCode;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 销售组织
     */
    private String saleCode;

    /**
     * 工贸
     */
    private String tradeCode;

    /**
     * 类型，1 山东日日顺，2 水家电
     */
    private String customerType;

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSaleCode() {
        return saleCode;
    }

    public void setSaleCode(String saleCode) {
        this.saleCode = saleCode;
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}
