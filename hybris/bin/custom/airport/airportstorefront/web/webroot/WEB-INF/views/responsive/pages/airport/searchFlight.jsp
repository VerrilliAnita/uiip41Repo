<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flight</title>
</head>
<body>
	<h1>Flight Info</h1>
	<p> Flight code: "${flight.codeFlight}"</p>
	<br>
	<h1>Route Info</h1>
	<p>Departure Date: ${dateDeparture}</p><br>
	<p>Arrival Date: ${dateArrival}</p> <br>

	<h1>Passenger Listing</h1>
	<ul>
		<c:forEach var="ticket" items="${ticketPassengers.keySet()}">
			<li>${ticketPassengers.get(ticket).getName()}	idSit: ${ticket.getIdSit()}</li>
		</c:forEach>
	</ul>
</body>
</html>