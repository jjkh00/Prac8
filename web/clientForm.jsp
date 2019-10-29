<%-- 
    Document   : clientForm
    Created on : 29 Oct, 2019, 3:32:47 PM
    Author     : JJ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Practical 8 Ex 2.1 with client form</h1>
        <form action="http://localhost:8080/HelloWS/webresources/webservice/sayHello" method="get">
            Username: <input type="text" name="username">
            <input type="submit">
        </form>
    </body>
</html>
