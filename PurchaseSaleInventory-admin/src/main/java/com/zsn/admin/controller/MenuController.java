package com.zsn.admin.controller;
/*     */ 
/*     */ import com.zsn.admin.dto.TreeDto;
/*     */ import com.zsn.admin.model.RespBean;
/*     */ import com.zsn.admin.pojo.Menu;
/*     */ import com.zsn.admin.service.IMenuService;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Resource;
/*     */ import org.springframework.stereotype.Controller;
/*     */ import org.springframework.ui.Model;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.ResponseBody;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Controller
/*     */ @RequestMapping({"/menu"})
/*     */ public class MenuController
/*     */ {
/*     */   @Resource
/*     */   private IMenuService menuService;
/*     */   
/*     */   @RequestMapping({"queryAllMenus"})
/*     */   @ResponseBody
/*     */   public List<TreeDto> queryAllMenus(Integer roleId) {
/*  42 */     return this.menuService.queryAllMenus(roleId);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/index"})
/*     */   public String index() {
/*  52 */     return "menu/menu";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"list"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> menuList() {
/*  63 */     return this.menuService.menuList();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"addMenuPage"})
/*     */   public String addMenuPage(Integer grade, Integer pId, Model model) {
/*  77 */     model.addAttribute("grade", grade);
/*  78 */     model.addAttribute("pId", pId);
/*  79 */     return "menu/add";
/*     */   }
/*     */ 
/*     */   
/*     */   @RequestMapping({"save"})
/*     */   @ResponseBody
/*     */   public RespBean saveMenu(Menu menu) {
/*  86 */     this.menuService.saveMenu(menu);
/*  87 */     return RespBean.success("菜单记录添加成功!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"updateMenuPage"})
/*     */   public String updateMenuPage(Integer id, Model model) {
/* 100 */     model.addAttribute("menu", this.menuService.getById(id));
/* 101 */     return "menu/update";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"update"})
/*     */   @ResponseBody
/*     */   public RespBean updateMenu(Menu menu) {
/* 113 */     this.menuService.updateMenu(menu);
/* 114 */     return RespBean.success("菜单记录更新成功!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"delete"})
/*     */   @ResponseBody
/*     */   public RespBean deleteMenu(Integer id) {
/* 127 */     this.menuService.deleteMenuById(id);
/* 128 */     return RespBean.success("菜单删除成功");
/*     */   }
/*     */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\controller\MenuController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */