package com.zsn.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.admin.pojo.Customer;
import com.zsn.admin.query.CustomerQuery;
import java.util.Map;

public interface ICustomerService extends IService<Customer> {
  Map<String, Object> customerList(CustomerQuery paramCustomerQuery);
  
  void saveCustomer(Customer paramCustomer);
  
  void updateCustomer(Customer paramCustomer);
  
  void deleteCustomer(Integer[] paramArrayOfInteger);
  
  Customer findCustomerByName(String paramString);
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\service\ICustomerService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */