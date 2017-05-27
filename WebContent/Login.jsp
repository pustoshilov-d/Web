<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Log in</h1>
	<form action = "SingIn" method = "POST">
		<p>
			<label for = "login">Login </label><input name = "login" type = "text"/>
		</p>
		<p>
			<label for = "password">Password </label><input name = "password" type = "text"/>
		</p>
		<input type = "submit"/>
	</form>
	<a href = "http://localhost:8080/Lab/Main">Sing up new user</a>
</body>
</html>