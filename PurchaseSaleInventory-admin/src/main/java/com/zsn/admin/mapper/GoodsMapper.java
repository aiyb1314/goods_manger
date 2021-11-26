package com.zsn.admin.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zsn.admin.pojo.Goods;
import com.zsn.admin.query.GoodsQuery;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper extends BaseMapper<Goods> {
  IPage<Goods> queryGoodsByParams(IPage<Goods> paramIPage, @Param("goodsQuery") GoodsQuery paramGoodsQuery);
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\mapper\GoodsMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */