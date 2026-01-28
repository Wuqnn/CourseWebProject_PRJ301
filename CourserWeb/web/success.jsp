<%@page import="dto.User"%>
<%--
  Created by IntelliJ IDEA.
  User: lengan
  Date: 1/25/26
  Time: 5:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User u = (User) session.getAttribute("REGISTER");
    String name = u.getFullName();
%>
<h3>Hello <%= name %></h3>
</body>
</html>
