<%-- 
    Document   : login
    Created on : Jan 30, 2026, 10:37:11 AM
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
        <h1>LOGIN</h1>
        <form action="LoginController" method="post" onsubmit="return validateForm()">
            <p><input type="text" id="email" name="email" placeholder="Email">
                <small id="emailError" style="color: #e74c3c" ></small>
            </p>        
            <p><input type="password" id="password" name="password" placeholder="Password">
                <small id="passwordError" style="color: #e74c3c" ></small>
            </p>
            <p><input type="submit" value="Login"></p>
        </form>
        <script>
            function validateForm() {
                valid = true;
                let email = document.getElementById("email").value.trim();
                let password = document.getElementById("password").value.trim();

                let emailError = document.getElementById("emailError");
                emailError.innerText = "";
                let passwordError = document.getElementById("passwordError");
                passwordError.innerText = "";

                let emailPattern = /^[a-zA-Z0-9._%+-]+@gmail\.com$/;

                if (email === "") {
                    emailError.innerText = "Vui long nhap email";
                    valid = false;
                } else if (!emailPattern.test(email)) {
                    emailError.innerText = "Vui long nhap dung dinh dang co duoi: @gmail.com";
                    valid = false;
                }

                if (password === "") {
                    passwordError.innerText = "Vui long nhap password";
                    valid = false;
                }
                return valid;
            }
        </script>
    </body>
</html>
