<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>declaration02</title>
</head>
<body>
	<%!
		int sum(int a, int b)
		{
			return a+b;
		}
	%>
	<%
		out.println("2 + 3" + sum(2,3));
	%>
	<br></br>
	2 + 3 = <%=sum(2,3)%>

	<p><a href = "home">홈으로 가기</a></p>	
</body>
</html>