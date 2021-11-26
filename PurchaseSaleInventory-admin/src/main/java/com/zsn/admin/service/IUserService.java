package com.zsn.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.admin.pojo.User;
import com.zsn.admin.query.UserQuery;
import java.util.Map;

public interface IUserService extends IService<User> {
  User findUserByUserName(String paramString);
  
  void updateUserInfo(User paramUser);
  
  void updateUserPassword(String paramString1, String paramString2, String paramString3, String paramString4);
  
  Map<String, Object> userList(UserQuery paramUserQuery);
  
  void saveUser(User paramUser);
  
  void updateUser(User paramUser);
  
  void deleteUser(Integer[] paramArrayOfInteger);
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\service\IUserService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */