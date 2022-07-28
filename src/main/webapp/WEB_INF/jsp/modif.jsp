<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Modifier nouveau produit</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container">
	<h1>Modifier Produit</h1>
	<form method="post" action="/produit/update">
		<input type="hidden" name="id" value="${produit.id}">
			<div class="mb-3 mt-3">
				<label for="nom" class="form-label">Nom :</label>
				<input type="text" class="form-control" id="nom" name="nom" value="${produit.nom}" required>
			</div>
			<div class="mb-3 mt-3">
				<label for="prix" class="form-label">Prix :</label>
				<input type="number" step="0.1" class="form-control" id="prix" name="prix" value="${produit.prix}" required>
			</div>
			<div class="mb-3 mt-3">
				<label for="quantite" class="form-label">Quantité :</label>
				<input type="number"  class="form-control" id="quantite" name="quantite" value="${produit.quantite}" required>
			</div>
			<div class="mb-3 mt-3">
				<label for="categorie" class="form-label">Catégorie :</label>
				<select name="categorie" id="categorie" class="form-select">
				<c:forEach var="c" items="${categories}">
					<option value="${c.id}" <c:if test="${c.id==produit.categorie.id}">selected</c:if> >${c.nom}</option>
				</c:forEach>
				</select>
				</div>
			<div class="mb-3 mt-3">
				<input type="submit"  class="btn btn-primary" value="Modifier">
			</div>
		</form>

</div>

</body>
</html>