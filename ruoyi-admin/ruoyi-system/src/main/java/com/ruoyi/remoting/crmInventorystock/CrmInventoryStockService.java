package com.ruoyi.remoting.crmInventorystock;

import com.ruoyi.remoting.crmInventorystock.wsdlfile.SelectStockAgeOutput;

import java.util.List;

public interface CrmInventoryStockService {

    /**
     * 批量查询CRM库存
     *
     * @param deptCode     区域编码
     * @param mainCustType 县网
     * @param productList  产品列表
     * @return 库存信息
     */
    List<SelectStockAgeOutput> listCrmStock(String deptCode, String mainCustType, List<String> productList);

}
