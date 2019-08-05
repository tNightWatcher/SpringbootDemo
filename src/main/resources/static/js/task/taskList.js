$(document).ready(function() {
    initUserTable();


})
    //参考教程 https://blog.csdn.net/yan88888888888888888/article/details/83651507

    //初始化任务表格
    function initUserTable(){
        $('#taskTable').bootstrapTable('destroy');
        $('#taskTable').bootstrapTable({
            url:"/taskController/getTaskList",
            method:"post",
            striped:true,
            contentType: "application/json",//请求数据内容格式 默认是 application/json 自己根据格式自行服务端处理
            dataType: "json",//期待返回数据类型
            pagination:true,//bootstrap分页符底栏
            search:true,//启用搜索框
            searchOnEnterKey:true,//按回车键启用搜索方法
            responseHandler:function (res) {
                return res;
            },
            columns:[
                {
                    field:"id",
                    title:"ID",
                    visible: false

                },{
                    field:"taskName",
                    title:"任务名"
                },{
                    field:"publisher",
                    title:"发布人"
                },{
                    field:"principal",
                    title:"处理人",
                    visible: false
                },{
                    field:"publishTime",
                    title:"发布日期",
                    formatter: function (value, row, index) {
                        return changeDateFormat(value);
                    }
                },{
                    field:"expectedTime",
                    title:"要求完成日期",
                    formatter: function (value, row, index) {
                        return changeDateFormat(value);
                    }
                },{
                    field:"taskOverview",
                    title:"任务概述"
                }
                ,{
                    field:"schedule",
                    title:"当前进度"
                },{
                    field:"accomplishment",
                    title:"是否完成"
                }
            ]
        })
    }

    function changeDateFormat(cellval) {
        var dateVal = cellval + "";
        console.log("dateVal:"+dateVal);
        if (cellval != null) {
            var reg=new RegExp(".\\d{3}\\+\\d{4}$");
            var date = new Date(dateVal.replace(reg, "").replace("T", " "));

            var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
            var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
            var hours = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
            var minutes = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
            var seconds = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();
            return date.getFullYear() + "-" + month + "-" + currentDate + " " + hours + ":" + minutes + ":" + seconds;
        }
    }
