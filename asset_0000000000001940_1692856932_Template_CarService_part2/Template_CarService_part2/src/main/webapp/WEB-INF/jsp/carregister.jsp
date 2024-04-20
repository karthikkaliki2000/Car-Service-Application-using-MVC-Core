<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head></head>
	<body>
	<div>
	<h1>This is the signup page</h1>
	<form:form action="done" modelAttribute="car1">
	Car Number:
	<form:input path="RegisterationNumber"/>
	<br/>
	<br/>
	Car Name:
	<form:input path="CarName"/>
	<br/>
	<br/>
	Covered in Warranty:
	<form:select path="CarDetails">
	<form:option value="YES"></form:option>
	<form:option value="NO"></form:option>
	</form:select>
	<br/>
	<br/>
	Any Remarks:
	<form:input path="CarWork"/>
	<br/>
	<br/>
	<input type="submit">
	</form:form>
	</div>
	</body>
</html>
