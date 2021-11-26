package com.zsn.admin.service;

import com.zsn.admin.pojo.Supplier;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.admin.query.SupplierQuery;

import java.util.Map;

/**
 * <p>
 * 供应商表 服务类
 * </p>
 *
 * @author zhaoosn
 */
public interface ISupplierService extends IService<Supplier> {

    Map<String, Object> supplierList(SupplierQuery supplierQuery);
    
    Supplier findSupplierByName(String name);

    void saveSupplier(Supplier supplier);

    void updateSupplier(Supplier supplier);

    void deleteSupplier(Integer[] ids);
}
