package com.zsn.admin;
/*    */ 
/*    */ import com.zsn.admin.exceptions.ParamsException;
/*    */ import com.zsn.admin.model.RespBean;
/*    */ import org.springframework.security.access.AccessDeniedException;
/*    */ import org.springframework.web.bind.annotation.ControllerAdvice;
/*    */ import org.springframework.web.bind.annotation.ExceptionHandler;
/*    */ import org.springframework.web.bind.annotation.ResponseBody;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @ControllerAdvice
/*    */ public class GlobalExceptionHandler
/*    */ {
/*    */   @ExceptionHandler({AccessDeniedException.class})
/*    */   public String accessDeniedException(AccessDeniedException e) {
/* 20 */     return "403";
/*    */   }
/*    */ 
/*    */   
/*    */   @ExceptionHandler({ParamsException.class})
/*    */   @ResponseBody
/*    */   public RespBean paramsExceptionHandler(ParamsException e) {
/* 27 */     return RespBean.error(e.getMsg());
/*    */   }
/*    */ 
/*    */   
/*    */   @ExceptionHandler({Exception.class})
/*    */   @ResponseBody
/*    */   public RespBean exceptionHandler(Exception e) {
/* 34 */     return RespBean.error(e.getMessage());
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\GlobalExceptionHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */