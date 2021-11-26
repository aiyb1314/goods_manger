package com.zsn.admin.controller;
/*     */ 
/*     */ import com.zsn.admin.model.RespBean;
/*     */ import com.zsn.admin.pojo.Goods;
/*     */ import com.zsn.admin.query.GoodsQuery;
/*     */ import com.zsn.admin.service.IGoodsService;
/*     */ import com.zsn.admin.service.IGoodsTypeService;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Resource;
/*     */ import org.springframework.stereotype.Controller;
/*     */ import org.springframework.ui.Model;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.ResponseBody;

/*     */ @Controller
/*     */ @RequestMapping({"/goods"})
/*     */ public class GoodsController
/*     */ {
/*     */   @Resource
/*     */   private IGoodsService goodsService;
/*     */   @Resource
/*     */   private IGoodsTypeService goodsTypeService;
/*     */   
/*     */   @RequestMapping({"index"})
/*     */   public String index() {
/*  37 */     return "goods/goods";
/*     */   }
/*     */ 
/*     */   
/*     */   @RequestMapping({"list"})
/*     */   @ResponseBody
/*     */   public Map<String, Object> goodsList(GoodsQuery goodsQuery) {
/*  44 */     return this.goodsService.goodsList(goodsQuery);
/*     */   }

/*     */   @RequestMapping({"addOrUpdateGoodsPage"})
/*     */   public String addOrUpdateGoodsPage(Integer id, Integer typeId, Model model) {
/*  58 */     if (null != id) {
/*  59 */       Goods goods = (Goods)this.goodsService.getById(id);
/*     */       
/*  61 */       model.addAttribute("goods", goods);
/*  62 */       model.addAttribute("goodsType", this.goodsTypeService.getById(goods.getTypeId()));
/*     */     
/*     */     }
/*  65 */     else if (null != typeId) {
/*  66 */       model.addAttribute("goodsType", this.goodsTypeService.getById(typeId));
/*     */     } 
/*     */
/*     */
/*     */
/*  71 */     return "goods/add_update";
/*     */   }

/*     */   @RequestMapping({"toGoodsTypePage"})
/*     */   public String toGoodsTypePage(Integer typeId, Model model) {
/*  83 */     if (null != typeId) {
/*  84 */       model.addAttribute("typeId", typeId);
/*     */     }
/*  86 */     return "goods/goods_type";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"save"})
/*     */   @ResponseBody
/*     */   public RespBean saveGoods(Goods goods) {
/*  98 */     this.goodsService.saveGoods(goods);
/*  99 */     return RespBean.success("商品记录添加成功");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"update"})
/*     */   @ResponseBody
/*     */   public RespBean updateGoods(Goods goods) {
/* 112 */     this.goodsService.updateGoods(goods);
/* 113 */     return RespBean.success("商品记录更新成功");
/*     */   }
/*     */   
/*     */   @RequestMapping({"delete"})
/*     */   @ResponseBody
/*     */   public RespBean deleteGoods(Integer id) {
/* 119 */     this.goodsService.deleteGoods(id);
/* 120 */     return RespBean.success("商品记录删除成功");
/*     */   }
/*     */ }

