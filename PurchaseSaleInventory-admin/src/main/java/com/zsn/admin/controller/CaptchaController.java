package com.zsn.admin.controller;
/*    */ 
/*    */ import com.google.code.kaptcha.impl.DefaultKaptcha;
/*    */ import com.zsn.admin.model.CaptchaImageModel;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ import javax.annotation.Resource;
/*    */ import javax.imageio.ImageIO;
/*    */ import javax.servlet.ServletOutputStream;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RequestMethod;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ 
/*    */ 
/*    */ 
/*    */ @RestController
/*    */ public class CaptchaController
/*    */ {
/*    */   @Resource
/*    */   public DefaultKaptcha defaultKaptcha;
/*    */   
/*    */   @RequestMapping(value = {"/image"}, method = {RequestMethod.GET})
/*    */   public void kaptcha(HttpSession session, HttpServletResponse response) throws IOException {
/* 27 */     response.setDateHeader("Expires", 0L);
/* 28 */     response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
/* 29 */     response.addHeader("Cache-Control", "post-check=0, pre-check=0");
/* 30 */     response.setHeader("Pragma", "no-cache");
/* 31 */     response.setContentType("image/jpeg");
/*    */     
/* 33 */     String capText = this.defaultKaptcha.createText();
/*    */     
/* 35 */     session.setAttribute("captcha_key", new CaptchaImageModel(capText, 120));
/* 36 */     ServletOutputStream out = response.getOutputStream();
/* 37 */     BufferedImage bufferedImage = this.defaultKaptcha.createImage(capText);
/* 38 */     ImageIO.write(bufferedImage, "jpg", (OutputStream)out);
/* 39 */     out.flush();
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\controller\CaptchaController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */