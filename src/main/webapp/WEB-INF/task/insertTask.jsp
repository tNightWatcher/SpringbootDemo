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
                    <h2>创建任务</h2>
                </div>
                <form id="insertTaskForm" method="post" class="form-horizontal" action="UserController/insertUserInfo">
                    <div class="form-group">
                        <label class="col-lg-4 control-label">任务名<font color="red">*</font></label>
                        <div class="col-lg-4">
                            <input type="text" class="form-control required" id="taskName" name="taskName" placeholder="任务名" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-4 control-label">发布人<font color="red">*</font></label>
                        <div class="col-lg-4">
                            <input type="text" class="form-control" id="publisher" name="publisher" placeholder="发布人" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-4 control-label">发布日期<font color="red">*</font></label>
                        <div class="col-lg-4">
                            <input type="text" class="form-control" id="publishTime" name="publishTime" placeholder="发布日期" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-4 control-label">要求完成日期<font color="red">*</font></label>
                        <div class="col-lg-4">
                            <input type="text" class="form-control" id="expectedTime" name="expectedTime" placeholder="要求完成日期" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-4 control-label">任务概述<font color="red">*</font></label>
                        <div class="col-lg-4">
                            <input type="text" class="form-control" id="taskOverview" name="taskOverview" placeholder="任务概述" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-4 control-label">任务详细描述<font color="red">*</font></label>
                        <div class="col-lg-4">
                            <input type="text" class="form-control" id="taskDetail" name="taskDetail" placeholder="任务详细描述" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-4 control-label">任务前提<font color="red">*</font></label>
                        <div class="col-lg-4">
                            <input type="text" class="form-control" id="premise" name="premise" placeholder="任务前提" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-4 control-label">当前进度<font color="red">*</font></label>
                        <div class="col-lg-4">
                            <input type="text" class="form-control" id="schedule" name="schedule" placeholder="当前进度" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-4 control-label">是否完成<font color="red">*</font></label>
                        <div class="col-lg-4">
                            <select class="form-control" id="accomplishment" name="accomplishment">
                                <option value="1">是</option>
                                <option value="2">否</option>
                            </select>
                        </div>
                    </div>



                    <div class="form-group">
                        <div class="col-lg-9 col-lg-offset-3">
                            <button type="button" class="btn btn-primary" name="submit_btn" value="add" id="submit_btn_task">增加</button>
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
<link href="/static/bootstrap-datetimepicker-master/css/bootstrap-datetimepicker.min.css" rel="stylesheet">

<script type="text/javascript" src="/static/jquery-3.4.1/jquery-3.4.1.js"></script>
<script type="text/javascript" src="/static/jquery-3.4.1/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/static/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<script type="text/javascript" src="/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/static/bootstrap-datetimepicker-master/js/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" src="/static/bootstrap-datetimepicker-master/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script type="text/javascript" src="/static/js/task/insertTask.js"></script>
</html>
