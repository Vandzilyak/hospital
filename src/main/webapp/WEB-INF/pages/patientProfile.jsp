<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Patient profile</title>
</head>
<body>

<div class="container">



    <h1>User Detail</h1>
    <br />

    <div class="row">
        <label class="col-sm-2">ID</label>
        <div class="col-sm-10">${patient.id}</div>
    </div>

    <div class="row">
        <label class="col-sm-2">Name</label>
        <div class="col-sm-10">${patient.name}</div>
    </div>

    <div class="row">
        <label class="col-sm-2">surname</label>
        <div class="col-sm-10">${patient.surname}</div>
    </div>

    <div class="row">
        <label class="col-sm-2">age</label>
        <div class="col-sm-10">${patient.age}</div>
    </div>

    <div class="row">
        <label class="col-sm-2">city</label>
        <div class="col-sm-10">${patient.city}</div>
    </div>

    <div class="row">
        <label class="col-sm-2">diagnosis</label>
        <div class="col-sm-10">${patient.diagnosis}</div>
    </div>



</div>


</body>
</html>
