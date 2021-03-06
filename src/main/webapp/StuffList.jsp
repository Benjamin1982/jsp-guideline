<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE HTML>
<html>
<head>
  <title>Listenansicht</title>
  <!-- Walkaround CSS -->
	<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
	<link rel="stylesheet" href="./css/styles.css">
</head>

<body>

  <center>
   	Liste tabellarisch (Alle Stock-Artikel in Auflistung)
   	<a class="mdl-navigation__link" href="/PSMS-1/new">Add New Item</a>
  </center>
  <br></br><br></br> 
  <div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
  <main class="mdl-layout__content">
  <div class="page-content">
  <div class="mdl-grid center-items">
  <div class="mdl-cell mdl-cell--4-col"> 
  <div> 
  <table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp">
  	<thead>
  		<tr>
  		
  			<th>NO</th>
  			<th>Name</th>
  			<th>Description</th>
  			<th>Quantity</th>
  			<th>Location</th>
  			<th>Action</th>
  		</tr>
  	</thead>
  	<tbody>
  	<c:set var="count" value="0" scope="page" /><!--scope-->
  	<c:forEach var="stuff" items="${alle_waren}">
  	<c:set var="count" value="${count +1}" scope="page" /><!--diese Variable z?hlt jede Zeile aufw?rts-->
  	<tr>
  			<th> <c:out value="${count}" 			/></th>
  			<td><c:out value="${stuff.name}" 		/></td>
  			<td><c:out value="${stuff.description}" /></td>
  			<td><c:out value="${stuff.quantity}" 	/></td>
  			<td><c:out value="${stuff.location}" 	/></td>
  			<td>
  		    <a 
  			href="/PSMS-1/edit?id=1">Edit</a>
  				 
  		    <a href="/PSMS-1/delete?id=1">Delete</a>
  			</td>
  	</tr>
  	</c:forEach>
  	</tbody>
  	
  </table>
  </div>
  </div>
  </div>
  </div>
  </main>
  </div>
 </body>
 </html>