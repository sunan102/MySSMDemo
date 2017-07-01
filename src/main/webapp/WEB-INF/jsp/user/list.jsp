<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
<h1>findUser</h1>
<table>
        <c:forEach items="${users}" var="u">
            <tr>
                <td>${u.username}</td>
                <td>${u.password}</td>
            </tr>
        </c:forEach>
</table>
<h5>
    ${p}
</h5>
</body>
</html>
