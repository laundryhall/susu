<?php
header('Access-Control-Allow-Origin: *');
header('Access-Control-Allow-Methods: GET, POST');
date_default_timezone_set('America/New_York');

$db = new PDO('mysql:host=us-cdbr-iron-east-02.cleardb.net;dbname=heroku_044365ba50ee2c5', 'b42b677fc15b1c', 'ba89aa3a');
$db->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
require_once('vendor/autoload.php');
try{
	
	$mc = new Memcached();
	$mc->setOption(Memcached::OPT_BINARY_PROTOCOL, true);
	$mc->addServers(array_map(function($server) { return explode(':', $server, 2); }, explode(',', 'pub-memcache-17137.us-east-1-1.1.ec2.garantiadata.com:17137')));
	$mc->setSaslAuthData('memcached-app41032108', 'SQfO9swsdFFAf9Lf');

//$mc->set('foo', 'bar');
//die($mc->get('foo'));


}catch(Exception $e){
	echo $e->getMessage();
}

try {
    \Stripe\Stripe::setApiKey("sk_test_Dza6Ffl40N5SMoWWNzCgQfkI");
} catch (stripe\Error\Base $e) {
  // Authentication with Stripe's API failed
  $error3 = $e->getMessage();
  echo $error3;
}

//die("fail");
$sid = "AC964534fb61c297bf127f4967aeabde63"; // Your Account SID from www.twilio.com/user/account
$token = "bdd9d5af9633326a2448d7f648f657c1"; // Your Auth Token from www.twilio.com/user/account

$client = new Services_Twilio($sid, $token);
//to set time zone for mysql server
$db->query('set @@session.time_zone = "-4:00"');

?>

<!DOCTYPE html>
<html lang="en">
<head>
  	<title>LAUNDER IT</title>
  	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="./css/themed.css" />
	<link rel="stylesheet" href="./css/jquery.mobile.icons.min.css" />
	<link rel="stylesheet" href="./css/jquery.mobile-1.4.5.min.css" />
	<!--<link rel="stylesheet" href="/jquery.mobile/jquery.mobile-1.4.5.min.css" /> -->
	<link rel="stylesheet" href="./css/myicons.min.css" />

	<!-- <link href="./css/timecircles.css" rel="stylesheet"> -->
	<script>
		/*$(document).bind(, function() {
		$.mobile.linkBindingEnabled = false;
		});*/
	</script>

	<script src="./js/jquery-1.11.3.min.js"></script>
	<script src="./js/jquery.mobile-1.4.5.min.js"></script>
	<!--<script src="./js/stripe_v1.js"></script>-->
	<script src="https://js.stripe.com/v2/"></script>
	<script src="./js/progressbar.js"></script>
	<!-- <script src="./js/timecircles.js"></script> -->
	<script src="./js/jquery.countdown.js"></script>
</head>
<body style = "height:100%;border-style:solid;border-width:0px;border-color:black;">
<!--
 <nav class="navbar navbar-inverse">
  <div class="container-fluid" style = 'text-shadow:none;'>
    <div class="navbar-header">
      <a class="navbar-brand" href="#">LAUNDER I.T.</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#">How it Works</a></li>
      <li><a href="#">Beta</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
      <li id = "pricing"><a href="#">Pricing</a></li>
      <li><a href="#">FAQs</a></li>
      <li><a href="#">Contact</a></li>
      <li><a href="#">Free Cleaning</a></li>
    </ul>
  </div>
</nav>
<div class="container-fluid" id = "frontpage">
  <h1>WELCOME TO LAUNDER I.T.</h1>
</div>
		
