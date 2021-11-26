package com.zsn.admin.controller;
/*    */ 
/*    */ import com.zsn.admin.dto.TreeDto;
/*    */ import com.zsn.admin.model.RespBean;
/*    */ import com.zsn.admin.pojo.GoodsType;
/*    */ import com.zsn.admin.service.IGoodsTypeService;
/*    */ import java.util.List;
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
/*    */ @RequestMapping({"/goodsType"})
/*    */ public class GoodsTypeController
/*    */ {
/*    */   @Resource
/*    */   private IGoodsTypeService goodsTypeService;
/*    */   
/*    */   @RequestMapping({"queryAllGoodsTypes"})
/*    */   @ResponseBody
/*    */   public List<TreeDto> queryAllGoodsTypes(Integer typeId) {
/* 37 */     return this.goodsTypeService.queryAllGoodsTypes(typeId);
/*    */   }
/*    */ 
/*    */   
/*    */   @RequestMapping({"index"})
/*    */   public String index() {
/* 43 */     return "goodsType/goods_type";
/*    */   }
/*    */ 
/*    */   
/*    */   @RequestMapping({"list"})
/*    */   @ResponseBody
/*    */   public Map<String, Object> goodsTypeList() {
/* 50 */     return this.goodsTypeService.goodsTypeList();
/*    */   }
/*    */ 
/*    */   
/*    */   @RequestMapping({"addGoodsTypePage"})
/*    */   public String addGoodsTypePage(Integer pId, Model model) {
/* 56 */     model.addAttribute("pId", pId);
/* 57 */     return "goodsType/add";
/*    */   }
/*    */   
/*    */   @RequestMapping({"save"})
/*    */   @ResponseBody
/*    */   public RespBean saveGoodsType(GoodsType goodsType) {
/* 63 */     this.goodsTypeService.saveGoodsType(goodsType);
/* 64 */     return RespBean.success("商品类别添加成功");
/*    */   }
/*    */ 
/*    */   
/*    */   @RequestMapping({"delete"})
/*    */   @ResponseBody
/*    */   public RespBean deleteGoodsType(Integer id) {
/* 71 */     this.goodsTypeService.deleteGoodsType(id);
/* 72 */     return RespBean.success("商品类别删除成功");
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\controller\GoodsTypeController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */