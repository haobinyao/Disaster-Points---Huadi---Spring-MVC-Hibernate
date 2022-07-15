<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<!-- 6. create html file -->
<html>
<head>
	<title>List Disaster Points</title>
	
	<!-- reference our style sheet -->
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Chongqing Jiangbei District DP Manager</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		
			<!-- add dp button -->
			
			<input type="button" value="Add DP"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
			
			<!-- add a table -->
			
			<table>
				<tr>
					<th>Altitude</th>
					<th>Latitude</th>
					<th>Type</th>
					<th>Hazard Level</th>
					<th>Comments</th>
					<th>Action</th>
				</tr>
			</table>
			
			<!-- loop over and print dps -->
			
			<c:forEach var="tempDp" items="${dps}">
			
				<!-- construct "update" link -->
				
				<c:url var="updateLink" value="/dp/showFormForUpdate">
					<c:param name="dpId" value="${tempDp.id}" />
				</c:url>
				
				<!-- construct "delete" link -->
				
				<c:url var="deleteLink" value="/dp/delete">
					<c:param name="dpId" value="${tempDp.id}" />
				</c:url>
				
				<tr>
					<td> ${tempDp.altitude} </td>
					<td> ${tempDp.latitude} </td>
					<td> ${tempDp.type} </td>
					<td> ${tempDp.hazardLevel} </td>
					<td> ${tempDp.comments} </td>
					
					<td>
						<!-- display the update link -->
						<a href="${updateLink}">Update</a>
						||
						<a href="${deleteLink}"
							onclick="if(!(confirm('Are you sure you want to delete this Dp?'))) return false">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</div>
	</div>
</body>
</html>