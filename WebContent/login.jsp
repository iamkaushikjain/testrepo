<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css" />
<title>Login</title>
</head>
<body id="size">
<form action="LoginServlet" method="post">
	<h3 align="center">User Login</h3><br/>
	<p align="center">
		<label>User Name :</label>
		<input type="text" name="username" /><br />
		<br /> <label>Password :</label>
		<input type="password" name="password" /><br /><br /><br/>
			
<!-- 	<a href="LoginServlet" target="login" class="button" style="background-color: #066270;"/>Login</a><br/><br/><br/>
 -->	
 	<input type="submit" value="SUBMIT" >
	<a href=createdoctor.jsp target="body">Click Here</a>, To Create New Account
	</form>
</body>
</html>