<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css" />
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Insert title here</title>
</head>
<body>



<sf:form method="post" action="${pageContext.request.contextPath}/doCreate" commandName="user" >

    <table class="formtable">
        <tr><td class="label">Name: </td><td><input class="control" name="name" type="text" /> <br/><sf:errors path="name" cssClass="error"></sf:errors></td></tr>
        <tr><td class="label">Email: </td><td><input class="control"  name="email" type="text" /> <br/><sf:errors path="email" cssClass="error"></sf:errors></td></tr>
        <tr><td class="label">Your offer: </td><td><textarea class="control"  name="text" rows="10" cols="10"> </textarea></td></tr>
        <tr><td class="label"> </td><td><input class="control"  value="Create advert" type="submit" /> <br/><sf:errors path="name" cssClass="error"></sf:errors></td></tr>
    </table>

</sf:form>
</body>
</html>