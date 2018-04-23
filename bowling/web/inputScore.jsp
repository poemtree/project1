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
	game_num : <input type='text' name="game_num" id="game_num">
	<br>
	SET1: <input type='text' name="set1" id="set1">
	SET2: <input type='text' name="set2" id="set2">
	SET3: <input type='text' name="set3" id="set3">
	SET4: <input type='text' name="set4" id="set4">
	SET5: <input type='text' name="set5" id="set5">
	<br>
	SET6: <input type='text' name="set6" id="set6">
	SET7: <input type='text' name="set7" id="set7">
	SET8: <input type='text' name="set8" id="set8">
	SET9: <input type='text' name="set9" id="set9">
	SET10: <input type='text' name="set10" id="set10">
	<br>
	STRIKE: <input type='text' name="strike" id="strike">
	SPARE: <input type='text' name="spare" id="spare">
	<br>
	<input type="button" value="INSERT" id="s_btn">
</form>
test@test.com<br>
aaa<br>
a11<br>
aaabbx<br>
qwe<br>
test1@test.com<br>
test2@test.com<br>
test3@test.com<br>
bbb<br>
ccc<br>
ddd<br>
aaas<br>
test5@test.com<br>
sss111<br>
ccccc<br>
12<br>
</div>