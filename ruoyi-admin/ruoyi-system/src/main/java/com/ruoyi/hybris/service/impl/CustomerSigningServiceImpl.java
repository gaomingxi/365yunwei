package com.ruoyi.hybris.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.enums.GlobalEnums;
import com.ruoyi.hybris.domain.CustomerSigningEntity;
import com.ruoyi.hybris.mapper.CustomerSigningMapper;
import com.ruoyi.hybris.service.CustomerSigningService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("customerSigningService")
public class CustomerSigningServiceImpl implements CustomerSigningService {

    @Resource
    private CustomerSigningMapper customerSigningMapper;

    /**
     * 客户签约
     *
     * @param code 售达方编码
     * @return 签约数据
     */
    @DataSource(DataSourceType.HYBRIS)
    @Override
    public List<CustomerSigningEntity> list(String code) {
        List<CustomerSigningEntity> resultList = customerSigningMapper.list(code);
        resultList.forEach(x -> x.setBrandLabel(GlobalEnums.BrandType.getEnumByCode(x.getBrand())));
        return resultList;
    }
}
