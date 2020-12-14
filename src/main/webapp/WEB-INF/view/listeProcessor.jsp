<%@ page language="java" contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Liste Processor</title>
</head>
<body>
<h1 >
Liste des Processor
</h1>
<table >
<tr>
<th>ID</th><th>Nom Processor</th><th>Model Processor</th><th>Prix</th><th>Date Release</th><th>Suppression<th>Edition</th>
</tr>
<c:forEach items="${processor}" var="p">
<tr>
<td>${p.idProcessor }</td>
<td>${p.nomProcessor }</td>
<td>${p.modelProcessor }</td>
<td>${p.prixProcessor }</td>
<td><fmt:formatDate pattern="dd/MM/yyyy" value="${p.dateCreation}" /></td>
<td><a onclick="return confirm('Etes-vous sûr ?')" href="supprimerProcessor?id=${p.idProcessor }">Supprimer</a></td>
<td><a href="modifierProcessor?id=${p.idProcessor }">Edit</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>