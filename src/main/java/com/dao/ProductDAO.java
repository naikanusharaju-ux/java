package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductDAO {

    private String jdbcURL = "jdbc:mysql://localhost:3306/productdb";
    private String jdbcUsername = "root";
    private String jdbcPassword = "root";

    // SQL Queries
    private static final String INSERT_PRODUCT_SQL =
            "INSERT INTO Products (ProductID, ProductName, Category, Price, Quantity) VALUES (?, ?, ?, ?, ?)";

    private static final String DELETE_PRODUCT_SQL =
            "DELETE FROM Products WHERE ProductID = ?";

    // DB Connection
    protected Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    jdbcURL,
                    jdbcUsername,
                    jdbcPassword
            );

        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }

    // ================= INSERT =================
    public boolean insertProduct(Product product) {

        try (
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(INSERT_PRODUCT_SQL)
        ) {

            ps.setInt(1, product.getId());
            ps.setString(2, product.getName());
            ps.setString(3, product.getCategory());
            ps.setDouble(4, product.getPrice());
            ps.setInt(5, product.getQuantity());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    // ================= DELETE =================
    public boolean deleteProduct(int id) {

        try (
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(DELETE_PRODUCT_SQL)
        ) {

            ps.setInt(1, id);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    // ================= UPDATE =================
    public boolean updateProduct(Product product) {

        String sql = "UPDATE Products SET ProductName=?, Category=?, Price=?, Quantity=? WHERE ProductID=?";

        try (
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)
        ) {

            ps.setString(1, product.getName());
            ps.setString(2, product.getCategory());
            ps.setDouble(3, product.getPrice());
            ps.setInt(4, product.getQuantity());
            ps.setInt(5, product.getId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    // ================= SELECT ALL =================
    public List<Product> selectAllProducts() {

        List<Product> list = new ArrayList<>();

        String sql = "SELECT * FROM Products";

        try (
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {

            while (rs.next()) {

                Product p = new Product();

                p.setId(rs.getInt("ProductID"));
                p.setName(rs.getString("ProductName"));
                p.setCategory(rs.getString("Category"));
                p.setPrice(rs.getDouble("Price"));
                p.setQuantity(rs.getInt("Quantity"));

                list.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // ================= REPORT (PRICE FILTER) =================
    public List<Product> getProductsByPrice(double price) {

        List<Product> list = new ArrayList<>();

        String sql = "SELECT * FROM Products WHERE Price > ?";

        try (
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setDouble(1, price);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Product p = new Product();

                p.setId(rs.getInt("ProductID"));
                p.setName(rs.getString("ProductName"));
                p.setCategory(rs.getString("Category"));
                p.setPrice(rs.getDouble("Price"));
                p.setQuantity(rs.getInt("Quantity"));

                list.add(p);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}