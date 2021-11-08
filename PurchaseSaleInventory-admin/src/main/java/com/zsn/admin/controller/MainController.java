package com.zsn.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

    /**
     * 系统登录页面
     *
     * @return
     */
    @RequestMapping("index")
    public String index() {
        return "index";
    }

    /**
     * 系统主页面
     *
     * @return
     */
    @RequestMapping("main")
    public String main() {
        return "main";
    }

    /**
     * 访问页面
     *
     * @return
     */
    @RequestMapping("welcome")
    public String welcome() {
        return "welcome";
    }
}
