package com.ruoyi.web.controller.hybris;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.hybris.domain.CustomerSigningEntity;
import com.ruoyi.hybris.service.CustomerSigningService;
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
@RequestMapping("/hybris/customerSigning")
public class CustomerSigningController extends BaseController {

    private String prefix = "hybris/customerSigning";

    @Resource
    private CustomerSigningService customerSigningService;

    @RequiresPermissions("hybris:customerSigning:view")
    @GetMapping()
    public String userStreet() {
        return prefix + "/customerSigning";
    }

    /**
     * 签约列表
     */
    @RequiresPermissions("hybris:customerSigning:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(String code) {
        if (StringUtils.isBlank(code)) {
            return getDataTable(new ArrayList<>());
        }
        startPage();
        List<CustomerSigningEntity> list = customerSigningService.list(code);
        return getDataTable(list);
    }

    /**
     * 导出列表
     */
    @RequiresPermissions("hybris:customerSigning:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(String code) {
        List<CustomerSigningEntity> list = customerSigningService.list(code);
        ExcelUtil<CustomerSigningEntity> util = new ExcelUtil<>(CustomerSigningEntity.class);
        return util.exportExcel(list, "客户签约列表");
    }

}
