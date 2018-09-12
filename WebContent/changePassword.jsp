<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<body>

<%@ include file="header.jsp" %>

<div class="card m-5">
    <div class="card-header">
        Change Password
    </div>
    <div class="m-3">
    <form action="changePassword" method="post"></form>
        <form class="row m-2">
            <div class="col-md-4 form-group">
                <label for="exampleInputEmail1">Old Password</label>
                <input type="text" name="oldPassword" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Account ID">
            </div>
            <div class="col-md-4 form-group">
                <label for="exampleInputEmail1">New Password</label>
                <input type="text" name="newPassword" class="form-control" id="exampleInputEmail81" aria-describedby="emailHelp" placeholder="Name">
            </div>
            <div class="col-md-4 form-group">
                <label for="exampleInputEmail1">Confirm Password</label>
                <input type="text" name="confirmPassword" class="form-control" id="exampleInputsEmai8l1" aria-describedby="emailHelp" placeholder="Date of Birth">
            </div>
            <div class="col-md-4 form-group">
                <!--<label for="exampleInputEmail1">Email</label>-->
                <!--<input type="email" class="form-control" id="examxpleInputEmai8l1" aria-describedby="emailHelp" placeholder="Email">-->
            </div>
            <div class="col-md-4 form-group">
                <!--<label for="exampleInputEmail1">Address</label>-->
                <!--<input type="text" class="form-control" id="exampleInputEmai8l1" aria-describedby="emailHelp" placeholder="Address">-->
                <!--<br>-->
                <button class="btn btn-primary btn-block">Change Password</button>
                * - Mandatory fields
            </div>
        </form>
    </div>
</div>


</body>
</html>