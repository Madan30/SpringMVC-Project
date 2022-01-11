<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
	<form action="orderprocess">
		<div align="center">
			<h2 align="center">${myCafe}</h2>
			<hr>
			<label for="item_name">Item Name :</label> <input type="text"
				name="foodtype" placeholder="item " id="item_name"> <input
				type="submit" value="order now">
		</div>
	</form>


</body>
</html>