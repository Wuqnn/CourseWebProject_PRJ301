<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header class="site-header">
  <div class="header-inner">
    <a class="brand" href="<%= request.getContextPath() %>/">FUH University</a>
    <nav class="site-nav" aria-label="Main navigation">
    <%-- Bất cứ thứ gì  trong dấu <%= %> sẽ được Java tính toán, sau đó chuyển thành chuỗi (String) và in trực tiếp vào vị trí đó trong file HTML khi trả về trình duyệt. --%>
    <%-- request.getContextPath(): lấy rood adrress của project, vd: /Demo_St1 --%>
      <ul>
        <li><a href="<%= request.getContextPath() %>/GetCoursesController">Course List</a></li>
        <li><a href="<%= request.getContextPath() %>/landing.jsp">Home</a></li>
        <li><a href="<%= request.getContextPath() %>/register.jsp">Register</a></li>
        <li><a href="<%= request.getContextPath() %>/login.jsp">Login</a></li>
      </ul>
    </nav>
  </div>
</header>