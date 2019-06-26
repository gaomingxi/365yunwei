package com.ruoyi.hybris.service;

import com.ruoyi.hybris.domain.UserGroupEntity;

import java.util.List;

/**
 * 客户基础 服务层
 *
 * @author mx
 * @date 2019-04-09
 */
public interface UserGroupService {

    /**
     * 客户基础信息查询
     *
     * @param code 客户编码
     * @return 客户信息实体
     */
    List<UserGroupEntity> listUserGroupsByCode(String code);

}
