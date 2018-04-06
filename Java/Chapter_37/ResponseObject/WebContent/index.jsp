<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Response Object</title>

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
					<td>response.getBufferSize()</td>
					<td><%= response.getBufferSize() %></td>
				</tr>
				<tr>
					<td>response.getCharacterEncoding()</td>
					<td><%= response.getCharacterEncoding() %></td>
				</tr>
				<tr>
					<td>response.getContentType()</td>
					<td><%= response.getContentType() %></td>
				</tr>
				<tr>
					<td>response.getStatus()</td>
					<td><%= response.getStatus() %></td>
				</tr>
				<tr>
					<td>response.getLocale()</td>
					<td><%= response.getLocale() %></td>
				</tr>
			</tbody>
		
		</table>
	
	</body>

</html>