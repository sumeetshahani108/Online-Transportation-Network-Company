<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
#myFont
	{
	 text-align: center;
	font-size:40px;
		}
		body
{	
	background: url(bg1.jpg);
	background-size:cover;
}
#heading{
	width:100vw;
	height:10vh;
	background-color:yellow;
}
.headinglist1{
	display:inline-block;
	padding:20px;
	background-color:red;
}
</style>
</head>
<body>
<!-- <div id="heading">
	<ul id="headinglist">
		<li class="headinglist1" id="person">Person</li>
		<li class="headinglist1" id="car">Car</li>
		<li class="headinglist1" id="driver">Driver</li>
		<li class="headinglist1" id="location">Location</li>
	</ul>
</div> -->
	<div id="myFont">
<table border=2 width=1570px height=770px>
				
	<s:form action="query1">
		Get the journey's according to their payment mode
		<s:textfield type="hidden" label="Payment Mode" key="mode_of_payment" />
		<s:submit /> 
	</s:form>	

</table>
</div>
	<script>
	document.getElementById("person").onclick = function() {
		location.href = "Person.jsp";
	};
	</script>
</body>
</html>