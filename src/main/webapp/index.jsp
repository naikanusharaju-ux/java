<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Cookie Management</title>
</head>
<body>

<h2>Cookie Management System</h2>

<form action="addCookie.jsp" method="post">

    Name: <input type="text" name="name" required><br><br>

    Value (Domain/Data): <input type="text" name="value" required><br><br>

    Max Age (seconds): <input type="number" name="maxage" required><br><br>

    <input type="submit" value="Add Cookie">

</form>

</body>
</html>