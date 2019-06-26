package com.ruoyi.web.controller.hybris;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.hybris.domain.UserGroupEntity;
import com.ruoyi.hybris.service.UserGroupService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 客户基础 信息操作处理
 *
 * @author mx
 * @date 2019-04-09
 */
@Controller
@RequestMapping("/hybris/usergroup")
public class UsergroupsController extends BaseController {
    private String prefix = "hybris/usergroup";

    @Resource
    private UserGroupService userGroupService;

    @RequiresPermissions("hybris:usergroup:view")
    @GetMapping()
    public String usergroup() {
        return prefix + "/usergroup";
    }

    /**
     * 查询客户基础列表
     */
    @RequiresPermissions("hybris:usergroup:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(String customerCode) {
        if(StringUtils.isBlank(customerCode)){
            return getDataTable(new ArrayList<>());
        }
        startPage();
        List<UserGroupEntity> list = userGroupService.listUserGroupsByCode(customerCode);
        return getDataTable(list);
    }


    /**
     * 导出客户基础列表
     */
    @RequiresPermissions("hybris:usergroup:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(String code) {
        List<UserGroupEntity> list = userGroupService.listUserGroupsByCode(code);
        ExcelUtil<UserGroupEntity> util = new ExcelUtil<UserGroupEntity>(UserGroupEntity.class);
        return util.exportExcel(list, "usergroup");
    }

}
