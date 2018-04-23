<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<style>
</style>
<script src="http://code.jquery.com/jquery-2.1.3.min.js"></script>
<script>
function display(input){
	
}

$(document).ready(function(){
	// Server에 데이터를 요청한다.
	// AJAX로
/* 	$.ajax({
		url:"dashBoard.do?id=${id}",
		type:"GET",
		success:function(datas){
			
		},
		error:function(){
			
		}
	}); */	
});
</script>
<div id="main_center">
<h1>Main Center</h1>
<%String rank_avg = request.getParameter("rank_avg"); String tot_avg = request.getParameter("tot_avg");%>
<%String strike_rank = request.getParameter("strike_rank"); String strike_avg = request.getParameter("strike_avg");%>		
<img src="imges/trophy2.png"/><br>
My&ensp;Rank!<br>
AVG&ensp;Rank&ensp;=&ensp;<%=rank_avg %>,&ensp;AVG&ensp;=&ensp;<%=tot_avg %><br>
Strike&ensp;Rank&ensp;=&ensp;<%=strike_rank %>,&ensp;Strike&ensp;=&ensp;<%=strike_avg %><br>
<div id="container" style="min-width: 300px; height: 400px; margin: 0 auto"></div>
WHAT THE FUCK!
</div>

