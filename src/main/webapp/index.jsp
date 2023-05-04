<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
</head>

<style>
body {
	height: 60vh;
	width: 100vw;
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
	font-family: 'Poppins', sans-serif;
}
a {
	padding: .5em 1em;
	font-size: 1.3rem;
	border: 3px solid #565656;
	border-radius: 50px;
	text-decoration: none;
	color: #303030;
	margin: .5rem 2rem;
	font-weight: 600;
}
a:hover {
	background-color: black;
	color: #49c5b6;
	border: 3px solid thin aqua;
}
h2 {
	padding: 0rem 0rem 0rem 0rem;
	font-size: 3rem;
	color: #49c5b6;
	background-color: #000;  
	width: auto ;
	text-align: justify;
	font-weight: 500;
	margin: 0
}
.a {
	width: 100%;
	display: flex;
	justify-content: center;
}
</style>

<body>

<h2>Welcome To Employee Management System</h2> <br> <br>
<div class="a">
	<a href="saveEmployee">Add Employee</a> 
	<a href="viewEmployee">view Employee</a>
	
</div>
	
	
</body>
</html>