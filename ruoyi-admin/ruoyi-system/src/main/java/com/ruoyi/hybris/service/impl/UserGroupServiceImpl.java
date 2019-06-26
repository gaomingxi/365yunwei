package com.ruoyi.hybris.service.impl;

import com.ruoyi.common.enums.GlobalEnums;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.hybris.domain.UserGroupEntity;
import com.ruoyi.hybris.mapper.UserGroupMapper;
import com.ruoyi.hybris.service.UserGroupService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Service("userGroupService")
public class UserGroupServiceImpl implements UserGroupService {

    private String prefix = "hybris/usergroup";

    @Resource
    private UserGroupMapper userGroupMapper;

    @RequiresPermissions("hybris:usergroups:view")
    @GetMapping()
    public String usergroup() {
        return prefix + "/usergroup";
    }

    @Override
    @DataSource(DataSourceType.HYBRIS)
    public List<UserGroupEntity> listUserGroupsByCode(String code) {
        List<UserGroupEntity> resultList = userGroupMapper.listUserGroupsByCode(code);
        resultList.forEach(x -> {
            x.setCustomerRoleLabel(GlobalEnums.CustomerRoles.getEnumByCode(x.getCustomerRole()));
        });
        return resultList;
    }

}
