package com.zsn.admin.controller;
/*    */ 
/*    */ import com.baomidou.mybatisplus.core.conditions.Wrapper;
/*    */ import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
/*    */ import com.zsn.admin.mapper.SupplierMapper;
/*    */ import com.zsn.admin.model.RespBean;
/*    */ import com.zsn.admin.pojo.PurchaseList;
/*    */ import com.zsn.admin.pojo.Supplier;
/*    */ import com.zsn.admin.query.PurchaseQuery;
/*    */ import com.zsn.admin.service.IPurchaseListService;
/*    */ import java.time.LocalDateTime;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
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
/*    */ @Controller
/*    */ @RequestMapping({"/purchase"})
/*    */ public class PurchaseListController
/*    */ {
/*    */   @Autowired
/*    */   private IPurchaseListService iPurchaseListService;
/*    */   @Autowired
/*    */   private SupplierMapper mapper;
/*    */   
/*    */   @RequestMapping({"index"})
/*    */   public String toIndex() {
/* 44 */     return "purchase/purchase";
/*    */   }
/*    */   
/*    */   @RequestMapping({"list"})
/*    */   @ResponseBody
/*    */   public Map<String, Object> purchaseList(PurchaseQuery query) {
/* 50 */     return this.iPurchaseListService.purchaseList(query);
/*    */   }
/*    */   
/*    */   @RequestMapping({"addOrUpdatePurchasePage"})
/*    */   public String addPurchase(Integer id, Model model) {
/* 55 */     if (null != id) {
/* 56 */       model.addAttribute("purchase", this.iPurchaseListService.getById(id));
/*    */     }
/* 58 */     System.out.println("start demo");
/* 59 */     List<Supplier> lst = this.mapper.selectList((Wrapper)(new QueryWrapper()).ne("is_del", Integer.valueOf(1)));
/* 60 */     model.addAttribute("supplierList", lst);
/* 61 */     System.out.println("suppilerList" + lst);
/* 62 */     return "purchase/add_update";
/*    */   }
/*    */   
/*    */   @RequestMapping({"save"})
/*    */   @ResponseBody
/*    */   public RespBean saveCustomer(PurchaseList purchaseList) {
/* 68 */     LocalDateTime now = LocalDateTime.now();
/* 69 */     purchaseList.setPurchaseDate(now);
/* 70 */     purchaseList.setState(Integer.valueOf(1));
/* 71 */     System.out.println(purchaseList);
/* 72 */     this.iPurchaseListService.savePurchase(purchaseList);
/*    */     
/* 74 */     return RespBean.success("记录添加成功");
/*    */   }
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
/*    */   
/*    */   @RequestMapping({"delete"})
/*    */   @ResponseBody
/*    */   public RespBean deletePurchase(Integer[] ids) {
/* 97 */     this.iPurchaseListService.deletePurchase(ids);
/* 98 */     return RespBean.success("客户记录删除成功");
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\controller\PurchaseListController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */