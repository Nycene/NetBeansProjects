<%-- 
    Document   : bienvenue
    Created on : 20 févr. 2018, 01:43:58
    Author     : Naycene Boussoffara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>
        <% String nom=(String) request.getParameter("nom");
        String prenom=(String) request.getParameter("prenom");
        out.println("Bienvenue "+nom+" "+prenom);

            %>
        </p>
    </body>
</html>
