<%-- 課題 4 --%>
<%-- practiceファイルに入っている FortuneBeanをインポート --%>
<%@ page import="practice.FortuneBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%--リクエストスコープから データを取り出す処理 --%>
<%
	FortuneBean fortuneBean = (FortuneBean) request.getAttribute("uranau");
%>
<meta charset="UTF-8">
<title>Fortune Result</title>
</head>
<body>
	<%
		out.println("<h1>↓" + fortuneBean.getToday() + "↓</h1>");
		out.println("<h1>" + fortuneBean.getFortune() + "</h1>");
	%>
	<%-- 上記の想定結果
	(タイトルタグ)Fortune Result
	(URL)
	(h1タグ)↓ 曜日 月 日付 時:分:秒 JST 年↓
	(h1タグ)大吉, 中吉, 小吉, 末吉, 凶, 大凶の中からランダムで1つ表示
	 --%>
</body>
</html>