<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css" />
<title>Create New Account</title>
 <link rel="stylesheet" href="/js/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
    $( "#datepicker" ).datepicker();
  });
  $('input[type=text]').one("focus", function() {    
      $(this).val("");
});
  </script>
</head>
<body>
<form action=""></form>
<h2 align="left">New User Account</h2><hr/>
			
	<div align="justify">

	<label>First Name :</label>
	<input type="text" name="fname" /><br/>
	<br />
	<br />
	<label>Last Name :</label>
	<input type="text" name="lname" /><br/>
	<br />
	<br />
	<label>Gender        :</label>
	<select>
	<option selected="selected">Select Gender</option>
	<option>Male</option>
	<option>Female</option>
	<option>Others</option>
	</select>
	<br/>
	<br />
	<br />
	<label>Date Of Birth:</label>
	<input type="text" id="datepicker">
	<br/>
	<br/>
	<br/>
	<label>Adhaar No:</label>
	<input type="text" name="adhaar" /><br/>
	<br/>
	<br/>
	<label>Phone   :</label>
	<input type="text" name="phone" /><br/>
	<br />
	<br />
	<label>Address:</label><br/>
	<textarea rows="4" cols="30">Enter The Address</textarea>
	<br/>
	<br/>
	<br/>
	
	<label>UserName  :</label>
	<input type="text" name="uname" /><br/>
	<br />
	<br />
	<label>Specialization :</label><br/>
	<textarea rows="4" cols="30">Specialization In 20 to 30 Words</textarea><br/><br/>
	<br/>
	<br />
	<br />
	<label> Photo   :</label>
	<input type="text" name="path" />
	<input type="Button" value="Browse" />	<br/>
	<br />
	<br />
	<label>Password:</label>
	<input type="password" name="password">

	<a href="home.jsp" target="body" class="button" style="background-color: #066270;">Create</a><br/><br/><br/>
	</div>

</body>
</html>