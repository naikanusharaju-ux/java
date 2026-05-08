/*9.c Build a Session Management using JSP program for getting  session expiry time and your name through text 
box and press submit to display the message by greeting Hello your name!.press the following link to check it within 
 the set session time  or wait there for the minutes set  to see the session expiry.*/
    
<%@ page session="true" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

<%
    String name = request.getParameter("username");
    int time = Integer.parseInt(request.getParameter("time"));

    // Create session
    session.setAttribute("user", name);

    // Convert minutes to seconds
    session.setMaxInactiveInterval(time * 60);
%>

<h2>Hello <%= name %>!</h2>

<p>Your session expiry time is <b><%= time %> minute(s)</b></p>

<br>

<a href="check.jsp">Click here to check session</a>

</body>
</html>