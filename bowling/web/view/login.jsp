<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
 <%@ page language="java" import="java.sql.*" %>
 
<%
	String id =%> ${itsMe.id };
<% String pwd =%> ${itsMe.pwd };
	
<%	
	if(id.equals("") || pwd.equals("")){
		out.println("2");
	}else{
		out.println("1");
	}
%>
