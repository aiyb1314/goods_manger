package com.zsn.admin.mapper;

import com.zsn.admin.dto.TreeDto;
import com.zsn.admin.pojo.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author zhaoosn
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<TreeDto>  queryAllMenus();
}
