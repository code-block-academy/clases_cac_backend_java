<%-- 
    Document   : home
    Created on : 01-dic-2020, 14:14:00  
    Author     : marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clase6.*" %>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.html" %>
        
        <h1>home</h1>
        <%
         Admin root = new Admin(1, "marco", "avila", "asd", "1234");
         BadModals f = BadModals.GRAVE;
        %>
         
        <p><%= root.bannearUser(26, BadModals.GRAVE) %></p>
        <p><%= root.permaBan(3) %></p>
         
         <p>
             user: <%= request.getParameter("email") %>
         </p>
         <p>
             password: <%= request.getParameter("password") %>
         </p>
         <%             
             String nombre = request.getParameter("nombre");
             String apellido = request.getParameter("apellido");
             String email = request.getParameter("email");
             String password = request.getParameter("password");
             String consulta = "insert into usuarios (nombre, apellido, email, password) values ";
             String datos = "('"+nombre+"', '"+apellido+"', '"+email+"', '"+password+"')";
            try{
                Connection mysql = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios", "root", "1234");
                Statement hojaConsulta = mysql.createStatement();
                hojaConsulta.executeUpdate(consulta+datos);
                out.print("consulta");
            }catch(SQLException e){
                e.printStackTrace();
                out.println(datos);
                out.print("consulta err " + e);
            }
            %>
            
         <%@include file="footer.html" %>
    </body>
</html>
