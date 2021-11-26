package com.zsn.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsn.admin.dto.TreeDto;
import com.zsn.admin.pojo.GoodsType;
import java.util.List;
import java.util.Map;

public interface IGoodsTypeService extends IService<GoodsType> {
  List<TreeDto> queryAllGoodsTypes(Integer paramInteger);
  
  List<Integer> queryAllSubTypeIdsByTypeId(Integer paramInteger);
  
  Map<String, Object> goodsTypeList();
  
  void saveGoodsType(GoodsType paramGoodsType);
  
  void deleteGoodsType(Integer paramInteger);
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\service\IGoodsTypeService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */