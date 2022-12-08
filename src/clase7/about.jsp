<%-- 
    Document   : about
    Created on : 01-dic-2020, 14:32:33
    Author     : marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.html" %>
        <h1>about</h1>
        <%-- comentario servidor --%>
        <!-- comentario html-->
        <h1>Hello World! clase 7</h1>
        <%-- Expresiones --%>
        <p>
            <%= "suma de 5 + 5: " %>
        </p>
        <%-- Sentencias --%>
        <%
        int a = 7;
        int b = 15;
        int suma = a + b;
        if(a > 6){
            suma = suma * (-1);
        }
        %>
        <p>
            <%= suma %>
        </p>
        <%-- Declaraciones --%>
        <%! 
        int a = 10;
        int b =50;
        String saludo = "Hola";
        %>
        <p>
            <% 
            out.print("asdasd");
            %>
        </p>
        <%@include file="footer.html" %>
    </body>
</html>
