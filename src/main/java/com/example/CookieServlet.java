/*8b. Build a servlet program to  create a cookie to get your name through text box and press submit 
button( through HTML)  to display the message by greeting Welcome back your name ! , you have visited this page n times
( n = number of your visit )  along with the list of cookies and its setvalues and demonstrate the expiry of cookie also.*/ 

package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int count = 1;

        Cookie[] cookies = request.getCookies();

        Cookie nameCookie = null;
        Cookie countCookie = null;

        // Read existing cookies
        if (cookies != null) {
            for (Cookie c : cookies) {

                if (c.getName().equals("username")) {
                    nameCookie = c;
                }

                if (c.getName().equals("visitCount")) {
                    countCookie = c;
                }
            }
        }

        // Update visit count
        if (countCookie != null) {
            count = Integer.parseInt(countCookie.getValue()) + 1;
        }

        // Create cookies
        Cookie c1 = new Cookie("username", name);
        Cookie c2 = new Cookie("visitCount", String.valueOf(count));

        // Set expiry (1 minute = 60 seconds)
        c1.setMaxAge(60);
        c2.setMaxAge(60);

        response.addCookie(c1);
        response.addCookie(c2);

        // OUTPUT
        out.println("<html><body>");

        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + count + " times.</h3>");

        // Display cookies list
        out.println("<h3>Cookie List (Name : Value):</h3>");

        Cookie[] allCookies = request.getCookies();

        if (allCookies != null) {
            out.println("<table border='1'><tr><th>Name</th><th>Value</th></tr>");

            for (Cookie c : allCookies) {
                out.println("<tr><td>" + c.getName() + "</td><td>" + c.getValue() + "</td></tr>");
            }

            out.println("</table>");
        }

        out.println("<br><b>Note: Cookies expire in 60 seconds.</b>");

        out.println("</body></html>");
    }
}