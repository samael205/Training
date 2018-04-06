<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<% SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss.SSS"); %>

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Session Object</title>

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
					<td>Session Creation Time</td>
					<td><%= sdf.format(session.getCreationTime()) %></td>
				</tr>
				<tr>
					<td>session.getId()</td>
					<td><%= session.getId() %></td>
				</tr>
				<tr>
					<td>Session Last Accessed Time</td>
					<td><%= sdf.format(session.getLastAccessedTime()) %></td>
				</tr>
				<tr>
					<td>session.getMaxInactiveInterval()</td>
					<td><%= session.getMaxInactiveInterval() %></td>
				</tr>
				<tr>
					<td>session.getServletContext()</td>
					<td><%= session.getServletContext() %></td>
				</tr>
				<tr>
					<td>session.getSessionContext()</td>
					<td><%= session.getSessionContext() %></td>
				</tr>
			</tbody>
		
		</table>
	</body>

</html>