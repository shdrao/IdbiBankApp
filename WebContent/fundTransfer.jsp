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
            Transfer Fund
        </div>
        <div class="m-3">
       
            <form action="fundtransfer" class="row m-2" method="post">
<!--                 <div class="col-md-4 form-group">
                    <label for="exampleInputEmail1">From Account*</label>
                    <input type="number" name="fromAccount" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Account ID">
                </div> -->
                <div class="col-md-4 form-group">
                    <label for="exampleInputEmail1">Beneficiary Account*</label>
                    <input type="number" name="toAccount" class="form-control" id="exampleInputEmail81" aria-describedby="emailHelp" placeholder="Account ID">
                </div>
                <div class="col-md-4 form-group">
                    <label for="exampleInputEmail1">Amount*</label>
                    <input type="number" name="amount" class="form-control" id="exampleInputsEmai8l1" aria-describedby="emailHelp" placeholder="Amount">
                </div>
                <div class="col-md-4 form-group">
                    <!--<label for="exampleInputEmail1">Email address</label>-->
                    <!--<input type="email" class="form-control" id="exampleInputEmai8l1" aria-describedby="emailHelp" placeholder="Enter email">-->
                </div>
                <div class="col-md-4 form-group">
                    <label for="exampleInputEmail1">Narrator</label>
                    <input type="text" name="narrator" class="form-control" id="exampleInputEmai8l1" aria-describedby="emailHelp" placeholder="Narrator">
                    <br>
                    <button class="btn btn-primary btn-block">Transfer</button>
                    * - Mandatory fields
                </div>
            </form>
        </div>
    </div>

</body>
</html>