package com.zsn.admin.mapper;

import com.zsn.admin.pojo.RoleMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 角色菜单表 Mapper 接口
 * </p>
 *
 * @author zhaoosn
 */
public interface RoleMenuMapper extends BaseMapper<RoleMenu> {

    List<Integer>  queryRoleHasAllMenusByRoleId(Integer roleId);

    List<String>  findAuthoritiesByRoleName(List<String> roleNames);
}
