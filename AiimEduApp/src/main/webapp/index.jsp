<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<title>Aiim Registration</title>
<script
	src="https://www.google.com/recaptcha/api.js?onload=vcRecaptchaApiLoaded&render=explicit"
	async defer></script>

<style type="text/css">
form.submitted  input.ng-invalid,form.submitted  select.ng-invalid {
	border: 2px red solid;
}

.gridStyle {
	border: 1px solid rgb(212, 212, 212);
	width: 100%;
	height: 1000px;
}

.field-error {
	color: #ff0039 !important;
	font-weight: bold
}

.control-label.required:after {
	content: " *";
	color: red;
	font-weight: bold;
}

.username.ng-valid {
	background-color: lightgreen;
}

.username.ng-dirty.ng-invalid-required {
	background-color: red;
}

.username.ng-dirty.ng-invalid-minlength {
	background-color: yellow;
}

.email.ng-valid {
	background-color: lightgreen;
}

.email.ng-dirty.ng-invalid-required {
	background-color: red;
}

.email.ng-dirty.ng-invalid-email {
	background-color: yellow;
}

.monthTxt {
	display: inline !important;
	max-width: 8em !important;
}

.monthYr {
	display: inline !important;
	max-width: 15em !important;
}
</style>

<link href="<c:url value='/static/css/bootstrap.min.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/bootstrap-theme.min.css' />"
	rel="stylesheet"></link>


<link href="<c:url value='/static/css/ui-grid.css' />" rel="stylesheet"></link>


<link href="<c:url value='/static/css/style.css' />" rel="stylesheet"></link>

<link href="<c:url value='/static/css/app.css?id=v13' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/angular-material.min.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/print.css?id=v13'  />"
	rel="stylesheet" type="text/css" media="print"></link>

</head>
<body ng-app="myApp" class="ng-cloak">





	<div class="container-fluid">

		<header class="no-print">
			<div class="container logo_section">
				<img src="images/logo.jpg" alt="adani Aiim" />
			</div>
			<div class="container-fluid adani_bck">
				<div class="container adani_title">Adani Institute of
					Infrastructure Management</div>
			</div>
		</header>



		<div id="main">

			<!-- angular templating -->
			<!-- this is where content will be injected -->
			<div ng-view autoscroll="true"></div>

		</div>




		<footer class="container-fluid footer_black no-print">
			<div class="container">
				<img src="images/logo.jpg" />
			</div>
		</footer>

	</div>

	<script src="<c:url value='/static/js/jquery-1.11.3.min.js' />"></script>
	<script src="<c:url value='/static/js/jquery.validate.js' />"></script>

	<script src="<c:url value='/static/js/angular.js' />"></script>
	<script src="<c:url value='/static/js/angular-route.js' />"></script>
	<script src="<c:url value='/static/js/angular-animate.js' />"></script>
	<script src="<c:url value='/static/js/ui-bootstrap-tpls-0.14.3.js' />"></script>
	<script src="<c:url value='/static/js/angular-animate.js' />"></script>
	<script src="<c:url value='/static/js/app.js?id=v13' />"></script>
	<script src="<c:url value='/static/js/directive.js' />"></script>
	<script src="<c:url value='/static/js/jquery.blockUI.js' />"></script>
	<script src="<c:url value='/static/js/ui-grid.js' />"></script>
	<script
		src="<c:url value='/static/js/service/user_service.js?id=v13' />"></script>
	<script
		src="<c:url value='/static/js/service/register_service.js?id=v13' />"></script>
	<script
		src="<c:url value='/static/js/controller/user_controller.js?id=v13' />"></script>
	<script src="<c:url value='/static/js/ng-file-upload.min.js' />"></script>
	<script src="<c:url value='/static/js/ng-file-upload-shim.js' />"></script>
	<script src="<c:url value='/static/js/angular-base64.min.js' />"></script>
	<script
		src="<c:url value='/static/js/controller/admin_controller.js?id=v13' />"></script>
	<script src="<c:url value='/static/js/ui-bootstrap-tpls-0.14.3.js' />"></script>

	<script src="<c:url value='/static/js/angular-recaptcha.js' />"></script>


	<script>


$( document ).ready(function() {
    $("a").on('click',  function(event){
	
		$( "form" ).addClass( "submitted" );

});
});
</script>
</body>
</html>