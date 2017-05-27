<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Site</h1>
	<script type="text/javascript">
function OnLoad()
{
httpRequest = new XMLHttpRequest();
httpRequest.open("GET", "/test.txt", true);
httpRequest.onreadystatechange = OnRequestStateChange;
httpRequest.send(null);
}

function OnRequestStateChange()
{
if (httpRequest.readyState != 4)
  return;
if (httpRequest.status != 200)
  return;
document.getElementById("textPlace").innerHTML = httpRequest.responseText;
}
</script>

	<form action = "Site" method = "POST" >
		
		<input name="role" type="radio" value="1" checked> 1<br>
    	<input name="role" type="radio" value="2"> 2<br>
    	<input name="role" type="radio" value="3"> 3<br>
    	<input name="role" type="radio" value="4"> 4<br>
    	<input name="role" type="radio" value="5"> 5<br>
    	<input name="role" type="radio" value="6"> 6<br>
    	<input name="role" type="radio" value="7"> 7<br>
    	<input name="role" type="radio" value="8"> 8<br>
    	<input name="role" type="radio" value="9"> 9<br>
    	<input name="role" type="radio" value="10"> 10<br>
    	<input name="role" type="radio" value="11"> 11<br>
    	<input name="role" type="radio" value="12"> 12<br>
    	<input name="role" type="radio" value="0"> Delete All<br>
		<input name = "delete" type = "submit" value="Delete" />
	</form>
</body>
</html>