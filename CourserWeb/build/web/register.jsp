<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Đăng Ký Tài Khoản</title>
        <link rel="stylesheet" href="<%= request.getContextPath()%>/mystyle.css">
    </head>

    <body>
        <div class="register-page-wrapper">
            <div class="register-card">
                <div class="register-header">
                    <div class="brand-logo-placeholder">LOGO</div>
                    <h1>Register</h1>
                </div>

                <%
                    String error = (String) request.getAttribute("ERROR");
                    if (error != null) {
                %>
                <div class="error-message">
                    <%= error%>
                </div>
                <%
                    }
                %>

                <form action="regist" method="post" id="registerForm" onsubmit="return validateFrom()">

                    <div class="form-group">
                        <label for="email" class="form-label">Email</label>
                        <input type="text" id="email" name="email" class="form-input">
                        <small id="emailError" style="color: #e74c3c"></small>
                    </div>


                    <div class="form-group">
                        <label for="password" class="form-label">Password</label>
                        <input type="password" id="password" name="password" class="form-input" pattern="^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{1,6}$">
                        <small id="passwordError" style="color: #e74c3c"></small>
                    </div>


                    <div class="form-group">
                        <label for="name" class="form-label">Full Name</label>
                        <input type="text" id="name" name="name" class="form-input" pattern="^[A-Za-z]+$">
                        <small id="nameError" style="color: #e74c3c"></small>
                    </div>


                    <div class="form-group">
                        <select name="role" id="role">
                            <option value="3" selected>Student</option>
                            <option value="2">Instructor</option>
                        </select>
                    </div>


                    <div class="form-group">
                        <label for="phone" class="form-label">Phone</label>
                        <input type="phone" id="phone" name="phone" class="form-input">
                        <small id="phoneError" style="color: #e74c3c"></small>
                    </div>

                    <button type="submit" class="btn-primary">Đăng Ký</button>
                </form>
                <script>
                    function validateFrom() {
                        let valid = true;
                        
                        let email = document.getElementById("email").value.trim();
                        let password = document.getElementById("password").value.trim();
                        let name = document.getElementById("name").value.trim();
                        let phone = document.getElementById("phone").value.trim();

                        let emailError = document.getElementById("emailError");
                        emailError.innerText = "";
                        let passwordError = document.getElementById("passwordError");
                        passwordError.innerText = "";
                        let nameError = document.getElementById("nameError");
                        nameError.innerText = "";
                        let phoneError = document.getElementById("phoneError");
                        phoneError.innerText = "";
                        
                        let emailPattern = /^[a-zA-Z0-9._%+-]+@gmail\.com$/;
                        let passwordPattern = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{1,6}$/;
                        let namePattern = /^[A-Za-zÀ-ỹ\s]+$/;
                        let phonePattern = /^\d{10}$/;

                        //mail
                        if (email === "") {
                            emailError.innerText = "Vui long khong duoc de trong";
                            valid = false;
                        }else if (!emailPattern.test(email)) {
                            emailError.innerText = "Vui long nhap mail phai co dinh dang: ..@gmail.com"
                            valid = false;
                        }

                        //pass
                        if (password === "") {
                            passwordError.innerText = "Vui long khong duoc de trong";
                            valid = false;

                        }else if (!passwordPattern.test(password)) {
                            passwordError.innerText = "Password vui long co ca chu va so";
                            valid = false;
                        }

                        //name
                        if (name === "") {
                            nameError.innerText = "Vui long nhap ho va ten";
                            valid = false;

                        }else if (!namePattern.test(name)) {
                            nameError.innerText = "Vui long chi duoc nhap chu";
                            valid = false;
                        }
                        
                        //phone
                        if (phone === "") {
                            phoneError.innerText = "Vui long nhap so dien thoai";
                            valid = false;

                        }else if (!phonePattern.test(phone)) {
                            phoneError.innerText = "Vui long nhap so dien thoai 10 so (khong nhap chu)";
                            valid = false;

                        }
                        return valid;
                    }


                </script>

                <div class="register-footer">
                    Đã có tài khoản? <a href="login.jsp" class="login-link">Đăng nhập ngay</a>
                </div>
            </div>
        </div>
    </body>
</html>