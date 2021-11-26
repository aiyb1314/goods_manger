<!DOCTYPE html>
<html>
<head>
    <#include "../common.ftl">
</head>
<body class="childrenBody">
<form class="layui-form" style="width:80%;">
    <input name="id" type="hidden" value="${(purchase.id)!}"/>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label" for="purchaseNumber">进货单号</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input name"
                   lay-verify="required" name="purchaseNumber" id="purnumber"  value="${(purchase.purchaseNumber)!}">
        </div>
    </div>
    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label" for="amountPaid">实付金额</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input contact"
                   lay-verify="required" name="amountPaid" id="paid" value="${(purchase.amountPaid)!}">
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label" for="amountPayable">应付金额</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="amountPayable" id="payable" value="${(purchase.amountPayable)!}">
        </div>
    </div>

<#--    <div class="layui-form-item layui-row layui-col-xs12">-->
<#--        <label class="layui-form-label" for="purchaseDate">进货时间</label>-->
<#--        <div class="layui-input-block">-->
<#--            <input type="datetime-local" class="layui-input userName"-->
<#--                   lay-verify="required" name="purchaseDate" id="purdate" value="${(purchase.purchaseDate)!}">-->
<#--        </div>-->
<#--    </div>-->

    <div class="layui-form-item">
        <label class="layui-form-label">供应商</label>
        <div class="layui-input-block">
            <select  name="supplierId" lay-verify="required">
                <option value="0"></option>
                <#if supplierList?? && (supplierList?size > 0) >
                    <#list supplierList as supplier>
                        <option value="${supplier.id}" >${supplier.name}</option>
                    </#list>
                </#if>
            </select>
        </div>
    </div>

    <div class="layui-form-item layui-row layui-col-xs12">
        <label class="layui-form-label" for="userId">操作人员</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input userName"
                   lay-verify="required" name="userId" id="userId" value="${(purchase.userId)!}">
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">备注</label>
        <div class="layui-input-block">
            <textarea name="desc" placeholder="请输入内容" class="layui-textarea"></textarea>
        </div>
    </div>
    <br/>
    <div class="layui-form-item layui-row layui-col-xs12">
        <div class="layui-input-block">
            <button class="layui-btn layui-btn-lg" lay-submit=""
                    lay-filter="addOrUpdatePurchase">确认
            </button>
            <a class="layui-btn layui-btn-lg layui-btn-normal"  id="closeDlg" href="javascript:void(0)">取消</a>
        </div>
    </div>
</form>
<script type="text/javascript" src="${ctx.contextPath}/js/purchase/add.update.js"></script>
</body>
</html>