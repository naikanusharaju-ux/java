package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.dao.ProductDAO;

@WebServlet("/deleteProduct")
public class DeleteProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private ProductDAO productDAO;

    public void init() {
        productDAO = new ProductDAO();
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));

            boolean status = productDAO.deleteProduct(id);

            if (status) {
                response.sendRedirect("index.jsp?msg=Product Deleted Successfully");
            } else {
                response.sendRedirect("productdelete.jsp?msg=Delete Failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("productdelete.jsp?msg=Error Occurred");
        }
    }
}