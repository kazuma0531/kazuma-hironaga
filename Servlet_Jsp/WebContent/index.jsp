<%--課題 1 課題 2 課題 4--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%--タイトルタグ--%>
<title>Servlet_Jsp</title>
</head>
<body>
	<%-- Task1のdoGetメソッドを呼び出す処理 --%>
	<input type="button" value="HelloServlet"
		onClick="location.href = 'task1'">
	<%-- ボタンを押下した際にTask1サーブレットを実行 --%>

	<%-- Task2のdoGetメソッドを呼び出す処理 --%>
	<p>
		<a href="task2">Hellojsp</a>
		<%-- リンクを押下した際にTask2サーブレットを実行 --%>
	</p>
	<%-- Task4のdoGetメソッドを呼び出す処理 --%>
	<input type="button" value="占う" onClick="location.href = 'task4'">
	<%-- ボタンを押下した際にTask4サーブレットを実行 --%>
	
	<%--上記の想定結果
	(タイトルタグ) Servlet_Jsp
	(URL) http://localhost:8080/Servlet_Jsp/index.jsp
	(pタグ)HelloServlet(ボタン形式)
	
	(pタグ)Hellojsp(リンク形式)
	
	(pタグ)占う(ボタン形式)
	 --%>
</body>
</html>