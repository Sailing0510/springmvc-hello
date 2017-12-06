<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户</title>
</head>
<body>
<!-- 此时没有写Action，直接提交给/add -->
<sf:form method="post" modelAttribute="user" enctype="multipart/form-data">
Username:<sf:input path="username"/><sf:errors path="username"></sf:errors><br/>
Password:<sf:password path="password"/><sf:errors path="password"></sf:errors><br/>
Nickname:<sf:input path="nickname"/><br/>
Email:<sf:input path="email"/><sf:errors path="email"></sf:errors><br/>
Attach:<input type="file" name="attach"><br/>
<input type="submit" value="添加用户"/>
</sf:form>
</body>
</html>