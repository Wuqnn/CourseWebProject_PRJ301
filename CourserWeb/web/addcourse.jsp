<%-- 
    Document   : addcourse
    Created on : Mar 14, 2026, 3:40:56 PM
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
        <form action="AddCourseController" method="post">

            Instructor ID: <input type="text" name="instructorID"><br>

            Category ID: <input type="text" name="categoryID"><br>

            Title: <input type="text" name="title"><br>

            Description: <textarea name="description"></textarea><br>

            Price: <input type="text" name="price"><br>

            Thumbnail URL: <input type="text" name="thumbnailURL"><br>

            Status:
            <select name="status">
                <option value="ACTIVE">ACTIVE</option>
                <option value="INACTIVE">INACTIVE</option>
            </select>

            <input type="submit" value="Add Course">

        </form>
    </body>
</html>
