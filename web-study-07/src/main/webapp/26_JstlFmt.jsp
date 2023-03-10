<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<pre>
		<c:set var="now" value="<%=new Date() %>"></c:set>
		\${now} : ${now}
		
		<fmt:formatDate value="${now}"/>
		
		date : <fmt:formatDate value="${now}" type="date"/>
		time : <fmt:formatDate value="${now }" type="time"/>
		both : <fmt:formatDate value="${now }" type="both"/>
		dafult : <fmt:formatDate value="${now }" 
			type="both" dateStyle="default" timeStyle="default" />
		short : <fmt:formatDate value="${now}" 
			type="both" dateStyle="short" timeStyle="short"/>
	</pre>
	
</body>
</html>