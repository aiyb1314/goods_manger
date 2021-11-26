package com.zsn.admin.service;

import java.util.List;

public interface IRbacService {
  List<String> findRolesByUserName(String paramString);
  
  List<String> findAuthoritiesByRoleName(List<String> paramList);
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\service\IRbacService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */