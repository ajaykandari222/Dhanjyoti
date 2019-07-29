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
<script>
function show(aval) {
    if (aval == "CSA") {
    hiddenDiv.style.display='inline-block';
    Form.fileURL.focus();
    } 
    else{
    hiddenDiv.style.display='none';
    }
  }
</script>
<body>
	<div class="container">
		<h3 id="form_header" class="text-warning" align="center">Account Summary</h3>
		<div>&nbsp;</div>
		<fieldset>
				<label>Create Saving Account:</label> <select name="A"
					onchange="java_script_:show(this.options[this.selectedIndex].value)">
					<option value="s">select</option>
					<option value="CSA">Create Saving Account</option>
				</select>
		</fieldset>	
		<%-- <font color="red">${message}</font> --%>
		<%-- <c:url var="registerUser" value="/save" /> --%>
		<font color="red">${message}</font>
		<div id="hiddenDiv" style="display:none">
		<form id="registration_form" action="createsavingsaccount" method="POST">
			<div class="form-group">
				<label for="accontNum">Accont Number:</label> <input type="text"
					class="form-control" id="accontNum"
					placeholder="Enter Account number" name="accontNum">
			</div>
			<div class="form-group">
				<label for="accontType">Accont Type:</label> <input type="text"
					class="form-control" id="accontType"
					placeholder="Enter Account Type" name="accontType">
			</div>
			<div class="form-group">
				<label for="accontBalance">Accont Balance:</label> <input
					type="text" class="form-control" id="accontBalance"
					placeholder="Enter Account BAlance" name="accontBalance">
			</div>
			<div class="form-group">
				<label for="createdDate">Created Date:</label> <input type="text"
					class="form-control" id="createdDate" name="createdDate">
			</div>
			<div class="form-group">
				<label for="updatedDate">Updated Date:</label> <input type="text"
					class="form-control" id="updatedDate" name="updatedDate">
			</div>
			<div>
				<button id="confirm_user" type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>
		</div>
	</div>
		
</body>
</html>
