package com.zsn.admin.controller;
/*    */ 
/*    */ import com.zsn.admin.model.RespBean;
/*    */ import com.zsn.admin.pojo.Customer;
/*    */ import com.zsn.admin.query.CustomerQuery;
/*    */ import com.zsn.admin.service.ICustomerService;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Resource;
/*    */ import org.springframework.stereotype.Controller;
/*    */ import org.springframework.ui.Model;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.ResponseBody;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Controller
/*    */ @RequestMapping({"/customer"})
/*    */ public class CustomerController
/*    */ {
/*    */   @Resource
/*    */   private ICustomerService customerService;
/*    */   
/*    */   @RequestMapping({"index"})
/*    */   public String index() {
/* 38 */     return "customer/customer";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RequestMapping({"list"})
/*    */   @ResponseBody
/*    */   public Map<String, Object> customerList(CustomerQuery customerQuery) {
/* 50 */     return this.customerService.customerList(customerQuery);
/*    */   }
/*    */   
/*    */   @RequestMapping({"addOrUpdateCustomerPage"})
/*    */   public String addRolePage(Integer id, Model model) {
/* 55 */     if (null != id) {
/* 56 */       model.addAttribute("customer", this.customerService.getById(id));
/*    */     }
/* 58 */     return "customer/add_update";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RequestMapping({"save"})
/*    */   @ResponseBody
/*    */   public RespBean saveCustomer(Customer customer) {
/* 70 */     this.customerService.saveCustomer(customer);
/* 71 */     return RespBean.success("记录添加成功");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RequestMapping({"update"})
/*    */   @ResponseBody
/*    */   public RespBean updateCustomer(Customer customer) {
/* 82 */     this.customerService.updateCustomer(customer);
/* 83 */     return RespBean.success("记录更新成功");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RequestMapping({"delete"})
/*    */   @ResponseBody
/*    */   public RespBean deleteCustomer(Integer[] ids) {
/* 94 */     this.customerService.deleteCustomer(ids);
/* 95 */     return RespBean.success("客户记录删除成功");
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\controller\CustomerController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */