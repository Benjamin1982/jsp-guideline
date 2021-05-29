<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE HTML>
<html>
<head>
  <title>Listenansicht</title>
  <!-- Walkaround CSS -->
	<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
	
	
	<!-- This is a scheme/template for UI -->
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
    
    <!-- local css -->
	<link rel="stylesheet" href="./css/styles.css">
</head>

<body>
	<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
		<!--<%@include file="./jsp/menu.jsp" %>-->
		<main class="mdl-layout__content>
		 
			<div class="page-content">
				<div class="mdl-grid center-items">
					<div class="mdl-cell mdl-cell--4-col">
					<div class="mdl-card__title mdl-color--primary mdl-color-text--green">
					<h2 class="mdl-card__title-text">
						<c:if test="${stuff != null}">Edit Record</c:if>
						<c:if test="${stuff == null}">Add New Record"</c:if>
					</h2>
					</div>
					<div class="mdl-card__supporting-text">
						<c:if test="${stuff != null}">
						 	<form name="myForm" action="update" method="post" 
						 	onsubmit="return validateForm()">
						 	
						</c:if>
						<c:if test="${stuff == null}">
						 	<form name="myForm" action="insert" method="post" 
						 	onsubmit="return validateForm()">
						 	
						</c:if>
						
						<c:if test="${stuff != null}">
							<input type="hidden" name="id"
							value="<c:out value='${stuff.id}' />" id="name" />
							<label class="mdl-textfield__label" for="name" >MName</label>
						</c:if>
						
						<div class="mdl-textfield mdl-js-textfield">
						<input class="mdl-textfield__input" type="text" name="description"
						value="HORST" id="description" />
						</div>
						<div class="mdl-textfield mdl-js-textfield">
						<input class="mdl-textfield__input" type="text" name="description"
						value="HORST" id="description" />
						</div>
						<div class="mdl-textfield mdl-js-textfield">
						<input class="mdl-textfield__input" type="text" name="description"
						value="HORST" id="description" />
						</div>
						
						<input type="submit" class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect"
						value="Save" >
						</form>
					</div>	
					 
				
				</div>			
			</div>
		</main>
	</div>

</body>
</html>