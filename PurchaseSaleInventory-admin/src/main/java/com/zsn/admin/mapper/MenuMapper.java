package com.zsn.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsn.admin.dto.TreeDto;
import com.zsn.admin.pojo.Menu;
import java.util.List;

public interface MenuMapper extends BaseMapper<Menu> {
  List<TreeDto> queryAllMenus();
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\mapper\MenuMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */