<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Brintell - Teste para desenvolvedor</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" />
<style>
.btn-primary:hover {
    color: #0069d9;
    background-color: #fff;
    border-color: #0062cc;
}
</style>
</head>
<body>
<center>
<h1>Aplicação para adicionar e listar alunos</h1>
<h6> Java, JSP, Spring MVC, JPA/Hibernate, Bando de dados PostgreSQL, Maven</h6>
</center>

<center><h5>${message}</h5></center><br/>
<p style="text-align:center">
<br/><a class="btn btn-primary" href="${pageContext.request.contextPath}/aluno/add.html">Adicionar novo aluno</a><br/>
<br/><a class="btn btn-primary" href="${pageContext.request.contextPath}/aluno/list.html">Lista de alunos</a><br/>
</p>
</body>
</html>