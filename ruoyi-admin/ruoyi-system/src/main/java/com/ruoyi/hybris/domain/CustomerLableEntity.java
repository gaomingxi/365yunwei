package com.ruoyi.hybris.domain;

import java.io.Serializable;

/**
 * 客户品牌标签
 */
public class CustomerLableEntity implements Serializable {

    private static final long serialVersionUID = 8423999714609718110L;

    /** 客户编码 */
    private String b2b_user;

    /** 标签 */
    private String lable_id;

    /**  */
    private String label_code;

    /** 标签名称 */
    private String label_name;

    /** 是否删除 */
    private String is_del;

    /** 更新时间 */
    private String insert_update;

}
