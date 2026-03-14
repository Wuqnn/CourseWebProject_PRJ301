<%-- 
    Document   : editcourse
    Created on : Mar 14, 2026, 3:41:23 PM
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
        <form action="UpdateCourseController" method="post">

            <input type="hidden" name="courseID" value="${COURSE.courseID}">

            Instructor ID:
            <input type="text" name="instructorID" value="${COURSE.instructorID}"><br>

            Category ID:
            <input type="text" name="categoryID" value="${COURSE.categoryID}"><br>

            Title:
            <input type="text" name="title" value="${COURSE.title}"><br>

            Description:
            <textarea name="description">${COURSE.description}</textarea><br>

            Price:
            <input type="text" name="price" value="${COURSE.price}"><br>

            Thumbnail URL:
            <input type="text" name="thumbnailURL" value="${COURSE.thumbnailURL}"><br>

            Status:
            <select name="status">

                <option value="ACTIVE"
                        <c:if test="${COURSE.status == 'ACTIVE'}">selected</c:if>>
                            ACTIVE
                        </option>

                        <option value="INACTIVE"
                        <c:if test="${COURSE.status == 'INACTIVE'}">selected</c:if>>
                    INACTIVE
                </option>

            </select>

            <br>

            <input type="submit" value="Update Course">

        </form>
    </body>
</html>