-->	
	<div data-role="page" id = "frontpage"  data-position="fixed" style = "height:100%;border-style:solid;border-color:black;border-width:0px;">
		<div data-role="header" data-theme = "b" style = "height:40%;">
			
			<div data-role="navbar" style = "text-align:center">
				<h1 onclick = "window.location.hash = '';location.reload();" >SUSU CARD</h1><p>THE ONLY COMMUNITY DISCOUNT CARD CUSTOMIZED FOR YOU</p>
				<ul>
					<li id = "hiw"><a href="#">Home </a></li>
					<li><a href="#" onclick = "window.location.hash = 'stayinformed'">How it works</a></li>
					<li id = "drivers"><a href="#" onclick = "window.location.hash = 'drive'">Save</a></li>
					<li id = ""><a href="#" onclick = "window.location.hash = 'pricing'">Share</a></li>
					<li id = ""><a href="#" onclick = "window.location.hash = 'share'">Contact Us</a></li>
      					
				</ul>
			</div>
		</div>
		<div data-role="main" class ="ui-content" data-theme = "a" id = "maindiv" style = 'padding:0;border-style:solid;border-color:red;border-width:0px;height:inherit;'>
			
			<div style = 'color:black;font-weight:bold;font-size:45px;text-align:center;width:100%;height:100%;background-size:100% 100%;");'>
				<br>
				<img src="conceptImage.png" style = "">
				<br>
				<p style = "vertical-align:middle;">THE ONLY COMMUNITY DISCOUNT CARD CUSTOMIZED FOR YOU</p>
				<br><br>			
			</div>
			
			
			<!--<p style = "vertical-align:middle;color:black;font-weight:bold;font-size:65px;text-align:center;">PICKUP AND DELIVERY FOR YOUR DRY CLEANING</p>-->
			
			<!--http://amsterdamtailor.com/wp-content/uploads/2016/07/corp-dry-cleaning-main.jpg-->
					<!--http://www.bizben.com/pictures/2251351.jpg-->
					<!--http://cdn.fabricrenewal.netdna-cdn.com/wp-content/uploads/2014/02/slide3.jpg-->
			<!--
			<table cellpadding = "0" style = 'margin:0;padding:0;width:100%;'>
				<tr>
					
					<td colspan = "2" style = 'text-align:center;width:100%;height:600px;background-size:100% 100%;background-image:url("http://cdn.fabricrenewal.netdna-cdn.com/wp-content/uploads/2014/02/slide3.jpg"); background-position:center;background-repeat:no-repeat'>
						<p style = "color:black;font-weight:bold;font-size:70px">Let us handle your dry cleaning</p>
					</td>
					<td>
					</td>
					<td rowspan = "3" style = "vertical-align:top;text-align:center;">
						
					</td>
				</tr>
				<tr>
					<td colspan = "2">
						
					</td>
					<td>
					</td>
					<td>
					</td>
				</tr>
			</table>
			-->
			<div id = "howitworks" name = "howitworks" style = "text-align:center;margin-left:15%;margin-right:15%;border-width:0px;border-color:black;border-style:solid;">
				<h1>How it Works</h1>
			<div>
			<div style = "margin-left:auto;margin-right:auto;border-width:0px;border-color:red;border-style:solid;">
				<div style = "float:left;width:33%;padding:0px;">
					<table>
						<tr>
							<td>
									<img src="http://protected-peak-28587.herokuapp.com/css/images/smartphone-call.svg" style = "width:20%;height:100px;" class="ui-li-icon ui-corner-none">
									<img src="http://protected-peak-28587.herokuapp.com/css/images/android-logo.svg" style = "width:20%;height:100px;" class="ui-li-icon ui-corner-none">
									<img src="http://protected-peak-28587.herokuapp.com/css/images/apple.svg" style = "width:20%;height:100px;" class="ui-li-icon ui-corner-none">
							</td>
						</tr>
						<tr>
							<td>
								<h2>Schedule a pickup</h2>
							</td>
						</tr>
						<tr>
							<td style = "padding:10px;">
								Download our app available on android and ios and Schedule a pickup and delivery window.
							</td>
						</tr>
					</table>
				</div>
				<div style = "border:0px solid black;width:33%;float:left;padding:0px;">
					<table style = "border:0px solid red;">
						<tr>
							<td>
									<img src="http://protected-peak-28587.herokuapp.com/css/images/blackcourier.svg" style = "width:20%;height:100px;" class="ui-li-icon ui-corner-none">
									
							</td>
						</tr>
						<tr>
							<td>
								<h2>Pickup</h2>
							</td>
						</tr>
						<tr>
							<td style = "padding:10px;">
								Our driver will arrive within your scheduled time to collect your garments.
							</td>
						</tr>
					</table>
				</div>
				<div style = "width:33%;float:left;">
					<table style = "border:0px solid red;padding:0px;">
						<tr>
							<td>
									<img src="http://protected-peak-28587.herokuapp.com/css/images/delivery-truck-with-circular-clock.svg" style = "width:20%;height:100px;" class="ui-li-icon ui-corner-none">
									
							</td>
						</tr>
						<tr>
							<td>
								<h2>Delivery</h2>
							</td>
						</tr>
						<tr>
							<td style = "padding:10px;">
								Your garments are professionally cleaned and delivered at your scheduled time.
							</td>
						</tr>
					</table>
				</div>
			</div><!-- /grid-b -->
			<div>
				<br>
				<h2 style = "margin-left:auto;margin-right:auto;">For the latest LAUNDER IT news, sign up below!</h2>
				<p class = "error_text" style = "color:red;"></p>
				<div data-role="fieldcontain" class = "ui-hide-label" data-theme = "b"  style = "margin-left:auto;margin-right:auto;">
    					<label for="fname">Text Input:</label>
    					<input type="text" name="fname" class="fname" value="" placeholder = "FIRST NAME (Required)" />
					<br>
					<label for="lname">Text Input:</label>
    					<input type="text" name="lname" class="lname" value="" placeholder = "LAST NAME (Required)" />
					<br>
					<label for="email">Text Input:</label>
    					<input type="email" name="ename" class="email" value="" placeholder = "EMAIL ADDRESS (Required)" />
					<br>
					<label for="phone_number">Text Input:</label>
    					<input type="text" name="phone_number" class="phone_number" value="" placeholder = "PHONE NUMBER (optional) 8041234567" />
					<br>
					<label for="zipcode">Text Input:</label>
    					<input type="text" name="zipcode" class="zipcode" value="" placeholder = "ZIP CODE (Required) 12345" />
					<br>
					<label for="isubscribe">Text Input:</label>
    					<input type="button" data-theme = "b" name="isubscribe" class="isubscribe" value="Subscribe" />
				</div>
			</div>
				<!--
			<table cellpadding = "0" style = "margin-left:auto;margin-right:auto;border-width:2px;border-color:black;border-style:solid;">
							<tr>
								<td colspan = "3">
									<h1>How It Works</h1>
								</td>
							</tr>
							<tr>
								<td>
								</td>
								<td>
								</td>
								<td>
								</td>
							</tr>
							<tr>
								<td>
								</td>
								<td>
								</td>
								<td>
								</td>
							</tr>
							
						</table>
				-->
		</div>
		<div data-role="footer" data-theme = "b" style = "border-style:solid;border-color:red;border-width:0px;">
		<!--
			<div data-role="navbar"  >
		<ul>
			<li><a href="#signup1">Sign Up</a></li>
			<li><a href="#" id = "login">Login</a></li>
		</ul>
			</div>
			<h1>&copy; LAUNDER I.T. 2017</h1>
		-->
		</div>
	</div>

		

