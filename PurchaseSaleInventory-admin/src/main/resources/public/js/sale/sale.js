layui.use(['table','layer'],function(){
       var layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        table = layui.table;
    //客户列表展示
    var  tableIns = table.render({
        elem: '#saleList',
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
            {title: '操作', minWidth:150, templet:'#roleListBar',fixed:"right",align:"center"}
        ]]
    });

    // 多条件搜索
    $(".search_btn").on("click",function(){
        table.reload("saleListTable",{
            page: {
                curr: 1 //重新从第 1 页开始
            },
            where: {
                customerName: $("input[name='salerName']").val()
            }
        })
    });


    //
    // /**
    //  * 行监听
    //  */
    // table.on("tool(customers)", function(obj){
    //     var layEvent = obj.event;
    //     if(layEvent === "edit") {
    //         openAddOrUpdateCustomerDialog(obj.data.id);
    //     }else if(layEvent === "del") {
    //         layer.confirm('确定删除当前客户？', {icon: 3, title: "客户管理"}, function (index) {
    //             $.post(ctx+"/customer/delete",{ids:obj.data.id},function (data) {
    //                     if(data.code==200){
    //                         layer.msg("操作成功！");
    //                         tableIns.reload();
    //                     }else{
    //                         layer.msg(data.message, {icon: 5});
    //                     }
    //             });
    //         })
    //     }
    // });
    //
    //
    // // 打开添加页面
    // function openAddOrUpdateCustomerDialog(uid){
    //     var url  =  ctx+"/customer/addOrUpdateCustomerPage";
    //     var title="客户管理-添加客户";
    //     if(uid){
    //         url = url+"?id="+uid;
    //         title="客户管理-更新客户";
    //     }
    //     layui.layer.open({
    //         title : title,
    //         type : 2,
    //         area:["600px","400px"],
    //         maxmin:true,
    //         content : url
    //     });
    // }
    //
    //
    //
    // /**
    //  * 批量删除
    //  * @param datas
    //  */
    // function delCustomer(datas) {
    //     if(datas.length==0){
    //         layer.msg("请选择删除记录!", {icon: 5});
    //         return;
    //     }
    //
    //     layer.confirm('确定删除选中的客户记录？', {
    //         btn: ['确定','取消'] //按钮
    //     }, function(index){
    //         layer.close(index);
    //         var ids= "ids=";
    //         for(var i=0;i<datas.length;i++){
    //             if(i<datas.length-1){
    //                 ids=ids+datas[i].id+"&ids=";
    //             }else {
    //                 ids=ids+datas[i].id
    //             }
    //         }
    //         $.ajax({
    //             type:"post",
    //             url:ctx+"/customer/delete",
    //             data:ids,
    //             dataType:"json",
    //             success:function (data) {
    //                 if(data.code==200){
    //                     tableIns.reload();
    //                 }else{
    //                     layer.msg(data.message, {icon: 5});
    //                 }
    //             }
    //         })
    //     });
    //
    //
    // }

});
