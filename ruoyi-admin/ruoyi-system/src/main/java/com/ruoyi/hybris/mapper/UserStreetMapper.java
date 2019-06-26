package com.ruoyi.hybris.mapper;

import com.ruoyi.hybris.domain.UserStreetEntity;

import java.util.List;

/**
 * 客户送达方
 *
 * @author 高明希
 */
public interface UserStreetMapper {

    /**
     * 查询送达方列表
     *
     * @param code 售达方编码
     * @return 送达方列表
     */
    List<UserStreetEntity> list(String code);

}
