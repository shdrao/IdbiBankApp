<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accounts </title>
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


<div class="row m-0">
    <div class="col-md-6 mt-5 ml-1 mr-0 mb-5">
        <div class="card">
            <div class="card-header">
                Customer Details
            </div>
            <div class="m-0">
                <table class="table table-bordered m-0">
                    <thead>
                    <tr>
                        <th scope="col">Customer ID</th>
                        <th scope="col">Name</th>
                        <th scope="col">DOB</th>
                        <th scope="col">Email</th>
                        <th scope="col">Address</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row">12534885</th>
                        <td>Adam John</td>
                        <td>30 May 1859</td>
                        <td style="font-size: 14px">asdlkasdkekgdskdk@gmail.com</td>
                        <td style="font-size: 14px">CKP, Airoli, Mumbai 560034</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div><br>
        <div class="card">
            <div class="card-header">
                Account Details
            </div>
            <div class="m-0">
                <table class="table table-bordered m-0">
                    <thead>
                    <tr>
                        <th scope="col">Account ID</th>
                        <th scope="col">Account Type</th>
                        <th scope="col">Balance</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row">125322224885</th>
                        <td>Savings</td>
                        <td>15886</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <div class="col-md-5 mt-5 ml-0">
        <div class="card">
            <div class="card-header">
                Transaction Details
            </div>
            <div class="m-0">
                <table class="table table-bordered m-0">
                    <thead>
                    <tr>
                        <th scope="col">Description & Date</th>
                        <th scope="col">Credit</th>
                        <th scope="col">Debit</th>
                        <th scope="col">Balance</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td scope="row">Nasjadsakjdkasksakhjkasfkdha sauh dushau 30 May 1256</td>
                        <td>1255</td>
                        <td></td>
                        <td>1254445455598</td>
                    </tr>
                    <tr>
                        <td scope="row">Ndsnjdsvasjkdha sauh dushau</td>
                        <td></td>
                        <td>4554</td>
                        <td>125556565598</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>




<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>