package com.zsn.admin.filters;
/*    */ import com.fasterxml.jackson.databind.ObjectMapper;
/*    */ import com.zsn.admin.model.CaptchaImageModel;
/*    */ import com.zsn.admin.model.RespBean;
/*    */ import java.io.IOException;
/*    */ import java.util.Objects;
/*    */ import javax.servlet.FilterChain;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.ServletRequest;
/*    */ import javax.servlet.ServletResponse;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ import org.apache.commons.lang3.StringUtils;
/*    */ import org.springframework.security.core.AuthenticationException;
/*    */ import org.springframework.security.web.authentication.session.SessionAuthenticationException;
/*    */ import org.springframework.stereotype.Component;
/*    */ import org.springframework.web.bind.ServletRequestBindingException;
/*    */ import org.springframework.web.bind.ServletRequestUtils;
/*    */ import org.springframework.web.context.request.ServletWebRequest;
/*    */ import org.springframework.web.filter.OncePerRequestFilter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Component
/*    */ public class CaptchaCodeFilter
/*    */   extends OncePerRequestFilter
/*    */ {
/* 31 */   private static ObjectMapper objectMapper = new ObjectMapper();
/*    */ 
/*    */ 
/*    */   
/*    */   protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
/* 36 */     if (StringUtils.equals("/login", request.getRequestURI()) && StringUtils.equalsIgnoreCase(request.getMethod(), "post")) {
/*    */       
/*    */       try {
/* 39 */         validate(new ServletWebRequest(request));
/* 40 */       } catch (AuthenticationException e) {
/* 41 */         response.setContentType("application/json;charset=UTF-8");
/* 42 */         response.getWriter().write(objectMapper.writeValueAsString(RespBean.error("验证码错误")));
/*    */         return;
/*    */       } 
/*    */     }
/* 46 */     filterChain.doFilter((ServletRequest)request, (ServletResponse)response);
/*    */   }
/*    */ 
/*    */   
/*    */   private void validate(ServletWebRequest request) throws ServletRequestBindingException {
/* 51 */     HttpSession session = request.getRequest().getSession();
/*    */ 
/*    */     
/* 54 */     String codeInRequest = ServletRequestUtils.getStringParameter((ServletRequest)request.getRequest(), "captchaCode");
/*    */     
/* 56 */     if (StringUtils.isEmpty(codeInRequest)) {
/* 57 */       throw new SessionAuthenticationException("验证码不能为空!");
/*    */     }
/*    */ 
/*    */     
/* 61 */     CaptchaImageModel codeInSession = (CaptchaImageModel)session.getAttribute("captcha_key");
/*    */     
/* 63 */     if (Objects.isNull(codeInSession)) {
/* 64 */       throw new SessionAuthenticationException("验证码不存在!");
/*    */     }
/*    */     
/* 67 */     if (codeInSession.isExpired()) {
/* 68 */       throw new SessionAuthenticationException("验证码已过期!");
/*    */     }
/*    */     
/* 71 */     if (!StringUtils.equals(codeInSession.getCode(), codeInRequest))
/* 72 */       throw new SessionAuthenticationException("验证码不匹配!"); 
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\filters\CaptchaCodeFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */