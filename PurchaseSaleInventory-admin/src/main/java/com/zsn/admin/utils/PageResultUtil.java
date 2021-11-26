package com.zsn.admin.utils;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class PageResultUtil
/*    */ {
/*    */   public static Map<String, Object> getResult(Long total, List<?> records) {
/* 10 */     Map<String, Object> result = new HashMap<>();
/* 11 */     result.put("count", total);
/* 12 */     result.put("data", records);
/* 13 */     result.put("code", Integer.valueOf(0));
/* 14 */     result.put("msg", "");
/* 15 */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admi\\utils\PageResultUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */