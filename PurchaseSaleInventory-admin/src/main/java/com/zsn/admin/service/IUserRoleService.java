package com.zsn.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.admin.pojo.UserRole;
import java.util.List;

public interface IUserRoleService extends IService<UserRole> {
  List<String> findRolesByUserName(String paramString);
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\service\IUserRoleService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */