<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.ArrayList"%>
    <%@ page import ="java.util.List"%>
    <%@ page import = "java.time.LocalDateTime"%>


    <%@page isELIgnored = "false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <h1>jstl controller called</h1>
	<h1>Name is ${name}</h1>
	Friends are : ${friends}
	<br>
	Updated at : ${time}
	<br>
	loop
	<c:forEach var = "item" items = "${friends}">
	    <h1>${item}</h1>
	    <c:out value = "${item}"></c:out>
	</c:forEach>
</body>
</html>