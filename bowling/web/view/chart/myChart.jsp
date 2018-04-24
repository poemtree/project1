<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<style>
</style>
<script src="http://code.jquery.com/jquery-2.1.3.min.js"></script>
<script>
function display(a){
	Highcharts.chart('container', {
	    chart: {
	        type: 'column'
	    },
	    title: {
	        text: 'My Score AVG'
	    },
	    subtitle: {
	        text: '볼링치기 좋은 날'
	    },
	    xAxis: {
	        categories: [
	            '2016', '2017', '2018'
	        ],
	        crosshair: true
	    },
	    yAxis: {
	        min: 0,
	        title: {
	            text: 'Score'
	        }
	    },
	    tooltip: {
	        headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
	        pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
	            '<td style="padding:0"><b>{point.y:.1f} point</b></td></tr>',
	        footerFormat: '</table>',
	        shared: true,
	        useHTML: true
	    },
	    plotOptions: {
	        column: {
	            pointPadding: 0.2,
	            borderWidth: 0
	        }
	    },
	    series: a/* [{
	        name: 'max',
	        data: [120, 130, 110]
	
	    }, {
	        name: 'avg',
	        data: [100, 110, 100]
	
	    }, {
	        name: 'min',
	        data: [80, 90, 90]
	
	    }] */
	})
};
$(document).ready(function(){
	// Server에 데이터를 요청한다.
	// AJAX로
 
	$.ajax({
		url:"myChartImpl.do",
		type:"GET",
		data:{id:'<%=request.getParameter("id")%>'},
		success:function(a){
			display(a);
		},
		error:function(){
			alert('fail');
		}
	});
});

</script>
<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>



