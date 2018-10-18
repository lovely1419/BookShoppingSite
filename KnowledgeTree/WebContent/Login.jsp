<!DOCTYPE html>
<html>
<%@ include file="header.jsp" %>
<head>
<meta charset="ISO-8859-1">
<title>JEE Technology</title>
</head>
<body style="background-color: #00FFFF" >

	<div align="center">
		<h1>Login Form</h1>
		<hr/>
		<form action="LoginServlet" method="post">
		<table style="margin:100px" style="background-color: #B8860B">
			<tr>
				<td>Email : </td>
				<td>
				
<input type="text"  name="email"  placeholder="Email adress"required autofocus="autofocus"></td>
			</tr>
			
			<tr>
				<td>Password : </td>
				<td>
<input type="password" name="password" placeholder="Password"required autofocus="autofocus"></td>
			</tr>



			<tr>
				<td></td>
				<td><input type="submit" value="Login"><a href="register.jsp">new user</a></td>
			</tr>
		</table>



		</form>
	</div>
	<%@ include file="footer.jsp" %>
</body>
</html>