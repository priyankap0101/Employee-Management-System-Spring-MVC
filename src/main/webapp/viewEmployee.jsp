<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
</head>
<style>
html {
	overflow: hidden;
}

body {
	display: flex;
	flex-direction: column;
	align-items: center;
	font-family: 'Poppins', sans-serif;
	width: inherit;
}

h2 {
	font-size: 2rem;
}

table {
	border: 0;
	font-size: 1rem;
}

th {
	background-color: salmon;
	color: #49c5b6;
	background-color: #000;
	padding: 1rem;
}

tr {
	border: 0;
	border-bottom: 3px solid #565656;
}

td {
	border: 0;
	padding: 1rem;
}

a {
	padding: .5em 1em;
	font-size: 1rem;
	text-decoration: none;
	color: #49c5b6;
	margin: .5rem 2rem;
	font-weight: 600;
}
</style>
<body>

	<h2>Employee List</h2>

	<table>

		<tr>

			<th>ID</th>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>SALARY</th>
			<th>PHONE</th>
			<th>UPDATE</th>
			<th>DELET</th>

		</tr>

		<c:forEach var="employee" items="${employees}">

			<tr>
				<th>${employee.getEmployeeId()}</th>
				<th>${employee.getEmployeeName()}</th>
				<th>${employee.getEmployeeEmail()}</th>
				<th>${employee.getEmployeeSalary()}</th>
				<th>${employee.getEmployeePhone()}</th>
				<th><a href="update?id=${employee.getEmployeeId()}">Update</a></th>
				<th><a href="delete?id=${employee.getEmployeeId()}">Delete</a>
				</th>
			</tr>


		</c:forEach>

	</table>

</body>
</html>