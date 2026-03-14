<%-- 
    Document   : CourseList
    Created on : Feb 14, 2026, 10:27:10 PM
    Author     : Windows
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Course List</h2>

        <c:forEach var="course" items="${COURSE_LIST}">

            <div style="border:1px solid gray; width:300px; margin:10px; padding:10px">

                <img src="${course.thumbnailURL}" width="250"/>

                <h3>${course.title}</h3>

                <p>${course.description}</p>

                <p>Price: ${course.price}</p>

                
                <a href="${pageContext.request.contextPath}/CourseDetailsController?id=${course.courseID}">
                    View Details
                </a>
            </div>



        </c:forEach>



    </body>
</html>
