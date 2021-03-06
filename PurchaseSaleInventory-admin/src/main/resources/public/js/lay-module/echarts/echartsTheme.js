<div class="apiDetail">
<div>
	<h2><span>Function(treeNodes)</span><span class="path">zTreeObj.</span>showNodes</h2>
	<h3>Overview<span class="h3_info">[ depends on <span class="highlight_green">jquery.ztree.exhide</span> js ]</span></h3>
	<div class="desc">
		<p></p>
		<div class="longdesc">
			<p>To show a group of nodes which be hidden.</p>
			<p class="highlight_red">1. This feature can't support the 'exedit' feature, so please don't use this feature in edit mode.</p>
			<p class="highlight_red">2. If you hide or show the nodes, it will effect the 'isFirstNode' and 'isLastNode' attribute.</p>
			<p class="highlight_red">3. Please use zTree object to executing the method.</p>
		</div>
	</div>
	<h3>Function Parameter Descriptions</h3>
	<div class="desc">
	<h4><b>treeNodes</b><span>Array(JSON)</span></h4>
	<p>the array of the nodes which will be shown</p>
	<p class="highlight_red">Please ensure that this data object is an internal node data object in zTree.</p>
	<h4 class="topLine"><b>Retrun </b><span>none</span></h4>
	<p>no return value</p>
	</div>
	<h3>Examples of function</h3>
	<h4>1. show all of the nodes which be hidden.</h4>
	<pre xmlns=""><code>var treeObj = $.fn.zTree.getZTreeObj("tree");
var nodes = treeObj.getNodesByParam("isHidden", true);
treeObj.showNodes(nodes);
</code></pre>
</div>
</div>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       <div class="apiDetail">
<div>
	<h2><span>Function(treeNodes)</span><span class="path">zTreeObj.</span>transformToArray</h2>
	<h3>Overview<span class="h3_info">[ depends on <span class="highlight_green">jquery.ztree.core</span> js ]</span></h3>
	<div class="desc">
		<p></p>
		<div class="longdesc">
			<p></p>
			<p>Transform the zTree nodes data into simple array.  (To avoid the user to write code to traverse all nodes)</p>
			<p class="highlight_red">Please use zTree object to executing the method.</p>
		</div>
	</div>
	<h3>Function Parameter Descriptions</h3>
	<div class="desc">
	<h4><b>treeNodes</b><span>Array(JSON) / JSON</span></h4>
	<p>JSON data object of the node which need to be transformed.</p>
	<p>or JSON data objects collection of the nodes which need to be transformed.</p>
	<h4 class="topLine"><b>Return </b><span>Array(JSON)</span></h4>
	<p>The JSON data objects array of the nodes which be transformed.</p>
	</div>
	<h3>Examples of function</h3>
	<h4>1. Transform the zTree nodes data into simple array.</h4>
	<pre xmlns=""><code>var treeObj = $.fn.zTree.getZTreeObj("tree");
var nodes = treeObj.transformToArray(treeObj.getNodes());
</code></pre>
</div>
</div>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     <div class="apiDetail">
<div>
	<h2><span>Function(simpleNodes)</span><span class="path">zTreeObj.</span>transformTozTreeNodes</h2>
	<h3>Overview<span class="h3_info">[ depends on <span class="highlight_green">jquery.ztree.core</span> js ]</span></h3>
	<div class="desc">
		<p></p>
		<div class="longdesc">
			<p>Transform the simple array into zTree nodes data.</p>
			<p class="highlight_red">If you use this method, you must set 'setting.data.simpleData.idKey' and 'setting.data.simpleData.pIdKey' attribute, and let the data are consistent with parent-child relationship.</p>
			<p class="highlight_red">Please use zTree object to executing the method.</p>
		</div>
	</div>
	<h3>Function Parameter Descriptions</h3>
	<div class="desc">
	<h4><b>simpleNodes</b><span>Array(JSON) / JSON</span></h4>
	<p>JSON data object of the node which need to be transformed.</p>
	<p>or JSON data objects array of the nodes which need to be transformed.</p>
	<h4 class="topLine"><b>Return </b><span>Array(JSON)</span></h4>
	<p>Standard data which zTree use. The child nodes are stored in the parent node's 'children' attribute.</p>
	<p class="highlight_red">If simpleNodes is a single JSON, so the return array's length is 1.</p>
	</div>
	<h3>Examples of function</h3>
	<h4>1. Transform the simple array data into zTree nodes format.</h4>
	<pre xmlns=""><code>var setting = {
	data: {
		simpleData: {
			enable: true,
			idKey: "id",
			pIdKey: "pId",
			rootPId: 0
		}
	}
};
var simpleNodes = [
    {"id":1, "pId":0, "name":"test1"},
    {"id":11, "pId":1, "name":"test11"},
    {"id":12, "pId":1, "name":"test12"},
    {"id":111, "pId":11, "name":"test111"}
];
var treeObj = $.fn.zTree.getZTreeObj("tree");
var nodes = treeObj.transformTozTreeNodes(simpleNodes);
</code></pre>
</div>
</div>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   <div class="apiDetail">
<div>
	<h2><span>Function(treeNode, checkTypeFlag)</span><span class="path">zTreeObj.</span>updateNode</h2>
	<h3>Overview<span class="h3_info">[ depends on <span class="highlight_green">jquery.ztree.core</span> js ]</span></h3>
	<div class="desc">
		<p></p>
		<div class="longdesc">
			<p>Update node data. Primarily used to update the node's DOM.</p>
			<p class="highlight_red">1. Can update the attributes for display (e.g. 'name', 'target', 'url', 'icon', 'iconSkin', 'checked', 'nocheck'), do not update the other attributes. For example: If you need to expand the node, please use expandNode() method, do not modify the 'open' attribute.</p>
			<p class="highlight_red">2. Use updateNode() method of zTree can't trigger 'beforeCheck' or 'onCheck' callback function.</p>
			<p class="highlight_red">Please use zTree object to executing the method.</p>
		</div>
	</div>
	<h3>Function Parameter Descriptions</h3>
	<div class="desc">
	<h4><b>treeNode</b><span>JSON</span></h4>
	<p>JSON data object of the node which need to update.</p>
	<p class="highlight_red">Please ensure that this data object is an internal node data object in zTree.</p>
	<h4 class="topLine"><b>checkTypeFlag</b><span>Boolean</span></h4>
	<p>checkTypeFlag = true means: According to 'setting.check.chkboxType' attribute automatically check or uncheck the parent and child nodes.</p>
	<p>checkTypeFlag = false means: only check or uncheck this node, don't affect its parent and child nodes.</p>
	<p class="highlight_red">This parameter is valid when 'setting.check.enable = true' and 'setting.check.chkStyle = "checkbox"'</p>
	<p class="highlight_red">Don't affect the parent and child nodes which 'nochecked' attribute is true.</p>
	<h4 class="topLine"><b>Return </b><span>none</span></h4>
	<p>no return value</p>
	</div>
	<h3>Examples of function</h3>
	<h4>1. Modify the first selected node's name, and update it.</h4>
	<pre xmlns=""><code>var treeObj = $.fn.zTree.getZTreeObj("tree");
var nodes = treeObj.getNodes();
if (nodes.length>0) {
	nodes[0].name = "test";
	treeObj.updateNode(nodes[0]);
}
</code></pre>
</div>
</div>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              