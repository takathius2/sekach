<%--<%@～%>はディレクティブタグ。JSP→サーブレットに変換するのに必要な設定を記述する  --%>
<%@page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="rb" scope="request" class="bean.RegisterBean"/>

<!DOCTYPE html>
<html>
	<head>
		<title>確認画面</title>
	</head>
<body>
	<h2>入力情報を確認して登録ボタンを押してください</h2>
	氏名:<strong><jsp:getProperty name="rb" property="name" /></strong><br/>
	年齢:<strong><%= rb.getJpnAge() %></strong><br/>
	開発経験:<strong><%= rb.getStrLangs() %></strong><br/><br/>
	<form action="/register" method="post">
		<input type="submit" value="登録" />
		<input type="button" value="戻る" onclick="history.back();" />
	</form>
</body>
</html>