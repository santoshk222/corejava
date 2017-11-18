<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<% if(session.getAttribute("isLogged")!="y")
	response.sendRedirect("/dccb/sadm");%>	

<!DOCTYPE html>
<html lang="en">
<!-- Head -->
<head>
<title>CosMos Co-operative Bank </title>
<jsp:include page="allcss.jsp"></jsp:include>
<!-- scrolling script -->
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- //scrolling script -->
</head>
<!-- //Head -->
<!-- Body -->
<body >
	<jsp:include page="head.jsp"></jsp:include>
	
	
	<jsp:include page="sadmbar.jsp"></jsp:include>
	
	<section class="skills" id="skills">
	<div class="container">	
	<div class='clearfix'></div>
	</div>
	
	
		
</section>
	
	<c:set var="adms" value="${adms}"></c:set>
	<c:set var="sadms" value="${sadms }"></c:set>
	
		

</body>
</html>
