<%--
  Created by IntelliJ IDEA.
  User: joshuapro
  Date: 2016-11-14
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Offers</title>
</head>
<body>

<c:forEach var="offer" items="${offers}">
    <p><c:out value="${offer}"/></p>
</c:forEach>
</body>
</html>
