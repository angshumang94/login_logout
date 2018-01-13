<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<form action="LoginServ" method="post">
	<table align="center">
	<tr><td>
	<br>&nbsp; Username : <input type="text" name="username" maxlength="10">
	</td></tr>
	<tr><td>
	<br>&nbsp; Password : <input type="password" name="password" maxlength="15">
	</td></tr>
	<tr><td>
	<br>&nbsp;&nbsp; <input type="submit" value="Go">
	</td></tr>
	</table>
	</form>
</body> 
</html>