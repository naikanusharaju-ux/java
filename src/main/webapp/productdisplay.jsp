<%@ page import="java.util.*,com.model.Product" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Products</title>
</head>
<body>

<h2>All Products</h2>

<%
List<Product> list = (List<Product>) request.getAttribute("productList");
%>

<table border="1">

<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Category</th>
    <th>Price</th>
    <th>Quantity</th>
</tr>

<%
if(list != null && !list.isEmpty()) {
    for(Product p : list) {
%>

<tr>
    <td><%= p.getId() %></td>
    <td><%= p.getName() %></td>
    <td><%= p.getCategory() %></td>
    <td><%= p.getPrice() %></td>
    <td><%= p.getQuantity() %></td>
</tr>

<%
    }
} else {
%>

<tr>
    <td colspan="5">No Products Found</td>
</tr>

<%
}
%>

</table>

</body>
</html>