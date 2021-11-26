package com.zsn.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.admin.dto.TreeDto;
import com.zsn.admin.pojo.Menu;
import java.util.List;
import java.util.Map;

public interface IMenuService extends IService<Menu> {
  List<TreeDto> queryAllMenus(Integer paramInteger);
  
  Map<String, Object> menuList();
  
  Menu findMenuByNameAndGrade(String paramString, Integer paramInteger);
  
  Menu findMenuByAclValue(String paramString);
  
  Menu findMenuById(Integer paramInteger);
  
  Menu findMenuByGradeAndUrl(String paramString, Integer paramInteger);
  
  void saveMenu(Menu paramMenu);
  
  void updateMenu(Menu paramMenu);
  
  void deleteMenuById(Integer paramInteger);
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\service\IMenuService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */