<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 03/01/2023
  Time: 08:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert-Currency</title>
</head>
<body>
  <%
    float rate = Float.parseFloat(request.getParameter("rate"));
    float usd = Float.parseFloat(request.getParameter("usd"));
    float vnd = rate * usd;
  %>
  <h1>Converter</h1>
  <div>Rate:<%=rate%></div>
  <div>Usd:<%=usd%></div>
  <div>Vnd:<%=vnd%></div>
</body>
</html>
