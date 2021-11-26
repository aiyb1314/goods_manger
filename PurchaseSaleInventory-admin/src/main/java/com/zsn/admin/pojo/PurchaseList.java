package com.zsn.admin.pojo;

 import com.baomidou.mybatisplus.annotation.IdType;
 import com.baomidou.mybatisplus.annotation.TableId;
 import com.baomidou.mybatisplus.annotation.TableName;
 import io.swagger.annotations.ApiModel;
 import io.swagger.annotations.ApiModelProperty;
 import lombok.Data;

 import java.io.Serializable;
 import java.time.LocalDateTime;

 @TableName("t_purchase_list")
 @ApiModel(value = "PurchaseList对象", description = "进货单")
 @Data
 public class PurchaseList implements Serializable {
   private static final long serialVersionUID = 1L;
           @ApiModelProperty("主键")
           @TableId(value = "id", type = IdType.AUTO)
           private Integer id;
           @ApiModelProperty("实付金额")
           private Float amountPaid;
           @ApiModelProperty("应付金额")
           private Float amountPayable;
           @ApiModelProperty("进货日期")
           private LocalDateTime purchaseDate;

           @ApiModelProperty("备注")
           private String remarks;

           @ApiModelProperty("交易状态")
           private Integer state;

           @ApiModelProperty("进货单号")
           private String purchaseNumber;

           @ApiModelProperty("供应商")
           private Integer supplierId;

           @ApiModelProperty("操作用户")
           private Integer userId;
 }


