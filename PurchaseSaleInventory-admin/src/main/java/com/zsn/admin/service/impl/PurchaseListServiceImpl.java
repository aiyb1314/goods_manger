package com.zsn.admin.service.impl;

 import com.baomidou.mybatisplus.core.conditions.Wrapper;
 import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
 import com.baomidou.mybatisplus.core.metadata.IPage;
 import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
 import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
 import com.zsn.admin.mapper.PurchaseListGoodsMapper;
 import com.zsn.admin.mapper.PurchaseListMapper;
 import com.zsn.admin.pojo.PurchaseList;
 import com.zsn.admin.query.PurchaseQuery;
 import com.zsn.admin.service.IPurchaseListService;
 import com.zsn.admin.utils.AssertUtil;
 import com.zsn.admin.utils.PageResultUtil;
 import java.text.SimpleDateFormat;
 import java.time.LocalDateTime;
 import java.time.format.DateTimeFormatter;
 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import org.apache.commons.lang3.StringUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Propagation;
 import org.springframework.transaction.annotation.Transactional;

 @Service
 public class PurchaseListServiceImpl extends ServiceImpl<PurchaseListMapper, PurchaseList> implements IPurchaseListService
 {
   @Autowired
   private PurchaseListMapper purchaseListMapper;
   @Autowired
   private PurchaseListGoodsMapper purchaseListGoodsMapper;

   public Map<String, Object> purchaseList(PurchaseQuery query) {
     IPage<PurchaseList>  page = new Page(1, 10);
     QueryWrapper<PurchaseList> queryWrapper = new QueryWrapper();
     queryWrapper.ne("purchase_number", "");
     page = this.purchaseListMapper.selectPage(page, queryWrapper);
     for (PurchaseList p : page.getRecords())
     {
      List list = this.purchaseListGoodsMapper.selectList((Wrapper)(new QueryWrapper()).eq("purchase_list_id", p.getId()));
     }
     return PageResultUtil.getResult(Long.valueOf(page.getTotal()), page.getRecords());
   }


   public Map<String, Object> purchaseListSelect(PurchaseQuery query) {
     Page page = new Page(query.getPage().intValue(), query.getLimit().intValue());
     QueryWrapper<PurchaseList> queryWrapper = new QueryWrapper();
     String startDate = query.getStartDate();
     String endDate = query.getEndDate();
     queryWrapper.ne("purchase_number", " ");
     if (startDate != null && endDate != null) {
          LocalDateTime sdate = getTimeStamp(startDate);
          LocalDateTime edate = getTimeStamp(endDate);
          Map<String, Object> result = new HashMap<>();
          result.put("code", Integer.valueOf(0));
          result.put("msg", "");
          ArrayList<PurchaseList> data = new ArrayList<>();
          List<PurchaseList> purchaseLists = this.purchaseListMapper.selectList((Wrapper)queryWrapper);
          int i = 0;
          for (PurchaseList demo : purchaseLists) {
            LocalDateTime purchaseDate = demo.getPurchaseDate();
            if (purchaseDate.isAfter(edate) || purchaseDate.isBefore(sdate)) {
              continue;
            }
            i++;
           data.add(demo);
          }
          result.put("data", data);
          result.put("count", Integer.valueOf(i));
          return result;
     }

     IPage iPage = this.purchaseListMapper.selectPage((IPage)page, (Wrapper)queryWrapper);
     return PageResultUtil.getResult(Long.valueOf(iPage.getTotal()), iPage.getRecords());
   }



   @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
   public void savePurchase(PurchaseList purchaseList) {
     HashMap<String, Object> map = new HashMap<>();
     map.put("purchase_number", purchaseList.getPurchaseNumber());
     checkParams(purchaseList.getPurchaseNumber(), purchaseList.getAmountPaid(), purchaseList.getAmountPayable(), purchaseList.getUserId().intValue());
     AssertUtil.isTrue(Boolean.valueOf((this.purchaseListMapper.selectByMap(map) == null)), "进货单已存在");
     AssertUtil.isTrue(Boolean.valueOf(!save(purchaseList)), "记录添加失败!");
   }

public void deletePurchase(Integer[] ids) {
     AssertUtil.isTrue(Boolean.valueOf((null == ids || ids.length == 0)), "请选择待删除记录id");
     List<Integer> lst = Arrays.asList(ids);
     int i = this.purchaseListMapper.deleteBatchIds(lst);
     AssertUtil.isTrue(Boolean.valueOf((i == 0)), "记录删除失败!");
   }

   public LocalDateTime getTimeStamp(String time) {
     String[] ts = time.split("T");
     SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     String str = "";
     for (String s : ts) {
       str = str + s;
       str = str + " ";
     }
     str = str.substring(0, str.length() - 1);
     str = str + ":00";
     DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
     LocalDateTime parse = LocalDateTime.parse(str, df);
     return parse;
   }


private void checkParams(String num, Float paid, Float payable, int userId) {
     AssertUtil.isTrue(Boolean.valueOf(StringUtils.isBlank(num)), "请输入进货单号!");
     AssertUtil.isTrue(Boolean.valueOf((paid.floatValue() < 0.0F)), "实付金额不科学!");
     AssertUtil.isTrue(Boolean.valueOf((payable.floatValue() < 0.0F)), "!");
     AssertUtil.isTrue(Boolean.valueOf((userId < 0)), "请输入正确操作人员Id!");
   }
 }

