<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE HTML>
<html>
<head>
  <title>Listenansicht</title>
</head>

<body>
   <div>
   	Liste tabellarisch (hupiouoiuo)
   </div>
  <table>
  	<thead>
  		<tr>
  		<!--ER: kleine runde Tische -->
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
  			href="/PSMS/edit?id=1">BEARBEITEN</a>
  				 
  		    <a href="/PSMS/delete?id=1">ENTFERNEN</a>
  			</td>
  	</tr>
  	</c:forEach>
  	</tbody>
  	
  </table>
 </body>
 </html>