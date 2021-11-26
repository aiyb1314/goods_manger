package com.zsn.admin.utils;
/*    */ 
/*    */ import com.zsn.admin.exceptions.ParamsException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AssertUtil
/*    */ {
/*    */   public static void isTrue(Boolean flag, String msg) {
/* 13 */     if (flag.booleanValue())
/* 14 */       throw new ParamsException(msg); 
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admi\\utils\AssertUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */