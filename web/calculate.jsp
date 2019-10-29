<%-- 
    Document   : calculate
    Created on : 29 Oct, 2019, 3:42:49 PM
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
        <h1>Practical 8 Ex 2.1 calculator</h1>
        <form action="http://localhost:8080/HelloWS/webresources/calculatews/Calculate" method="get">
            Num 1: <input type="text" name="num1">
            Num 2: <input type="test" name="num2">
            Operator: <select name="operator">
                <option value="add">add</option>
                <option value="subtract">subtract</option>
                <option value="multiply">multply</option>
                <option value="divide">divide</option>
            </select>
            <input type="submit">
        </form>
    </body>
</html>
