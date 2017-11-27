<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
 <%try{
	 String isl=session.getAttribute("isLogged").toString();
	 String lgusr=session.getAttribute("lgusrtyp").toString();
	 if(isl=="y" && lgusr=="sadm"){
%>		 
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Branch registration from</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>

<!-- css files -->
<link href="css/formstyle.css" rel="stylesheet" type="text/css" media="all">
<!-- //css files -->
<!-- online-fonts -->
<link href="//fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i&subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese" rel="stylesheet">

</head>
<body>
<jsp:include page="allcss.jsp"></jsp:include>
<jsp:include page="head.jsp"></jsp:include>

<jsp:include page="sadmbar.jsp"></jsp:include>
	<div class="agile-header">
		<h1>New Branch regstration from</h1>
		${rsts}
	</div>
	<!--//header-->
	<!--main-->
	<div class="agileits-main">
		<div class="wrap">
		<form action="/dccb/rnbb" method="post">
			<!-- <ul>
				<li class="text">Branch ID:  :  </li>
				<li><input name="BRANCH_ID" type="text" required disabled="disabled"></li>
			</ul>
 -->			<ul>
				<li class="text">Branch name  :  </li>
				<li><input name="BRANCH_NAME" type="text" required></li>
			</ul>
			<ul>
				<li class="text"> Location  :  </li>
				<li><input name="LOCATION" type="text" required></li>
			</ul>
			<ul>
				<li class="text">contact no  :  </li>
				<li><input name="contact" type="text" required></li>
			</ul>
			<ul>
				<li class="text">Admin ID  :  </li>
				<li><input name="ADMIN_ID" type="text" required></li>
			</ul>
			<ul>
				<li class="text">Country  :  </li>
				<li><input name="COUNTRY_COUNTRY_ID" type="text" required></li>
			</ul>
			<ul>
				<li class="text">State  :  </li>
				<li><input name="STATE_STATE_ID" type="text" required></li>
			</ul>
			<ul>
				<li class="text"> Branch Scale  :  </li>
				<li><input name="BRANCH_SSCALE_SCALE_ID" type="text" required></li>
			</ul>
			<ul>
				<li class="text">zip/pin code  :  </li>
				<li><input name="pin" type="text" required></li>
			</ul>
			<ul>
				<li class="text">Extra info :  </li>
				<li><textarea></textarea></li>
			</ul>
			<div class="clear"></div>
			<div class="agile-submit">
				<input type="submit" value="Register">
				<input type="reset" value="Reset">
			</div>
			</form>
		</div>	
	</div>
</body>
</html>	
<%}
	 else{
		response.sendRedirect("/dccb/sadm");
	 	}
	}
	catch(NullPointerException npe){
	 response.sendRedirect("/dccb/sadm");
}
%>
