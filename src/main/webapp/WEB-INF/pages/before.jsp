<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true" isELIgnored="false"%>
    
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*,com.sec.model.Quiz" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<tr>
<%

List<Quiz> qo=(List<Quiz>)session.getAttribute("quiz12") ; %>

	<c:forEach items="${qo}" var="user" varStatus="tagStatus">
	  <tr>
	    <td>${user.name}</td>
	    <td>${user.link}</td>
	   
	  </tr>
	</c:forEach>
	</table>
</h1>
 </body>
</html>