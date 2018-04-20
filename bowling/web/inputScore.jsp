<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
<style>
</style>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>    
<script>
$(document).ready(function(){
	$('#s_btn').click(function(){
	
		$('#score_description').attr({
			'method':'post',
			'action':'inputScore.do'
		});
		$('#score_description').submit();
	
	});
});
</script>
<div>
<form id="score_description">
	ID : <input type='text' name="id" id="id">
	PWD: <input type='text' name="game_num" id="game_num">
	PWD: <input type='text' name="set1" id="set1">
	PWD: <input type='text' name="set2" id="set2">
	PWD: <input type='text' name="set3" id="set3">
	PWD: <input type='text' name="set4" id="set4">
	PWD: <input type='text' name="set5" id="set5">
	PWD: <input type='text' name="set6" id="set6">
	PWD: <input type='text' name="set7" id="set7">
	PWD: <input type='text' name="set8" id="set8">
	PWD: <input type='text' name="set9" id="set9">
	PWD: <input type='text' name="set10" id="set10">
	PWD: <input type='text' name="strike" id="strike">
	PWD: <input type='text' name="spare" id="spare">
	<br>
	<input type="button" value="select" id="s_btn">
</form>
</div>