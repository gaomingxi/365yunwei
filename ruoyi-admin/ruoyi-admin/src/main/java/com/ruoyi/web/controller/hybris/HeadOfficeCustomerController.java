package com.ruoyi.web.controller.hybris;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.hybris.domain.HeadOfficeCustomerEntity;
import com.ruoyi.hybris.service.HeadOfficeCustomerService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 经营2000客户数据查询
 *
 * @author Mx
 */
@Controller
@RequestMapping("/hybris/headofficecustomer")
public class HeadOfficeCustomerController extends BaseController {

    private String prefix = "hybris/headofficecustomer";

    @Resource
    private HeadOfficeCustomerService headOfficeCustomerService;

    @RequiresPermissions("hybris:headofficecustomer:view")
    @GetMapping()
    public String headOfficeCustomerService() {
        return prefix + "/headofficecustomer";
    }

    /**
     * 查询客户付款方列表
     */
    @RequiresPermissions("hybris:headofficecustomer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(String code) {
        startPage();
        List<HeadOfficeCustomerEntity> list = headOfficeCustomerService.list(code);
        return getDataTable(list);
    }


    /**
     * 导出列表
     */
    @RequiresPermissions("hybris:headofficecustomer:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(String code) {
        List<HeadOfficeCustomerEntity> list = headOfficeCustomerService.list(code);
        ExcelUtil<HeadOfficeCustomerEntity> util = new ExcelUtil<>(HeadOfficeCustomerEntity.class);
        return util.exportExcel(list, "经营2000客户列表");
    }

}
