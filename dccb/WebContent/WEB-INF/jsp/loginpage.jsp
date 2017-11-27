<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%try{
	 String isl=session.getAttribute("isLogged").toString();
	 String lgusr=session.getAttribute("lgusrtyp").toString();
	 if(isl!="y" ){
%>

<!DOCTYPE html>
<html lang="en">
<!-- Head -->
<head>
<title>Bank</title>
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
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<c:set var="adms" value="${adms}"></c:set>
	<c:set var="sadms" value="${sadms }"></c:set>
	<c:if test="${sadms =='y'}">
		<div class="banner-main jarallax">
			<div class="container">
				<div class="banner-inner">
					<div class="col-md-5 banner-left">
					 ${errmsg}
						<form action="lgsadm" method="post">
						<h3>Super Admin Login</h3>
							<input type="email" name="email" placeholder="Your mail" required=""/>
							<input type="password" name="password" placeholder="password" required=""/>
							<div class="submit">
								<input type="submit" value="Login">
							</div>
						</form>
					</div>
					<div class="col-md-7 banner-left">
						${logsts}
						<form action="regsadm" method="post">
						<h3>Super Admin Registration</h3>
							<input type="text" name="name" placeholder="Full name" required=""/>
							<input type="email" name="email" placeholder="Your mail" required=""/>
							<input type="password" name="password" placeholder="password" required=""/>
							<input type="password" name="password2" placeholder="confirm password" required=""/>
							<div class="submit">
								<input type="submit" value="register">
							</div>
						</form>
					</div>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="clearfix"></div>
			</div>
		</c:if>
		<c:if test="${adms=='y' }">
			<div class="banner-main jarallax">
			<div class="container">
				<div class="banner-inner">
					<div class="col-md-5 banner-left">
						<form action="loginadmin" method="post">
						<h3>Admin Login</h3>
<<<<<<< HEAD
							<input type="email" name="email" placeholder="Your mail" required=""/>
							<input type="password" name="password" placeholder="password" required=""/>
							<div class="submit">
								<input type="submit" value="Login">
							</div>
						</form>
					</div>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="clearfix"></div>
			</div>
		</c:if>
<jsp:include page="foot.jsp"></jsp:include>
</body>
<!-- //Body -->
</html>

<%}
	 
	 else if(isl=="y" && lgusr=="sadm"){
		 response.sendRedirect("/dccb/sadmnhmpg");
	 	}
	 else if(isl=="y" && lgusr=="adm"){
		 response.sendRedirect("/dccb/admnhmpg");
	 }
 	}
	catch(Exception npe){
		String sadms=session.getAttribute("sadms").toString();
		 String adms=session.getAttribute("adms").toString();
		 if(sadms=="y")
			 response.sendRedirect("/dccb/index");
			out.print("NullPointerMessage: "+npe);
	 		//response.sendRedirect("/dccb/index");
	}
%>
