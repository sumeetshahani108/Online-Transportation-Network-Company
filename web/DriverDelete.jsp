<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    padding: 12px 16px;
    z-index: 1;
}

.nounderline{
	text-decoration:none;
}

.nounderline:hover{
	font-size:15px;
}


.dropdown:hover .dropdown-content {
    display: block;
}
.label{
color:black;
}
</style>
<script>
	function setFrame(val){
		switch(val){
			case 1:document.getElementById("frame").src = "Query1.jsp";
			break;
			case 2:document.getElementById("frame").src = "query2.jsp";
			break;
			case 3:document.getElementById("frame").src = "query3.jsp";
			break;
			case 4:document.getElementById("frame").src = "QueryFourth.jsp";
			break;
			case 5:document.getElementById("frame").src = "QueryFifth.jsp";
			break;
		}
	}
</script>
<script>

	function check(){
		var a =document.getElementById("tt").value;
		var myNum = +a; 
		if (isNaN(myNum)) {
			document.getElementById("err").innerHTML = 'Please input a valid ID';
			return false;
		} else{
			
			return true;
		}
	}
</script>
</head>
<body>
<div class="row" style="border-bottom:5px solid yellow">
		<div class="col-lg-3 col-lg-offset-1">
			<a href="home.jsp"><img src="http://localhost:8082/DDB/olacabs2.jpg" style="height:13vh"></a>
		</div>
		<div class="col-lg-1" style="margin-top:-10px">
			<div class="dropdown" style="background-color:red;border-radius:10px;padding:20px">
			  Person
			  <div class="dropdown-content">
			    <p><a href="PersonRegister.jsp" class="nounderline" style="text-decoration:none">Add</a></p>
			    <p><a href="PersonUpdate.jsp" class="nounderline" style="text-decoration:none">Update</a></p>
			    <p><a href="PersonDelete.jsp" class="nounderline" style="text-decoration:none">Delete</a></p>
			  </div>
			</div>
			
		</div>
		<div class="col-lg-1" style="margin-top:-10px">
			<div class="dropdown" style="background-color:red;border-radius:10px;padding:20px">
			  Driver
			  <div class="dropdown-content">
			    <p><a href="DriverRegister.jsp" class="nounderline" style="text-decoration:none">Add</a></p>
			    <p><a href="DriverUpdate.jsp" class="nounderline" style="text-decoration:none">Update</a></p>
			    <p><a href="DriverDelete.jsp" class="nounderline" style="text-decoration:none">Delete</a></p>
			  </div>
			</div>
			
		</div>
		<div class="col-lg-1" style="margin-top:-10px">
			<div class="dropdown" style="background-color:red;border-radius:10px;padding:20px">
			  Location
			  <div class="dropdown-content">
			    <p><a href="LocationRegister.jsp" class="nounderline" style="text-decoration:none">Add</a></p>
			    <p><a href="LocationUpdate.jsp" class="nounderline" style="text-decoration:none">Update</a></p>
			    <p><a href="LocationDelete.jsp" class="nounderline" style="text-decoration:none">Delete</a></p>
			  </div>
			</div>
			
		</div>
		<div class="col-lg-1" style="margin-top:-10px">
			<div class="dropdown" style="background-color:red;border-radius:10px;padding:20px">
			  Car
			  <div class="dropdown-content">
			    <p><a href="CarRegister.jsp" class="nounderline" style="text-decoration:none">Add</a></p>
			    <p><a href="CarUpdate.jsp" class="nounderline" style="text-decoration:none">Update</a></p>
			    <p><a href="CarDelete.jsp" class="nounderline" style="text-decoration:none">Delete</a></p>
			  </div>
			</div>
			
		</div>
	</div>
<s:form action="driverDelete"  onSubmit="return check();">
	<s:textfield label="Id" key="id" id="tt"/>
	<s:submit /> 
</s:form>
<p id="err" style="color:red"></p>
</body>
</html>