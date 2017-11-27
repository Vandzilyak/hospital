<%@ page contentType = "text/html; charset = UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add User</title>
</head>

<body>
<h3>Add USER</h3>


<form:form method="post" action="addUser" modelAttribute="user" commandName="user" >
    <div class="table-responsive">
        <table class="table table-bordered" style="width: auto">
            <tr>
                <td>Name :</td>
                <td><form:input type="text" path="name" placeholder="name"/></td>
            </tr>
            <tr>
                <td>Surname :</td>
                <td><form:input type="text" path="surname" placeholder="surname"/></td>
            </tr>
            <tr>
                <td>Email :</td>
                <td><form:input type="text" path="email" placeholder="email"/></td>
            </tr>
            <tr>
                <td>Password :</td>
                <td><form:input type="text" path="password" placeholder="password"/></td>
            </tr>
            <tr>
                <td>Age :</td>
                <td><form:input type="text" path="age" placeholder="age"/></td>
            </tr>
            <tr>
                <td>City :</td>
                <td><form:input type="text" path="city" placeholder="city"/></td>
            </tr>
            <tr>
                <td><input class="btn btn-primary btn-sm" type="submit" value="Submit"/></td>
            </tr>
        </table>
    </div>
</form:form>



</body>
</html>