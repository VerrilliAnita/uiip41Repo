<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InfoFlight</title>
</head>
<body>
	<h1>dot notation ${tickets.get(0).flight.codeFlight}</h1>
	<h1>${codeFlight}</h1>
	<ul>
		<c:forEach var="ticket" items="${tickets}">
			<li>${ticket.passenger.name}</li>
			<li>${ticket.seat}</li>
		</c:forEach>
	</ul>
</body>
</html> 