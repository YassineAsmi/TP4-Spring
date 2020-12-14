<%@ page language="java" contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Add New Processor</title>
</head>
<body>
<form action="saveProcessor" method="post">
<pre>
nom : <input type="text" name="nomProcessor">
model : <input type="text" name="modelProcessor">
prix : <input type="text" name="prixProcessor">
date release : <input type="date" name="date">
<input type="submit" value="ajouter">
</pre>
</form>
${msg}
<br/>
<br/>
<a href="ListeProcessor">Liste Processors</a>
</body>
</html>