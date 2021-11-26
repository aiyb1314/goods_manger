package com.zsn.admin.query;

import lombok.Data;

@Data
public class SaleQuery extends BaseQuery {
    private String startDate;
    private String endDate;
}
