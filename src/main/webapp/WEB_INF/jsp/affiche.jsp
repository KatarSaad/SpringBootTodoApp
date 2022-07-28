<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Liste des produits</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-4">
	<h1>Liste des produits</h1>
	<div class="my-3">
		<a href="/produit/add" class="btn btn-primary">Ajouter un nouveau produit</a>
	</div>
	<div>
	<form action="/produit/find" method="post">
		<input type="text" name="motcle">
		<input type="submit" value="Rechercher">
	</form>
	</div>
	<table class="table table-hover">
		<tr>
			<th>#</th>
			<th>NOM</th>
			<th>PRIX</th>
			<th>QUANTITE</th>
			<th>CATEGORIE</th>
			<th>ACTION</th>
		</tr>
		<c:forEach var="p" items="${listeP}">
			<tr>
				<td>${p.id}</td>
				<td>${p.nom}</td>
				<td>${p.prix}</td>
				<td>${p.quantite}</td>
				<td>${p.categorie.nom}</td>
				<td><a href="/produit/delete/${p.id}" onclick="return confirm('Voulez vous vraiment supprimer ce produit?')" class="btn btn-danger">Supprimer</a>
				<a href="/produit/update/${p.id}" class="btn btn-warning">modifier</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>