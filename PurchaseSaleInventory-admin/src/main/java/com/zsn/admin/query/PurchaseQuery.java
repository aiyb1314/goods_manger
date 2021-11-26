package com.zsn.admin.query;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PurchaseQuery extends  BaseQuery{
    private String startDate;
    private String endDate;
}
