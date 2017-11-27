<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		
	</div>
	<!--//header-->
	<!--main-->
	<div class="agileits-main">
		<div class="wrap">
		<form action="#" method="post">
			<ul>
				<li class="text">name  :  </li>
				<li><input name="name" type="text" required></li>
			</ul>
			<ul>
				<li class="text">organization  :  </li>
				<li><input name="organization" type="text" required></li>
			</ul>
			<ul>
				<li class="text">E-mail  :  </li>
				<li><input name="E-mail" type="text" required></li>
			</ul>
			<ul>
				<li class="text">contact no  :  </li>
				<li><input name="contact" type="text" required></li>
			</ul>
			<ul>
				<li class="text">mobile no  :  </li>
				<li><input name="mobile" type="text" required></li>
			</ul>
			<ul>
				<li class="text">fax  :  </li>
				<li><input name="fax" type="text" required></li>
			</ul>
			<ul>
				<li class="text">address 1  :  </li>
				<li><input name="addr 1" type="text" required></li>
			</ul>
			<ul>
				<li class="text">address 2  :  </li>
				<li><input name="addr 2" type="text" required></li>
			</ul>
			<ul>
				<li class="text">country  :  </li>
				<li><input name="country" type="text" required></li>
			</ul>
			<ul>
				<li class="text">state  :  </li>
				<li><input name="state" type="text" required></li>
			</ul>
			<ul>
				<li class="text">city  :  </li>
				<li><input name="city" type="text" required></li>
			</ul>
			<ul>
				<li class="text">zip/pin code  :  </li>
				<li><input name="pin" type="text" required></li>
			</ul>
			<ul>
				<li class="text">sales inquiry  :  </li>
				<li><textarea></textarea></li>
			</ul>
			<div class="clear"></div>
			<div class="agile-submit">
				<input type="submit" value="submit">
				<input type="reset" value="reset">
			</div>
			</form>
		</div>	
	</div>
</body>
</html>