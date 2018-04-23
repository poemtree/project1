<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE>
<html>
<head>
<meta charset="EUC-KR">
<title>My DashBoard!</title>
</head>
<body>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<section>

			<jsp:include page="chart/mainChart.jsp?rank_avg=${rank_avg}&tot_avg=${tot_avg}&strike_rank=${strike_rank}&strike_avg=${strike_avg}"></jsp:include>

</section>
<section>
	<jsp:include page="chart/myChart.jsp"></jsp:include>
</section>
<footer></footer>
</body>
</html>




