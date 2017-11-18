		<!-- Top-Bar -->
		<div class="top-bar">
			<nav class="navbar navbar-inverse">
				<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#myNavbar">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
					</div>
					<div class="collapse navbar-collapse" id="myNavbar">
						<ul class="nav navbar-nav navbar-right">
							<li><a href="/dccb/index" class="">home</a></li>
							<li><a href="/dccb/about" class="">about</a></li>
							<li><a href="/dccb/services" class="">services</a></li>
							<li><a href="/dccb/team" class="">team</a></li>
							<li><a href="/dccb/payment" class="">payment</a></li>
							<li><a href="/dccb/blog" class="">blog</a></li>
							<li><a href="/dccb/contact" class="">contact</a></li>
							<%if(session.getAttribute("isLogged")=="y" && session.getAttribute("lgusrtyp")=="sadm"){%>
								<li><a href="/dccb/sadmnhmpg" class="">Dashboard</a></li>
								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">Super Admin
									<span class="caret"></span></a>
									<ul class="dropdown-menu">
										
        					 			<li><a href="#">Profile</a></li>
     									<li><a href="/dccb/sadmlogout">Logout</a></li>        
     								</ul>
								</li><%}else{%>
							<li class="navbar navbar-inverse">
      							<li class="dropdown">
        							<a class="dropdown-toggle" data-toggle="dropdown" href="#">Logins
        							<span class="caret"></span></a>
        							<ul class="dropdown-menu">
        					 			<li><a href="/dccb/adm">Admin</a></li>
     									<li><a href="/dccb/sadm">Super Admin</a></li>        
     								</ul>
      							</li>
								<!-- <li class="active"><a href="#">Profile</a></li> --> 
    						</li>	
							<%}%>
						</ul>
					</div>
				</div>
			</nav>
		</div>

		<!-- //Top-Bar -->
	