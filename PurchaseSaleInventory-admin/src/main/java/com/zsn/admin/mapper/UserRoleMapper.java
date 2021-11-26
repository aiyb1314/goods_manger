package com.zsn.admin.mapper;

import com.zsn.admin.pojo.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 用户角色表 Mapper 接口
 * </p>
 *
 * @author zhaoosn
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {

    List<String>  findRolesByUserName(String userName);
}
