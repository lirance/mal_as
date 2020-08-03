<%@page import="action.Dbcon"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page session="true"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>Agent lists</title>
<meta charset="utf-8">

<meta name="description" content="Your description">
<meta name="keywords" content="Your keywords">
<meta name="author" content="Your name">
<meta name="format-detection" content="telephone=no" />
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<!--CSS-->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="styles.css">
<link rel="stylesheet" href="css/touchTouch.css">
<!--JS-->
<script src="js/jquery.js"></script>
<script src="js/jquery-migrate-1.1.1.js"></script>
<script src="js/superfish.js"></script>
<script src="js/jquery.mobilemenu.js"></script>
<script src="js/jquery.cookie.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/jquery.ui.totop.js"></script>
<script src="js/touchTouch.jquery.js"></script>
<script>
	$(window).load(function() {
		// Initialize the gallery
		$('.thumb-pad5 figure a').touchTouch();
	});
</script>
</head>
<body>
	<div class="global">
		<header class="margBot1 margBrand">
			<div class="bg">
				<div class="container">
					<div class="row">
						<article class="span12">
							<div class="navbar navbar_ clearfix marg">
								<div class="navbar-inner">
									<div class="clearfix">
										<div class="nav-collapse nav-collapse_">
											<ul class="nav sf-menu clearfix">
												<li><a href="ahome.jsp">Home</a></li>
												<li><a href="agentlist.jsp">Agent list</a></li>
												<li><a href="policyholders.jsp">clients</a></li>
												<li><a class="active" href="policylist.jsp">policy
														list</a></li>
												<li><a href="index.jsp">Logout</a></li>
											</ul>
										</div>
									</div>
								</div>
							</div>
							<center>
								<h1 class="brand"
									style="margin-left: -30px; color: white; font-size: 30px"><%@include
										file="title.jsp"%>
								</h1>
							</center>
						</article>
					</div>
				</div>
			</div>
		</header>
		<!--content-->
		<div class="container padBot"
			style="height: 800px; background-image: url('img/bgall2.jpg')">
			<br> <br>
			<div class="row">
				<article class="span4" style="color: white">
					<h5 style="color: white;">Actions</h5>
					<ol class="list1">
						<li><a style="font-size: 20px;" href="ahome.jsp">Home</a></li>
						<li><a style="font-size: 20px;" href="agentlist.jsp">Agent
								list</a></li>
						<li><a style="font-size: 20px;" href="policyholders.jsp">clients</a></li>
						<li><a class="active" style="font-size: 20px;"
							href="policylist.jsp">policy list</a></li>

						<li><a style="font-size: 20px;" href="newpolicy.jsp">new
								policy</a></li>

						<li><a style="font-size: 20px;" href="index.jsp">Logout</a></li>
					</ol>
				</article>
				<article class="span8 about-box">
					<div class="container">
						<div class="row">

							<article class="span8 form-box">
								<div>
									<br>
									<h5 style="margin-left: -70px; color: white">New Policy
										Form</h5>
									<form name="devreg" action="newPolicyAction" method="post"
										onsubmit="return reg()">
										<fieldset>

											<div class="form-div-3">
												<input placeholder="Policy Name:" name="name"> <br>
											</div>
											<div class="form-div-3">
												<input placeholder="Weekly Interest:" name="weekly">
												<br>
											</div>
											<div class="form-div-3">
												<input placeholder="Monthly Interest:" name="monthly">
												<br>
											</div>
											<div class="form-div-3">
												<input placeholder="Quarter Interest:" name="quarter">
												<br>
											</div>

											<div class="form-div-3">
												<input placeholder="Half-year Interest:" name="half">
												<br>
											</div>


											<div class="form-div-3">
												<input placeholder="Yearly Interest:" name="year"> <br>
											</div>
										</fieldset>
										<input type="submit" value="" class="btn btn-primary btn2"
											style="margin-left: 73px; width: 90px; background-image: url('img/sub.png')" />
									</form>
								</div>
							</article>
						</div>
					</div>
				</article>
			</div>
		</div>
		<div hidden class="met">
			Web Development: <a class="cop" href="http://www.metamorphozis.com">Free
				html5 Templates</a>
		</div>
	</div>
	<!--footer-->
	<footer>
		<div class="container">
			<div class="row">
				<article class="span12">
					<div class="row">
						<nav class="span6">
							<!--                        <ul>
                            <li><a href="thome.jsp">Home</a></li>
                            <li><a href="affix.jsp">Affix New Bug</a></li>
                            <li><a href="buganalyse.jsp">Analyse Bug Report</a></li>
                            <li><a href="feature1.jsp">Data Reduction FS</a></li>
                            <li class="active"><a href="ired.jsp">Data Reduction IS</a></li>
                            <li><a href="index.jsp">Logout</a></li>
                        </ul>-->
						</nav>
						<div class="span3 offset3">
							<!--                        <p>Company Name Here & copy; 2014 &bull; </p>-->
						</div>
					</div>
				</article>
			</div>
		</div>
	</footer>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script>
		$('.thumbnail figure a').hover(function() {
			$(this).stop().animate({
				opacity : 0.7
			}, 350, "easeOutSine");
		}, function() {
			$(this).stop().animate({
				opacity : 1
			}, 350, "easeOutSine");
		})
		$('.list1 li a').hover(function() {
			$(this).parent('li').stop().css({
				'color' : '#6b9157'
			});
			$(this).stop().css({
				'color' : '#6b9157'
			});
		}, function() {
			$(this).parent('li').stop().css({
				'color' : '#de592f'
			});
			$(this).stop().css({
				'color' : '#de592f'
			});
		})
	</script>
</body>

</html>