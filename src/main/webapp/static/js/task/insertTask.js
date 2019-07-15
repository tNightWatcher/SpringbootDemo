$(document).ready(function() {

    //任务发布时间
    $('#publishTime').datetimepicker({
        format: 'yyyy-mm-dd',
        language: 'zh-CN',
        weekStart: 1,
        todayBtn: 1,//显示‘今日’按钮
        autoclose: 1,
        todayHighlight: 1,
        startView: 2,
        minView: 2,
        clearBtn:true,//清除按钮
        forceParse: 0
    });
    //要求完成时间
    $('#expectedTime').datetimepicker({
        format: 'yyyy-mm-dd',
        language: 'zh-CN',
        weekStart: 1,
        todayBtn: 1,//显示‘今日’按钮
        autoclose: 1,
        todayHighlight: 1,
        startView: 2,
        minView: 2,
        clearBtn:true,//清除按钮
        forceParse: 0
    });

    //添加用户信息,点击事件
    $('#submit_btn_task').click(function() {

        //var myDate = new Date();
        var obj={};
        obj.taskName=$("#taskName").val();
        obj.publisher=$("#publisher").val();
        obj.publishTime=$("#publishTime").val();
        obj.expectedTime=$("#expectedTime").val();
        obj.taskOverview=$("#taskOverview").val();
        obj.taskDetail=$("#taskDetail").val();
        obj.premise=$("#premise").val();
        obj.schedule=$("#schedule").val();
        obj.accomplishment=$("#accomplishment").val();

        var description = "";
        for(var i in obj){
            var property=obj[i];
            description+=i+" = "+property+"\n";
        }
        console.log(description);

        $.ajax({
            type: "POST",
            url: "/TaskController/insertTask",
            dataType: "json",
            data:JSON.stringify(obj),
            contentType : "application/json",
            success: function (data) {
                alert("数据提交成功");
                console.log("success");
                console.log(data);
            },
            error: function (e) {
                console.log(e)
            }
        })
    })
})