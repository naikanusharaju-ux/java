<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Management System</title>

<style>
body {
    font-family: Arial;
    background: #f2f2f2;
    text-align: center;
    margin-top: 50px;
}

.container {
    width: 500px;
    margin: auto;
    background: white;
    padding: 30px;
    border-radius: 10px;
    box-shadow: 0px 0px 10px gray;
}

h1 {
    color: #333;
}

a {
    display: block;
    margin: 15px;
    padding: 12px;
    text-decoration: none;
    background: #4CAF50;
    color: white;
    border-radius: 5px;
    font-size: 18px;
}

a:hover {
    background: #45a049;
}
</style>

</head>
<body>

<div class="container">

    <h1>Product Management System</h1>

    <a href="productadd.jsp">Add Product</a>
    <a href="productupdate.jsp">Update Product</a>
    <a href="productdelete.jsp">Delete Product</a>
    <a href="displayProducts">Display Products</a>
    <a href="reports.jsp">Reports</a>

</div>

</body>
</html>