</body>
</html>
<script>
	var isMobile = {
    Android: function() {
        return navigator.userAgent.match(/Android/i);
    },
    BlackBerry: function() {
        return navigator.userAgent.match(/BlackBerry/i);
    },
    iOS: function() {
        return navigator.userAgent.match(/iPhone|iPad|iPod/i);
    },
    Opera: function() {
        return navigator.userAgent.match(/Opera Mini/i);
    },
    Windows: function() {
        return navigator.userAgent.match(/IEMobile/i);
    },
    any: function() {
        return (isMobile.Android() || isMobile.BlackBerry() || isMobile.iOS() || isMobile.Opera() || isMobile.Windows());
    }
};
	if(isMobile.any()){	
				$("#howitworks").html('<div id = "howitworks" name = "howitworks" style = "text-align:center;margin-left:auto;margin-right:auto;border-width:0px;border-color:black;border-style:solid;"><h1>How it Works</h1><div><div style = "<div style = "width:100%;padding:0px;margin-left:auto;margin:right:auto;"><table><tr><td><img src="http://protected-peak-28587.herokuapp.com/css/images/smartphone-call.svg" style = "width:20%;height:100px;" class="ui-li-icon ui-corner-none"><img src="http://protected-peak-28587.herokuapp.com/css/images/android-logo.svg" style = "width:20%;height:100px;" class="ui-li-icon ui-corner-none"><img src="http://protected-peak-28587.herokuapp.com/css/images/apple.svg" style = "width:20%;height:100px;" class="ui-li-icon ui-corner-none"></td></tr><tr><td><h2>Start</h2></td></tr><tr><td>Download our app available on android and ios and Schedule a pickup and delivery window.</td></tr></table></div><div style = "border:0px solid black;width:100%;padding:0px;margin-left:auto;margin:right:auto;"><table style = "border:0px solid red;"><tr><td><img src="http://protected-peak-28587.herokuapp.com/css/images/blackcourier.svg" style = "width:20%;height:100px;" class="ui-li-icon ui-corner-none"></td></tr><tr><td><h2>Pickup</h2></td></tr><tr><td>Our driver will arrive within your scheduled time to collect your garments.</td></tr></table></div><div style = "width:100%;margin-left:auto;margin:right:auto;"><table style = "border:0px solid red;padding:0px;"><tr><td><img src="http://protected-peak-28587.herokuapp.com/css/images/delivery-truck-with-circular-clock.svg" style = "width:20%;height:100px;" class="ui-li-icon ui-corner-none"></td></tr><tr><td><h2>Delivery</h2></td></tr><tr><td>Your garments are professionally cleaned and delivered at your scheduled time.</td></tr></table></div><div><br><h2 style = "margin-left:auto;margin-right:auto;">For the latest LAUNDER IT news, sign up below!</h2><p class = "error_text" style = "color:red;"></p><div data-role="fieldcontain" class = "ui-hide-label" data-theme = "b" style = "width:100%;margin-left:auto;margin-right:auto;"> <label for="fname">Text Input:</label> <input type="text" name="fname" class="fname" value="" placeholder = "FIRST NAME (Required)" /><br><label for="lname">Text Input:</label> <input type="text" name="lname" class="lname" value="" placeholder = "LAST NAME (Required)" /><br><label for="email">Text Input:</label> <input type="email" name="ename" class="email" value="" placeholder = "EMAIL ADDRESS (Required)" /><br><label for="phone_number">Text Input:</label> <input type="text" name="phone_number" class="phone_number" value="" placeholder = "PHONE NUMBER (optional) 8041234567" /><br><label for="zipcode">Text Input:</label> <input type="text" name="zipcode" class="zipcode" value="" placeholder = "ZIP CODE (Required) 12345" /><br><label for="isubscribe">Text Input:</label> <input type="button" data-theme = "b" name="isubscribe" class="isubscribe" value="Subscribe" /></div></div>');
				}else{
					//alert('Not Mobile');
			}
		window.onhashchange = locationHashChanged; 

		if(window.localStorage.getItem("hiw") === "TRUE") {  
				try{
					/*
					$(window).on( "beforeunload", function() {
					
						$(document).scrollTop( $("#howitworks").offset().top );	
						window.localStorage.removeItem("hiw");	
						//alert("how check");
					});
					*/
					window.onload = function() {
 						setTimeout (function () {
						$(document).scrollTop( $("#howitworks").offset().top );	
						window.localStorage.removeItem("hiw");


 					}, 50); //100ms for example
				}
					
				
				}catch(err){
				alert(err.message);
				}
		}
		function locationHashChanged() {  
				//alert('change check');
  			if (location.hash === "#stayinformed") {  
    				//alert('Stay Informed');  
				try{
    					$.post("https://protected-peak-28587.herokuapp.com/results.php",
					{
						stayinformed: "true"
					
					},
					function(data, status){
						
						//alert(data);
						
						
						$("#maindiv").html(data).enhanceWithin();
						
							
					});  
					}catch(err){
						alert(err.message);
					}
  			}else if(location.hash === "#pricing") {  
				//alert('pricing');
				try{
    					$.post("https://protected-peak-28587.herokuapp.com/results.php",
					{
						prices: "true"
					
					},
					function(data, status){
						
						//alert(data);
						
						
						$("#maindiv").html(data).enhanceWithin();
						
							
					});  
					}catch(err){
						alert(err.message);
					}
  			}else if(location.hash === "#FAQs") {  
				try{
					$.post("https://protected-peak-28587.herokuapp.com/results.php",
					{
						faqs: "true"
					
					},
					function(data, status){
						
						//alert(data);
						
						
						$("#maindiv").html(data).enhanceWithin();
						
							
					});
				
				}catch(err){
				alert(err.message);
				}
			}else if(location.hash === "#contact") {  
				try{
					$.post("https://protected-peak-28587.herokuapp.com/results.php",
					{
						contact: "true"
					
					},
					function(data, status){
						
						//alert(data);
						
						
						$("#maindiv").html(data).enhanceWithin();
						
							
					});
				
				}catch(err){
				alert(err.message);
				}
			}else if(location.hash === "#drive") {  
				try{
					$.post("https://protected-peak-28587.herokuapp.com/results.php",
					{
						drive: "true"
					
					},
					function(data, status){
						
						//alert(data);
						
						
						$("#maindiv").html(data).enhanceWithin();
						
							
					});
				
				}catch(err){
				alert(err.message);
				}
			}else if(location.hash === "#driver_referals") {  
				try{
					$.post("https://protected-peak-28587.herokuapp.com/results.php",
					{
						driver_referals: "true"
					
					},
					function(data, status){
						
						//alert(data);
						
						
						$("#maindiv").html(data).enhanceWithin();
						
							
					});
				
				}catch(err){
				alert(err.message);
				}
			}
		}	
		locationHashChanged();
		$(window).on('popstate', function(event) {
 			if(location.hash === "") {
				location.reload();
			}
		});	
	$(".isubscribe").on("click", function (e) {
				function pricing_btn(){
				//alert("check1");
				//$(this).attr("class", "active");
				//alert($("#address_id").val());
				//$(this).css('background-color', 'white');
				if (!$(this).hasClass('active')) {
    					$(this).addClass('active');
  				}
				$(this).attr('class','active')
				//alert($(this).attr('class'));
  				e.preventDefault();
				try{
					$.post("https://protected-peak-28587.herokuapp.com/results.php",
					{
						fname: $('.fname').val(),
						lname: $('.lname').val(),
						email: $('.email').val(),
						phone_number: $('.phone_number').val(),
						zipcode: $('.zipcode').val()
						
					
					},
					function(data, status){
						
						//alert(data);
						$resp = data.split("_");
						if($resp[0] == 'fail'){
						$("#error_text").html($resp[1]).enhanceWithin();
						}else if ($resp[0] == 'success'){
							$('.fname').val("");
							$('.lname').val("");
							$('.email').val("");
							$('.phone_number').val("");
							$('.zipcode').val("");
							$(".error_text").html("<p style = 'color:green;'>Thanks for subscribing. We will keep you posted of any updates!</p>").enhanceWithin();
						}else if ($resp[0] == 'query fail'){
							alert(data);
						}
							
					});
				
				}catch(err){
				alert(err.message);
				}
				}
				if(isMobile.any()){	
				pricing_btn();
				window.plugins.sslCertificateChecker.check(
					noshow_btn,
					checkError,
          				server,
          				fingerprint);
				}else{
					pricing_btn();
				}
			});
	
	$("#pricing").on("click", function (e) {
				/*
				function pricing_btn(){
				//alert("check1");
				//$(this).attr("class", "active");
				//alert($("#address_id").val());
				//$(this).css('background-color', 'white');
				if (!$(this).hasClass('active')) {
    					$(this).addClass('active');
  				}
				$(this).attr('class','active')
				//alert($(this).attr('class'));
  				e.preventDefault();
				try{
					$.post("https://protected-peak-28587.herokuapp.com/results.php",
					{
						prices: "true"
					
					},
					function(data, status){
						
						//alert(data);
						
						
						$("#maindiv").html(data).enhanceWithin();
						
							
					});
				
				}catch(err){
				alert(err.message);
				}
				}
				if(isMobile.any()){	
				pricing_btn();
				window.plugins.sslCertificateChecker.check(
					noshow_btn,
					checkError,
          				server,
          				fingerprint);
				}else{
					pricing_btn();
				}
				*/
			});

			$("#hiw").on("click", function (e) {
				try{
    					$.post("https://protected-peak-28587.herokuapp.com/results.php",
					{
						hiw: "true"
					
					},
					function(data, status){
						
						//alert(data);
						
						
						$("#maindiv").html(data).enhanceWithin();
						
							
					});  
					}catch(err){
						alert(err.message);
					}
			});

			$("#faqs").on("click", function (e) {
				/*
				function faqs_btn(){
				//alert("check1");
				//$(this).attr("class", "active");
				//alert($("#address_id").val());
				//$(this).css('background-color', 'white');
				if (!$(this).hasClass('active')) {
    					$(this).addClass('active');
  				}
				//$(this).attr('class','active')
				//alert($(this).attr('class'));
  				e.preventDefault();
				try{
					$.post("https://protected-peak-28587.herokuapp.com/results.php",
					{
						faqs: "true"
					
					},
					function(data, status){
						
						//alert(data);
						
						
						$("#maindiv").html(data).enhanceWithin();
						
							
					});
				
				}catch(err){
				alert(err.message);
				}
				}
				if(isMobile.any()){	
				faqs_btn();
				window.plugins.sslCertificateChecker.check(
					noshow_btn,
					checkError,
          				server,
          				fingerprint);
				}else{
					faqs_btn();
				}
				 */
			});
</script>

