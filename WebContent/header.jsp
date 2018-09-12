<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>head</title>
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
                <a class="nav-link" href="accountDetails.jsp">Accounts <span class="sr-only">(current)</span></a>
            </li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <li class="nav-item">
                <a class="nav-link" href="fundTransfer.jsp">Fund Transfer</a>
            </li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <li class="nav-item">
                <a class="nav-link" href="editCustomer.jsp">Edit Profile</a>
            </li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <li class="nav-item">
                <a class="nav-link" href="#">Change Password</a>
            </li>
        </ul>
    </div>
    <div class="d-flex flex-row-reverse">
        <div class="p-2"><button class="btn btn-danger btn-sm">Logout</button> </div>
        <div class="p-2"><h6 class="p-0 m-0"> Welcome ${sessionScope.customer.customerName}</h6></div>&nbsp;
    </div>
</nav>
</body>
</html>