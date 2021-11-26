package com.zsn.admin.controller;
/*    */ 
/*    */ import com.zsn.admin.model.RespBean;
/*    */ import com.zsn.admin.pojo.Goods;
/*    */ import com.zsn.admin.query.GoodsQuery;
/*    */ import com.zsn.admin.service.IGoodsService;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Resource;
/*    */ import org.springframework.stereotype.Controller;
/*    */ import org.springframework.ui.Model;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.ResponseBody;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Controller
/*    */ @RequestMapping({"stock"})
/*    */ public class StockController
/*    */ {
/*    */   @Resource
/*    */   private IGoodsService goodsService;
/*    */   
/*    */   @RequestMapping({"index"})
/*    */   public String index() {
/* 35 */     return "stock/stock";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RequestMapping({"listNoInventoryQuantity"})
/*    */   @ResponseBody
/*    */   public Map<String, Object> listNoInventoryQuantity(GoodsQuery goodsQuery) {
/* 48 */     goodsQuery.setType(Integer.valueOf(1));
/* 49 */     return this.goodsService.goodsList(goodsQuery);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RequestMapping({"listHasInventoryQuantity"})
/*    */   @ResponseBody
/*    */   public Map<String, Object> listHasInventoryQuantity(GoodsQuery goodsQuery) {
/* 61 */     goodsQuery.setType(Integer.valueOf(2));
/* 62 */     return this.goodsService.goodsList(goodsQuery);
/*    */   }
/*    */ 
/*    */   
/*    */   @RequestMapping({"toUpdateGoodsInfoPage"})
/*    */   public String toUpdateGoodsInfoPage(Integer gid, Model model) {
/* 68 */     model.addAttribute("goods", this.goodsService.getById(gid));
/* 69 */     return "stock/goods_update";
/*    */   }
/*    */   
/*    */   @RequestMapping({"updateStock"})
/*    */   @ResponseBody
/*    */   public RespBean updateGoods(Goods goods) {
/* 75 */     this.goodsService.updateStock(goods);
/* 76 */     return RespBean.success("商品记录更新成功!");
/*    */   }
/*    */ 
/*    */   
/*    */   @RequestMapping({"deleteStock"})
/*    */   @ResponseBody
/*    */   public RespBean deleteStock(Integer id) {
/* 83 */     this.goodsService.deleteStock(id);
/* 84 */     return RespBean.success("商品记录删除成功!");
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\controller\StockController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */