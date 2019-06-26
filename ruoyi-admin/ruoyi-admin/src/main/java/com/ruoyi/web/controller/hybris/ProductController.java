package com.ruoyi.web.controller.hybris;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.hybris.domain.ProductEntity;
import com.ruoyi.hybris.service.ProductService;
import com.ruoyi.remoting.crmInventorystock.wsdlfile.SelectStockAgeOutput;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/hybris/product")
public class ProductController extends BaseController {

    private String prefix = "hybris/product";

    @Resource
    private ProductService productService;

    @RequiresPermissions("hybris:product:view")
    @GetMapping()
    public String product() {
        return prefix + "/product";
    }

    @RequiresPermissions("hybris:productFind:view")
    @GetMapping()
    @RequestMapping("/findProduct")
    public String productFind() {
        return prefix + "/productFind";
    }

    /**
     * 产品信息查询
     */
    @RequiresPermissions("hybris:product:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(String code, String name) {
        if (StringUtils.isBlank(code) && StringUtils.isBlank(name)) {
            return getDataTable(new ArrayList<>());
        }
        ProductEntity dto = new ProductEntity();
        dto.setProductCode(code);
        dto.setProductName(name);
        startPage();
        List<ProductEntity> list = productService.listProductByLike(dto);
        return getDataTable(list);
    }

    /**
     * 产品详细信息查询
     */
    @RequiresPermissions("hybris:productFind:list")
    @PostMapping("/find")
    @ResponseBody
    public TableDataInfo find(String code) {
        if (StringUtils.isBlank(code)) {
            return getDataTable(new ArrayList<>());
        }
        startPage();
        List<ProductEntity> list = productService.findProductByCode(code);
        return getDataTable(list);
    }

    @RequiresPermissions("hybris:productByComp:view")
    @GetMapping()
    @RequestMapping("/listProductByCompPage")
    public String listProductComp() {
        return prefix + "/productByComp";
    }

    /**
     * 使用子件查询套机信息
     */
    @RequiresPermissions("hybris:productByComp:list")
    @PostMapping("/listProductComp")
    @ResponseBody
    public TableDataInfo listProductByComp(String code) {
        if (StringUtils.isBlank(code)) {
            return getDataTable(new ArrayList<>());
        }
        startPage();
        List<ProductEntity> list = productService.listProductByComp(code);
        return getDataTable(list);
    }


    @RequiresPermissions("hybris:productCrmStock:view")
    @GetMapping()
    @RequestMapping("/listProductCrmStockPage")
    public String getproductStockRrspage() {
        return prefix + "/productCrmStock";
    }

    /**
     * 查询产品日日顺库存
     * @param product 产品编码
     * @param deptCode 区域编码
     * @param popFlag pop标识
     * @return 库存信息
     */
    @RequiresPermissions("hybris:productCrmStock:list")
    @PostMapping("/listProductCrmStock")
    @ResponseBody
    public TableDataInfo getProductStockForCrm(String product, String deptCode, String popFlag){
        if (StringUtils.isBlank(product)) {
            return getDataTable(new ArrayList<>());
        }
        startPage();
        List<SelectStockAgeOutput> list = productService.getProductStock(product,deptCode,popFlag);
        return getDataTable(list);
    }

}
