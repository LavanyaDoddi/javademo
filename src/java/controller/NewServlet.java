package controller;

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


public class NewServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String Name = request.getParameter("fname");
        String StateIssuedDivorceid = request.getParameter("sid");

        try {
            Connection con;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "root");
            System.out.println("connected");

            String sql = "insert into registration1(name,sid) VALUES(?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Name);
            ps.setString(2, StateIssuedDivorceid);

            ps.executeUpdate();
            RequestDispatcher rs = request.getRequestDispatcher("page2.jsp");
            rs.forward(request, response);

        } catch (Exception e) {
            System.out.println("Error ::" + e.getMessage());
        }
    }
}