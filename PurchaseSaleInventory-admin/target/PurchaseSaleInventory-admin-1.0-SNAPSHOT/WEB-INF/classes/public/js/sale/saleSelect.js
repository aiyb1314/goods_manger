layui.use(['table','layer'],function(){
       var layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        table = layui.table;
    //客户列表展示
    var  tableIns = table.render({
        elem: '#saleSelectList',
        url : ctx+'/saleSelect/searchPage',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limits : [10,15,20,25],
        limit : 10,
        toolbar: "#toolbarDemo",
        id : "saleListTable",
        cols : [[
            {type: "checkbox", fixed:"left", width:50},
            {field: "saleNumber", title:'销售单号',fixed:"true", width:150},
            {field: 'amountPaid', title: '实付金额', minWidth:50, align:"center"},
            {field: 'saleDate', title: '销售日期', minWidth:100, align:'center'},
            {field: 'userId', title: '操作用户Id', align:'center',minWidth:150},
            {field: 'customerId', title: '客户Id', align:'center',minWidth:150},
        ]]
    });

    // 多条件搜索
    $(".search_btn").on("click",function(){
        table.reload("saleListTable",{
            page: {
                curr: 1 //重新从第 1 页开始
            },
            where: {
                startDate: $("input[name='startDate']").val(),
                endDate: $("input[name='endDate']").val()
            }
        })
    });

});
