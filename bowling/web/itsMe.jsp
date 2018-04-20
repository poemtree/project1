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
	
		$('#member_description').attr({
			'method':'post',
			'action':'itsMe.do'
		});
		$('#member_description').submit();
	
	});
});
</script>
<div>
<form id="member_description">
	ID : <input type='text' name="id" id="id">
	PWD: <input type='text' name="pwd" id="pwd">
	<br>
	<input type="button" value="select" id="s_btn">
</form>
</div>