<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<p><font color="red">${errorMessage}</font></p>
	<form action="login.do" method="post">
		<div>Name : <input type="text" name="name"/> </div>
		<div>Password : <input type="password" name="password"/> </div>
		<input type="submit" value="Login"/>
	</form>
</body>
</html>