package com.ruoyi.web.controller.hybris;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.hybris.domain.UserFukuanEntity;
import com.ruoyi.hybris.domain.UserStreetEntity;
import com.ruoyi.hybris.service.UserFukuanService;
import com.ruoyi.hybris.service.UserStreetService;
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
@RequestMapping("/hybris/userStreet")
public class UserStreetController extends BaseController {

    private String prefix = "hybris/userStreet";

    @Resource
    private UserStreetService userStreetService;

    @RequiresPermissions("hybris:userStreet:view")
    @GetMapping()
    public String userStreet() {
        return prefix + "/userStreet";
    }

    /**
     * 查询客户列表
     */
    @RequiresPermissions("hybris:userStreet:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(String code) {
        if (StringUtils.isBlank(code)) {
            return getDataTable(new ArrayList<>());
        }
        startPage();
        List<UserStreetEntity> list = userStreetService.list(code);
        return getDataTable(list);
    }

    /**
     * 导出列表
     */
    @RequiresPermissions("hybris:userfukuan:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(String code) {
        List<UserStreetEntity> list = userStreetService.list(code);
        ExcelUtil<UserStreetEntity> util = new ExcelUtil<>(UserStreetEntity.class);
        return util.exportExcel(list, "送达方列表");
    }
}
