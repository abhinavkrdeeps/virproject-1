<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>trainer registration</title>
</head>
<body>

	<h1>Trainer Registration Page</h1>

	<form action="SignIn" method="post"> 
		<table>
			<tr>
				<td>Trainer Name:</td>
				<td><input type="text" name="tname"></td>
			</tr>
			<br>
			<tr>
				<td>UID:</td>
				<td><input type="text" name="uid"></td>
			</tr>
			<br>
			<tr>
				<td>Age:</td>
				<td><input type="text" name="age"></td>
			</tr>
			<br>
			<tr>
				<td>Specialization:</td>
				<td><select id="myList">
						<option value="" disabled selected>Select your option</option>
						<option value="1">Business Intelligence</option>
						<option value="2">Design</option>
						<option value="3">Artificial Intelligence</option>
						<option value="4">Development</option>
						<option value="5">Marketing</option>

				</select></td>
			</tr>
			<br>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="username"></td>
			</tr>
			<br>
			<tr>
				<td>Password:
				<td><input type="password" name="password"></td>
			</tr>
			<br>



		</table>
	</form>

	<input type="submit" value="Submit">
</body>
</html>