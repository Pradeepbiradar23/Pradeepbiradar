<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>password doesn't match</h3>
<form action="http://localhost:8082/MVC/Register.java">
<table>
<tr>
<td>Name</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>UserName</td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td>password</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td>conform password</td>
<td><input type="password" name="conformpassword"></td>
</tr>
<tr><td><input type="submit"></td></tr>
</table>
</form>

</body>
</html>