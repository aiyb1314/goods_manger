package com.zsn.admin.service.impl;
/*    */ 
/*    */ import com.baomidou.mybatisplus.core.conditions.Wrapper;
/*    */ import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
/*    */ import com.baomidou.mybatisplus.core.metadata.IPage;
/*    */ import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/*    */ import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
/*    */ import com.zsn.admin.mapper.SaleListMapper;
/*    */ import com.zsn.admin.pojo.SaleList;
/*    */ import com.zsn.admin.query.SaleQuery;
/*    */ import com.zsn.admin.service.ISaleListService;
/*    */ import com.zsn.admin.utils.PageResultUtil;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.time.LocalDateTime;
/*    */ import java.time.format.DateTimeFormatter;
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
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
/*    */ @Service
/*    */ public class SaleListServiceImpl
/*    */   extends ServiceImpl<SaleListMapper, SaleList>
/*    */   implements ISaleListService
/*    */ {
/*    */   @Autowired
/*    */   private SaleListMapper saleListMapper;
/*    */   
/*    */   public Map<String, Object> saleList() {
/* 41 */     Page page = new Page(1L, 10L);
/* 42 */     QueryWrapper<SaleList> queryWrapper = new QueryWrapper();
/* 43 */     queryWrapper.ne("sale_number", " ");
/* 44 */     IPage iPage = this.saleListMapper.selectPage((IPage)page, (Wrapper)queryWrapper);
/* 45 */     return PageResultUtil.getResult(Long.valueOf(iPage.getTotal()), iPage.getRecords());
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Object> saleListSelect(SaleQuery query) {
/* 50 */     Page page = new Page(query.getPage().intValue(), query.getLimit().intValue());
/* 51 */     QueryWrapper<SaleList> queryWrapper = new QueryWrapper();
/* 52 */     String startDate = query.getStartDate();
/* 53 */     String endDate = query.getEndDate();
/* 54 */     queryWrapper.ne("sale_number", " ");
/* 55 */     if (startDate != null && endDate != null) {
/* 56 */       LocalDateTime sdate = getTimeStamp(startDate);
/* 57 */       LocalDateTime edate = getTimeStamp(endDate);
/* 58 */       Map<String, Object> result = new HashMap<>();
/* 59 */       result.put("code", Integer.valueOf(0));
/* 60 */       result.put("msg", "");
/* 61 */       ArrayList<SaleList> data = new ArrayList<>();
/* 62 */       List<SaleList> saleLists = this.saleListMapper.selectList((Wrapper)queryWrapper);
/* 63 */       int i = 0;
/* 64 */       for (SaleList demo : saleLists) {
/* 65 */         LocalDateTime purchaseDate = demo.getSaleDate();
/* 66 */         if (purchaseDate.isAfter(edate) || purchaseDate.isBefore(sdate)) {
/*    */           continue;
/*    */         }
/* 69 */         i++;
/* 70 */         data.add(demo);
/*    */       } 
/* 72 */       result.put("data", data);
/* 73 */       result.put("count", Integer.valueOf(i));
/* 74 */       return result;
/*    */     } 
/* 76 */     IPage iPage = this.saleListMapper.selectPage((IPage)page, (Wrapper)queryWrapper);
/* 77 */     return PageResultUtil.getResult(Long.valueOf(iPage.getTotal()), iPage.getRecords());
/*    */   }
/*    */ 
/*    */   
/*    */   public LocalDateTime getTimeStamp(String time) {
/* 82 */     System.out.println("demo");
/* 83 */     String[] ts = time.split("T");
/* 84 */     SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 85 */     String str = "";
/* 86 */     for (String s : ts) {
/* 87 */       str = str + s;
/* 88 */       str = str + " ";
/*    */     } 
/* 90 */     str = str.substring(0, str.length() - 1);
/* 91 */     str = str + ":00";
/* 92 */     DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
/* 93 */     LocalDateTime parse = LocalDateTime.parse(str, df);
/* 94 */     return parse;
/*    */   }
/*    */ }


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\service\impl\SaleListServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */