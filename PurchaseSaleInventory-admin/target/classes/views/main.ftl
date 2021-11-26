<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>进销存管理系统</title>
    <#include "common.ftl">
    <style>
        .hiddenStyle{
            display: none;
        }
    </style>
</head>
<body class="layui-layout-body layuimini-all">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header header">
        <div class="layui-logo" align="left">
            <a href="" >
                <img src="images/logo.jpg" alt="logo" style="border-radius: 30px">
                <h1 style="margin: 0 0 0 3px">进销存管理系统</h1>
            </a>
        </div>
        <a>
            <div class="layuimini-tool"><i title="展开" class="fa fa-outdent" data-side-fold="1"></i></div>
        </a>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item mobile layui-hide-xs" lay-unselect>
                <a href="javascript:;" data-check-screen="full"><i class="fa fa-arrows-alt"></i></a>
            </li>
            <li class="layui-nav-item layuimini-setting">
                <a href="javascript:;">${(Session.SPRING_SECURITY_CONTEXT.authentication.principal.username)!'demox'} </a>
                <dl class="layui-nav-child">
                    <dd>
                        <a href="javascript:;" data-iframe-tab="${ctx.contextPath}/user/setting" data-title="基本资料" data-icon="fa fa-gears">基本资料</a>
                    </dd>
                    <dd>
                        <a href="javascript:;" data-iframe-tab="${ctx.contextPath}/user/password" data-title="修改密码" data-icon="fa fa-gears">修改密码</a>
                    </dd>
                    <dd>
                        <a href="${ctx.contextPath}/signout" class="login-out">退出登录</a>
                    </dd>
                </dl>
            </li>
            <li class="layui-nav-item layuimini-select-bgcolor mobile layui-hide-xs" lay-unselect>
                <a href="javascript:;"></a>
            </li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll layui-left-menu">
                <ul class="layui-nav layui-nav-tree layui-left-nav-tree layui-this" id="currency">
                    <li class="layui-nav-item">
                        <a href="javascript:;" class="layui-menu-tips"><i class="layui-icon layui-icon-senior"></i><span class="layui-left-nav"> 进货管理</span> <span class="layui-nav-more"></span></a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-11" data-tab="purchase/index" target="_self"><i class="fa fa-user"></i><span class="layui-left-nav"> 进货入库</span></a>
                            </dd>

                            <dd class="">
                                <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-13" data-tab="purchaseSelect/index" target="_self"><i class="fa fa-tachometer"></i><span class="layui-left-nav"> 进货查询</span></a>
                            </dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item">
                        <a href="javascript:;" class="layui-menu-tips"><i class="layui-icon layui-icon-app"></i><span class="layui-left-nav"> 销售管理</span> <span class="layui-nav-more"></span></a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-11" data-tab="sale/index" target="_self"><i class="fa fa-user"></i><span class="layui-left-nav"> 销售出库</span></a>
                            </dd>

                            <dd class="">
                                <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-13" data-tab="saleSelect/index" target="_self"><i class="fa fa-tachometer"></i><span class="layui-left-nav"> 销售查询</span></a>
                            </dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item">
                        <a href="javascript:;" class="layui-menu-tips"><i class="layui-icon layui-icon-link"></i><span class="layui-left-nav"> 转仓管理</span> <span class="layui-nav-more"></span></a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-11" data-tab="supplier/index" target="_self"><i class="fa fa-user"></i><span class="layui-left-nav"> 转入仓库</span></a>
                            </dd>

                            <dd class="">
                                <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-12" data-tab="customer/index" target="_self"><i class="fa fa-tachometer"></i><span class="layui-left-nav"> 转出仓库</span></a>
                            </dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item">
                        <a href="javascript:;" class="layui-menu-tips"><i class="layui-icon layui-icon-form"></i><span class="layui-left-nav"> 基础资料</span> <span class="layui-nav-more"></span></a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-11" data-tab="supplier/index" target="_self"><i class="fa fa-user"></i><span class="layui-left-nav"> 供应商管理</span></a>
                            </dd>

                            <dd class="">
                                <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-12" data-tab="customer/index" target="_self"><i class="fa fa-tachometer"></i><span class="layui-left-nav"> 客户管理</span></a>
                            </dd>
                            <dd class="">
                                <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-13" data-tab="goods/index" target="_self"><i class="layui-icon layui-icon-chart-screen"></i><span class="layui-left-nav"> 商品管理</span></a>
                            </dd>
                            <dd class="">
                                <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-13" data-tab="goodsType/index" target="_self"><i class="layui-icon layui-icon-chart-screen"></i><span class="layui-left-nav"> 商品分类管理</span></a>
                            </dd>
                            <dd class="">
                                <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-13" data-tab="stock/index" target="_self"><i class="layui-icon layui-icon-chart-screen"></i><span class="layui-left-nav"> 期初库存</span></a>
                            </dd>
                        </dl>
                    </li>


                    <@security.authorize access="hasAnyAuthority('10')">
                        <li class="layui-nav-item">
                            <a href="javascript:;" class="layui-menu-tips"><i class="layui-icon layui-icon-util"></i><span class="layui-left-nav"> 系统设置</span> <span class="layui-nav-more"></span></a>
                            <dl class="layui-nav-child">
                                <@security.authorize access="hasAnyAuthority('1010')">
                                    <dd>
                                        <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-11" data-tab="user/index" target="_self"><i class="fa fa-user"></i><span class="layui-left-nav"> 用户管理</span></a>
                                    </dd>
                                </@security.authorize>

                                <@security.authorize access="hasAnyAuthority('1020')">
                                    <dd class="">
                                        <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-12" data-tab="role/index" target="_self"><i class="fa fa-tachometer"></i><span class="layui-left-nav"> 角色管理</span></a>
                                    </dd>
                                </@security.authorize>

                                <@security.authorize access="hasAnyAuthority('1030')">
                                    <dd class="">
                                        <a href="javascript:;" class="layui-menu-tips" data-type="tabAdd" data-tab-mpi="m-p-i-13" data-tab="menu/index" target="_self"><i class="fa fa-tachometer"></i><span class="layui-left-nav"> 菜单管理</span></a>
                                    </dd>
                                </@security.authorize>
                            </dl>
                        </li>
                    </@security.authorize>

                    <span class="layui-nav-bar" style="top: 201px; height: 0px; opacity: 0;"></span>
                </ul>
        </div>
    </div>

    <div class="layui-body">
        <div class="layui-tab" lay-filter="layuiminiTab" id="top_tabs_box">
            <ul class="layui-tab-title" id="top_tabs">
                <li class="layui-this" id="layuiminiHomeTabId" lay-id="welcome"><i class="fa fa-home"></i> <span>首页</span></li>
            </ul>


            <ul class="layui-nav closeBox">
                <li class="layui-nav-item">
                    <a href="javascript:;"> <i class="fa fa-dot-circle-o"></i> 页面操作</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" data-page-close="other"><i class="fa fa-window-close"></i> 关闭其他</a></dd>
                        <dd><a href="javascript:;" data-page-close="all"><i class="fa fa-window-close-o"></i> 关闭全部</a></dd>
                    </dl>
                </li>
            </ul>
            <div class="layui-tab-content clildFrame">
                <div id="layuiminiHomeTabIframe" class="layui-tab-item layui-show">
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="${ctx.contextPath}/js/main.js"></script>
</body>
</html>