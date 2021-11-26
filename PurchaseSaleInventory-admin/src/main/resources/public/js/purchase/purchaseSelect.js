layui.use(['table','layer'],function(){
       var layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        table = layui.table;
    //客户列表展示
    var  tableIns = table.render({
        elem: '#purchaseSelectList',
        url : ctx+'/purchaseSelect/searchPage',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limits : [10,15,20,25],
        limit : 10,
        toolbar: "#toolbarDemo",
        id : "purchaseListTable",
        cols : [[
            {type: "checkbox", fixed:"left", width:50},
            {field: 'purchaseNumber', title: '进货单号', minWidth:100, align:'center'},
            {field: 'amountPayable', title: '实付金额', minWidth:50, align:"center"},
            {field: 'purchaseDate', title: '进货日期', align:'center',minWidth:150},
            {field: 'supplierId', title: '供应商', align:'center',minWidth:150},
            {field: 'userId', title: '操作用户', align:'center',minWidth:150}
        ]]
    });

    // 多条件搜索
    $(".search_btn").on("click",function(){
        table.reload("purchaseListTable",{
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
