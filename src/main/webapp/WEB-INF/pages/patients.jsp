<%@ page contentType="text/html; charset = UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Patients</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>

<body>
<h2>${message}</h2>
<table class="table table-striped">

    <h2>Welcome ${logInUser.email} </a></h2>
    <thead>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>SURNAME</th>
            <th>AGE</th>
            <th>CITY</th>
            <th>DIAGNOSIS</th>
        </tr>
    </thead>

    <c:forEach var="patient" items="${patientList}">
        <tr>
            <td>${patient.id}</td>
            <td>${patient.name}</td>
            <td>${patient.surname}</td>
            <td>${patient.age}</td>
            <td>${patient.city}</td>
            <td>${patient.diagnosis}</td>
            <td>
                <spring:url value="/updatePatient/${patient.id}" var="updatePatient"/>
                <spring:url value="/deletePatient/${patient.id}" var="deletePatient"/>
                <button class="btn btn-info" onclick="location.href='${updatePatient}'">Edit</button>
                <button class="btn btn-info" onclick="location.href='${deletePatient}'">Delete</button>
            </td>
        </tr>
    </c:forEach>

</table>

<spring:url value="/addPatient" var="patientUrl"/>
<button class="btn btn-info" onclick="location.href='${patientUrl}'">Add Patient</button>

</body>
</html>