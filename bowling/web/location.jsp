<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
 <%@ page language="java" import="java.sql.*" %>
<%
 String lat=request.getParameter("lat");
 String log=request.getParameter("log");
 double slat=Double.parseDouble(lat)-0.02;
 double slog=Double.parseDouble(log)-0.02;
 double elat=Double.parseDouble(lat)+0.02;
 double elog=Double.parseDouble(log)+0.02;
 System.out.println(lat+" "+log);
 
 String url = "jdbc:oracle:thin:@70.12.114.140:1521:xe";
 String user = "bowling";
 String pass = "111111";
 Connection conn;
 Statement  stmt;
 PreparedStatement pstmt;
 ResultSet rs;
  
 Class.forName("oracle.jdbc.driver.OracleDriver");
 conn = DriverManager.getConnection(url, user, pass);
 stmt = conn.createStatement();
 pstmt=conn.prepareStatement("select * from location where lat<"+elat+"and lat >"+slat+"and log >"+slog+"and log <"+elog);
 rs=pstmt.executeQuery();
 String store="";
String resultlat="";
String resultlog="";
int count=0;
 while(rs.next()){
    
    store+="/";
    resultlat+="/";
    resultlog+="/";
    store+=rs.getString("center_name");
    
    resultlat+=rs.getString("lat");
    resultlog+=rs.getString("log");
    count++;
/*      out.println("<tr>");
     out.println("<td>"+rs.getString("center_seq")+"</td>");
     out.println("<td>"+rs.getString("center_name")+"</td>");
     out.println("<td>"+rs.getString("lat")+"</td>");
     out.println("<td>"+rs.getString("log")+"</td>");
     out.println("</tr>"); */
 }
out.println(resultlat+resultlog+store+"/"+count);
System.out.println(resultlat+resultlog+store+"/"+count);
 conn.close();
%>