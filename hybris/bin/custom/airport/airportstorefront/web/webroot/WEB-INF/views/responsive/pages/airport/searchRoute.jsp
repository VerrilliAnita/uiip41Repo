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
	
	<h3>Date Departure: "${route.dateRouteDep}"</h3>
	<h3>Date Arrival: "${route.dateRouteArr}"</h3>
	
	<c:forEach var="ticket" items="${route.tickets}">
		<li>Passenger: ${ticket.passenger.name} --- Seat Id: ${ticket.idSit}</li>
		</c:forEach>
	
</body>
</html>