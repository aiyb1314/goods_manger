layui.use(['form', 'layer','formSelects'], function () {
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery;
        formSelects = layui.formSelects;


    var userId=$("input[name='id']").val();
    formSelects.config('selectId',{
        type:"post",
        searchUrl:ctx+"/role/queryAllRoles?userId="+userId,
        keyName: 'roleName',            //自定义返回数据中name的key, 默认 name
        keyVal: 'id'            //自定义返回数据中value的key, 默认 value
    },true);



    form.on("submit(addOrUpdateUser)", function (data) {
         index = top.layer.msg('数据提交中，请稍候', {icon: 16, time