<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<style>
</style>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>    
<script>
</script>
<div>
<form id="member_description">
	ID : <input type='text' name="id" id="id" value='${itsMe.id }' readonly>
	PWD : <input type='text' name="pwd" id="pwd" value='${itsMe.pwd }' >
	NAME : <input type='text' name="name" id="name" value='${itsMe.name }' >
	<br>
</form>
<a href="itsMe.jsp">Back</a>
</div>




