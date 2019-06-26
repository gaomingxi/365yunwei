package com.ruoyi.hybris.mapper;

import com.ruoyi.hybris.domain.ProductEntity;

import java.util.List;

public interface ProductMapper {

    /**
     * 使用产品编码查询产品信息
     *
     * @param code 产品编码
     * @return 产品信息对象
     */
    List<ProductEntity> findProductByCode(String code);

    /**
     * 使用编码或名称模糊查询产品数据
     *
     * @param dto 参数对象
     * @return 产品信息对象集合
     */
    List<ProductEntity> listProductByLike(ProductEntity dto);

    /**
     * 使用自己查询套机编码
     *
     * @param code 产品编码
     * @return 产品信息对象
     */
    List<ProductEntity> compSelectTaoji(String code);

    /**
     * 批量查询产品数据
     *
     * @param dto 产品编码
     * @return 产品信息对象
     */
    List<ProductEntity> listProductByComp(ProductEntity dto);

}
