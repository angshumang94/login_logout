<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign Up</title>
</head>
<body>
	<form action="SignupServ" method="post">
	<table align="center">
	<tr><td>
		Enter Username:&nbsp;<input type="text" name="username" maxlength="10"><br>
		</td></tr>
		<tr><td>
		Enter Password:&nbsp;<input type="password" name="password" maxlength="15"><br>
		</td></tr>
		<tr><td>
		&nbsp;<input type="submit" value="Sign Me Up">
		</td></tr>
		</table>
	
	</form>
</body>
</html>