package com.zsn.admin.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@TableName("t_sale_list_goods")
@ApiModel(value = "SaleListGoods对象", description = "销售单商品表")
@Data
 public class SaleListGoods implements Serializable {
   private static final long serialVersionUID = 1L;
   @ApiModelProperty("主键")
   @TableId(value = "id", type = IdType.AUTO)
   private Integer id;
   @ApiModelProperty("商品编码")
   private String code;
   @ApiModelProperty("商品型号")
   private String model;
   @ApiModelProperty("商品名称")
   private String name;
   @ApiModelProperty("数量")
   private Integer num;

  @ApiModelProperty("单价")
  private Float price;

  @ApiModelProperty("总价")
  private Float total;

  @ApiModelProperty("单位")
  private String unit;

  @ApiModelProperty("销售单")
  private Integer saleListId;

  @ApiModelProperty("商品类别")
  private Integer typeId;

  @ApiModelProperty("商品id")
  private Integer goodsId;
 }


