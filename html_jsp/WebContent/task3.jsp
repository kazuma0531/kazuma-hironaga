<%-- HTML・JSP 課題3 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date, java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<%!	int count = 1; 
	Date now = new Date();
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>訪問回数: <%= count++ %></h1>
	
	<p><% out.print("今日の日付: " + sdf1.format(now)); %><p>
</body>
</html>

<%-- 上記の想定結果
訪問回数: (リロードすると1増加)(h1タグ)
今日の日付: (現在時刻を出力)(pタグ)
--%>