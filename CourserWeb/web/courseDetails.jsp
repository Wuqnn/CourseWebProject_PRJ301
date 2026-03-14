<%-- 
    Document   : courseDetails
    Created on : Mar 12, 2026, 10:52:53 AM
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
        <h2>${COURSE.title}</h2>

        <img src="${COURSE.thumbnailURL}" width="250">

        <p><b>Description:</b> ${COURSE.description}</p>

        <p><b>Price:</b> ${COURSE.price}</p>

        
        <a href="CourseListController"> Back to course list </a>
    </body>
</html>
