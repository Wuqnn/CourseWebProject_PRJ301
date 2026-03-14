<%-- 
    Document   : addUser
    Created on : Mar 14, 2026, 2:09:43 PM
    Author     : Windows
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Add User</h2>

        <form action="AddUserController" method="post">

            Email:
            <input type="text" name="email">
            <br>

            Password:
            <input type="text" name="password">
            <br>

            Phone:
            <input type="text" name="phoneNumber">
            <br>

            First Name:
            <input type="text" name="firstName">
            <br>

            Last Name:
            <input type="text" name="lastName">
            <br>

            Role:
            <input type="number" name="roleID">
            <br>

            <input type="submit" value="Add User">

        </form>>
    </body>
</html>
