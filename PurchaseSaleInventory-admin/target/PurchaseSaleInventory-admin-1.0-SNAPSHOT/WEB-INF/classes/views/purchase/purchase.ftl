<!DOCTYPE html>
<html>
<head>
	<title>客户管理</title>
	<#include "../common.ftl">
</head>
<body class="childrenBody">

	<table id="purchaseList" class="layui-table"  lay-filter="purchases"></table>

	<script type="text/html" id="toolbarDemo">
		<div class="layui-btn-container">
			<a class="layui-btn layui-btn-normal addNews_btn" lay-event="add">
				<i class="layui-icon">&#xe608;</i>
				添加
			</a>
			<a class="layui-btn layui-btn-normal delNews_btn" lay-event="del">
				<i class="layui-icon">&#xe672;</i>
				删除
			</a>
		</div>
	</script>
	<!--操作-->
	<script id="roleListBar" type="text/html">
		<a class="layui-btn layui-btn-xs" id="edit" lay-event="edit">编辑</a>
		<a class="layui-btn layui-btn-xs layui-btn-danger" lay-event="del">删除</a>
	</script>
</form>
<script type="text/javascript" src="${ctx.contextPath}/js/purchase/purchase.js"></script>

</body>
</html>