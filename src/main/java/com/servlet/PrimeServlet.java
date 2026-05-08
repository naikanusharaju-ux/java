/*6c. Build a servlet program to check the given number is prime number or not using HTML with step by step procedure.*/

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));

            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<html><body>");
            out.println("<h2>Prime Number Result</h2>");

            if (isPrime) {
                out.println("<h3 style='color:green;'>" + number + " is a Prime Number</h3>");
            } else {
                out.println("<h3 style='color:red;'>" + number + " is NOT a Prime Number</h3>");
            }

            out.println("<br><a href='index.html'>Check Another Number</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            out.println("<h3 style='color:red;'>Invalid Input!</h3>");
        }
    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.sendRedirect("index.html");
    }
}