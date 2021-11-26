package com.zsn.admin.controller;
/*     */ 
/*     */ import com.zsn.admin.model.RespBean;
/*     */ import com.zsn.admin.pojo.User;
/*     */ import com.zsn.admin.query.UserQuery;
/*     */ import com.zsn.admin.service.IUserService;
/*     */ import java.security.Principal;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Resource;
/*     */ import org.springframework.security.access.prepost.PreAuthorize;
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
/*     */ @Controller
/*     */ @RequestMapping({"/user"})
/*     */ public class UserController
/*     */ {
/*     */   @Resource
/*     */   private IUserService userService;
/*     */   
/*     */   @RequestMapping({"setting"})
/*     */   public String setting(Principal principal, Model model) {
/*  41 */     User user = this.userService.findUserByUserName(principal.getName());
/*  42 */     model.addAttribute("user", user);
/*  43 */     return "user/setting";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"updateUserInfo"})
/*     */   @ResponseBody
/*     */   public RespBean updateUserInfo(User user) {
/*  56 */     this.userService.updateUserInfo(user);
/*  57 */     return RespBean.success("用户信息更新成功");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"password"})
/*     */   public String password() {
/*  68 */     return "user/password";
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
/*     */   
/*     */   @RequestMapping({"updateUserPassword"})
/*     */   @ResponseBody
/*     */   public RespBean updateUserPassword(Principal principal, String oldPassword, String newPassword, String confirmPassword) {
/*  84 */     this.userService.updateUserPassword(principal.getName(), oldPassword, newPassword, confirmPassword);
/*  85 */     return RespBean.success("用户密码更新成功");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"index"})
/*     */   @PreAuthorize("hasAnyAuthority('1010')")
/*     */   public String index() {
/*  96 */     return "user/user";
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
/*     */   @PreAuthorize("hasAnyAuthority('101003')")
/*     */   public Map<String, Object> userList(UserQuery userQuery) {
/* 110 */     return this.userService.userList(userQuery);
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
/*     */   @RequestMapping({"addOrUpdateUserPage"})
/*     */   public String addOrUpdatePage(Integer id, Model model) {
/* 123 */     if (null != id) {
/* 124 */       model.addAttribute("user", this.userService.getById(id));
/*     */     }
/* 126 */     return "user/add_update";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"save"})
/*     */   @ResponseBody
/*     */   public RespBean saveUser(User user) {
/* 139 */     this.userService.saveUser(user);
/* 140 */     return RespBean.success("用户记录添加成功!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"update"})
/*     */   @ResponseBody
/*     */   public RespBean updateUser(User user) {
/* 153 */     this.userService.updateUser(user);
/* 154 */     return RespBean.success("用户记录更新成功!");
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
/*     */   public RespBean deleteUser(Integer[] ids) {
/* 167 */     this.userService.deleteUser(ids);
/* 168 */     return RespBean.success("用户记录删除成功!");
/*     */   }
/*     */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\controller\UserController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */