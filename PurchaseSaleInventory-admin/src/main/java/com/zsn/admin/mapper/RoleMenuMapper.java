package com.zsn.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsn.admin.pojo.RoleMenu;
import java.util.List;

public interface RoleMenuMapper extends BaseMapper<RoleMenu> {
  List<Integer> queryRoleHasAllMenusByRoleId(Integer paramInteger);
  
  List<String> findAuthoritiesByRoleName(List<String> paramList);
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\mapper\RoleMenuMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */