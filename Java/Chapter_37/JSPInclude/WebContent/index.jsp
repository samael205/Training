<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>JSP Include</title>

	</head>

	<body>
	
		Line from index.jsp before jsp:include<br>
		<jsp:include page="jsp/insert.jsp"></jsp:include>
		Line from index.jsp after jsp:include<br>
	
	</body>

</html>
