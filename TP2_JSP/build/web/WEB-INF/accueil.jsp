<%-- 
    Document   : bonjour
    Created on : 20 févr. 2018, 00:18:28
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
        <%= request.getAttribute("erreur")%>
       <form action="Travail" method="POST">
       <input type="text" name="nom" placeholder="Nom">
       <input type="text" name="prenom" placeholder="Prenom">
       <input type="submit" value="Submit">
       </form> 
              
        
    </body>
</html>
