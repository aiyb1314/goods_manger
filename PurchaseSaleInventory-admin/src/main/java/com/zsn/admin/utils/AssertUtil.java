package com.zsn.admin.utils;

import com.zsn.admin.exceptions.ParamsException;

/**
 * 自定义 断言
 * 在登录界面 验证用户名和密码，避免判断时使用大量if-else
 */
public class AssertUtil {


    public static void isTrue(Boolean flag, String msg) {
        if (flag) {
            throw new ParamsException(msg);
        }
    }

}
