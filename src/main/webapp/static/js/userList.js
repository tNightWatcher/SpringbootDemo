$(document).ready(function() {
    initUserTable();

    //参考教程 https://blog.csdn.net/yan88888888888888888/article/details/83651507

    function initUserTable(){
        $('#userTable').bootstrapTable({
            url:"/userController/getUserList",
            method:"post",
            striped:true,
            contentType: "application/json",//请求数据内容格式 默认是 application/json 自己根据格式自行服务端处理
            dataType: "json",//期待返回数据类型
            responseHandler:function (res) {
                return res;
            },
            columns:[
                {
                    field:"id",
                    title:"ID",
                    visible: false

                },{
                    field:"account",
                    title:"账号"
                },{
                    field:"name",
                    title:"名字"
                },{
                    field:"age",
                    title:"年龄"
                },{
                    field:"sex",
                    title:"性别"
                },{
                    field:"lastChangeTime",
                    title:"最后一次修改时间"
                },{
                    field:"createTime",
                    title:"创建时间"
                }
            ]
        })
    }

})