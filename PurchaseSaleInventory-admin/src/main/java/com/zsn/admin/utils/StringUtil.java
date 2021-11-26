package com.zsn.admin.utils;

public class StringUtil
/*    */ {
/*    */   public static boolean isEmpty(String str) {
/* 17 */     if (str == null || "".equals(str.trim())) {
/* 18 */       return true;
/*    */     }
/* 20 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean isNotEmpty(String str) {
/* 31 */     if (str != null && !"".equals(str.trim())) {
/* 32 */       return true;
/*    */     }
/* 34 */     return false;
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
/*    */   public static String formatCode(String code) {
/*    */     try {
/* 47 */       int length = code.length();
/* 48 */       Integer num = Integer.valueOf(Integer.valueOf(code.substring(length - 4, length)).intValue() + 1);
/* 49 */       String codenum = num.toString();
/* 50 */       int codelength = codenum.length();
/* 51 */       for (int i = 4; i > codelength; i--) {
/* 52 */         codenum = "0" + codenum;
/*    */       }
/* 54 */       return codenum;
/* 55 */     } catch (NumberFormatException e) {
/* 56 */       return "0100";
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admi\\utils\StringUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */