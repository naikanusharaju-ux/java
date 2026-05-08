/*7b. Construct a Cookie Management program using JSP to get the fields  Name, Domain and Max Expiry Age 
( in sec) and press the button Add Cookie for displaying the set cookie information. 
Then it has to go to show the active cookie list when you press the link go to the active cookie list */

<%@ page import="javax.servlet.http.Cookie" %>

<html>
<head>
    <title>Add Cookie</title>
</head>
<body>

<%
    String name = request.getParameter("name");
    String value = request.getParameter("value");
    int maxAge = Integer.parseInt(request.getParameter("maxage"));

    // Create cookie
    Cookie cookie = new Cookie(name, value);

    // Set expiry time
    cookie.setMaxAge(maxAge);

    // Add cookie to response
    response.addCookie(cookie);
%>

<h2>Cookie Added Successfully!</h2>

<p><b>Name:</b> <%= name %></p>
<p><b>Value:</b> <%= value %></p>
<p><b>Max Age:</b> <%= maxAge %> seconds</p>

<br>

<a href="showCookie.jsp">Go to Active Cookie List</a>

</body>
</html>