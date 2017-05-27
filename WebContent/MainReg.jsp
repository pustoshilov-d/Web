<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<form action = "Main" method = "POST" onSubmit="validate(this)">
		<h1>Registration</h1>
		<p>
			<label for = "login"> Login </label>
			<input name = "login" type = "text" id = "nameInput" />
		</p>
		<p>
			<label for = "password"> Password </label>
			<input name = "password" type = "text" id = "passwordInput" />
		</p>
		<p><input name="role" type="radio" value="user" checked> User</p>
    	<p><input name="role" type="radio" value="admin"> Admin</p>
		<input name = "registration" type = "submit" value="Registration" />
	</form>
</body>
	<script>
		function validate(event) {
			var inputName = document.getElementById("nameInput");
			var inputPassword = document.getElementById("passwordInput");
			console.log(this.event);
			if (inputName.value == '' || inputPassword.value == '') {
				this.event.stopPropagation(true);
				this.event.preventDefault();
				alert("Error: Empty field");
				return false;
			}
			  
			var regName = /^[a-zA-Z0-9]{3,}$/;
			var regPas = /^.{3,}$/;
			
			if (!regName.test(inputName.value) || !regPas.test(inputPassword.value)){
				this.event.stopPropagation(true);
				this.event.preventDefault();
				alert("Error: Incorrcet name or password field");
				return false;
			}
		}
	</script>
</html>