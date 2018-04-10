<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<c:forEach var="patient" items="${test}">
    <tr>
        <td>${patient.name}</td>
    </tr>
</c:forEach>
</body>
</html>
