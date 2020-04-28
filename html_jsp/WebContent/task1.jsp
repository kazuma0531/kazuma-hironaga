<%-- HTML・JSP 課題1 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h1>Hello JSP</h1>
	<h2>Hello JSP</h2>
	<h3>Hello JSP</h3>
	<% out.print("Hello JSP"); %>
</body>
</html>

<%-- 上記の想定結果
Hello JSP(h1タグ)
Hello JSP(h2タグ)
Hello JSP(h3タグ)
Hello JSP(printメソッドで表示)
--%>
