<%@ taglib prefix="form" uri="http://java.springframework.org/tags/form"  %>

<!DOCTYPE html>

<html>
<head>
	<title>Save Disaster Point</title>
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>

<body>
	<div id="wrapper">
	
		<div id="header">
			<h2>Chongqing Jiangbei District DP Manager</h2>
		</div>

		<div id="container">
			<h3>Save DP</h3>
			<form:form action="saveDp" modelAttribute="dp" method="POST">
			
				<!-- need to associate this data with dp id (entity will call : get ID or set ID)-->
				<form:hidden path="id" />
				
				<table>
					<tbody>
						<tr>
							<td><label>Altitude</label></td>
							<td><form:input path="altitude" /></td>
						</tr>
						<tr>
							<td><label>Latitude</label></td>
							<td><form:input path="latitude" /></td>
						</tr>
						<tr>
							<td><label>Type</label></td>
							<td><form:input path="type" /></td>
						</tr>
						<tr>
							<td><label>Hazard Level</label></td>
							<td><form:input path="hazardLevel" /></td>
						</tr>
						<tr>
							<td><label>Comments</label></td>
							<td><form:input path="comments" /></td>
						</tr>
						<tr>
							<td><label></label></td>
							<td><input type="submit" value="Save" class="save" /></td>
						</tr>
					</tbody>
				</table>			
			</form:form>
			
			<div style="clear; both;"></div>
			<p>
				<a href= "${pageContext.request.contextPath}/dp/list"> Back to List </a>
			</p>
			
			
		</div>
	</div>
</body>

</html>