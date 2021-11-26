package com.zsn.admin.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@TableName("t_purchase_list_goods")
@ApiModel(value = "PurchaseListGoods对象", description = "进货单商品表")
@Data
 public class PurchaseListGoods implements Serializable {
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

   @ApiModelProperty("商品单位")
   private String unit;

   @ApiModelProperty("进货单id")
   private Integer purchaseListId;

   @ApiModelProperty("商品类别")
   private Integer typeId;

   @ApiModelProperty("商品id")
   private Integer goodsId;
 }

