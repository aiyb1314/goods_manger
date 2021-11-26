package com.zsn.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.admin.pojo.RoleMenu;
import java.util.List;

public interface IRoleMenuService extends IService<RoleMenu> {
  List<Integer> queryRoleHasAllMenusByRoleId(Integer paramInteger);
  
  List<String> findAuthoritiesByRoleName(List<String> paramList);
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\service\IRoleMenuService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */