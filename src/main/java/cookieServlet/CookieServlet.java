/*6b. Build a servlet program to create a cookie to get your name through text box and press submit button
( through HTML) to display the message by greeting Welcome back your name ! , you have visited this page n times 
( n = number of your visit ) and demonstrate the expiry of cookie also.*/

package cookieServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieServlet")
public class CookieServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int visitCount = 1;

        Cookie[] cookies = request.getCookies();

        Cookie nameCookie = null;
        Cookie visitCookie = null;

        // Check existing cookies
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) {
                    nameCookie = c;
                }
                if (c.getName().equals("visitCount")) {
                    visitCookie = c;
                }
            }
        }

        // If first time visit
        if (nameCookie == null) {
            nameCookie = new Cookie("username", name);

            visitCookie = new Cookie("visitCount", "1");
        } else {
            nameCookie.setValue(name);

            visitCount = Integer.parseInt(visitCookie.getValue()) + 1;
            visitCookie.setValue(String.valueOf(visitCount));
        }

        // Set expiry (cookie expires in 60 seconds)
        nameCookie.setMaxAge(60);
        visitCookie.setMaxAge(60);

        response.addCookie(nameCookie);
        response.addCookie(visitCookie);

        // Output message
        out.println("<html><body>");

        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times</h3>");

        out.println("<p><b>Cookie Expiry:</b> 60 seconds</p>");
        out.println("<p>After 60 seconds refresh → cookie resets</p>");

        out.println("<br><a href='index.html'>Go Back</a>");

        out.println("</body></html>");
    }
}