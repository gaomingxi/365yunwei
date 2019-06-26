package com.ruoyi.hybris.mapper;

import com.ruoyi.hybris.domain.UserGroupEntity;

import java.util.List;

/**
 * 客户基础 数据层
 *
 * @author mx
 * @date 2019-04-09
 */
public interface UserGroupMapper {

    List<UserGroupEntity> listUserGroupsByCode(String code);

}