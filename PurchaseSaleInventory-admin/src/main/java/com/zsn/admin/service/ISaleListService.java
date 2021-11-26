package com.zsn.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.admin.pojo.SaleList;
import com.zsn.admin.query.SaleQuery;
import java.util.Map;

public interface ISaleListService extends IService<SaleList> {
  Map<String, Object> saleList();
  
  Map<String, Object> saleListSelect(SaleQuery paramSaleQuery);
}

