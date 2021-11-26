package com.zsn.admin.controller;
/*    */ 
/*    */ import com.zsn.admin.model.RespBean;
/*    */ import com.zsn.admin.pojo.Supplier;
/*    */ import com.zsn.admin.query.SupplierQuery;
/*    */ import com.zsn.admin.service.ISupplierService;
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
/*    */ 
/*    */ @Controller
/*    */ @RequestMapping({"/supplier"})
/*    */ public class SupplierController
/*    */ {
/*    */   @Resource
/*    */   private ISupplierService supplierService;
/*    */   
/*    */   @RequestMapping({"index"})
/*    */   public String index() {
/* 39 */     return "supplier/supplier";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RequestMapping({"list"})
/*    */   @ResponseBody
/*    */   public Map<String, Object> supplierList(SupplierQuery supplierQuery) {
/* 50 */     return this.supplierService.supplierList(supplierQuery);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RequestMapping({"addOrUpdateSupplierPage"})
/*    */   public String addOrUpdateSupplierPage(Integer id, Model model) {
/* 61 */     if (null != id) {
/* 62 */       model.addAttribute("supplier", this.supplierService.getById(id));
/*    */     }
/* 64 */     return "supplier/add_update";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RequestMapping({"save"})
/*    */   @ResponseBody
/*    */   public RespBean saveSupplier(Supplier supplier) {
/* 75 */     this.supplierService.saveSupplier(supplier);
/* 76 */     return RespBean.success("供应商记录添加成功!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RequestMapping({"update"})
/*    */   @ResponseBody
/*    */   public RespBean updateSupplier(Supplier supplier) {
/* 88 */     this.supplierService.updateSupplier(supplier);
/* 89 */     return RespBean.success("供应商记录更新成功!");
/*    */   }
/*    */   
/*    */   @RequestMapping({"delete"})
/*    */   @ResponseBody
/*    */   public RespBean deleteSupplier(Integer[] ids) {
/* 95 */     this.supplierService.deleteSupplier(ids);
/* 96 */     return RespBean.success("供应商记录删除成功!");
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\controller\SupplierController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */