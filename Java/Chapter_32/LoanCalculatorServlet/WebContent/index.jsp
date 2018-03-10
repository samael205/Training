<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	Boolean isValid = (Boolean) session.getAttribute("isValid");
	String error = (String) session.getAttribute("error");
	Double payment = (Double) session.getAttribute("payment");
	String principal = (String) session.getAttribute("principal");
	String years = (String) session.getAttribute("years");
	String roi = (String) session.getAttribute("roi");
	
	principal = principal == null ? "" : principal;
	years = years == null ? "" : years;
	roi = roi == null ? "" : roi;
	error = error == null ? "" : error;
	
	session.removeAttribute("isValid");
	session.removeAttribute("error");
	session.removeAttribute("payment");
	session.removeAttribute("principal");
	session.removeAttribute("years");
	session.removeAttribute("roi");
	
%>

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Loan Calculator</title>

		<style type="text/css">
		
			td
			{
				padding: 10px;
				padding-left: 25px;
				padding-right: 25px;
			}
		
		</style>

	</head>

	<body>

		<br>

		<%
			if(isValid != null && (isValid))
			{
		%>
				<br>
				<br>
		
				<form method="POST" action="<%= request.getContextPath() %>/EMICalculator">
					<table align="center" border="1">
						<tr>
							<td colspan="2" align="center">Loan Monthly Payment Calculator</td>
						</tr>
						<tr>
							<td>Principal</td>
							<td><input name="principal" value="<%= principal %>" required></input></td>
						</tr>
						<tr>
							<td>Number of Years</td>
							<td><input name="years" value="<%= years %>" required></input></td>
						</tr>
						<tr>
							<td>Interest Rate</td>
							<td><input name="roi" value=<%= roi %> required></input></td>
						</tr>
						<tr>
							<td>Monthly Payments</td>
							<td><%= payment %></td>
						</tr>
						<tr>
							<td colspan="2" align="center">
								<input type="submit" value="Calculate"></input>
							</td>
						</tr>				
					</table>
				</form>
		<%		
			}
			else
			{
		%>
				<br>
				<p align="center"><%= error %></p>				
				<br>
		
				<form method="POST" action="<%= request.getContextPath() %>/EMICalculator">
					<table align="center" border="1">
						<tr>
							<td colspan="2" align="center">Loan Monthly Payment Calculator</td>
						</tr>
						<tr>
							<td>Principal</td>
							<td><input name="principal" required></input></td>
						</tr>
						<tr>
							<td>Number of Years</td>
							<td><input name="years" required></input></td>
						</tr>
						<tr>
							<td>Interest Rate</td>
							<td><input name="roi" required></input></td>
						</tr>
						<tr>
							<td>Monthly Payments</td>
							<td></td>
						</tr>
						<tr>
							<td colspan="2" align="center">
								<input type="submit" value="Calculate"></input>
							</td>
						</tr>				
					</table>
				</form>
		<%		
			}
		%>
	</body>

</html>