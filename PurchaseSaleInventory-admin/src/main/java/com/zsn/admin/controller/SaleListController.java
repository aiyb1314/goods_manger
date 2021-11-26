package com.zsn.admin.controller;
/*    */ 
/*    */ import com.zsn.admin.service.ISaleListService;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Controller;
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
/*    */ @Controller
/*    */ @RequestMapping({"/sale"})
/*    */ public class SaleListController
/*    */ {
/*    */   @Autowired
/*    */   private ISaleListService iSaleListService;
/*    */   
/*    */   @RequestMapping({"index"})
/*    */   public String indexPage() {
/* 30 */     return "sale/sale";
/*    */   }
/*    */   
/*    */   @RequestMapping({"list"})
/*    */   @ResponseBody
/*    */   public Map<String, Object> saleList() {
/* 36 */     System.out.println(this.iSaleListService.saleList());
/* 37 */     return this.iSaleListService.saleList();
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\controller\SaleListController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */