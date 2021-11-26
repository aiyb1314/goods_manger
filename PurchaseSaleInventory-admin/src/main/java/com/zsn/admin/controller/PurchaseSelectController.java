package com.zsn.admin.controller;
/*    */ 
/*    */ import com.zsn.admin.query.PurchaseQuery;
/*    */ import com.zsn.admin.service.IPurchaseListService;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Controller;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.ResponseBody;
/*    */ 
/*    */ @Controller
/*    */ @RequestMapping({"purchaseSelect"})
/*    */ public class PurchaseSelectController {
/*    */   @Autowired
/*    */   private IPurchaseListService iPurchaseListService;
/*    */   
/*    */   @RequestMapping({"index"})
/*    */   public String indexPage() {
/* 19 */     return "purchase/purchaseSelect";
/*    */   }
/*    */   
/*    */   @RequestMapping({"searchPage"})
/*    */   @ResponseBody
/*    */   public Map<String, Object> searchPage(PurchaseQuery query) {
/* 25 */     return this.iPurchaseListService.purchaseListSelect(query);
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\controller\PurchaseSelectController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */