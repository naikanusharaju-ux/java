<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>

<style>
body {
    font-family: Arial;
    background: #f7f7f7;
}

.container {
    width: 500px;
    margin: 50px auto;
    background: white;
    padding: 30px;
    border-radius: 10px;
    box-shadow: 0px 0px 10px gray;
}

h2 {
    text-align: center;
}

input {
    width: 100%;
    padding: 10px;
    margin: 10px 0;
}

button {
    width: 100%;
    padding: 12px;
    background: green;
    color: white;
    border: none;
    font-size: 16px;
}

button:hover {
    background: darkgreen;
}
</style>

</head>
<body>

<div class="container">

    <h2>Add Product</h2>
<form action="addProduct" method="post">

ID: <input type="text" name="id"><br>
Name: <input type="text" name="name"><br>
Category: <input type="text" name="category"><br>
Price: <input type="text" name="price"><br>
Quantity: <input type="text" name="quantity"><br>

<input type="submit" value="Add">

</form>
</div>

</body>
</html>