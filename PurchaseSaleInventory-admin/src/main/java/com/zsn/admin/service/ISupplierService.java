package com.zsn.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.admin.pojo.Supplier;
import com.zsn.admin.query.SupplierQuery;
import java.util.Map;

public interface ISupplierService extends IService<Supplier> {
  Map<String, Object> supplierList(SupplierQuery paramSupplierQuery);
  
  Supplier findSupplierByName(String paramString);
  
  void saveSupplier(Supplier paramSupplier);
  
  void updateSupplier(Supplier paramSupplier);
  
  void deleteSupplier(Integer[] paramArrayOfInteger);
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\service\ISupplierService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */