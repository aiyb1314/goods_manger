package com.zsn.admin.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.zsn.admin.model.CaptchaImageModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;


@RestController
public class CaptchaController {

    @Resource
    public DefaultKaptcha defaultKaptcha;


    @RequestMapping(value="/image",method = RequestMethod.GET)
    public void kaptcha(HttpSession session, HttpServletResponse response) throws IOExcept