<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<?xml version="1.0" encoding="UTF-8" ?>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" />
<title>Lista de alunos</title>
</head>
<body>
<h1>Lista de alunos</h1>
<p>Lista de alunos e funcionalidade de exclusão</p>
<table class="table" border="1px" cellpadding="0" cellspacing="0" >
<thead class="thead-dark">
<tr>
<th width="15%">Nome</th><th width="15%">CPF</th><th width="15%">SEXO</th><th width="15%">EMAIL</th><th width="15%">TELEFONE</th>
</tr>
</thead>
<tbody>
<c:forEach var="aluno" items="${alunos}">
<tr>
	<td>${aluno.nome}</td>
	<td>${aluno.cpf}</td>
	<td>${aluno.sexo}</td>
	<td>${aluno.email}</td>
	<td>${aluno.telefone}</td>
	<td>
	<a href="${pageContext.request.contextPath}/aluno/delete/${aluno.CPF}.html">Deletar</a><br/>
	</td>
</tr>
</c:forEach>
</tbody>
</table>

<p><a class="btn btn-primary" href="${pageContext.request.contextPath}/index.html">Voltar</a></p>

</body>
</html>