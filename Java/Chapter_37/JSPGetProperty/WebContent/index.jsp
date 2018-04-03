<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Use Bean Example</title>

	</head>

	<body>
	
		<jsp:useBean id="today" class="com.rahulmadbhavi.training.DateBean"></jsp:useBean>
	
			Today's Date = <jsp:getProperty property="day" name="today"/>/<jsp:getProperty property="month" name="today"/>/<jsp:getProperty property="year" name="today"/>
	
	</body>

</html>