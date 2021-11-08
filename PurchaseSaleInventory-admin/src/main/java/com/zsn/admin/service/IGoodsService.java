package com.zsn.admin.service;

import com.zsn.admin.pojo.Goods;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.admin.query.GoodsQuery;

import java.util.Map;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author zhaoosn
 */
public interface IGoodsService extends IService<Goods> {

    Map<String, Object> goodsList(GoodsQuery goodsQuery);


    String genGoodsCode();

    void saveGoods(Goods goods);

    void updateGoods(Goods goods);

    void deleteGoods(Integer id);

    void updateStock(Goods goods);

    void deleteStock(Integer id);
}
