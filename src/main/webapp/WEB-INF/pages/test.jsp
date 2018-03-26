<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Sergiy Vandzilyak
  Date: 26.03.2018
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>

<c:forEach var="patient" items="${patients}">
    <tr>
        <td>${patient.id}</td>
        <td>${patient.name}</td>Re
        <td>${patient.surname}</td>
        <td>${patient.age}</td>
        <td>${patient.city}</td>
        <td>${patient.diagnosis}</td>

    </tr>
</c:forEach>

</body>
</html>
