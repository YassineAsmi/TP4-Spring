<%@ page language="java" contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Modifier un Processor</title>
</head>
<body>
<form action="updateProcessor" method="post">
<pre>
id : <input type="text" name="idProcessor" value="${processor.idProcessor}">
nom :<input type="text" name="nomProcessor" value="${processor.nomProcessor}">
Model :<input type="text" name="modelProcessor" value="${processor.modelProcessor}">
prix :<input type="text" name="prixProcessor" value="${processor.prixProcessor}">
Date création :
<fmt:formatDate pattern="yyyy-MM-dd" value="${processor.dateCreation}" var="formatDate" />
<input type="date" name="date" value="${formatDate}"></input>
<input type="submit" value="Modifier">
</pre>
</form>
<br/>
<br/>
<a href="ListeProcessor">Liste Processor</a>
</body>
</html>