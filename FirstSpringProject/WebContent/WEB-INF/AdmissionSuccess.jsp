<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Welcome</h1>
		<h2>${msg}</h2>
		<table>
			<tr><td>Name: </td><td>${stud.name}</td></tr>
			<tr><td>Hobby: </td><td>${stud.hobby}</td></tr>
			<tr><td>Number: </td><td>${stud.number}</td></tr>
			<tr><td>DOB: </td><td>${stud.date}</td></tr>
			<tr><td>Skills: </td><td>${stud.skills}</td></tr>
			<tr><td>Address: </td><td>${stud.studadd.city}${stud.studadd.state}</td></tr>
		</table>
		
	</body>
</html>