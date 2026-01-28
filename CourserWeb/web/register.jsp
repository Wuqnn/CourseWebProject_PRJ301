<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đăng Ký Tài Khoản</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/mystyle.css">
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
            <%= error %>
        </div>
        <%
            }
        %>

        <form action="regist" method="post" id="registerForm">
            <div class="form-group">
                <label for="email" class="form-label">Email</label>
                <input type="text" id="email" name="email" class="form-input" pattern="^[a-zA-Z0-9._%+-]+@gmail\.com$">
            </div>
            
            <div class="form-group">
                <label for="password" class="form-label">Password</label>
                <input type="password" id="password" name="password" class="form-input" pattern="^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{1,6}$">
            </div>
            
             <div class="form-group">
                <label for="name" class="form-label">Full Name</label>
                <input type="text" id="name" name="name" class="form-input" pattern="^[A-Za-z]+$">
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
            </div>

            <button type="submit" class="btn-primary">Đăng Ký</button>
        </form>

        <div class="register-footer">
            Đã có tài khoản? <a href="login.jsp" class="login-link">Đăng nhập ngay</a>
        </div>
    </div>
</div>
</body>
</html>