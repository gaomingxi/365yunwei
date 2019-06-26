package com.ruoyi.hybris.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.enums.GlobalEnums;
import com.ruoyi.hybris.domain.UserStreetEntity;
import com.ruoyi.hybris.mapper.UserStreetMapper;
import com.ruoyi.hybris.service.UserStreetService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Service("userStreetService")
public class UserStreetServiceImpl implements UserStreetService {

    @Resource
    private UserStreetMapper userStreetMapper;

    /**
     * 查询送达方列表
     *
     * @param code 售达方编码
     * @return 送达方列表
     */
    @Override
    @DataSource(DataSourceType.HYBRIS)
    public List<UserStreetEntity> list(String code) {
        List<UserStreetEntity> list = userStreetMapper.list(code);
        list.forEach(x -> {
            x.setFlagLabel(GlobalEnums.WarehouseStatus.getEnumByCode(x.getFlag()));
        });
        return list;
    }

}
