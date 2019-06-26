package com.ruoyi.hybris.mapper;

import com.ruoyi.hybris.domain.CustomerSigningEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 客户签约查询
 */
public interface CustomerSigningMapper {

    List<CustomerSigningEntity> list(@Param(value = "code") String code);

}
