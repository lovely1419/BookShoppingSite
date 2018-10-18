<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.cart.connection.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>

<!-- add , display(add,update) -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 

"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
<!-- BOOTSTRAP -->
		<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="bootstrap/js/bootstrap.bundle.min.js"></script>  
        <script src="bootstrap/jquery/jquery-3.2.1.min.js"></script>  
        <script src="bootstrap/jquery/popper.min.js"></script>  
        <script src="bootstrap/jquery/bootstrap.min.js"></script>  
        <!-- BOOTSTRAP -->

</head>
<body>

<div class="container" style="padding-top:70px;">

<div class="card" style="width: 40rem;">
  <div class="card-body">
    <h5 class="card-title display-4">Add Product</h5>

	<form action="AddProduct" method="post" enctype="multipart/form-data">

	<div class="input-group mb-3">
	  	  <div class="input-group-prepend">
    			<label class="input-group-text" 

for="inputGroupSelect01">Category</label>
		  </div>
	  	  <select class="custom-select" id="inputGroupSelect01" name="categoryId">
	  	  			<option value="101">Fiction</option>
					<option value="102">computing </option>
					<option value="103">Literature </option>
		</select>
	</div>

  	<div class="form-group">
    	<label for="name">Product Name</label>
    	<input type="text" class="form-control" name="name" placeholder="Enter product name">
  	</div>
  	
  	<div class="input-group mb-3">
  		<div class="input-group-prepend">
    		<span class="input-group-text" name="image">Image</span>
  		</div>
  		
  		<div class="custom-file">
    		<input type="file" class="custom-file-input" name="image" aria-

describedby="inputGroupFileAddon01">
    		<label class="custom-file-label" for="inputGroupFile01">Choose Product 

Image</label>
		</div>
	</div>  	
  	
  	<div class="form-group">
 	   <label for="productPrice">Product Price</label>
 	   <input type="text" class="form-control" name="price" placeholder="Enter Product Price">
  	</div>
  	
  	<div class="form-group">
  		<label for="comment">Product Description</label>
  		<textarea class="form-control" name="description" rows="2" 

id="comment"></textarea>
	</div>
  	
	<button type="submit" class="btn btn-primary">Add</button>
	</form>

  </div>
</div>
</div>

</body>
</html>