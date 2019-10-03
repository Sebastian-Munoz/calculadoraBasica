<%-- 
    Document   : calcjsp
    Created on : 28/09/2019, 02:24:43 PM
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="calcServlet" method="POST">
            <input type="text" name="t1">
            <select name="opera" size="1">
                <option>+</option>
                <option>-</option>
                <option>/</option>
                <option>*</option>
            </select>
            <input type="text" name="t2">
            <input type="submit" name="ADD">
        </form>
    </body>
</html>
