package com.ruoyi.hybris.service;

import com.ruoyi.hybris.domain.UserStreetEntity;

import java.util.List;

/**
 * @author MX
 */
public interface UserStreetService {

    /**
     * 查询送达方列表
     *
     * @param code 售达方编码
     * @return 送达方列表
     */
    List<UserStreetEntity> list(String code);

}
