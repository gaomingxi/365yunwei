package com.ruoyi.hybris.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.enums.GlobalEnums;
import com.ruoyi.hybris.domain.UserFukuanEntity;
import com.ruoyi.hybris.mapper.UserFukuanMapper;
import com.ruoyi.hybris.service.UserFukuanService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Service("userFukuanService")
public class UserFukuanServiceImpl implements UserFukuanService {

    private String prefix = "hybris/userfukuan";

    @Resource
    private UserFukuanMapper userFukuanMapper;

    @RequiresPermissions("hybris:userfukuan:view")
    @GetMapping()
    public String usergroup() {
        return prefix + "/userfukuan";
    }

    @Override
    @DataSource(DataSourceType.HYBRIS)
    public List<UserFukuanEntity> lsit(String code) {
        List<UserFukuanEntity> list = userFukuanMapper.list(code);
        list.forEach(x -> {
            x.setIsDeleteLabel(GlobalEnums.FreezeStatus.getEnumByCode(x.getIsDelete()));
            x.setFukuanTypeLabel(GlobalEnums.FukuanType.getEnumByCode(x.getFukuanType()));
        });
        return list;
    }
}
