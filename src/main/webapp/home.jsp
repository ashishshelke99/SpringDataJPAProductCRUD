<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ashish's Website</title>
</head>
<body>

	Product CRUD
	
	<br/>
	
	<hr/>
	
	<h3>Add Product</h3>
	
	<form action="addProduct">
		<input type="number" name="productId"><br/>
		<input type="text" name="productName"><br/>
		<input type="number" name="productPrice"><br/>
		<input type="submit" value="Add Product"><br/>
	</form>
	
	<hr/>
	
	<h3>Get Product</h3>
	
	<form action="getProduct">
		<input type="number" name="productId"><br/>
		<input type="submit"><br/>
	</form>
	
	<hr/>
	
	<h3>Get All Products</h3>
	
	<form action="getAllProducts">
		<input type="submit" value="showAll"><br/>
	</form>
	
	<hr/>
	
	
	
	<h3>Update Product</h3>
	
	<form action="updateProduct">
		<input type="number" name="productId"><br/>
		<input type="submit" value="Update"><br/>
	</form>
	
	<hr/>
	
	
	
	<h3>Delete Product</h3>
	
	<form action="deleteProduct">
		<input type="number" name="productId"><br/>
		<input type="submit" value="Delete"><br/>
	</form>
	
	<hr/>
	
	
</body>
</html>