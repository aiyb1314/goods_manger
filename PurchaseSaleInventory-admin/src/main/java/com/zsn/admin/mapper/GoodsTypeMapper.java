package com.zsn.admin.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsn.admin.dto.TreeDto;
import com.zsn.admin.pojo.GoodsType;
import java.util.List;

public interface GoodsTypeMapper extends BaseMapper<GoodsType> {
  List<TreeDto> queryAllGoodsTypes();
}


/* Location:              C:\Users\MR.X\Desktop\purchase.war!\purchase\WEB-INF\classes\com\zsn\admin\mapper\GoodsTypeMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */