package com.zsn.admin.mapper;

import com.zsn.admin.dto.TreeDto;
import com.zsn.admin.pojo.GoodsType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 商品类别表 Mapper 接口
 * </p>
 *
 * @author 老李
 */
public interface GoodsTypeMapper extends BaseMapper<GoodsType> {

    List<TreeDto>  queryAllGoodsTypes();
}
