package com.zsn.admin.service;

import com.zsn.admin.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.admin.query.UserQuery;

import java.util.Map;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author zhaoosn
 * @since 2021-05-30
 */
public interface IUserService extends IService<User> {


    /**
     * 根据用户名查询用户记录, 配置config时会调用
     * @param userName
     * @return
     */
    public User findUserByUserName(String userName);

    void updateUserInfo(User user);

    public void updateUserPassword(String userName, String oldPassword, String newPassword, String confirmPassword);

    Map<String, Object> userList(UserQuery userQuery);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Integer[] ids);
}
