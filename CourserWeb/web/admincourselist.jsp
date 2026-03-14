<%-- 
    Document   : admincourselist
    Created on : Mar 14, 2026, 3:25:45 PM
    Author     : Windows
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">

            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Price</th>
                <th>Status</th>
                <th>Action</th>
            </tr>

            <c:forEach var="c" items="${COURSE_LIST}">

                <tr>

                    <td>${c.courseID}</td>
                    <td>${c.title}</td>
                    <td>${c.price}</td>
                    <td>${c.status}</td>

                    <td>

                        <a href="EditCourseController?id=${c.courseID}">Edit</a>

                        <a href="DeleteCourseController?id=${c.courseID}">Delete</a>

                    </td>

                </tr>

            </c:forEach>

        </table>

        <a href="addcourse.jsp">Add Course</a>
    </body>
</html>
