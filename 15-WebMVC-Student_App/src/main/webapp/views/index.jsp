<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>
</head>
<body>
	<h1>Student Enquiry Form</h1>
	<h3 style="color:green" >${msg}</h3>
	<form:form action="save" modelAttribute="student" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>
					<form:radiobutton path="gender" value="M" />Male
					<form:radiobutton path="gender" value="F" />Female
				</td>
			</tr>
			<tr>
				<td>Course</td>
				<td>
					<form:select path="course">
						<form:option value="">- Select -</form:option>
						<form:options items="${courses}"></form:options>
					</form:select>
				</td>
			</tr>
			<tr>
				<td>Timing</td>
				<td>
					<form:checkboxes items="${timings}" path="timings"></form:checkboxes>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>
	
</body>
</html>