<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
</style>

</head>
<body>
<div id="myFont">
<table border=2 width=1570px height=770px>
	<tr>
		<td colspan="6">
				<jsp:include page="logo.jsp" />
		</td>
	</tr>
	
	<tr>
		<td width=220px height=550px>
			<jsp:include page="LeftMenu.jsp" />  
		</td>
		<td colspan="4">
				
				DDB Project<br><br>
				Database Connectivity using JDBC(Eclipse IDE)
				
				<br><br><br>
				Project By-
				<table align="center">
					<tr>
						<td>
							Sumeet Shahani	
						</td>
						<td>
							64
						</td>
					</tr>
					
					<tr>
						<td>
							Madhu Raut
						</td>
						<td>
							60
						</td>
					</tr>
					<tr>
						<td>
							Nikhil Vatwani
						</td>
						<td>
							70
						</td>
					</tr>
				</table>
				
		</td>
	</tr>
		
</table>
</div>
</body>
</html>