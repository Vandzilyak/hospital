<%@page contentType="text/html;charset = UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Update User</title>
</head>

<body>
<h2>Update User</h2>
<form:form method="post" action="/updatePatient" modelAttribute="patient">
    <div class="table-responsive">
        <table class="table table-bordered" style="width: auto">
            <tr>
                <td><form:hidden path="id"/></td>
            </tr>
            <tr>
                <td>Name :</td>
                <td><form:input type="text" path="name"/></td>
            </tr>
            <tr>
                <td>Surname :</td>
                <td><form:input type="text" path="surname"/></td>
            </tr>
            <tr>
                <td>Email :</td>
                <td><form:input type="text" path="email"/></td>
            </tr>
            <tr>
                <td>Password :</td>
                <td><form:input type="text" path="password"/></td>
            </tr>
            <tr>
                <td>Age :</td>
                <td><form:input type="text" path="age"/></td>
            </tr>
            <tr>
                <td>City :</td>
                <td><form:input type="text" path="city"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input class="btn btn-primary btn-sm" type="submit" value="Submit"/></td>
            </tr>
        </table>
    </div>
</form:form>
</body>

</html>
