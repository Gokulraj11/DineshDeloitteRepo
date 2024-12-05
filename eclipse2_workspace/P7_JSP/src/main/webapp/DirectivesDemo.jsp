<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Random,java.lang.*" %>
<%@ page isThreadSafe="true" %>
<%@ page errorPage="ErrorDemo.jsp" %>
<%@ page info="Welcome to Deloitte This is an Directive info" %>
<%@ page language="java" %>
<%@ page buffer="8kb" %>
<%@ page autoFlush="true" %>
<%@ page isELIgnored="True" %>
<%@ page session="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Directives</title>
</head>
<body>
<%
Random rand = new Random();
int n = rand.nextInt(20);
//System.out.println(n);
%>
<%@ include file="Header.jsp"%>
<h1>Random number <%=n %></h1>
<%= getServletInfo() %>
<%
//int a=10;
//int b=0;
//int c=a/b;
//out.println(c);
%>

</body>
</html>