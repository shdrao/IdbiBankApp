<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Customer</title>
 <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>


<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent1" aria-controls="navbarSupportedContent1" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent1">
        <h1>IDBI Bank</h1>
    </div>
    <div class="d-flex flex-row-reverse">
        <div class="p-2"><p>Change Password</p></div>
        <div class="p-2"><p>Session Summary  |</p></div>
    </div>
</nav>


<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <li class="nav-item active">
                <a class="nav-link" href="#">Accounts <span class="sr-only">(current)</span></a>
            </li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <li class="nav-item">
                <a class="nav-link" href="#">Fund Transfer</a>
            </li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <li class="nav-item">
                <a class="nav-link" href="#">Edit Profile</a>
            </li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <li class="nav-item">
                <a class="nav-link" href="#">Change Password</a>
            </li>
        </ul>
    </div>
    <div class="d-flex flex-row-reverse">
        <div class="p-2"><button class="btn btn-danger btn-sm">Logout</button> </div>
        <div class="p-2"><h6 class="p-0 m-0"> Welcome Adam Jeeva Ali</h6></div>&nbsp;
    </div>
</nav>


<div class="card m-5">
    <div class="card-header">
        Transfer Fund
    </div>
    <div class="m-3">
        <form class="row m-2">
            <div class="col-md-4 form-group">
                <label for="exampleInputEmail1">Customer ID</label>
                <input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Account ID">
            </div>
            <div class="col-md-4 form-group">
                <label for="exampleInputEmail1">Name</label>
                <input type="number" class="form-control" id="exampleInputEmail81" aria-describedby="emailHelp" placeholder="Name">
            </div>
            <div class="col-md-4 form-group">
                <label for="exampleInputEmail1">DOB</label>
                <input type="date" class="form-control" id="exampleInputsEmai8l1" aria-describedby="emailHelp" placeholder="Date of Birth">
            </div>
            <div class="col-md-4 form-group">
                <label for="exampleInputEmail1">Email</label>
                <input type="email" class="form-control" id="examxpleInputEmai8l1" aria-describedby="emailHelp" placeholder="Email">
            </div>
            <div class="col-md-4 form-group">
                <label for="exampleInputEmail1">Address</label>
                <input type="text" class="form-control" id="exampleInputEmai8l1" aria-describedby="emailHelp" placeholder="Address">
                <br>
                <button class="btn btn-primary btn-block">Edit Profile</button>
                * - Mandatory fields
            </div>
        </form>
    </div>
</div>





<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>