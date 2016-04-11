<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
                    <form action="<c:url value='/login' />" method='POST'>
                        <h1>Login</h1>
                        <div>
                            <input type="text" name="username" class="form-control" placeholder="Username" required="" />
                        </div>
                        <div>
                            <input type="password" name="password" class="form-control" placeholder="Password" required="" />
                        </div>
                        
		  				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			
                        <div>
                        	<input class="btn btn-default submit" name="submit" type="submit" value="Log in" />
                            <a class="reset_pass" href="<c:url value='/recoveryAccess' />">Lost your password?</a>
                        </div>
                        <div class="clearfix"></div>
                        <div class="separator">

                            <p class="change_link">New to site?
                                <a href="<c:url value='/newUser' />" class="to_register"> Create Account </a>
                            </p>
                            <div class="clearfix"></div>
                            <br />
                            <div>
                                <h1><i class="fa fa-plus" style="font-size: 26px;"></i> Health Tracker!</h1>

                                <p>©2016 All Rights Reserved.</p>
                            </div>
                        </div>
                    </form>
                    <!-- form -->
                </section>
                <!-- content -->
            </div>
        </div>
    </div>

</body>

</html>