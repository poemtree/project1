<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="//fonts.googleapis.com/css?family=Lobster&subset=latin,latin-ext" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-2.1.3.min.js"></script>
<script>
</script>
<style>
	h1 {
    	color: #008080;
    	font-family: 'Lobster';
}
</style>
<div id="main_center">
<h1>Dash Board</h1>
<%int rank_avg = Integer.parseInt(request.getParameter("rank_avg")); double tot_avg = Double.parseDouble(request.getParameter("tot_avg"));%>
<%int strike_rank = Integer.parseInt(request.getParameter("strike_rank")); double strike_avg = Double.parseDouble(request.getParameter("strike_avg"));%>		

<table class="table"  border=1 style="border-collapse:collapse;">
    <thead>
      <tr class="table-primary">
        <th>My Grade</th>
        <th>Avg Rank</th>
        <th>Avg Score</th>
      </tr>
    </thead>
    <tbody>
    <tr class="table-light" >
        <td rowspan="3"><img src=<%if(rank_avg>50) {%>"imges/trophy_copper.png"<%} else if(rank_avg>10) {%>"imges/trophy_silver.png" <%} else { %> "imges/trophy_gold.png"<%}; %> width="100%"height="100%"/><br></td>
        <td><%=rank_avg %></td>
        <td><%=tot_avg %></td>
      </tr>
      <tr class="table-primary" height="20%">
       
        <td><b>Strike Rank</b></td>
        <td><b>Strike avg</b></td>
      </tr>
      <tr class="table-light" >
      
        <td><%=strike_rank %></td>
        <td><%=strike_avg %></td>
      </tr>
    </tbody>
    </table>
      