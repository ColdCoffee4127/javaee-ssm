<%--
  Created by IntelliJ IDEA.
  User: Coffee
  Date: 2024/10/12
  Time: 09:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table,tr,td {
            margin: 20px auto;
            border: 2px solid black;
            text-align: center; /* 设置表格文字居中 */
            border-collapse: collapse;
            line-height: 60px; /* 设置表格行高 */
            width: 30%;
        }
    </style>
</head>
<body>
    <a href="#">
        <c:if test="${empty uname}">
            登录
        </c:if>
    </a>
    <table>
        <c:forEach items="${requestScope.pros}" var="p">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.price}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
