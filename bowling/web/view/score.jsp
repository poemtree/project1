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
	SCORE_SEQ : <input type='text' name="score_seq" id="score_seq" value='${myScore.score_seq}' readonly>
	ID : <input type='text' name="id" id="id" value='${myScore.id}'>
	REGDATE : <input type='text' name="regdate" id="regdate" value='${myScore.regdate}'>
	SET10 : <input type='text' name="set10" id="set10" value='${myScore.set10}'>
	STRIKE : <input type='text' name="strike" id="strike" value='${myScore.strike}'>
	SPARE : <input type='text' name="spare" id="spare" value='${myScore.spare}'>
	<br>
</form>
<a href="inputScore.jsp">Back</a>
</div>