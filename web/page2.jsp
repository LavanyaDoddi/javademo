<%-- 
   Document   : page2
   Created on : Feb 17, 2021, 3:37:16 PM
   Author     : Doddi
   --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <title>jsp</title>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
      <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
      <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
      <script>
         $(function () {
             $("#datepicker").datepicker();
         });
      </script>
   </head>
   <body>
      <form action="NewServlet1" method="post">
        <Pre>
            <div align="center">
                <label for="datepicker">Enter Your Date of Birth:</label>
                <input type="text" name="dob" id="datepicker"><br/>\
            </div>
        </pre>
         
        <div align="center">
            <pre>
                <label> nationality</label>
                <input type="text" placeholder="Enter nationality" name="nationality"><br/>
                <button type="submit">Next</button>
            </pre>
        </div>
      </form>

   </body>
</html>