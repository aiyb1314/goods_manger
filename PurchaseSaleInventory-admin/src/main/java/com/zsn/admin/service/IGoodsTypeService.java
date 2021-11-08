package com.zsn.admin.service;

import com.zsn.admin.dto.TreeDto;
import com.zsn.admin.pojo.GoodsType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品类别表 服务类
 * </p>
 *
 * @author zhaoosn
 */
public interface IGoodsTypeService extends IService<GoodsType> {

    List<TreeDto> queryAllGoodsTypes(Integer typeId);

    List<Integer> queryAllSubTypeIdsByTypeId(Integer typeId);

    Map<String, Object> goodsTypeList();

    void saveGoodsType(GoodsType goodsType);

    void deleteGoodsType(Integer id);
}
