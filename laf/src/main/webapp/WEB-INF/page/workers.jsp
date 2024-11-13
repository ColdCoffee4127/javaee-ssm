<%--
  Created by IntelliJ IDEA.
  User: Coffee
  Date: 2024/11/1
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td class="id">编号</td>
            <td class="name">姓名</td>
            <td class="birth">生日</td>
            <td class="salary">薪水</td>
            <td class="operation">操作</td>
        </tr>
        <c:forEach items="${workers}" var="wkr">
            <tr>
                <td class="id">${wkr.id}</td>
                <td class="name">${wkr.workName}</td>
                <td class="birth"><fmt:formatDate value="${wkr.workBirth}" pattern="yyyy-MM-dd"/></td>
                <td class="salary">${wkr.salary}</td>
                <td class="operation"><a href="/wkr/delete/${wkr.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
<style>
    table {
        margin: auto;
        border-collapse: collapse;
    }
    tr{
        font-size: 20px;
    }
    .id {
        text-align:center;
        border:2px solid;
        width:50px;
    }
    .name {
        text-align:center;
        border:2px solid;
        width:50px;
    }
    .birth {
        text-align:center;
        border:2px solid;
        width:200px;
    }
    .salary {
        text-align:center;
        border:2px solid;
        width:50px;
    }
    .operation {
        text-align:center;
        border:2px solid;
        width:50px;
    }
</style>
</html>