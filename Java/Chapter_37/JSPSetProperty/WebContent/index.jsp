<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>JSP Set Property</title>

	</head>

	<body>
	
		<jsp:useBean id="circle" class="com.rahulmadbhavi.training.Circle"></jsp:useBean>
		
		<jsp:setProperty property="radius" name="circle" value="10.0"/>
		
		Area of circle = <jsp:getProperty property="area" name="circle"/> units<sup>2</sup>.
	
	</body>

</html>