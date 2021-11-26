package com.zsn.admin.controller;
/*     */ 
/*     */ import com.zsn.admin.model.RespBean;
/*     */ import com.zsn.admin.pojo.Role;
/*     */ import com.zsn.admin.query.RoleQuery;
/*     */ import com.zsn.admin.service.IRoleService;
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
/*     */ 
/*     */ @Controller
/*     */ @RequestMapping({"/role"})
/*     */ public class RoleController
/*     */ {
/*     */   @Resource
/*     */   private IRoleService roleService;
/*     */   
/*     */   @RequestMapping({"index"})
/*     */   public String index() {
/*  42 */     return "role/role";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"list"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> roleList(RoleQuery roleQuery) {
/*  55 */     return this.roleService.roleList(roleQuery);
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
/*     */   @RequestMapping({"addOrUpdateRolePage"})
/*     */   public String addOrUpdatePage(Integer id, Model model) {
/*  68 */     if (null != id) {
/*  69 */       model.addAttribute("role", this.roleService.getById(id));
/*     */     }
/*  71 */     return "role/add_update";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"save"})
/*     */   @ResponseBody
/*     */   public RespBean saveRole(Role role) {
/*  83 */     this.roleService.saveRole(role);
/*  84 */     return RespBean.success("角色记录添加成功!");
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
/*     */   public RespBean updateRole(Role role) {
/*  96 */     this.roleService.updateRole(role);
/*  97 */     return RespBean.success("角色记录更新成功!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"delete"})
/*     */   @ResponseBody
/*     */   public RespBean updateRole(Integer id) {
/* 109 */     this.roleService.deleteRole(id);
/* 110 */     return RespBean.success("角色记录删除成功!");
/*     */   }
/*     */   
/*     */   @RequestMapping({"queryAllRoles"})
/*     */   @ResponseBody
/*     */   public List<Map<String, Object>> queryAllRoles(Integer userId) {
/* 116 */     return this.roleService.queryAllRoles(userId);
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
/*     */   @RequestMapping({"toAddGrantPage"})
/*     */   public String toAddGrantPage(Integer roleId, Model model) {
/* 129 */     model.addAttribute("roleId", roleId);
/* 130 */     return "role/grant";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"addGrant"})
/*     */   @ResponseBody
/*     */   public RespBean addGrant(Integer roleId, Integer[] mids) {
/* 143 */     this.roleService.addGrant(roleId, mids);
/* 144 */     return RespBean.success("角色记录授权成功!");
/*     */   }
/*     */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\controller\RoleController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */