<div class="apiDetail">
<div>
	<h2><span>Function(treeId, treeNodes, targetNode, moveType, isCopy)</span><span class="path">setting.callback.</span>beforeDrop</h2>
	<h3>概述<span class="h3_info">[ 依赖 <span class="highlight_green">jquery.ztree.exedit</span> 扩展 js ]</span></h3>
	<div class="desc">
		<p></p>
		<div class="longdesc">
			<p>用于捕获节点拖拽操作结束之前的事件回调函数，并且根据返回值确定是否允许此拖拽操作</p>
			<p>默认值：null</p>
			<p class="highlight_red">如未拖拽到有效位置，则不触发此回调函数，直接将节点恢复原位置</p>
		</div>
	</div>
	<h3>Function 参数说明</h3>
	<div class="desc">
	<h4><b>treeId</b><span>String</span></h4>
	<p>目标节点 targetNode 所在 zTree 的 <b class="highlight_red">treeId</b>，便于用户操控</p>
	<h4 class="topLine"><b>treeNodes</b><span>Array(JSON)</span></h4>
	<p>被拖拽的节点 JSON 数据集合</p>
	<p class="highlight_red">无论拖拽操作为 复制