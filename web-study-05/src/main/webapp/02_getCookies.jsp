<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>클라이언트 쿠기 얻기</h3>
<%
	 Cookie[] cookies  = request.getCookies();
	for(Cookie cookie : cookies){
		out.println(cookie.getName() + " : " + cookie.getValue() + "<br>");
		out.println(cookie.getPath() + "<br>");
	}
%>
</body>
</html>