package com.ruoyi.hybris.domain;

import com.ruoyi.common.core.domain.BaseEntity;

import java.io.Serializable;

/**
 * @author 高明希
 */
public class UserFukuanEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -5927500391424393186L;

    /**
     * 售达方编码
     */
    private String shoudaCode;

    /**
     * 付款方编码
     */
    private String fukuanCode;

    /**
     * 付款方名称
     */
    private String fukuanName;

    /**
     * 付款方类型
     */
    private String fukuanType;

    /**
     * 付款方类型
     */
    private String fukuanTypeLabel;

    /**
     * 删除标记
     */
    private String isDelete;

    /**
     * 删除标记
     */
    private String isDeleteLabel;

    public String getShoudaCode() {
        return shoudaCode;
    }

    public void setShoudaCode(String shoudaCode) {
        this.shoudaCode = shoudaCode;
    }

    public String getFukuanCode() {
        return fukuanCode;
    }

    public void setFukuanCode(String fukuanCode) {
        this.fukuanCode = fukuanCode;
    }

    public String getFukuanName() {
        return fukuanName;
    }

    public void setFukuanName(String fukuanName) {
        this.fukuanName = fukuanName;
    }

    public String getFukuanType() {
        return fukuanType;
    }

    public void setFukuanType(String fukuanType) {
        this.fukuanType = fukuanType;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getIsDeleteLabel() {
        return isDeleteLabel;
    }

    public void setIsDeleteLabel(String isDeleteLabel) {
        this.isDeleteLabel = isDeleteLabel;
    }

    public String getFukuanTypeLabel() {
        return fukuanTypeLabel;
    }

    public void setFukuanTypeLabel(String fukuanTypeLabel) {
        this.fukuanTypeLabel = fukuanTypeLabel;
    }
}
