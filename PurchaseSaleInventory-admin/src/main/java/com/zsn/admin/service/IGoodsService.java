package com.zsn.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.admin.pojo.Goods;
import com.zsn.admin.query.GoodsQuery;
import java.util.Map;

public interface IGoodsService extends IService<Goods> {
  Map<String, Object> goodsList(GoodsQuery paramGoodsQuery);
  
  String genGoodsCode();
  
  void saveGoods(Goods paramGoods);
  
  void updateGoods(Goods paramGoods);
  
  void deleteGoods(Integer paramInteger);
  
  void updateStock(Goods paramGoods);
  
  void deleteStock(Integer paramInteger);
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\service\IGoodsService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */