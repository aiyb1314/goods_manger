package com.zsn.admin.query;

import lombok.Data;

/**
 * layui提交后台的页面和分页大小
 */
@Data
public class BaseQuery {
    private Integer page=1;
    private Integer limit=10;

}
