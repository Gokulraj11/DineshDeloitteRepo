<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Random" %>
<%@ page isELIgnored="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTLcore</title>
</head>
<body>
<c:set var="score" value="88" scope="session"></c:set>
After Insert <c:out value="${score}"></c:out></br>
<c:if test="${score%2==0}">
<p> Even Numbers</p></br>
</c:if>
<c:choose>
<c:when test="${score>=80}">
A Grade
</c:when>
<c:when test="${score>=60 && score<80}">
B Grade
</c:when>
<c:otherwise>
C Grade
</c:otherwise>
</c:choose></br>

<c:catch var="exception">
<% String str = null;
str.toLowerCase();
%>
</c:catch>
<c:if test="${exception!=null}">
<c:out value="${exception}"></c:out></br>
</c:if>

<c:forEach var="i" begin="1" end="4" >
<c:out value="${i}"></c:out></br>
</c:forEach>

<c:import url="Welcome.txt" var="data"></c:import>
<c:out value="${data}"></c:out></br>

<c:forTokens items="This_is_Tag_library_Directives" delims="_" var="token">
<c:out value="${token}"></c:out></br>
</c:forTokens>

<c:remove var="score"/>
After Removal<c:out value="${score}"></c:out></br>

<c:url value="/Demo.jsp" var="DemoPage">
<c:param name="user" value="test"></c:param>
<c:param name="password" value="test#12"></c:param>
</c:url>
<c:out value="${DemoPage}"></c:out> 
</body>
</html>