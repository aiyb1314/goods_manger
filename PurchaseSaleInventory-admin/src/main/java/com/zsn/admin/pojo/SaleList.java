package com.zsn.admin.pojo;

 import com.baomidou.mybatisplus.annotation.IdType;
 import com.baomidou.mybatisplus.annotation.TableId;
 import com.baomidou.mybatisplus.annotation.TableName;
 import io.swagger.annotations.ApiModel;
 import io.swagger.annotations.ApiModelProperty;
 import lombok.Data;

 import java.io.Serializable;
 import java.time.LocalDateTime;

 @TableName("t_sale_list")
 @ApiModel(value = "SaleList对象", description = "销售单表")
 @Data
 public class SaleList implements Serializable {
     private static final long serialVersionUID = 1L;
     @ApiModelProperty("主键")
     @TableId(value = "id", type = IdType.AUTO)
     private Integer id;
     @ApiModelProperty("实付金额")
     private Float amountPaid;
     @ApiModelProperty("应付金额")
     private Float amountPayable;
     @ApiModelProperty("备注")
     private String remarks;

     @ApiModelProperty("销售日期")
     private LocalDateTime saleDate;

     @ApiModelProperty("销售单号")
     private String saleNumber;

     @ApiModelProperty("交易状态")
     private Integer state;

     @ApiModelProperty("操作用户")
     private Integer userId;

     @ApiModelProperty("客户id")
     private Integer customerId;
 }