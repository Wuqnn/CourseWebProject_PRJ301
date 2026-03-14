<%-- 
    Document   : editUser
    Created on : Mar 14, 2026, 2:08:50 PM
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

        <h2>Edit User</h2>

        <form action="UpdateUserController" method="post">

            <input type="hidden" name="id" value="${USER.userId}">

            Email:
            <input type="text" name="email" value="${USER.email}">
            <br><br>

            First Name:
            <input type="text" name="firstName" value="${USER.firstName}">
            <br><br>

            Last Name:
            <input type="text" name="lastName" value="${USER.lastName}">
            <br><br>

            Phone:
            <input type="text" name="phoneNumber" value="${USER.phoneNumber}">
            <br><br>

            Role:
            <input type="number" name="roleID" value="${USER.roleID}">
            <br><br>

            Status:
            <input type="checkbox" name="isActive" ${USER.active ? "checked" : ""}>
            <br><br>

            <input type="submit" value="Update">


        </form>
    </body>
</html>
