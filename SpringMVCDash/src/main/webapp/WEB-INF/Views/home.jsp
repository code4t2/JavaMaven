<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
<head>


<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Starter Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link href="/SpringMVCDash/css/bootstrap/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link href="/SpringMVCDash/css/starter-template.css" rel="stylesheet"
	type="text/css" />

<!-- Custom styles for this template -->

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="../../assets/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<!-- CHARTIST BITS -->
<script type="text/javascript"
	src="/SpringMVCDash/js/chartist/chartist.js">
	
</script>
<link href="/SpringMVCDash/css/chartist/chartist.min.css"
	rel="stylesheet" type="text/css" />

</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Project name</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
					<li><a href="#contact">Contact</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>

	<div class="container">

		<div class="starter-template">
			<div class="container" role="main">
				<div class="row">
					<div class="col-md-6">
						<h4>iOS Status summary</h4>
						<div class="ct-chart ct-perfect-fourth" id="iossummary"></div>
					</div>
					<div class="col-md-6">
						<h4>Pie 2</h4>
						<div class="ct-chart ct-perfect-fourth" id="cvsummary"></div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<h4>Summary</h4>
						<div class="clusterize">
							<table>
								<thead></thead>
							</table>
							<div id="scrollArea" class="clusterize-scroll">
								<table>
									<tbody id="contentArea" class="clusterize-content">
										<tr class="clusterize-no-data">
											<td>Loading data…</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
	<!-- /.container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script type="text/javascript"
		src="/SpringMVCDash/js/bootstrap/bootstrap.js">
		
	</script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script type="text/javascript">
		var dataios = {
			labels : [ 'Critical', 'Warning', 'Normal' ],
			series : [ 5, 15, 60 ]
		};

		var optionsios = {
			labelInterpolationFnc : function(value) {
				return value[0]
			}
		};

		var responsiveOptionsios = [ [ 'screen and (min-width: 640px)', {
			chartPadding : 30,
			labelOffset : 100,
			labelDirection : 'explode',
			labelInterpolationFnc : function(value) {
				return value;
			}
		} ], [ 'screen and (min-width: 1024px)', {
			labelOffset : 80,
			chartPadding : 20
		} ] ];

		var datacv = {
			labels : [ 'Critical', 'Warning', 'Normal' ],
			series : [ 10, 30, 60 ]
		};

		var optionscv = {
			labelInterpolationFnc : function(value) {
				return value[0]
			}
		};

		var responsiveOptionscv = [ [ 'screen and (min-width: 640px)', {
			chartPadding : 30,
			labelOffset : 100,
			labelDirection : 'explode',
			labelInterpolationFnc : function(value) {
				return value;
			}
		} ], [ 'screen and (min-width: 1024px)', {
			labelOffset : 80,
			chartPadding : 20
		} ] ];

		new Chartist.Pie('#iossummary', dataios, optionsios,
				responsiveOptionsios);
		new Chartist.Pie('#cvsummary', datacv, optionscv, responsiveOptionscv);

		var data = ['<tr><td>Row1</td></tr>', '<tr><td>Row2</td></tr>'];
		var clusterize = new Clusterize({
		  rows: data,
		  scrollId: 'scrollArea',
		  contentId: 'contentArea'
		});
	</script>
</body>
</html>
