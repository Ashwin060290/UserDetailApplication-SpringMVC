<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
	<title>Admission Form</title>
	</head>
	<body>
	<h1>Enter Your Details</h1><br>
	
	<p><font color="red"><form:errors path="stud.*"/></font>	</p>
		<form action="/FirstSpringProject/submitadmission" method="post">
		<table>
			
			<tr><td>Enter Your Name : </td><td><input type="text" name="name" /></td></tr>
			<tr><td>Enter Your Hobby: </td><td><input type="text" name="hobby" /></td></tr>
			<tr><td>Enter Your Mobile : </td><td><input type="text" name="number" /></td></tr>
			<tr><td>Enter Your DOB : </td><td><input type="date" name="date" /></td></tr>
			<tr><td>Select Your Skills : </td><td><select name="skills" multiple>
													<option value="Java">Java</option>
													<option value="Spring">Spring</option>
													<option value="Python">Python</option>
													</select></td></tr>
			<tr><td>Address : </td></tr>										
			<tr><td>Enter Your city : </td><td><input type="text" name="studadd.city" /></td>
			<tr><td>Enter Your state : </td><td><input type="text" name="studadd.state" /></td></tr>
			<tr><td><input type="submit" value="Submit"/></td></tr>
		</table>
		</form>
	</body>
</html>