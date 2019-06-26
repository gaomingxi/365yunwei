package com.ruoyi.web.controller.hybris;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.hybris.domain.UserFukuanEntity;
import com.ruoyi.hybris.service.UserFukuanService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 客户付款方
 *
 * @author mx
 * @date 2019-04-09
 */
@Controller
@RequestMapping("/hybris/userfukuan")
public class UserFukuanController extends BaseController {

    private String prefix = "hybris/userfukuan";

    @Resource
    private UserFukuanService userFukuanService;

    @RequiresPermissions("hybris:userfukuan:view")
    @GetMapping()
    public String usergroup() {
        return prefix + "/userfukuan";
    }

    /**
     * 查询客户付款方列表
     */
    @RequiresPermissions("hybris:userfukuan:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(String code) {
        if (StringUtils.isBlank(code)) {
            return getDataTable(new ArrayList<>());
        }
        startPage();
        List<UserFukuanEntity> list = userFukuanService.lsit(code);
        return getDataTable(list);
    }


    /**
     * 导出列表
     */
    @RequiresPermissions("hybris:userfukuan:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(String code) {
        List<UserFukuanEntity> list = userFukuanService.lsit(code);
        ExcelUtil<UserFukuanEntity> util = new ExcelUtil<>(UserFukuanEntity.class);
        return util.exportExcel(list, "付款方列表");
    }

}
