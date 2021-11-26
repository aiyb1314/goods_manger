package com.zsn.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.admin.pojo.PurchaseList;
import com.zsn.admin.query.PurchaseQuery;
import java.util.Map;

public interface IPurchaseListService extends IService<PurchaseList> {
  Map<String, Object> purchaseList(PurchaseQuery paramPurchaseQuery);
  
  Map<String, Object> purchaseListSelect(PurchaseQuery paramPurchaseQuery);
  
  void savePurchase(PurchaseList paramPurchaseList);
  
  void deletePurchase(Integer[] paramArrayOfInteger);
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\service\IPurchaseListService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */