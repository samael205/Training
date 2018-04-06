<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Out Object</title>

	</head>

	<body>
	
		<% out.print("<H2>Request Object Information</H2>"); %>
	
		<table border="1">
		
			<thead>
				<tr>
					<th>Method</th>
					<th>Value</th>
				</tr>
			</thead>
			
			<tbody>
				<tr>
					<td>Buffer Size</td>
					<td><%= out.getBufferSize() %> Bytes</td>
				</tr>
				<tr>
					<td>Auto Flush</td>
					<td><%= out.isAutoFlush() %></td>
				</tr>
				<tr>
					<td>Remaining Buffer</td>
					<td><%= out.getRemaining() %> Bytes</td>
				</tr>
			</tbody>
		
		</table>
	
	</body>

</html>