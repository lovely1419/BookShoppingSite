<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
    <br>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="backgroun-color:#008B8B">
<center>
<form action="SignupServlet" method="post">
<table>
<thead><h1>Registration Form</h1></thead>
<br>
<tr>
<td>User-Name</td>
<td><input type="text" name="name" placeholder="Name" required></td>

</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password" placeholder="Password" required></td>
</tr>

<tr>
<td>Email</td>
<td><input type="text" name="email" placeholder="Email" required></td>
</tr>

<tr>
<td>Contact</td>
<td><input type="text" name="contact" placeholder="Contact" required></td>
</tr>

<tr>
<td>Gender</td>
<td><input type="text" name="gender" placeholder="Gender" required></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="Register"></td>
</tr>


</table>
</form>
</center>
<%@ include file="footer.jsp" %>
</body>
</html>