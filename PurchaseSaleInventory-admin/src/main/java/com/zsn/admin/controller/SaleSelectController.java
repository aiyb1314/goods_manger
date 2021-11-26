package com.zsn.admin.controller;
/*    */ 
/*    */ import com.zsn.admin.query.SaleQuery;
/*    */ import com.zsn.admin.service.ISaleListService;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Controller;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.ResponseBody;
/*    */ 
/*    */ 
/*    */ @Controller
/*    */ @RequestMapping({"saleSelect"})
/*    */ public class SaleSelectController
/*    */ {
/*    */   @Autowired
/*    */   private ISaleListService iSaleListService;
/*    */   
/*    */   @RequestMapping({"index"})
/*    */   public String indexPage() {
/* 21 */     return "sale/saleSelect";
/*    */   }
/*    */   
/*    */   @RequestMapping({"searchPage"})
/*    */   @ResponseBody
/*    */   public Map<String, Object> searchPage(SaleQuery query) {
/* 27 */     return this.iSaleListService.saleListSelect(query);
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\controller\SaleSelectController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */