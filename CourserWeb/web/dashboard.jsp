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
<meta charset="UTF-8">

<%
    User u = (User) session.getAttribute("User");
    String name = u.getFirstName();
    String error = (String) request.getAttribute("errorMessage");
    if(error != null){
%>
    <h3 style="color:red;"><%= error %></h3>
<%
    }else{
%>
    <h3>Hello <%= name %></h3>
<%
    }
%>
</body>
</html>
