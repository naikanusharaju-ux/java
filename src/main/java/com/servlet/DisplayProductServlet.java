package com.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.dao.ProductDAO;
import com.model.Product;

@WebServlet("/displayProducts")
public class DisplayProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private ProductDAO productDAO;

    public void init() {
        productDAO = new ProductDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ProductDAO dao = new ProductDAO();
        List<Product> productList = dao.selectAllProducts();

        System.out.println("Products fetched: " + productList.size()); // DEBUG

        request.setAttribute("productList", productList);
        request.getRequestDispatcher("productdisplay.jsp").forward(request, response);
    }}