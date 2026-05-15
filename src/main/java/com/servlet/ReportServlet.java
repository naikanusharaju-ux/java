package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.dao.ProductDAO;
import com.model.Product;

@WebServlet("/report")
public class ReportServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private ProductDAO productDAO;

    public void init() {
        productDAO = new ProductDAO();
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        try {

            // Get minimum price from reports.jsp
            double price = Double.parseDouble(
                    request.getParameter("price"));

            // Fetch products greater than entered price
            List<Product> reportList =
                    productDAO.getProductsByPrice(price);

            // Send data to JSP page
            request.setAttribute("reportList", reportList);

            request.getRequestDispatcher("report_result.jsp")
                   .forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("reports.jsp?msg=Error Generating Report");
        }
    }
}