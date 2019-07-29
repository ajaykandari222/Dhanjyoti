<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>User Registration</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h3 id="form_header" class="text-warning" align="center">User Registration</h3>
	<div>&nbsp;</div>
<font color="red">${message}</font>
<c:url var="registerUser" value="/save" />
<form id="registration_form" action="${registerUser}" method="POST">
			<div class="form-group">
				<label for="fname">First Name:</label> <input type="text"
					class="form-control" id="fName" placeholder="Enter First Name"
					name="fName">
			</div>
			<div class="form-group">
				<label for="lname">Last Name:</label> <input type="text"
					class="form-control" id="lName" placeholder="Enter Last Name"
					name="lName">
			</div>
			<div class="form-group">
				<label for="dob">Date of Birth:</label> <input type="text"
					class="form-control" id="dob" placeholder="Enter Date of Birth"
					name="dob">
			</div>
			<div class="form-group">
				<label for="addrln1">Address Line 1:</label> <input type="text"
					class="form-control" id="addrL1" placeholder="Enter Address Line 1"
					name="addrL1">
			</div>
			<div class="form-group">
				<label for="addrln2">Address Line 2:</label> <input type="text"
					class="form-control" id="addrL2" placeholder="Enter Address Line 2"
					name="addrL2">
			</div>
			<div class="form-group">
				<label for="city">City:</label> <input type="text"
					class="form-control" id="city" placeholder="Enter City"
					name="city">
			</div>
			<div class="form-group">
				<label for="state">State:</label> <input type="text"
					class="form-control" id="state" placeholder="Enter State"
					name="state">
			</div>
			<div class="form-group">
				<label for="pin">PIN:</label> <input type="text"
					class="form-control" id="pin" placeholder="Enter PIN"
					name="pin">
			</div>
			<div class="form-group">
				<label for="mobile">Mobile Number:</label> <input type="text"
					class="form-control" id="mobile" placeholder="Enter Mobile Number"
					name="mobile">
			</div>
			<div class="form-group">
				<label for="email">Email:</label> <input type="text"
					class="form-control" id="email" placeholder="Enter Email ID"
					name="email">
			</div>
			<div class="form-group">
				<label for="aadhar">AADHAR:</label> <input type="text"
					class="form-control" id="aadhar" placeholder="Enter Aadhar"
					name="aadhar">
			</div>
			<div class="form-group">
				<label for="pan">PAN:</label> <input type="text"
					class="form-control" id="pan" placeholder="Enter PAN"
					name="pan">
			</div>
			<div class="form-group">
				<label for="username">Login username:</label> <input type="text"
					class="form-control" id="userName" placeholder="Enter Login username"
					name="userName">
			</div>
			<div class="form-group">
				<label for="password">Login password:</label> <input type="password"
					class="form-control" id="userPassword" placeholder="Enter Login password"
					name="userPassword">
			</div>
			<div class="form-group">
				<label for="passwordconf">Confirm password:</label> <input type="password"
					class="form-control" id="passwordconf" placeholder="Confirm password"
					name="passwordconf">
			</div>
			<div>
			<button id="confirm_user" type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>
</body>
</html>