package com.ruoyi.remoting.crmInventorystock.impl;

import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.file.ReadPropertiesFileUtil;
import com.ruoyi.remoting.crmInventorystock.CrmInventoryStockService;
import com.ruoyi.remoting.crmInventorystock.wsdlfile.QueryStockAgeFromIHSToB2B;
import com.ruoyi.remoting.crmInventorystock.wsdlfile.QueryStockAgeFromIHSToB2B_Service;

import com.ruoyi.remoting.crmInventorystock.wsdlfile.SelectStockAgeOutput;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * @author 高明希
 */
@Service("crmInventoryStockService")
public class CrmInventoryStockServiceImpl implements CrmInventoryStockService {

    @Value("${wsdl.path}")
    private String wsdlPath;

    @Value("${wsdl.crmInventoryStockUrl}")
    private String crmInventoryStockUrl;

    /**
     * 查询CRM库存
     *
     * @param saleCustCode 管理客户
     * @param mainCustType 县网
     * @param deptCode     区域编码
     * @param invcode      产品编码
     * @return
     * @throws MalformedURLException
     */
    private List<SelectStockAgeOutput> getProductStockForCrm(String saleCustCode, String mainCustType, String deptCode, String invcode) throws MalformedURLException {
        URL  url= ReadPropertiesFileUtil.getWsdlFile(wsdlPath+"QueryStockAgeFromIHSToB2B.wsdl");
        QueryStockAgeFromIHSToB2B_Service crmStock_Service = new QueryStockAgeFromIHSToB2B_Service(url);
        QueryStockAgeFromIHSToB2B crmStockService = crmStock_Service.getQueryStockAgeFromIHSToB2BSOAP();
        List<SelectStockAgeOutput> list = crmStockService.queryStockAgeFromIHSToB2B(saleCustCode, mainCustType, deptCode, invcode);
        return list;
    }


    /**
     * 批量查询CRM库存
     *
     * @param deptCode     区域编码
     * @param mainCustType 县网
     * @param productList  产品列表
     * @return 库存信息
     */
    @Override
    public List<SelectStockAgeOutput> listCrmStock(String deptCode, String mainCustType, List<String> productList) {
        if (StringUtils.isBlank(mainCustType)) {
            mainCustType = "1";
        }
        StringBuilder stringBuilder = new StringBuilder();
        productList.forEach(x -> stringBuilder.append(x + ","));
        String productString = stringBuilder.toString();
        productString = productString.substring(0, productString.length() - 1);
        try {
            return getProductStockForCrm("1", mainCustType, deptCode, productString);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
