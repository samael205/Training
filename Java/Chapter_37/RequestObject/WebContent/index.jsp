<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Request Object</title>

	</head>

	<body>
	
		<table border="1">
		
			<thead>
				<tr>
					<td>Method</td>
					<td>Value</td>
				</tr>
			</thead>
		
			<tbody>
				<tr>
					<td>request.getMethod()</td>
					<td><%= request.getMethod() %></td>
				</tr>
				<tr>
					<td>request.getRequestURI()</td>
					<td><%= request.getRequestURI() %></td>
				</tr>
				<tr>
					<td>request.getProtocol()</td>
					<td><%= request.getProtocol() %></td>
				</tr>
				<tr>
					<td>request.getServerName()</td>
					<td><%= request.getServerName() %></td>
				</tr>
				<tr>
					<td>request.getServerPort()</td>
					<td><%= request.getServerPort() %></td>
				</tr>
				<tr>
					<td>request.getRemoteAddr()</td>
					<td><%= request.getRemoteAddr() %></td>
				</tr>
				<tr>
					<td>request.getHeader("User-Agent")</td>
					<td><%= request.getHeader("User-Agent") %></td>
				</tr>
			</tbody>
		
		</table>
	
	</body>

</html>