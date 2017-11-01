<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
</head>
<body style="text-align:center;">
	<div style="width:90%;height:100%;margin:0 auto;">
		<form action="<%=request.getContextPath() %>/ognl/ognl.action" method="POST">
			用户名：<input type="text" name="userName"/><br/>
			密&nbsp;码：<input type="password" name="password"/><br/>
			<input type="submit" value="登录" />
		</form>
	</div>
</body>
</html>