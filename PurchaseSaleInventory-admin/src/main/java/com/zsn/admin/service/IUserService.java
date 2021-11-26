<div class="apiDetail">
<div>
	<h2><span class="path">setting.callback.</span>onAsyncError</h2>
	<h2><span>Function(event, treeId, treeNode, XMLHttpRequest, textStatus, errorThrown)</span>&nbsp;</h2>
	<h3>概述<span class="h3_info">[ 依赖 <span class="highlight_green">jquery.ztree.core</span> 核心 js ]</span></h3>
	<div class="desc">
		<p></p>
		<div class="longdesc">
			<p>用于捕获异步加载出现异常错误的事件回调函数</p>
			<p class="highlight_red">如果设置了 setting.callback.beforeAsync 方法，且返回 false，将无法触发 onAsyncSuccess / onAsyncError 事件回调函数。</p>
			<p>默认值：null</p>
		</div>
	</div>
	<h3>Function 参数说明</h3>
	<div class="desc">
	<h4><b>event</b><span>js event 对象</span></h4>
	<p>标准的 js event 对象</p>
