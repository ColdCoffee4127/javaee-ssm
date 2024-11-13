<%--
  Created by IntelliJ IDEA.
  User: Coffee
  Date: 2024/10/16
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="width: 300px; margin: 0 auto">
    <h2>登录</h2>
    <form action="login1" method="post">
        <div>
            <label for="username">昵称:</label>
            <input type="text" id="username" name="username" >
        </div>
        <div>
            <label for="password">密码:</label>
            <input type="password" id="password" name="password">
        </div>
<%--        <div>--%>
<%--            <label for="birthday">日期</label>--%>
<%--            <input type="date" id="birthday" name="birthday">--%>
<%--        </div>--%>

        <div>
            <button type="submit" onclick="save()">登录</button>
        </div>
    </form>
</div>
<script  type="text/javascript"  src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script type="text/javascript">
    function  save(){
        var username=$("#username").val();
        var password=$("#password").val();
        $.ajax({
            url:"/login",
            type:"post",
            data:JSON.stringify({username:username,password:password}),
            contentType:"application/json",
            success:function (res){
                alert(res.msg);
            }
        });
    }
</script>
</body>
</html>
