package com.zsn.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsn.admin.pojo.UserRole;
import java.util.List;

public interface UserRoleMapper extends BaseMapper<UserRole> {
  List<String> findRolesByUserName(String paramString);
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\mapper\UserRoleMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */