/*8a. Build a servlet program to  create a cookie to get your name through text box and press submit button
 ( through HTML)  to display the message by greeting Welcome back your name ! , you have visited this page n times
 ( n = number of your visit )  along with the list of cookies and demonstrate the expiry of cookie also. */

package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

public class MyCookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int count = 1;

        Cookie[] cookies = request.getCookies();

        Cookie nameCookie = null;
        Cookie countCookie = null;

        if (cookies != null) {
            for (Cookie c : cookies) {

                if (c.getName().equals("username")) {
                    nameCookie = c;
                }

                if (c.getName().equals("visits")) {
                    countCookie = c;
                }
            }
        }

        if (countCookie != null) {
            count = Integer.parseInt(countCookie.getValue()) + 1;
        }

        // Create cookies
        Cookie c1 = new Cookie("username", name);
        Cookie c2 = new Cookie("visits", String.valueOf(count));

        // Set expiry (1 minute demo)
        c1.setMaxAge(60);
        c2.setMaxAge(60);

        response.addCookie(c1);
        response.addCookie(c2);

        // Output
        out.println("<h2>Welcome back " + name + "</h2>");
        out.println("<h3>You visited " + count + " times</h3>");

        // Show cookies
        out.println("<h3>Cookie List:</h3>");

        Cookie[] all = request.getCookies();

        if (all != null) {
            for (Cookie c : all) {
                out.println(c.getName() + " = " + c.getValue() + "<br>");
            }
        }

        out.println("<br><b>Cookies expire in 60 seconds</b>");
    }
}