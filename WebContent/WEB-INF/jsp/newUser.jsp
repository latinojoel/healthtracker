<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Health Tracker | </title>

    <!-- Bootstrap core CSS -->

    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">

    <link href="<c:url value="/resources/fonts/css/font-awesome.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/animate.min.css" />" rel="stylesheet">

    <!-- Custom styling plus plugins -->
    <link href="<c:url value="/resources/css/custom.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/icheck/flat/green.css" />" rel="stylesheet">


    <script src="<c:url value="/resources/js/jquery.min.js" />"></script>


</head>

<body style="background:#F7F7F7;">
    
    <div class="">
        <a class="hiddenanchor" id="toregister"></a>
        <a class="hiddenanchor" id="tologin"></a>

        <div id="wrapper">
            <div id="login" class="animate form">
                <section class="login_content">
                    
					<form:form method="POST" modelAttribute="user" class="form-horizontal">
				
                        <h1>New User</h1>
                        
						<div class="row">
							<div class="form-group col-md-12">
								<label class="col-md-3 control-lable" for="firstName">First Name</label>
								<div class="col-md-7">
									<form:input type="text" path="firstName" id="firstName" class="form-control input-sm"/>
									<div class="has-error">
										<form:errors path="firstName" class="help-inline"/>
									</div>
								</div>
							</div>
						</div>
				
						<div class="row">
							<div class="form-group col-md-12">
								<label class="col-md-3 control-lable" for="lastName">Last Name</label>
								<div class="col-md-7">
									<form:input type="text" path="lastName" id="lastName" class="form-control input-sm"/>
									<div class="has-error">
										<form:errors path="lastName" class="help-inline"/>
									</div>
								</div>
							</div>
						</div>
				
						<div class="row">
							<div class="form-group col-md-12">
								<label class="col-md-3 control-lable" for="email">Email</label>
								<div class="col-md-7">
									<form:input type="text" path="email" id="email" class="form-control input-sm"/>
									<div class="has-error">
										<form:errors path="email" class="help-inline"/>
									</div>
								</div>
							</div>
						</div>
				
						<div class="row">
							<div class="form-group col-md-12">
								<label class="col-md-3 control-lable" for="password">Password</label>
								<div class="col-md-7">
									<form:input type="password" path="password" id="password" class="form-control input-sm"/>
									<div class="has-error">
										<form:errors path="password" class="help-inline"/>
									</div>
								</div>
							</div>
						</div>
				
						<div class="row">
							<div class="form-actions floatRight">
								<input class="btn btn-default submit" name="submit" type="submit" value="Register">
								<a class="btn" style="margin: 0px;" href="<c:url value='/' />">Cancel</a>
							</div>
						</div>
                        <div class="clearfix"></div>
                        <div class="separator">
                            <div class="clearfix"></div>
                            <br />
                            <div>
                                <h1><i class="fa fa-plus" style="font-size: 26px;"></i> Health Tracker!</h1>

                                <p>©2016 All Rights Reserved.</p>
                            </div>
                        </div>
					</form:form>
                    <!-- form -->
                </section>
                <!-- content -->
            </div>
        </div>
    </div>

</body>

</html>
