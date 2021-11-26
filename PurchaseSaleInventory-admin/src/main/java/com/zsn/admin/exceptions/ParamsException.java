package com.zsn.admin.exceptions;

/*    */ public class ParamsException
/*    */   extends RuntimeException
/*    */ {
/*  7 */   private Integer code = Integer.valueOf(300);
/*  8 */   private String msg = "参数异常!";
/*    */ 
/*    */   
/*    */   public ParamsException() {
/* 12 */     super("参数异常!");
/*    */   }
/*    */   
/*    */   public ParamsException(String msg) {
/* 16 */     super(msg);
/* 17 */     this.msg = msg;
/*    */   }
/*    */   
/*    */   public ParamsException(Integer code) {
/* 21 */     super("参数异常!");
/* 22 */     this.code = code;
/*    */   }
/*    */   
/*    */   public ParamsException(Integer code, String msg) {
/* 26 */     super(msg);
/* 27 */     this.code = code;
/* 28 */     this.msg = msg;
/*    */   }
/*    */   
/*    */   public Integer getCode() {
/* 32 */     return this.code;
/*    */   }
/*    */   
/*    */   public void setCode(Integer code) {
/* 36 */     this.code = code;
/*    */   }
/*    */   
/*    */   public String getMsg() {
/* 40 */     return this.msg;
/*    */   }
/*    */   
/*    */   public void setMsg(String msg) {
/* 44 */     this.msg = msg;
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\exceptions\ParamsException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */