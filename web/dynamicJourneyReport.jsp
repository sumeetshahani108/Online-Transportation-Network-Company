<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Customer Report:</h3>  
<s:iterator  value="list">  
<fieldset>  
Journey Id			:	<s:property value="id"/><br/>  
Journey Start Location		:<s:property value="start_location"/><br/>  
Journey End Location	:<s:property value="end_location"/><br/>  
Journey Payment Mode	:<s:property value="payment_mode"/><br/>  
</fieldset>  
</s:iterator>  
</body>
</html>