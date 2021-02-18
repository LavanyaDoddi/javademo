/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Doddi
 */
public class Database {
    
    public static Connection DBConnect() {
        Connection con = null;
        String url = "jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12393813"; //MySQL URL and followed by the database name
        String username = "sql12393813"; //MySQL username
        String password = "cmxf1SsUk7"; //MySQL password   
        try 
        {
            try 
            {
                Class.forName("com.mysql.jdbc.Driver"); //loading mysql driver 
            } 
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            } 
            con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
            System.out.println("Printing connection object "+con);
        }   
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return con; 
    }
}

