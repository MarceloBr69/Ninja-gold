<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Ninja Gold</title>
		<link rel="stylesheet" href="Style.css">
	</head>
	<body>
		<div id="YourGold"> <!-- Cuenta de oro -->
			<h1>Tu oro:
			</h1>
			<table>
				<tr>
					<td><c:out value="${goldBase}"></c:out></td>
				</tr>
			</table>	
		</div>
		
		
		<!-- Acciones -->
		<div class="container">
			<div id="acciones">
			<div id="farm">
				<h3>Farm</h3>
				<p>(Obten 10-20 de oro)</p>
				<form action="/goldfarm" method="POST">
					<button name="farmear">Encuentra oro!</button>
				</form>
			</div>
		</div>
		<div id="acciones">
			<div id="Cave">
				<h3>Cave</h3>
				<p>(Obten 5-10 de oro)</p>
				<form action="/goldcave" method="POST">
					<button name="cave">Encuentra oro!</button>
				</form>
			</div>
		</div>
		<div id="acciones">
			<div id="House">
				<h3>Casa</h3>
				<p>(Obten 2-5 de oro)</p>
				<form action="/goldcasa" method="POST">
					<button name="casa">Encuentra oro!</button>
				</form>
			</div>
		</div>
		<div id="acciones">
			<div id="Casino">
				<h3>Casino</h3>
				<p>(Obten 0-50 de oro)</p>
				<form action="/goldcasino" method="POST">
					<button name="casino">Encuentra oro!</button>
				</form>
			</div>
		</div>
		</div>
		
		<h1>Acciones:</h1>
		<div id="historial">
			<textarea>
				<c:out value="${historial}"></c:out>
			</textarea>
		</div>
	</body>
</html>