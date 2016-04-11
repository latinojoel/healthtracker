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
                    <form action="<c:url value='/recoveryAccess' />" method='POST'>
                        <h1>Recovery Access</h1>
                        <div>
                            <input type="text" name="username" class="form-control" placeholder="Username" required="" />
                        </div>
                        
						<div class="row">
							<div class="form-actions floatRight">
								<input class="btn btn-default submit" name="submit" type="submit" value="Reset">
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
                    </form>
                    <!-- form -->
                </section>
                <!-- content -->
            </div>
        </div>
    </div>

</body>

</html>