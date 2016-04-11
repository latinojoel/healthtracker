<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Health Tracker! |</title>

<!-- Bootstrap core CSS -->

<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">

<link href="<c:url value="/resources/fonts/css/font-awesome.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/animate.min.css" />"
	rel="stylesheet">

<!-- Custom styling plus plugins -->
<link href="<c:url value="/resources/css/custom.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/icheck/flat/green.css" />"
	rel="stylesheet" />
<link href="<c:url value="/resources/css/floatexamples.css" />"
	rel="stylesheet" type="text/css" />

<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/nprogress.js" />"></script>
<script>
	NProgress.start();
</script>


</head>


<body class="nav-md">

	<div class="container body">


		<div class="main_container">

			<div class="col-md-3 left_col">
				<div class="left_col scroll-view">

					<div class="navbar nav_title" style="border: 0;">
						<a href="index.html" class="site_title"><i class="fa fa-plus"
							style="border: none;"></i> <span>Health Tracker!</span></a>
					</div>
					<div class="clearfix"></div>

					<!-- menu prile quick info -->
					<!-- <div class="profile">
                        <div class="profile_info">
                            <span>Welcome,</span>
                            <h2>${pageContext.request.userPrincipal.name}</h2>
                        </div>
                    </div>-->
					<!-- /menu prile quick info -->

					<br />

					<!-- sidebar menu -->
					<div id="sidebar-menu"
						class="main_menu_side hidden-print main_menu">

						<div class="menu_section">
							<h3>General</h3>
							<ul class="nav side-menu">
								<li><a><i class="fa fa-home"></i> Home <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu" style="display: none">
										<li><a href="<c:url value="registerHypertension" />">Register
												Hypertension</a></li>
										<li><a href="<c:url value="/app/listHypertension" />">List
												Hypertension</a></li>
									</ul></li>
							</ul>
						</div>

					</div>
					<!-- /sidebar menu -->

					<!-- /menu footer buttons -->
					<div class="sidebar-footer hidden-small">
						<a data-toggle="tooltip" data-placement="top" title="Logout"
							href="/logout"> <span class="glyphicon glyphicon-off"
							aria-hidden="true"></span>
						</a>
					</div>
					<!-- /menu footer buttons -->
				</div>
			</div>

			<!-- top navigation -->
			<div class="top_nav">

				<div class="nav_menu">
					<nav class="" role="navigation">
						<div class="nav toggle">
							<a id="menu_toggle"><i class="fa fa-bars"></i></a>
						</div>

						<ul class="nav navbar-nav navbar-right">
							<li class=""><a href="javascript:;"
								class="user-profile dropdown-toggle" data-toggle="dropdown"
								aria-expanded="false"> <!-- <img src="images/img.jpg" alt="">-->${user.firstName}
									${user.lastName} <span class=" fa fa-angle-down"></span>
							</a>
								<ul
									class="dropdown-menu dropdown-usermenu animated fadeInDown pull-right">
									<li><a href="#"><i class="fa fa-sign-out pull-right"></i>
											Log Out</a></li>
								</ul></li>

						</ul>
					</nav>
				</div>

			</div>
			<!-- /top navigation -->


			<!-- page content -->
			<div class="right_col" role="main">





				<!-- footer content -->

				<footer>
					<div class="">
						<p class="pull-right">
							<!--Gentelella Alela! a Bootstrap 3 template by <a href="https://colorlib.com">Colorlib</a>.-->
							| <span class="lead"> <i class="fa fa-plus"></i> Health
								Tracker!
							</span>
						</p>
					</div>
					<div class="clearfix"></div>
				</footer>
				<!-- /footer content -->
			</div>
			<!-- /page content -->

		</div>

	</div>

	<div id="custom_notifications" class="custom-notifications dsp_none">
		<ul class="list-unstyled notifications clearfix"
			data-tabbed_notifications="notif-group">
		</ul>
		<div class="clearfix"></div>
		<div id="notif-group" class="tabbed_notifications"></div>
	</div>

	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

	<!-- bootstrap progress js -->
	<script
		src="<c:url value="/resources/js/progressbar/bootstrap-progressbar.min.js" />"></script>
	<script
		src="<c:url value="/resources/js/nicescroll/jquery.nicescroll.min.js" />"></script>


	<script src="<c:url value="/resources/js/custom.js" />"></script>


	<script>
		NProgress.done();
	</script>
	<!-- /datepicker -->
	<!-- /footer content -->
</body>


</html>
