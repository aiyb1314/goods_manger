package com.zsn.admin.controller;
/*    */ 
/*    */ import com.zsn.admin.pojo.GoodsUnit;
/*    */ import com.zsn.admin.service.IGoodsUnitService;
/*    */ import java.util.List;
/*    */ import javax.annotation.Resource;
/*    */ import org.springframework.stereotype.Controller;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.ResponseBody;
/*    */ @Controller
/*    */ @RequestMapping({"/goodsUnit"})
/*    */ public class GoodsUnitController
/*    */ {
/*    */   @Resource
/*    */   private IGoodsUnitService goodsUnitService;
/*    */   
/*    */   @RequestMapping({"allGoodsUnits"})
/*    */   @ResponseBody
/*    */   public List<GoodsUnit> allGoodsUnits() {
/* 31 */     return this.goodsUnitService.list();
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\controller\GoodsUnitController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */