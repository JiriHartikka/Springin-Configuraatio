<%-- 
    Document   : Welcome
    Created on : 25-Mar-2013, 16:43:52
    Author     : jirihamb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
      <c:forEach var="alkio" items="${serviceLista}">
          ${alkio.bibTexId} <br>
        </c:forEach>
    </body>
</html>
