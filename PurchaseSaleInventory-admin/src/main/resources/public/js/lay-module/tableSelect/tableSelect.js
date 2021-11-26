/**
配色方案（如有需要，请自行配置）
 */
/**头部-配色*/
.layui-layout-admin .layui-header{background-color:#1aa094!important;}
.layui-header>ul>.layui-nav-item.layui-this,.layuimini-tool i:hover{background-color:#197971!important;}
/**logo-配色*/
.layui-layout-admin .layui-logo {background-color:#243346!important;}
/**左侧-配色*/
.layui-side.layui-bg-black,.layui-side.layui-bg-black>.layui-left-menu>ul {background-color:#2f4056!important;}
.layui-left-menu .layui-nav .layui-nav-child a:hover:not(.layui-this) {background-color:#3b3f4b;}
/**左侧菜单选中-配色*/
.layui-layout-admin .layui-nav-tree .layui-this, .layui-layout-admin .layui-nav-tree .layui-this>a, .layui-layout-admin .layui-nav-tree .layui-nav-child dd.layui-this, .layui-layout-admin .layui-nav-tree .layui-nav-child dd.layui-this a {
    background-color: #1aa094 !important;
}


/**头部样式 */
.layui-layout-admin .header {position: fixed;left: 0;right: 0;top: 0;bottom: 0;}
.layui-header-menu,.layui-header {height:60px !important;}
.layui-header-menu > .layui-nav-item {color:#1b1d21;height:60px !important;line-height:60px !important;}
.layui-header > .layui-layout-right > .layui-nav-item {height:60px !important;line-height:60px !important;}
.layui-layout-left {left:295px!important;}
.layui-nav.layui-layout-left.layui-header-menu.mobile.layui-hide-xs {font-weight:bold;transition:all .2s;}

/**头部样式（缩放） */
.layuimini-mini .layui-layout-left.layui-header-menu.layui-hide-xs {left:155px!important;}

/**logo演示（通用） */
.layui-layout-admin .layui-logo {font-weight:bold;color:#ffffff!important;height:60px!important;line-height:60px !important;overflow:hidden;line-height:64px;transition:all .2s!important;}
.layui-layout-admin  .layui-logo img {display:inline-block;height:30px;vertical-align:middle;}
.layui-layout-admin  .layui-logo h1 {display:inline-block;margin:0 0 0 12px;color:#dadde2;font-weight:600;font-size:20px;font-family:Avenir,Helvetica Neue,Arial,Helvetica,sans-serif;vertical-align:middle;}

/**logo演示（缩放） */
.layuimini-mini .layui-layout-admin .layui-logo {width:60px!important;}
.layuimini-mini .layui-layout-admin .layui-logo h1 {display:none;}

/**缩放工具（通用） */
.layuimini-tool {position:absolute!important;top:0;left:235px;width:60px;height:100%;line-height:60px;text-align:center;color:#ffffff!important;transition:all .2s;}
/**缩放工具（缩放） */
.layuimini-mini .layuimini-tool {left:95px!important;}
.layuimini-tool i {display:block;color:#fff;width:32px;height:32px;line-height:32px;border-radius:3px;text-align:center;margin-top:15px;cursor:pointer;}

/**tab选项卡 */
.layui-tab-title li cite {font-style:normal;padding-left:5px;}
#top_tabs_box>.layui-tab-title {color:#acafb1;}
#top_tabs_box>.layui-tab-title li:hover {color:#000000;background-color:#e7ebed;}
#top_tabs_box .layui-tab-close {font-size:12px!important;width:14px!important;height:14px!important;line-height:16px!important;}
#top_tabs_box .layui-tab-close:hover {border-radius:4em;background:#ff5722;}
#top_tabs_box>.layui-tab-title>.layui-this>i:first-child {color:#009688;}
#top_tabs_box>.layui-tab-title li {border-right:1px solid #e2e2e2;font-size: 12.5px!important;}
#top_tabs_box>.layui-tab-title .layui-this {color:#000000;}
#top_tabs_box>.layui-tab-title .layui-this:after {margin-top:33px;width: 100%;border: none;height: 2px;background-color: #243346;}
#top_tabs_box {padding-right:138px;height:34px;border-bottom:1px solid #e2e2e2;}
#top_tabs_box > .layui-tab-title ,#top_tabs_box > .closeBox {height:35px !important;}
#top_tabs_box > .layui-tab-title > li ,#top_tabs_box > .closeBox > li {line-height:35px !important;}
#top_tabs {position:absolute;border-bottom:none;}

/**多窗口页面操作下拉**/
.closeBox {position:absolute;right:15px;background-color:#fff !important;color:#000;border-left:1px solid #e2e2e2;border-bottom:1px solid #e2e2e2;padding:0 10px !important;}
.closeBox .layui-nav-item {line-height:40px;}
.closeBox .layui-nav-item > a,.closeBox .layui-nav-item > a:hover {color:#000;}
.closeBox .layui-nav-child {top:40px;}
.closeBox .layui-nav-bar {display:none;}
.closeBox a i.caozuo {font-size:20px;position:absolute;top:1px;left:0;}
.closeBox a span.layui-nav-more {border-color:#333 transparent transparent;}
.closeBox a span.layui-nav-more.layui-nav-mored {border-color:transparent transparent #333;}

/**左侧菜单栏 (通用) */
.layui-side.layui-bg-black {transition:all .2s;}
.layui-side.layui-bg-black>.layui-left-menu>ul {transition:all .2s;}
.layui-side.layui-bg-black>.layui-left-menu > ul > .layui-nav-item:first-child {border-top:1px solid #4b5461;}
.layui-left-menu .layui-nav .layui-nav-item a {height:40px;line-height:40px;padding-right:30px;}
.layui-left-menu .layui-nav .layui-nav-item>a {padding-top:5px;padding-bottom:5px;}
.layui-left-menu .layui-nav .layui-nav-child .layui-nav-child {background:0 0!important}
.layui-left-menu .layui-nav .layui-nav-more {right:15px;}
/**左侧菜单栏 (正常) */
.layuimini-all .layui-nav-itemed .layui-nav-child a ,.layuimini-all .layui-left-menu .layui-nav .layui-nav-child a{padding-left:35px;}
.layuimini-all .layui-left-menu .layui-nav .layui-nav-child .layui-nav-child a {padding-left:45px;}
.layuimini-all .layui-left-menu .layui-nav .layui-nav-child .layui-nav-child .layui-nav-child a {padding-left:55px;}
.layuimini-all .layui-left-menu .layui-nav .layui-nav-child .layui-nav-child .layui-nav-child .layui-nav-child a {padding-left:65px;}
.layuimini-all .layui-left-menu .layui-nav .layui-nav-itemed>.layui-nav-child {padding:5px 0;}
/**左侧菜单栏（缩放） */
.layuimini-mini .layui-left-menu {width: 80px !important;}
.layuimini-mini .layui-side.layui-bg-black,.layuimini-mini .layui-left-menu>ul ,.layuimini-mini .layui-left-menu>ul li i {width:60px!important;}
.layuimini-mini .layui-left-menu>ul li span:first-child {display:none;}
.layuimini-mini .layui-left-menu>ul li span:last-child {float:right; right: 7px;}
.layuimini-mini .layui-left-menu .layui-nav .layui-nav-item a {height:40px;line-height:40px;padding-right:0px!important;}

/**内容主体（通用） */
.layui-layout-admin .layui-body {overflow:hidden;bottom:0px !important;top:60px !important;transition:all .2s;}
/**内容主体（缩放） */
.layuimini-mini .layui-layout-admin .layui-body {left:60px!important;}

/**选择配色方案 */
.layuimini-color .color-title {padding: 10px 0 10px 20px;border-bottom: 1px solid #d9dada;margin-bottom: 8px;}
.layuimini-color .color-content {padding: 0 5px 0 5px;}
.layuimini-color .color-content ul {list-style: none;text-align: center;}
.layuimini-color .color-content ul li {position: relative;display: inline-block;vertical-align: top;width: 80px;height: 50px;margin: 0 15px 15px 0;padding: 2px 2px 4px 2px;background-color: #f2f2f2;cursor: pointer;font-size: 12px;color: #666;}
.layuimini-color .color-content li.layui-this:after, .layuimini-color .color-content li:hover:after {width: 100%;height: 100%;padding: 4px;top: -5px;left: -5px;border-color: #d8d8d8;opacity: 1;}
.layuimini-color .color-content li:after {content: '';position: absolute;z-index: 20;top: 50%;left: 50%;width: 1px;height: 0;border: 1px solid #f2f2f2;transition: all .3s;-webkit-transition: all .3s;opacity: 0;}


/**其它 */
.layui-tab-item {width:100% !important;height:100% !important;}
.layui-nav-item.layui-this {background-color:#1b1d21;}
.layui-width-height {width:100%;height:95%;}
.layui-tab {margin:0 0 0 0;z-index:99999;}
.text-center {height:30px !important;line-height:30px !important;text-align:center !important;}
.layui-nav {padding:0 !important;}
.layui-nav .layui-this:after,.layui-nav-bar,.layui-nav-tree .layui-nav-itemed:after {width:0 !important;height:0 !important;}
.layui-layout-admin .layui-side {top:60px !important;}
.layui-tab-card {box-shadow:0px 0px 0px #888888;border-bottom:0;}
.clildFrame.layui-tab-content {top:35px;position:absolute;bottom:0px;width:100%;padding:0;}
* {touch-action:pan-y;}

/*打开页面动画*/
.layui-tab-item.layui-show{ animation:moveTop 1s; -webkit-animation:moveTop 1s; animation-fill-mode:both; -webkit-animation-fill-mode:both; position:relative; height:100%; -webkit-overflow-scrolling: touch; overflow:auto; }
@keyframes moveTop{
    0% {opacity: 0;-webkit-transform: translateY(30px);-ms-transform: translateY(30px);transform: translateY(30px);}
    100% {opacity: 1;-webkit-transform: translateY(0);-ms-transform: translateY(0);transform: translateY(0);}
}
@-o-keyframes moveTop{
    0% {opacity: 0;-webkit-transform: translateY(30px);-ms-transform: translateY(30px);transform: translateY(30px);}
    100% {opacity: 1;-webkit-transform: translateY(0);-ms-transform: translateY(0);transform: translateY(0);}
}
@-moz-keyframes moveTop{
    0% {opacity: 0;-webkit-transform: translateY(30px);-ms-transform: translateY(30px);transform: translateY(30px);}
    100% {opacity: 1;-webkit-transform: translateY(0);-ms-transform: translateY(0);transform: translateY(0);}
}
@-webkit-keyframes moveTop{
    0% {opacity: 0;-webkit-transform: translateY(30px);-ms-transform: translateY(30px);transform: translateY(30px);}
    100% {opacity: 1;-webkit-transform: translateY(0);-ms-transform: translateY(0);transform: translateY(0);}
}

@media screen and (min-width:768px) {
    /**自定义滚动条样式 */
    ::-webkit-scrollbar {width: 4px;height: 4px}
    ::-webkit-scrollbar-track {background-color: transparent;-webkit-border-radius: 2em;-moz-border-radius: 2em;border-radius: 2em;}
    ::-webkit-scrollbar-thumb {background-color: #9c9da0;-webkit-border-radius: 2em;-moz-border-radius: 2em;border-radius: 2em}
}

/**
 手机自适应样式
*/
@media screen and (max-width:768px) {
    #top_tabs_box {border-bottom:0px!important;}
    .layui-layout-admin .layui-body .layui-tab-item.layui-show{border-top:1px solid #e2e2e2;}
    .layuimini-mini .layuimini-tool {left:15px !important;}
    .layuimini-tool i:hover {background-color:transparent!important;}
    .layuimini-all .layui-layout-left.layui-header-menu {transition:all .2s;float:right;right:5px;}
    .layuimini-all .layui-header-menu > .layui-nav-item {float:right;right:0px;}
    .layuimini-mini .layui-layout-left.layui-header-menu {left:50px !important;transition:all .2s;}
    .layui-layout-admin .layui-nav.layui-layout-right {margin-right:15px!important;}
    .layui-layout-admin .layui-nav.layui-layout-right>li:not(.layuimini-setting) {width:40px!important;}
    .layui-layout-admin .layui-nav.layui-layout-right>li:not(.layuimini-setting) a {padding:0 15px;}
    .layuimini-mini .layui-layout-admin .layui-body {left:0px!important;}
    .layui-layout-admin .layui-body .clildFrame.layui-tab-content {top:0px!important;}
    .layui-layout-admin .layui-body .clildFrame.layui-tab-content {overflow:scroll;table-layout:fixed;word-wrap:break-word;word-break:break-all;-webkit-overflow-scrolling:touch!important;}
    .layuimini-all .layui-nav.layui-layout-right,.layuimini-mini .layui-layout-admin .layui-logo ,.layuimini-mini .layui-side.layui-bg-black,.layuimini-mini .layui-left-menu,.layui-layout-admin .layui-body #top_tabs,.layui-layout-admin .layui-body .layui-nav.closeBox{
        transition:all .2s;display:none;
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   