package com.ruoyi.hybris.service;

import com.ruoyi.hybris.domain.HeadOfficeCustomerEntity;

import java.util.List;

/**
 * 经营2000客户数据查询
 *
 * @author Mx
 */
public interface HeadOfficeCustomerService {

    /**
     * 经营2000总公司客户列表数据
     *
     * @param code 售达方编码
     * @return 付款方列表
     */
    List<HeadOfficeCustomerEntity> list(String code);

}
