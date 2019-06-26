package com.ruoyi.hybris.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 客户门店标识查询
 *
 * @author 高明希
 */
@Data
public class CustomerStoreEntity implements Serializable {

    private static final long serialVersionUID = 5987484024282385281L;

    /**
     * 客户编码
     */
    private String customerCode;

    /**
     * 送达方编码
     */
    private String streetCode;

    /**
     * 送达方名称
     */
    private String streetCodeLabel;

    /**
     * 门店标识
     */
    private String storeFlag;

    /**
     * 门店标识
     */
    private String storeFlagLabel;

    /**
     * 小渠道
     */
    private String industryClass;

    /**
     * 大渠道
     */
    private String customerCategory;

    /**
     * 是否冻结
     */
    private String deleteFlag;

    /**
     * 最后更新时间
     */
    private String lastUpdateTime;

}
