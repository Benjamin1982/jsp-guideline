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
  			<th> <c:out value="${count}" /></th>
  			<td><c:out value="${stuff.name}" /></td>
  			<td>Any Description</td>
  			<td>Any Quantity</td>
  			<td>Any Location</td>
  			<td style="color:red; font-weight:bolder">  Actions are edit delete </td>
  	</tr>
  	</c:forEach>
  	</tbody>
  	
  </table>
 </body>
 </html>