layui.use(['table', 'treetable'], function () {
    var $ = layui.jquery;
    var table = layui.table;
    var treeTable = layui.treetable;

    // 渲染表格
    treeTable.render({
        treeColIndex: 1,
        treeSpid: -1,
        treeIdName: 'id',
        treePidName: 'pId',
        elem: '#menu-table',
        url: ctx+'/menu/list',
        toolbar: "#toolbarDemo",
        treeDefaultClose:true,
        cols: [[
            {type: 'numbers'},
            {field: 'name', minWidth: 100, title: '菜单名称'},
            {field: 'aclValue', width: 100,title: '权限码'},
            {field: 'url', width: 120,title: '菜单url'},
            {
                field: 'grade', width: 80, align: 'center', templet: function (d) {
                    if (d.grade == -1 ) {
                        return '<span class="layui-badge layui-bg-blue">根菜单</span>';
                    }
                    if (d.grade == 0 ) {
                        return '<span class="layui-badge layui-bg-blue">一级菜单</span>';
            