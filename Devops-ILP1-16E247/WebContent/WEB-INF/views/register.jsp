<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="uregister" name="uregister" method="post">
enter the username<input type="text" name="uname"><br>
enter your password<input type="password" name="password"><br>
<input type="submit">
</form>
<a href="login">click here to login</a>
${msg} 
</body>
</html>