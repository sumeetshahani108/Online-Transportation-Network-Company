<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
button
{
	height:50px;
	width: 120px;
}
</style>
</head>
<body>
	
<table width=100% height=100% background="bg2.jpg" style="background-size:cover">
	<tr>
		<td>
			<button id="Home_button" class="float-left submit-button">Home page
			</button>
		</td>
		
	</tr>
	<tr></tr><tr></tr>
	
	<tr>	
		<td>
			<button id="View_button" class="float-left submit-button">View
			</button>
		</td>
	</tr>
	<tr></tr><tr></tr>
	<tr>	
		<td>
			<button id="Insert_button" class="float-left submit-button">New
		Customer? Sign up!</button>
		</td>
	</tr>
	
	<tr></tr><tr></tr>
	<tr>	
		<td>
			<button id="book" class="float-left submit-button">Book a Ticket!</button>
		</td>
	</tr>	
	
	<tr></tr><tr></tr>
	<tr>	
		<td>
			<button id="Update_button" class="float-left submit-button">Update
		your details</button>
		</td>
	</tr>
	<tr></tr><tr></tr>
	<tr>	
		<td>
			<button id="Delete_button" class="float-left submit-button">Delete
		your Details</button>
		</td>
	</tr>
	<tr></tr><tr></tr>
	<tr>	
		<td>
			<button id="Query_1" class="float-left submit-button">Query 1</button>
		</td>
	</tr>
	<tr></tr><tr></tr>
	<tr>	
		<td>
			<button id="Query_2" class="float-left submit-button">Query 2</button>
		</td>
	</tr>
	<tr></tr><tr></tr>
	<tr>	
		<td>
			<button id="Query_3" class="float-left submit-button">Query 3</button>
		</td>
	</tr>
	
		
	
	
</table>

	
	<script type="text/javascript">
		document.getElementById("Home_button").onclick = function() {
			location.href = "welcome.jsp";
		};
		document.getElementById("View_button").onclick = function() {
			location.href = "view.jsp";
		};
		document.getElementById("Insert_button").onclick = function() {
			location.href = "register.jsp";
		};

		document.getElementById("Update_button").onclick = function() {
			location.href = "update.jsp";
		};
		document.getElementById("Delete_button").onclick = function() {
			location.href = "delete.jsp";
		};
		document.getElementById("Query_1").onclick = function() {
			location.href = "query1.jsp";
		};
		document.getElementById("Query_2").onclick = function() {
			location.href = "query2.jsp";
		};
		document.getElementById("Query_3").onclick = function() {
			location.href = "query3.jsp";
		};
		document.getElementById("Insert_button").onclick = function() {
			location.href = "PersonRegister.jsp";
		};
		
		
		
	</script>
	
</body>
</html>