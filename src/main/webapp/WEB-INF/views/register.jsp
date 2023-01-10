<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css">

<!-- Website CSS style -->
<link rel="stylesheet" type="text/css" href="assets/css/main.css">

<!-- Website Font style -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">

<!-- Google Fonts -->
<link href='https://fonts.googleapis.com/css?family=Passion+One'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Oxygen'
	rel='stylesheet' type='text/css'>

<!-- <title>Admin</title> -->
</head>
<body>
	<div class="container">
		<form:form action="saveUser" modelAttribute="user" method="post">
			<div class="form-group">
				<label for="email">First Name:</label>
				<form:input path="firstName" type="text" class="form-control"
					id="email" placeholder="first name" />
			</div>
			<div class="form-group">
				<label for="email">Last Name</label>
				<form:input path="lastName" type="text" class="form-control"
					id="email" placeholder="last name" />
			</div>
			<div class="form-group">
				<label for="email">Mobile No</label>
				<form:input path="mobileNo" type="text" class="form-control"
					id="email" placeholder="mobile no" />
			</div>
			<div class="form-group">
				<label for="houseNo">House No</label>
				<form:input path="address.houseNo" type="text" class="form-control"
					id="houseNo" placeholder="house no" />
			</div>

			<div class="form-group">
				<label for="streetNo">Street No</label>
				<form:input path="address.streetNo" type="text" class="form-control"
					id="streetNo" placeholder="street no" />
			</div>

			<div class="form-group">
				<label for="state">State</label>
				<form:input path="address.state" type="text" class="form-control"
					id="state" placeholder="state" />
			</div>

			<div class="form-group">
				<label for="city">City</label>
				<form:input path="address.city" type="text" class="form-control"
					id="city" placeholder="city" />
			</div>

			<div class="form-group">
				<label for="locality">Locality</label>
				<form:input path="address.locality" type="text" class="form-control"
					id="locality" placeholder="locality" />
			</div>

			<div class="form-group">
				<label for="pincode">Pincode</label>
				<form:input path="address.pincode" type="text" class="form-control"
					id="pincode" placeholder="pincode" />
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form:form>
	</div>
</body>
</html>