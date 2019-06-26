package com.ruoyi.hybris.service;

import com.ruoyi.hybris.domain.CustomerSigningEntity;

import java.util.List;

public interface CustomerSigningService {

    /**
     * 查询送达方列表
     *
     * @param code 售达方编码
     * @return 送达方列表
     */
    List<CustomerSigningEntity> list(String code);

}
