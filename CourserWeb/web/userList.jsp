<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <title>User List</title>
    </head>

    <body>

        <h2>User List</h2>

        <a href="addUser.jsp">Add User</a>

        <br><br>

        <table border="1">

            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Role</th>
                <th>Status</th>
                <th>Action</th>
            </tr>

            <c:forEach var="user" items="${USER_LIST}">

                <tr>

                    <td>${user.userId}</td>

                    <td>${user.firstName}</td>

                    <td>${user.lastName}</td>

                    <td>${user.email}</td>

                    <td>${user.phoneNumber}</td>

                    <td>${user.roleID}</td>

                    <td>${user.active}</td>

                    <td>

                        <a href="EditUserController?id=${user.userId}">Edit</a>

                        |

                        <a href="DeleteUserController?id=${user.userId}"
                           onclick="return confirm('Delete this user?');">
                            Delete
                        </a>

                    </td>

                </tr>

            </c:forEach>

        </table>

    </body>
</html>