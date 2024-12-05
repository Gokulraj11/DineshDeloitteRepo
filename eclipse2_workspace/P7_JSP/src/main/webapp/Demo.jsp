<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSP Demo</h1>
<%!
int a = 10;
int b = 5;
public int add(){
	return (a+b);
}
%>
<%
out.println(a);
out.println("</br>");
out.println(b);
out.println("</br>");
out.println("SUM = "+add());
%>

<h2>Sum of two numbers = <%=add()%> </h2>

</body> 
</html>