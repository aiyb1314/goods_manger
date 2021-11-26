package com.zsn.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsn.admin.pojo.Role;
import java.util.List;
import java.util.Map;

public interface RoleMapper extends BaseMapper<Role> {
  List<Map<String, Object>> queryAllRoles(Integer paramInteger);
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\mapper\RoleMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */