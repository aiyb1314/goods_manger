<div class="apiDetail">
<div>
	<h2><span>Function(treeNode, addFlag, isSilent)</span><span class="path">zTreeObj.</span>selectNode</h2>
	<h3>Overview<span class="h3_info">[ depends on <span class="highlight_green">jquery.ztree.core</span> js ]</span></h3>
	<div class="desc">
		<p></p>
		<div class="longdesc">
			<p>Select a node</p>
			<p class="highlight_red">zTree v3.x supports select multiple nodes.</p>
			<p class="highlight_red">Please use zTree object to executing the method.</p>
		</div>
	</div>
	<h3>Function Parameter Descriptions</h3>
	<div class="desc">
	<h4><b>treeNode</b><span>JSON</span></h4>
	<p>JSON data object of the node to be selected.</p>
	<p class="highlight_red">Please ensure that this data object is an internal node data object in zTree.</p>
	<h4 class="topLine"><b>addFlag</b><span>Boolean</span></h4>
	<p>addFlag = true means: append to select node, don't affect the previously selected node, can select multiple nodes.</p>
	<p>addFlag = false (default) means: select single node, prior the selected node is deselected.</p>
	<p class="highlight_red">If setting.view.selectedMulti = false, this para, this parameter is not valid, always select single node</p>
	<p>isSilent = true means: when you select node, zTree will not scroll the node into view.</p>
	<p>isSilent = false (default) means: when you select node, zTree will scroll the node into view.</p>
	<p class="highlight_red">(v3.5.23+)</p>
	<h4 class="topLine"><b>Return </b><span>none</span></h4>
	<p>no return value</p>
	</div>
	<h3>Exampleso of function</h3>
	<h4>1. Select single node which be first selected.</h4>
	<pre xmlns=""><code>var treeObj = $.fn.zTree.getZTreeObj("tree");
var nodes = treeObj.getNodes();
if (nodes.length>0) {
	treeObj.selectNode(nodes[0]);
}
</code></pre>
</div>
</div>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             <div class="apiDetail">
<div>
	<h2><span>Function(node, disabled, inheritParent, inheritChildren)</span><span class="path">zTreeObj.</span>setChkDisabled</h2>
	<h3>Overview<span class="h3_info">[ depends on <span class="highlight_green">jquery.ztree.excheck</span> js ]</span></h3>
	<div class="desc">
		<p></p>
		<div class="longdesc">
			<p>Set the node's checkbox or radio is disabled or remove disabled. It is valid when <span class="highlight_red">[setting.check.enable = true]</span></p>
			<p class="highlight_red">1. After the node's checkbox / radio is disabled, it can not be checked or unchecked, but it can affect the half-checked status of the parent node.</p>
			<p class="highlight_red">2. Please do not directly modify the 'chkDisabled' attribute of the loaded node.</p>
			<p class="highlight_red">3. Please use zTree object to executing the method.</p>
		</div>
	</div>
	<h3>Function Parameter Descriptions</h3>
	<div class="desc">
	<h4><b>treeNode</b><span>JSON</span></h4>
	<p>JSON data object of the node which need to be checked or unchecked.</p>
	<p class="highlight_red">Please ensure that this data object is an internal node data object in zTree.</p>
	<h4 class="topLine"><b>disabled</b><span>Boolean</span></h4>
	<p>disabled = true means: the node's checkbox / radio is disabled.</p>
	<p>disabled = false means: the node's checkbox / radio is removed disabled.</p>
	<p class="highlight_red">If this parameter is omitted, it is same as disabled = false </p>
	<p class="highlight_red">Don't affect the node which 'nochecked' attribute is true.</p>
	<h4 class="topLine"><b>inheritParent</b><span>Boolean</span></h4>
	<p>inheritParent = true means: all parent nodes's disabled status will be same as this node.</p>
	<p>inheritParent = false means: all parent nodes's disabled status will be not affected.</p>
	<p class="highlight_red">If this parameter is omitted, it is same as 'inheritParent = false'</p>
	<h4 class="topLine"><b>inheritChildren</b><span>Boolean</span></h4>
	<p>inheritChildren = true means: all child nodes's disabled status will be same as this node.</p>
	<p>inheritChildren = false means: all child nodes's disabled status will be not affected.</p>
	<p class="highlight_red">If this parameter is omitted, it is same as 'inheritChildren = false'</p>
	<h4 class="topLine"><b>Return </b><span>none</span></h4>
	<p>no return value</p>
	</div>
	<h3>Examples of function</h3>
	<h4>1. Set the selected nodes's checkbox / radio to disable.</h4>
	<pre xmlns=""><code>var treeObj = $.fn.zTree.getZTreeObj("tree");
var nodes = treeObj.getSelectedNodes();
for (var i=0, l=nodes.length; i < l; i++) {
	treeObj.setChkDisabled(nodes[i], true);
}
</code></pre>
</div>
</div>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       <div class="apiDetail">
<div>
	<h2><span>Function(editable)</span><span class="path">zTreeObj.</span>setEditable</h2>
	<h3>Overview<span class="h3_info">[ depends on <span class="highlight_green">jquery.ztree.exedit</span> js ]</span></h3>
	<div class="desc">
		<p></p>
		<div class="longdesc">
			<p>Edit mode and normal mode switch.</p>
			<p class="highlight_red">To use edit mode, please set the attributes in 'setting.edit'</p>
			<p class="highlight_red">Please use zTree object to executing the method.</p>
		</div>
	</div>
	<h3>Function Parameter Descriptions</h3>
	<div class="desc">
	<h4><b>editable</b><span>Boolean</span></h4>
	<p>true means: set zTree to edit mode.</p>
	<p>false means: set zTree to normal mode.</p>
	<h4><b>Return </b><span>none</span></h4>
	<p>no return value</p>
	</div>
	<h3>Examples of function</h3>
	<h4>1. set zTree to edit mode</h4>
	<pre xmlns=""><code>var treeObj = $.fn.zTree.getZTreeObj("tree");
treeObj.setEditable(true);
</code></pre>
</div>
</div>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      <div class="apiDetail">
<div>
	<h2><span>Function(treeNode)</span><span class="path">zTreeObj.</span>showNode</h2>
	<h3>Overview<span class="h3_info">[ depends on <span class="highlight_green">jquery.ztree.exhide</span> js ]</span></h3>
	<div class="desc">
		<p></p>
		<div class="longdesc">
			<p>To hide any node which be hidden.</p>
			<p class="highlight_red">1. This feature can't support the 'exedit' feature, so please don't use this feature in edit mode.</p>
			<p class="highlight_red">2. If you hide or show the nodes, it will effect the 'isFirstNode' and 'isLastNode' attribute.</p>
			<p class="highlight_red">3. Please use zTree object to executing the method.</p>
		</div>
	</div>
	<h3>Function Parameter Descriptions</h3>
	<div class="desc">
	<h4><b>treeNodes</b><span>Array(JSON)</span></h4>
	<p>JSON data object of the node to be shown</p>
	<p class="highlight_red">Please ensure that this data object is an internal node data object in zTree.</p>
	<h4 class="topLine"><b>Retrun </b><span>none</span></h4>
	<p>no return value</p>
	</div>
	<h3>Examples of function</h3>
	<h4>1. show someone node which be hidden.</h4>
	<pre xmlns=""><code>var treeObj = $.fn.zTree.getZTreeObj("tree");
var node = treeObj.getNodeByParam("isHidden", true);
if (node) {
  treeObj.showNode(node);
}
</code></pre>
</div>
</div>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 