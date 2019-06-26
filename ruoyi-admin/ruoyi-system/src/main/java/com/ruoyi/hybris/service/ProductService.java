package com.ruoyi.hybris.service;

import com.ruoyi.hybris.domain.ProductEntity;
import com.ruoyi.remoting.crmInventorystock.wsdlfile.SelectStockAgeOutput;

import java.util.List;

public interface ProductService {

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
     * 使用子件查询套机信息
     *
     * @param code 子件编码
     * @return 套机信息
     */
    List<ProductEntity> listProductByComp(String code);

    /**
     * 查询产品日日顺库存
     * @param product 产品编码
     * @param deptCode 区域编码
     * @param popFlag pop标识
     * @return 库存信息
     */
    List<SelectStockAgeOutput> getProductStock(String product, String deptCode, String popFlag);

}
