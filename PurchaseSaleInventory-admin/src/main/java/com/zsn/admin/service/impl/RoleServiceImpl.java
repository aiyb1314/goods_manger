package com.zsn.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zsn.admin.pojo.Role;
import com.zsn.admin.mapper.RoleMapper;
import com.zsn.admin.pojo.RoleMenu;
import com.zsn.admin.pojo.User;
import com.zsn.admin.query.RoleQuery;
import com.zsn.admin.query.UserQuery;
import com.zsn.admin.service.IRoleMenuService;
import com.zsn.admin.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zsn.admin.utils.AssertUtil;
import com.zsn.admin.utils.PageResultUtil;
import com.zsn.admin.utils.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author zhaoosn
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Resource
    private IRoleMenuService roleMenuService;

    @Override
    public Map<String, Object> roleList(RoleQuery roleQuery) {
        IPage<Role> page = new Page<Role>(roleQuery.getPage(), roleQuery.getLimit());
        QueryWrapper<Role> queryWrapper = new QueryWrapper<Role>();
        queryWrapper.eq("is_del", 0);
        if (StringUtils.isNotBlank(roleQuery.getRoleName())) {
            queryWrapper.like("name", roleQuery.getRoleName());
        }
        page = this.baseMapper.selectPage(page, queryWrapper);
        return PageResultUtil.getResult(page.getTotal(), page.getRecords());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void saveRole(Role role) {
        AssertUtil.isTrue(StringUtils.isBlank(role.getName()), "请输入角色名!");
        AssertUtil.isTrue(null != this.findRoleByRoleName(role.getName()), "角色名已存在!");
        role.setIsDel(0);
        AssertUtil.isTrue(!(this.save(role)), "角色添加失败!");
    }

    @Override
    public Role findRoleByRoleName(String roleName) {
        return this.baseMapper.selectOne(new QueryWrapper<Role>().eq("is_del", 0).eq("name", roleName));
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void updateRole(Role role) {
        AssertUtil.isTrue(StringUtils.isBlank(role.getName()), "请输入角色名!");
        Role temp = this.findRoleByRoleName(role.getName());
        AssertUtil.isTrue(null != temp && !(temp.getId().equals(role.getId())), "角色名已存在!");
        AssertUtil.isTrue(!(this.updateById(role)), "角色更新失败!");
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void deleteRole(Integer id) {
        AssertUtil.isTrue(null == id, "请选择待删除记录!");
        Role role = this.getById(id);
        AssertUtil.isTrue(null == role, "待删除记录不存在!");
        role.setIsDel(1);
        AssertUtil.isTrue(!(this.updateById(role)), "角色记录删除失败!");
    }

    @Override
    public List<Map<String, Object>> queryAllRoles(Integer userId) {
        return this.baseMapper.queryAllRoles(userId);
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void addGrant(Integer roleId, Integer[] mids) {
        /**
         * 1.参数校验
         *    roleId 非空 必须存在
         * 2.授权
         *    2.1 第一次授权
         *        直接批量添加即可
         *    2.2 第2+次  授权 (存在原始权限)
         *        如果存在原始权限  此时删除原始权限  然后添加新的权限记录
         *        如果不存在 直接批量添加即可
         *  合并2.1 2.2 原始权限不管是否存在  先执行权限记录查询 如果存在 直接删除(根据角色id)
         *  执行批量添加(数组非空 数量>0)
         */
        Role role = this.getById(roleId);
        AssertUtil.isTrue(null == role, "待授权的角色记录不存在!");
        int count = roleMenuService.count(new QueryWrapper<RoleMenu>().eq("role_id", roleId));
        if (count > 0) {
            AssertUtil.isTrue(!(roleMenuService.remove(new QueryWrapper<RoleMenu>().eq("role_id", roleId))), "角色授权失败");
        }
        if (null != mids && mids.length > 0) {
            List<RoleMenu> roleMenus = new ArrayList<RoleMenu>();
            for (Integer mid : mids) {
                RoleMenu roleMenu = new RoleMenu();
                roleMenu.setRoleId(roleId);
                roleMenu.setMenuId(mid);
                roleMenus.add(roleMenu);
            }
            AssertUtil.isTrue(!(roleMenuService.saveBatch(roleMenus)), "角色授权失败!");
        }

    }


}