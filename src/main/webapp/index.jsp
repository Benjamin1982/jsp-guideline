<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Kellerhals</title>
	<!-- Walkaround -->
	<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
	<link rel="stylesheet" href="./css/styles.css">
</head>
<body>


	<div class="box-center">
		Current Time: <%= java.util.Calendar.getInstance().getTime() %>
	</div>
	<div class="box-center">
	<h2 align="center" style="color:orange">
		Test Ausgabe
	</h2>
	</div>
	
	<div class="footer">
	<div class="bottom">
  			<div style="background-color:red;">Dont't mess with the U.S. Or they mess with you (quote by Micky Mouse)</div>
  			<div style="background-color:white;">Dont't mess with the U.S. Or they mess with you (quote by Micky Mouse)</div>  
  			<div style="background-color:blue;">Dont't mess with the U.S. Or they mess with you (quote by Micky Mouse)</div>
	</div>
	</div>
     <hr>
	<p><b>Dev-Hinweis:</b> Internet Explorer 10 unterstuetzt align-items property nicht.</p>
	

</body>
</html>