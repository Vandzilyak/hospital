<%@ page contentType="text/html; charset = UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Users</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>

<body>
<h2>${message}</h2>
<table class="table table-striped">

    <thead>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>SURNAME</th>
            <th>EMAIL</th>
            <th>PASSWORD</th>
            <th>AGE</th>
            <th>CITY</th>
        </tr>
    </thead>

    <c:forEach var="user" items="${userList}">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.surname}</td>
            <td>${user.email}</td>
            <td>${user.password}</td>
            <td>${user.age}</td>
            <td>${user.city}</td>
            <td>
                <spring:url value="/updateUser/${user.id}" var="updateUser"/>
                <spring:url value="/deleteUser/${user.id}" var="deleteUser"/>
                <button class="btn btn-info" onclick="location.href='${updateUser}'">Edit</button>
                <button class="btn btn-info" onclick="location.href='${deleteUser}'">Delete</button>
            </td>
        </tr>
    </c:forEach>

</table>

<spring:url value="/addUser" var="userUrl"/>
<button class="btn btn-info" onclick="location.href='${userUrl}'">Add User</button>

</body>
</html>