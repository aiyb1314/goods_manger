package com.zsn.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.admin.pojo.Role;
import com.zsn.admin.query.RoleQuery;
import java.util.List;
import java.util.Map;

public interface IRoleService extends IService<Role> {
  Map<String, Object> roleList(RoleQuery paramRoleQuery);
  
  void saveRole(Role paramRole);
  
  Role findRoleByRoleName(String paramString);
  
  void updateRole(Role paramRole);
  
  void deleteRole(Integer paramInteger);
  
  List<Map<String, Object>> queryAllRoles(Integer paramInteger);
  
  void addGrant(Integer paramInteger, Integer[] paramArrayOfInteger);
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\service\IRoleService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */