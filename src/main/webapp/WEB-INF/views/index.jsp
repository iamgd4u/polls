<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.ArrayList"%>
    <%@ page import ="java.util.List"%>
    <%@ page import = "java.time.LocalDateTime"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>called by home controller</h1>
	<% String name = (String)request.getAttribute("name"); %>
	<% List<String> friends = (ArrayList<String>)request.getAttribute("friends");%>
	<% LocalDateTime time = (LocalDateTime)request.getAttribute("time"); %>
	<h1>Name is <%=name%></h1>
	Friends are : <%= friends%>
	Updated at : <%= time%>

</body>
</html>