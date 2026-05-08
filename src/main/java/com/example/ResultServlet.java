/*10.b Build an Application to get Rollno, Studentname, Sub1, Sub2, Sub3, Sub4 and Sub5  through JSP called index.
jsp with client sided validation and submit to the servlet called ResultServlet and process all the fields with
server sided validation and display all the data along with result ( Pass if all subjects greater than 40%) and 
Average marks through result.jsp with a link to move to the client side*/

package com.example;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class ResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int roll = Integer.parseInt(request.getParameter("rollno"));
        String name = request.getParameter("name");

        int s1 = Integer.parseInt(request.getParameter("sub1"));
        int s2 = Integer.parseInt(request.getParameter("sub2"));
        int s3 = Integer.parseInt(request.getParameter("sub3"));
        int s4 = Integer.parseInt(request.getParameter("sub4"));
        int s5 = Integer.parseInt(request.getParameter("sub5"));

        String error = null;

        // SERVER-SIDE VALIDATION
        if (name == null || name.trim().isEmpty()) {
            error = "Name is required";
        }

        if (s1 < 0 || s2 < 0 || s3 < 0 || s4 < 0 || s5 < 0) {
            error = "Marks cannot be negative";
        }

        if (error != null) {
            request.setAttribute("error", error);
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        } else {

            // CALCULATION
            int total = s1 + s2 + s3 + s4 + s5;
            float avg = total / 5.0f;

            String result;

            if (s1 >= 40 && s2 >= 40 && s3 >= 40 && s4 >= 40 && s5 >= 40) {
                result = "PASS";
            } else {
                result = "FAIL";
            }

            // PASS DATA TO JSP
            request.setAttribute("roll", roll);
            request.setAttribute("name", name);
            request.setAttribute("s1", s1);
            request.setAttribute("s2", s2);
            request.setAttribute("s3", s3);
            request.setAttribute("s4", s4);
            request.setAttribute("s5", s5);
            request.setAttribute("avg", avg);
            request.setAttribute("result", result);

            RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
            rd.forward(request, response);
        }
    }
}