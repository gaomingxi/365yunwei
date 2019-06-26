package com.ruoyi.web.controller.hybris;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.hybris.domain.CustomerStoreEntity;
import com.ruoyi.hybris.service.CustomerStoreService;
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
@RequestMapping("/hybris/customerStore")
public class CustomerStoreController extends BaseController {

    private String prefix = "hybris/customerStore";

    @Resource
    private CustomerStoreService customerStoreService;

    @RequiresPermissions("hybris:customerStore:view")
    @GetMapping()
    public String userStreet() {
        return prefix + "/customerStore";
    }

    /**
     * 签约列表
     */
    @RequiresPermissions("hybris:customerStore:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(String code) {
        if (StringUtils.isBlank(code)) {
            return getDataTable(new ArrayList<>());
        }
        startPage();
        List<CustomerStoreEntity> list = customerStoreService.list(code);
        return getDataTable(list);
    }

    /**
     * 导出列表
     */
    @RequiresPermissions("hybris:customerStore:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(String code) {
        List<CustomerStoreEntity> list = customerStoreService.list(code);
        ExcelUtil<CustomerStoreEntity> util = new ExcelUtil<>(CustomerStoreEntity.class);
        return util.exportExcel(list, "客户门店列表");
    }

}
