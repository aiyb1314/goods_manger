package com.zsn.admin.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zsn.admin.dto.TreeDto;
import com.zsn.admin.model.RespBean;
import com.zsn.admin.pojo.Menu;
import com.zsn.admin.service.IMenuService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 菜单表 前端控制器
 * </p>
 *
 * @author zhaoosn
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @Resource
    private IMenuService menuService;

    /**
     * 返回所有菜单数据
     *
     * @return
     */
    @RequestMapping("queryAllMenus")
    @ResponseBody
    public List<TreeDto> queryAllMenus(Integer roleId) {
        return menuService.queryAllMenus(roleId);
    }

    /**
     * 菜单主页
     *
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        return "menu/menu";
    }

    /**
     * 菜单列表查询接口
     *
     * @return
     */
    @RequestMapping("list")
    @ResponseBody
    public Map<String, Object> menuList() {
        return menuService.menuList();
    }


    /**
     * 添加菜单页
     *
     * @param grade
     * @param pId
     * @param model
     * @return
     */
    @RequestMapping("addMenuPage")
    public String addMenuPage(Integer grade, Integer pId, Model model) {
        model.addAttribute("grade", grade);
        model.addAttribute("pId", pId);
        return "menu/add";
    }


    @RequestMapping("save")
    @ResponseBody
    public RespBean saveMenu(Menu menu) {
        menuService.saveMenu(menu);
        return RespBean.success("菜单记录添加成功!");
    }


    /**
     * 更新菜单页
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("updateMenuPage")
    public String updateMenuPage(Integer id, Model model) {
        model.addAttribute("menu", menuService.getById(id));
        return "menu/update";
    }

    /**
     * 更新菜单接口
     *
     * @param menu
     * @return
     */
    @RequestMapping("update")
    @ResponseBody
    public RespBean updateMenu(Menu menu) {
        menuService.updateMenu(menu);
        return RespBean.success("菜单记录更新成功!");
    }


    /**
     * 菜单删除
     *
     * @param id
     * @return
     */
    @RequestMapping("delete")
    @ResponseBody
    public RespBean deleteMenu(Integer id) {
        menuService.deleteMenuById(id);
        return RespBean.success("菜单删除成功");
    }


}
