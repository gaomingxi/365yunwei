package com.ruoyi.hybris.mapper;

import com.ruoyi.hybris.domain.CustomerStoreEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 客户门店信息查询
 */
public interface CustomerStoreMapper {

    /**
     * 客户门店信息查询
     *
     * @param code 售达方编码
     * @return 客户门店信息
     */
    List<CustomerStoreEntity> list(@Param(value = "code") String code);

}
