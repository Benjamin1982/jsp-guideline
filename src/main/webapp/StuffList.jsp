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
   </center>
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
  	<c:set var="count" value="${count +1}" scope="page" /><!--diese Variable zählt jede Zeile aufwärts-->
  	<tr>
  			<th> <c:out value="${count}" 			/></th>
  			<td><c:out value="${stuff.name}" 		/></td>
  			<td><c:out value="${stuff.description}" /></td>
  			<td><c:out value="${stuff.quantity}" 	/></td>
  			<td><c:out value="${stuff.location}" 	/></td>
  			<td>
  		    <a 
  			href="/PSMS/edit?id=1">Edit</a>
  				 
  		    <a href="/PSMS/delete?id=1">Delete</a>
  			</td>
  	</tr>
  	</c:forEach>
  	</tbody>
  	
  </table>
  </div>
  </div>

 </body>
 </html>