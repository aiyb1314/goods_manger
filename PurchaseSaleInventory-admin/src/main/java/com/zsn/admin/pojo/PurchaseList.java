<div class="apiDetail">
<div>
	<h2><span>Boolean</span><span class="path">treeNode.</span>checked</h2>
	<h3>Overview<span class="h3_info">[ depends on <span class="highlight_green">jquery.ztree.excheck</span> js ]</span></h3>
	<div class="desc">
		<p></p>
		<div class="longdesc">
			<p>The checked status about node's checkbox or radio. It is valid when <span class="highlight_red">[setting.check.enable = true & treeNode.nocheck = false]</span></p>
			<p class="highlight_red">1. If change the 'checked' to other attribute, please set the 'setting.data.key.checked' attribute.</p>
			<p class="highlight_red">2. If you create node data, and set 'checked' attribute to true, zTree will check this node's checkbox or radio when zTree is initialized.</p>
			<p class="highlight_red">3. Use the treeObj.checkNode or checkAllNodes or updateNode method, you can check or uncheck the node. Please see the API about these methods.</p>
			<p class="highlight_red">4. zTree support identification string 'true' & 'false'.</p>
			<p>Default: false</p>
		</div>
	</div>
	<h3>Boolean Format</h3>
	<div class="desc">
	<p>true means: check the checkbox or radio when zTree is initialized.</p>
	<p>false means: uncheck the checkbox or radio when zTree is initialized.</p>
	</div>
	<h3>Examples of treeNode</h3>
	<h4>1. check the checkbox when zTree is initialized</h4>
	<pre xmlns=""><code>var nodes = [
{ "id":1, "name":"test1", checked:true },
{ "id":2, "name":"test2", checked:true }
]</code