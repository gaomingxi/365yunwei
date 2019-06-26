package com.ruoyi.hybris.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 产品信息
 *
 * @author 高明希
 */
@Data
public class ProductEntity implements Serializable {

    private static final long serialVersionUID = 5503025600596506157L;

    /**
     * 产品编码
     */
    private String productCode;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品组
     */
    private String productGroup;

    /**
     * 产品品牌
     */
    private String productBrand;

    /**
     * 产品品牌
     */
    private String productBrandLabel;

    /**
     * 单位：台，套
     */
    private String productUnit;

    /**
     * 单位：台，套
     */
    private String productUnitLabel;

    /**
     * 子件信息
     */
    private String compProducts;

    /**
     * 高端标识
     */
    private String highEnd;

    /**
     * 是否机壳
     */
    private String jike;

    /**
     * 是否机壳
     */
    private String jikeLabel;

    private List<String> productList;

}
