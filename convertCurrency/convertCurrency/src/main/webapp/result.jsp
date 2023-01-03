<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 03/01/2023
  Time: 09:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dispartcher</title>
</head>
<body>
    <h1>Rate:<%= request.getAttribute("rRate")%></h1>
    <h1>Usd:<%= request.getAttribute("rUsd")%></h1>
    <h1>VND:<%= request.getAttribute("rVND")%></h1>
</body>
</html>
