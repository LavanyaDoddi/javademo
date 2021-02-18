package controller;

import Utils.Database;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NewServlet2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String Martialstatus = request.getParameter("status");
        String Education = request.getParameter("education");

        System.out.println(Martialstatus);
        try {
            System.out.println("Entered into system");

            Connection con = Database.DBConnect();
            String sql = "insert into page3(martial_status,education) VALUES(?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Martialstatus);
            ps.setString(2, Education);

            ps.executeUpdate();
            System.out.println("connected");
            RequestDispatcher rs = request.getRequestDispatcher("successMessage.jsp");
            rs.forward(request, response);
        } catch (Exception e) {
            System.out.println("Error ::" + e.getMessage());
        }
    }
}