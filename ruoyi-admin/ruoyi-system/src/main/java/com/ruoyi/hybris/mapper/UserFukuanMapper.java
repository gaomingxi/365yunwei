package com.ruoyi.hybris.mapper;

import com.ruoyi.hybris.domain.UserFukuanEntity;

import java.util.List;

public interface UserFukuanMapper {

    /**
     * 查询售达方下付款方列表数据
     * @param code 售达方编码
     * @return 付款方列表
     */
    List<UserFukuanEntity> list(String code);

}
