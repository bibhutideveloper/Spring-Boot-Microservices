<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book</title>
</head>
<body>
<h1>Book Details</h1>
	<form action="book">
		Book Id: <input type="text" name="id" />
		<input type="submit" value="Search" />
	</form>
	<hr>
	
	Book Id:: ${book.bookId} <br>
	Book Name:: ${book.bookName} <br>
	Book Price:: ${book.bookPrice} <br>
	
</body>
</html>