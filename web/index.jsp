<%-- 
   Document   : index
   Created on : Feb 17, 2021, 12:38:37 PM
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
         <form action="NewServlet" method="post">
            <label>Name</label>
            <input type="text" placeholder="Enter fname" name="fname"><br/>
            <label> State Issued Divorce id</label>
            <input type="text" placeholder="Enter sid" name="sid"><br/>
            <button type="submit">Next</button>
         </form>
      </div>
   </body>
</html>