<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2019/7/2
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>插入用户数据</title>
</head>
<body>

<div class="container">
    <div class="row">
        <!-- form: -->
        <section>
            <div class="col-lg-8 col-lg-offset-2">
                <div class="page-header">
                    <h2>录入用户</h2>
                </div>
                <%--jijian/--%>
                <form id="zfryForm" method="post" class="form-horizontal" action="UserController/insertUserInfo">
                    <div class="form-group">
                        <label class="col-lg-4 control-label">账号<font color="red">*</font></label>
                        <div class="col-lg-4">
                            <input type="text" class="form-control required" id="account" name="account" placeholder="账号" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-4 control-label">密码<font color="red">*</font></label>
                        <div class="col-lg-4">
                            <input type="text" class="form-control" id="password" name="password" placeholder="密码" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-4 control-label">再次确认密码<font color="red">*</font></label>
                        <div class="col-lg-4">
                            <input type="text" class="form-control" id="password2" name="password2" placeholder="再次确认密码" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-4 control-label">名字<font color="red">*</font></label>
                        <div class="col-lg-4">
                            <input type="text" class="form-control" id="userName" name="userName" placeholder="名字" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-4 control-label">年龄<font color="red">*</font></label>
                        <div class="col-lg-4">
                            <input type="text" class="form-control" id="age" name="age" placeholder="年龄" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-4 control-label">性别<font color="red">*</font></label>
                        <div class="col-lg-4">
                            <select class="form-control" id="sex" name="sex">
                                <option value="1">男</option>
                                <option value="2">女</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-lg-9 col-lg-offset-3">
                            <button type="button" class="btn btn-primary" name="submit_btn" value="add" id="submit_btn">增加</button>
                            <button type="button" class="btn btn-info" id="validateBtn">验证</button>
                        </div>

                    </div>

                </form>
            </div>
        </section>
        <!-- :form -->
    </div>
</div>

</body>
<link href="/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
<link href="/static/bootstrap-3.3.7-dist/css/bootstrap-theme.css" rel="stylesheet">

<script type="text/javascript" src="/static/jquery-3.4.1/jquery-3.4.1.js"></script>
<script type="text/javascript" src="/static/jquery-3.4.1/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/static/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<script type="text/javascript" src="/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/static/js/insertUserInfo.js"></script>
</html>
