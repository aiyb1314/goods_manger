package com.zsn.admin.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zsn.admin.pojo.RoleMenu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.admin.pojo.RoleMenu;

import java.util.List;

/**
 * <p>
 * 角色菜单表 服务类
 * </p>
 *
 * @author zhaoosn
 */
public interface IRoleMenuService extends IService<RoleMenu> {

    List<Integer> queryRoleHasAllMenusByRoleId(Integer roleId);

    List<String> findAuthoritiesByRoleName(List<String> roleNames);

}
