package com.ruoyi.hybris.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.enums.GlobalEnums;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.hybris.domain.ProductEntity;
import com.ruoyi.hybris.mapper.ProductMapper;
import com.ruoyi.hybris.service.ProductService;
import com.ruoyi.remoting.crmInventorystock.CrmInventoryStockService;
import com.ruoyi.remoting.crmInventorystock.wsdlfile.SelectStockAgeOutput;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Resource
    private CrmInventoryStockService crmInventoryStockService;

    /**
     * 使用产品编码查询产品信息
     *
     * @param code 产品编码
     * @return 产品信息对象
     */
    @Override
    @DataSource(DataSourceType.HYBRIS)
    public List<ProductEntity> findProductByCode(String code) {
        List<ProductEntity> list = productMapper.findProductByCode(code);
        getProductEntityCodeToLabel(list);
        return list;
    }

    private void getProductEntityCodeToLabel(List<ProductEntity> list) {
        list.forEach(x -> {
            x.setProductBrandLabel(GlobalEnums.BrandType.getEnumByCode(x.getProductBrand()));
            x.setProductUnitLabel(x.getProductUnit() + "-" + GlobalEnums.ProductUnitType.getEnumByCode(x.getProductUnit()));
        });
    }

    /**
     * 使用编码或名称模糊查询产品数据
     *
     * @param dto 参数对象
     * @return 产品信息对象集合
     */
    @Override
    @DataSource(DataSourceType.HYBRIS)
    public List<ProductEntity> listProductByLike(ProductEntity dto) {
        return productMapper.listProductByLike(dto);
    }

    /**
     * 使用子件查询套机编码
     *
     * @param code 产品编码
     * @return 产品信息对象
     */
    @Override
    @DataSource(DataSourceType.HYBRIS)
    public List<ProductEntity> compSelectTaoji(String code) {
        return productMapper.compSelectTaoji(code);
    }

    /**
     * 使用子件查询套机信息
     *
     * @param code 子件编码
     * @return 套机信息
     */
    @Override
    @DataSource(DataSourceType.HYBRIS)
    public List<ProductEntity> listProductByComp(String code) {
        // 查询套机编码
        List<ProductEntity> taojiList = productMapper.compSelectTaoji(code);
        if (CollectionUtils.isEmpty(taojiList)) {
            return new ArrayList<>();
        }
        List<String> products = new ArrayList<>();
        taojiList.forEach(x -> products.add(x.getProductCode()));
        ProductEntity dto = new ProductEntity();
        dto.setProductList(products);
        // 查询套机信息
        List<ProductEntity> resultList = productMapper.listProductByComp(dto);
        if (CollectionUtils.isNotEmpty(resultList)) {
            getProductEntityCodeToLabel(resultList);
        }
        return resultList;
    }

    /**
     * 查询产品日日顺库存
     * @param product 产品编码
     * @param deptCode 区域编码
     * @param popFlag pop标识
     * @return 库存信息
     */
    @Override
    @DataSource(DataSourceType.HYBRIS)
    public List<SelectStockAgeOutput> getProductStock(String product, String deptCode, String popFlag){
        if(StringUtils.isBlank(product)){
            return new ArrayList<>();
        }
        // 查询产品信息
        List<ProductEntity> list = productMapper.findProductByCode(product);
        if(CollectionUtils.isEmpty(list)){
            return new ArrayList<>();
        }
        List<String> productList = new ArrayList<>();
        list.forEach(x->{
            if(GlobalEnums.ProductUnitType.TAO.getKwType().equals(x.getProductUnit())){
                List<String> lis = Arrays.asList(x.getCompProducts().split(","));
                productList.addAll(lis);
            }else {
                productList.add(x.getProductCode());
            }
        });
        // 查询库存
        return crmInventoryStockService.listCrmStock(deptCode,popFlag,productList);
    }
}
