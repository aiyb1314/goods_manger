layui.use(['table','layer'],function(){
       var layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        table = layui.table;
    //客户列表展示
    var  tableIns = table.render({
        elem: '#purchaseList',
        url : ctx+'/purchase/list',
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
            {field: 'userId', title: '操作用户', align:'center',minWidth:150},
            {title: '操作', minWidth:150, templet:'#roleListBar',fixed:"right",align:"center"}
        ]]
    });


    //头工具栏事件
    table.on('toolbar(purchases)', function(obj){
        var checkStatus = table.checkStatus(obj.config.id);
        switch(obj.event){
            case "add":
                openAddOrUpdatePurchaseDialog();
                break;
            case "del":
                delCustomer(checkStatus.data);
        };
    });


    /**
     * 行监听
     */
    table.on("tool(purchases)", function(obj){
        var layEvent = obj.event;
        if(layEvent === "edit") {
            openAddOrUpdateCustomerDialog(obj.data.id);
        }else if(layEvent === "del") {
            layer.confirm('确定删除当前进货信息？', {icon: 3, title: "客户管理"}, function (index) {
                $.post(ctx+"/purchase/delete",{ids:obj.data.id},function (data) {
                        if(data.code==200){
                            layer.msg("操作成功！");
                            tableIns.reload();
                        }else{
                            layer.msg(data.message, {icon: 5});
                        }
                });
            })
        }
    });


    // 打开添加页面
    function openAddOrUpdatePurchaseDialog(uid){
        var url  =  ctx+"/purchase/addOrUpdatePurchasePage";
        var title="库存管理-添加进货信息";
        if(uid){
            url = url+"?id="+uid;
            title="库存管理-更新进货信息";
        }
        layui.layer.open({
            title : title,
            type : 2,
            area:["700px","600px"],
            maxmin:true,
            content : url
        });
    }



    /**
     * 批量删除
     * @param datas
     */
    function delCustomer(datas) {
        if(datas.length==0){
            layer.msg("请选择删除记录!", {icon: 5});
            return;
        }

        layer.confirm('确定删除选中的客户记录？', {
            btn: ['确定','取消'] //按钮
        }, function(index){
            layer.close(index);
            var ids= "ids=";
            for(var i=0;i<datas.length;i++){
                if(i<datas.length-1){
                    ids=ids+datas[i].id+"&ids=";
                }else {
                    ids=ids+datas[i].id
                }
            }
            $.ajax({
                type:"post",
                url:ctx+"/purchase/delete",
                data:ids,
                dataType:"json",
                success:function (data) {
                    if(data.code==200){
                        tableIns.reload();
                    }else{
                        layer.msg(data.message, {icon: 5});
                    }
                }
            })
        });


    }

});
