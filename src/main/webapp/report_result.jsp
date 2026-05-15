<%@ page import="java.util.*,com.model.Product" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Report Result</title>

<style>
body {
    font-family: Arial;
    background: #f5f5f5;
    text-align: center;
    margin-top: 30px;
}

.container {
    width: 80%;
    margin: auto;
    background: white;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0px 0px 10px gray;
}

table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 20px;
}

table, th, td {
    border: 1px solid #ccc;
}

th {
    background: #4CAF50;
    color: white;
    padding: 12px;
}

td {
    padding: 10px;
    text-align: center;
}

a {
    text-decoration: none;
    padding: 10px 20px;
    background: #2196F3;
    color: white;
    border-radius: 5px;
}

a:hover {
    background: #0b7dda;
}
</style>

</head>
<body>

<div class="container">

    <h2>Report Result</h2>

<%
List<Product> reportList =
        (List<Product>) request.getAttribute("reportList");

if (reportList != null && !reportList.isEmpty()) {
%>

    <table>
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Category</th>
            <th>Price</th>
            <th>Quantity</th>
        </tr>

<%
for (Product p : reportList) {
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
%>

    </table>

<%
} else {
%>

    <h3>No Products Found</h3>

<%
}
%>

    <br><br>

    <a href="reports.jsp">Back to Reports</a>

</div>

</body>
</html>