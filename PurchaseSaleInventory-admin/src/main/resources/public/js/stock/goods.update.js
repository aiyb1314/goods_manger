<div class="apiDetail">
<div>
	<h2><span>Boolean / Function(treeId, treeNodes, targetNode)</span><span class="path">setting.edit.drag.</span>inner</h2>
	<h3>概述<span class="h3_info">[ 依赖 <span class="highlight_green">jquery.ztree.exedit</span> 扩展 js ]</span></h3>
	<div class="desc">
		<p></p>
		<div class="longdesc">
			<p>拖拽到目标节点时，设置是否允许成为目标节点的子节点。<span class="highlight_red">[setting.edit.enable = true 时生效]</span></p>
			<p class="highlight_red">拖拽目标是 根 的时候，不触发 prev 和 next，只会触发 inner</p>
			<p class="highlight_red">此功能主要作用是对拖拽进行适当限制（辅助箭头），需要结合 prev、next 一起使用，才能实现完整功能。</p>
			<p>默认值：true</p>
		</div>
	</div>
	<h3>Boolean 格式说明</h3>
	<div class="desc">
	<p> true / false 分别表示 允许 / 不允许 成为目标节点的子节点</p>
	</div>
	<h3>Function 参数说明</h3>
	<div class="desc">
	<h4><b>treeId</b><span>String</span></h4>
	<p>对应 zTree 的 <b class="highlight_red">treeId</b>，