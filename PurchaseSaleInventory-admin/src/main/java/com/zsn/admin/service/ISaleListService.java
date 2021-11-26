package com.zsn.admin.service;

import com.zsn.admin.pojo.SaleList;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.admin.query.SaleQuery;

import java.util.Map;

/**
 * <p>
 * 销售单表 服务类
 * </p>
 *
 * @author zhaoosn
 * @since 2021-11-09
 */
public interface ISaleListService extends IService<SaleList> {
    Map<String,Object>  saleList();
    Map<String,Object>  saleListSelect(SaleQuery query);
}
