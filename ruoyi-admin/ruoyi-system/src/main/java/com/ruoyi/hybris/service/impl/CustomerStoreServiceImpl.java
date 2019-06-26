package com.ruoyi.hybris.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.enums.GlobalEnums;
import com.ruoyi.hybris.domain.CustomerStoreEntity;
import com.ruoyi.hybris.mapper.CustomerStoreMapper;
import com.ruoyi.hybris.service.CustomerStoreService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("customerStoreService")
public class CustomerStoreServiceImpl implements CustomerStoreService {

    @Resource
    private CustomerStoreMapper customerStoreMapper;

    /**
     * 客户门店信息查询
     *
     * @param code 售达方编码
     * @return 客户门店信息
     */
    @Override
    @DataSource(DataSourceType.B2BSYNC)
    public List<CustomerStoreEntity> list(String code) {
        List<CustomerStoreEntity> list = customerStoreMapper.list(code);
        list.forEach(x -> x.setStoreFlagLabel(GlobalEnums.StoreType.getEnumByCode(x.getStoreFlag())));
        return list;
    }

}
