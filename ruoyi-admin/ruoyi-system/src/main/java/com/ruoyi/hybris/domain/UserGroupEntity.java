package com.ruoyi.hybris.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * 客户基础信息
 *
 * @author mx
 * @date 2019-04-09
 */
public class UserGroupEntity extends BaseEntity implements Serializable{

    private static final long serialVersionUID = -509314273541609303L;

    /**
     * 客户名称
     */
    private String customerCodeLabel;

    /**
     * 客户编码
     */
    private String customerCode;

    /**
     * 客户角色
     */
    private String customerRole;

    /**
     * 客户角色
     */
    private String customerRoleLabel;

    /**
     * 中心名称
     */
    private String tradeName;

    /**
     * 中心编码
     */
    private String tradeCode;

    /**
     * 销售组织
     */
    private String salesOrganization;

    /**
     * 大渠道
     */
    private String channel;

    /**
     * 小渠道
     */
    private String subChannel;

    /**
     * 区域编码
     */
    private String regionCode;

    /**
     * 子账号
     */
    private String uniqueId;

    public String getCustomerCodeLabel() {
        return customerCodeLabel;
    }

    public void setCustomerCodeLabel(String customerCodeLabel) {
        this.customerCodeLabel = customerCodeLabel;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerRole() {
        return customerRole;
    }

    public void setCustomerRole(String customerRole) {
        this.customerRole = customerRole;
    }

    public String getCustomerRoleLabel() {
        return customerRoleLabel;
    }

    public void setCustomerRoleLabel(String customerRoleLabel) {
        this.customerRoleLabel = customerRoleLabel;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public String getSalesOrganization() {
        return salesOrganization;
    }

    public void setSalesOrganization(String salesOrganization) {
        this.salesOrganization = salesOrganization;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getSubChannel() {
        return subChannel;
    }

    public void setSubChannel(String subChannel) {
        this.subChannel = subChannel;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

}
