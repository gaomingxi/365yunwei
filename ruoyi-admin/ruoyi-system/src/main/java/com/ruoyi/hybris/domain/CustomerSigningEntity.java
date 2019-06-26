package com.ruoyi.hybris.domain;

import java.io.Serializable;

/**
 * 客户签约Entity
 */
public class CustomerSigningEntity implements Serializable {

    private static final long serialVersionUID = -5015146876606298969L;

    /**
     * 客户编码
     */

    private String customerCode;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 品牌名称
     */
    private String brandLabel;

    /**
     * 产品组
     */
    private String productGroup;

    /**
     * 产品组名称
     */
    private String productGroupLabel;

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrandLabel() {
        return brandLabel;
    }

    public void setBrandLabel(String brandLabel) {
        this.brandLabel = brandLabel;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public String getProductGroupLabel() {
        return productGroupLabel;
    }

    public void setProductGroupLabel(String productGroupLabel) {
        this.productGroupLabel = productGroupLabel;
    }
}
