package com.zsn.admin.controller;

import com.zsn.admin.model.RespBean;
import com.zsn.admin.pojo.Goods;
import com.zsn.admin.query.GoodsQuery;
import com.zsn.admin.service.IGoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 期初库存
 *
 * @author zhaoosn
 * @version 1.0
 */
@Controller
@RequestMapping("stock")
public class StockController {

    @Resource
    private IGoodsService goodsService;

    /**
     * 期初库存主页
     *