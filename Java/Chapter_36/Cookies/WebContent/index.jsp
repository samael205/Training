<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Cookies</title>

	</head>

	<body>
	
	<%
		Cookie[] cookies = request.getCookies();
	
		if(cookies == null)
		{
	%>
			<h1>Cookies not found.</h1><br>
			Click link to add cookies <a href=request target="_blank">Click Here</a>
	<%
		}
		else
		{
	%>
					<table border="1">
						<thead><tr><th>Name</th><th>Value</th></tr></thead>
						<tbody>
	<%
			for(Cookie cookie : cookies)
			{
	%>
						<tr>
							<td><%= cookie.getName() %></td>
							<td><%= cookie.getValue() %></td>
						</tr>
	<%
			}
		}
	%>
						</tbody>
					</table>
	</body>

</html>