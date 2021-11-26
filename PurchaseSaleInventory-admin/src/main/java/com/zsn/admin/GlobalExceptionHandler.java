layui.define(['layer', 'carousel'], function (exports) {
    var $ = layui.jquery;
    var layer = layui.layer;
    var carousel = layui.carousel;

    // 添加步骤条dom节点
    var renderDom = function (elem, stepItems, postion) {
        var stepDiv = '<div class="lay-step">';
        for (var i = 0; i < stepItems.length; i++) {
            stepDiv += '<div class="step-item">';
            // 线
            if (i < (stepItems.length - 1)) {
                if (i < postion) {
                    stepDiv += '<div class="step-item-tail"><i class="step-item-tail-done"></i></div>';
                } else {
                    stepDiv += '<div class="step-item-tail"><i class=""></i></div>';
                }
            }

            // 数字
            var number = stepItems[i].number;
            if (!number) {
                number = i + 1;
            }
            if (i == postion) {
                stepDiv += '<