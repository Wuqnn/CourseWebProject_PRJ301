<%-- 
    Document   : Registration
    Created on : Jan 17, 2026, 9:43:26 AM
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
        <h1>Register Account</h1>
        <form action="Register" method="post">
            <p><input type="text" name="txtname" required="" placeholder="Username"></p>
            <p><input type="text" name="txtemail" required="" placeholder="Email"></p>
            <p><input type="password" name="txtpassword" required="" placeholder="Password"></p>
            
            <p><input type="submit" name="button" value="Registration"></p>
        </form>
    </body>
</html>
