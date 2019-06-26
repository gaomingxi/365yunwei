package com.ruoyi.hybris.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.hybris.domain.HeadOfficeCustomerEntity;
import com.ruoyi.hybris.mapper.HeadOfficeCustomerMapper;
import com.ruoyi.hybris.service.HeadOfficeCustomerService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 经营2000客户数据查询
 *
 * @author Mx
 */
@Service("headOfficeCustomerService")
public class HeadOfficeCustomerServiceImpl implements HeadOfficeCustomerService {

    @Resource
    private HeadOfficeCustomerMapper headOfficeCustomerMapper;

    /**
     * 经营2000总公司客户列表数据
     *
     * @param code 售达方编码
     * @return 付款方列表
     */
    @Override
    @DataSource(DataSourceType.HYBRIS)
    public List<HeadOfficeCustomerEntity> list(String code) {
        return headOfficeCustomerMapper.list(code);
    }

}
