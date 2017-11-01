<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功</title>
</head>
<body>
	访问 Action上的属性不需要加#号，但需要提供getter方法<br/>
	用户名：<s:property value="userName"/><br/>
	密码：<s:property value="password"/><br/>
	<br/>
	<hr>
	用户名：<s:property value="context._currentObject.userName"/>(错误写法：&lt;s:property value="context._currentObject.userName"/&gt;)<br/>
	密码：<s:property value="context._currentObject.password"/> (错误写法：&lt;s:property context._currentObject.password"/&gt;)
</body>
</html>