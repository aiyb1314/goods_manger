package com.zsn.admin.controller;
/*    */ 
/*    */ import org.springframework.stereotype.Controller;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Controller
/*    */ public class MainController
/*    */ {
/*    */   @RequestMapping({"index"})
/*    */   public String index() {
/* 17 */     return "index";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RequestMapping({"main"})
/*    */   public String main() {
/* 27 */     return "main";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RequestMapping({"welcome"})
/*    */   public String welcome() {
/* 37 */     return "welcome";
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\controller\MainController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */