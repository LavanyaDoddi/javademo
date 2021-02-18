/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Utils.Database;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.jar.Attributes.Name;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.DatePicker;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NewServlet1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        /* TODO output your page here. You may use following sample code. */
        String dob = request.getParameter("dob");
        String nationality = request.getParameter("nationality");

        java.util.Date myDate = new java.util.Date(dob);

        java.sql.Date sqlDate = new java.sql.Date(myDate.getDate());

        try {


            Connection con = Database.DBConnect();
            
            String sql = "insert into page2(dob,nationality) VALUES(?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, sqlDate);
            ps.setString(2, nationality);

            ps.executeUpdate();
            RequestDispatcher rs = request.getRequestDispatcher("page3.jsp");
            rs.forward(request, response);


        } catch (SQLException ex) {
            Logger.getLogger(DatePicker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}