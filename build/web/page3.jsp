<%-- 
   Document   : page3
   Created on : Feb 17, 2021, 9:36:26 PM
   Author     : Doddi
   --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
   </head>
   <body>
      <div align="center">
         <form action="NewServlet2" method="post">
            <label>Martial Status</label></br>
            Married:<input type="radio" name="status" value="male" >
           Unmarried:<input type="radio" name="status" value="female" ><br>
            
            <label> Highest Education</label><br>
            <input type="text" placeholder="Enter education" name="education"><br>
            
            <button type="submit">Submit</button>
         </form>
      </div>
   </body>
</html>