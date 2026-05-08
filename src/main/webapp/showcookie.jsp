<%@ page import="javax.servlet.http.Cookie" %>

<html>
<head>
    <title>Active Cookies</title>
</head>
<body>

<h2>Active Cookie List</h2>

<%
    Cookie[] cookies = request.getCookies();

    boolean found = false;

    if (cookies != null) {
%>

<table border="1">
    <tr>
        <th>Cookie Name</th>
        <th>Cookie Value</th>
    </tr>

<%
        for (Cookie c : cookies) {
            found = true;
%>

    <tr>
        <td><%= c.getName() %></td>
        <td><%= c.getValue() %></td>
    </tr>

<%
        }
%>

</table>

<%
    }

    if (!found) {
%>

<h3>No Active Cookies Found</h3>

<%
    }
%>

<br>

<a href="index.jsp">Back</a>

</body>
</html>