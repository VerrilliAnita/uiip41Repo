<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Route Listing</h1>
	
		<h4> Partenza : "${route.dataRouteDep}"</h4>
		<h4> Arrivo : "${route.dataRouteArr}"</h4>
		
		<c:forEach var="ticket" items="${route.tickets}">
			
			<h6>${ticket.passenger.name}</h6>
			<h6>${ticket.sit}</h6>
		
		</c:forEach>
	

</body>
</html>