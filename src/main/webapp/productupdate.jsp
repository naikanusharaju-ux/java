<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>
</head>
<body>

<h2>Update Product</h2>

<form action="updateProduct" method="post">

    Product ID:
    <input type="number" name="id" required><br><br>

    Product Name:
    <input type="text" name="name" required><br><br>

    Category:
    <input type="text" name="category" required><br><br>

    Price:
    <input type="number" step="0.01" name="price" required><br><br>

    Quantity:
    <input type="number" name="quantity" required><br><br>

    <button type="submit">Update Product</button>

</form>

</body>
</html>