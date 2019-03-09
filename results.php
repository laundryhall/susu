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

function send_email($email, &$response = null, &$http_code = null) {
    $json = json_encode(array(
        'From' => $email['from'],
        'To' => $email['to'],
        'Cc' => $email['cc'],
        'Bcc' => $email['bcc'],
        'Subject' => $email['subject'],
        'Tag' => $email['tag'],
        'HtmlBody' => $email['html_body'],
        'TextBody' => $email['text_body'],
        'ReplyTo' => $email['reply_to'],
        'Headers' => $email['headers'],
        'Attachments' => $email['attachments']
    ));
    $ch = curl_init();
    curl_setopt($ch, CURLOPT_URL, 'https://api.postmarkapp.com/email');
    curl_setopt($ch, CURLOPT_POST, true);
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
    curl_setopt($ch, CURLOPT_HTTPHEADER, array(
        'Accept: application/json',
        'Content-Type: application/json',
        'X-Postmark-Server-Token: db1f9e7f-923d-4e31-ab3a-e05afde5c2c0'
    ));
    curl_setopt($ch, CURLOPT_POSTFIELDS, $json);
    $response = json_decode(curl_exec($ch), true);
    $http_code = curl_getinfo($ch, CURLINFO_HTTP_CODE);
    curl_close($ch);
    return $http_code === 200;
}

function sanitize($data) {
$data = strip_tags(trim($data));
$search = array('/[^A-Za-z0-9\. -\!\?\(\)\<\>\@]/');
$data = preg_replace($search, '', $data);
return $data;
}

//to set time zone for mysql server
$db->query('set @@session.time_zone = "-4:00"');
	if(isset($_POST['save'])){
		//die("conn made");
		echo("conn made selb");
		$auth = rawurlencode("email=api@instantcard.net&password=instantcardapitest");
		/*
		$auth = json_encode(array(
		        'email' => urlencode("api@instantcard.net"),
		        'password' => "instantcardapitest"
   		 ));
		 */

		$ch = curl_init();
    		curl_setopt($ch, CURLOPT_URL, 'https://core.instantcard.net/api/v2/authenticate');
		curl_setopt($ch, CURLOPT_POST, true);
		curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
		curl_setopt($ch, CURLOPT_HTTPHEADER, array(
		        'cache-control: no-cache'
	    	));
	        curl_setopt($ch, CURLOPT_POSTFIELDS, rawurlencode("email=api@instantcard.net&password=instantcardapitest"));
	        $response = curl_exec($ch);
	        echo($response);
	        //$http_code = curl_getinfo($ch, CURLINFO_HTTP_CODE);
	        curl_close($ch);
		/*
		$request = new HttpRequest();
		$request->setUrl('https://core.instantcard.net/api/v2/authenticate');
		$request->setMethod(HTTP_METH_POST);

		$request->setQueryData(array(
		  'email' => 'api@instantcard.net',
		  'password' => 'instantcardapi'
		));

		$request->setHeaders(array(
		  'postman-token' => 'db5da708-6377-de27-e2e5-bd1c44c683e1',
		  'cache-control' => 'no-cache'
		));

		try {
		  $response = $request->send();

		  echo $response->getBody();
		} catch (HttpException $ex) {
		  echo $ex;
		}
		 */

	}
	if(isset($_POST['hiw'])){
		echo('
			
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
			<script>
				
			</script>
					
			
			
			
		');
		die("
			<script>
			if(isMobile.any()){	
				$('#howitworks').html('<div id = ".'"howitworks"'." name = ".'"howitworks"'." style = ".'"text-align:center;margin-left:auto;margin-right:auto;border-width:0px;border-color:black;border-style:solid;"'."><h1>How it Works</h1><div><div style = ".'"<div style = "width:100%;padding:0px;margin-left:auto;margin:right:auto;"'."><table><tr><td><img src=".'"http://protected-peak-28587.herokuapp.com/css/images/smartphone-call.svg"'." style = ".'"width:20%;height:100px;"'." class=".'"ui-li-icon ui-corner-none"'."><img src=".'"http://protected-peak-28587.herokuapp.com/css/images/android-logo.svg"'." style = ".'"width:20%;height:100px;"'." class=".'"ui-li-icon ui-corner-none"'."><img src=".'"http://protected-peak-28587.herokuapp.com/css/images/apple.svg"'." style = ".'"width:20%;height:100px;"'." class=".'"ui-li-icon ui-corner-none"'."></td></tr><tr><td><h2>Start</h2></td></tr><tr><td>Download our app available on android and ios and Schedule a pickup and delivery window.</td></tr></table></div><div style = ".'"border:0px solid black;width:100%;padding:0px;margin-left:auto;margin:right:auto;"'."><table style = ".'"border:0px solid red;"'."><tr><td><img src=".'"http://protected-peak-28587.herokuapp.com/css/images/blackcourier.svg"'." style = ".'"width:20%;height:100px;"'." class=".'"ui-li-icon ui-corner-none"'."></td></tr><tr><td><h2>Pickup</h2></td></tr><tr><td>Our driver will arrive within your scheduled time to collect your garments.</td></tr></table></div><div style = ".'"width:100%;margin-left:auto;margin:right:auto;"'."><table style = ".'"border:0px solid red;padding:0px;"'."><tr><td><img src=".'"http://protected-peak-28587.herokuapp.com/css/images/delivery-truck-with-circular-clock.svg"'." style = ".'"width:20%;height:100px;"'." class=".'"ui-li-icon ui-corner-none"'."></td></tr><tr><td><h2>Delivery</h2></td></tr><tr><td>Your garments are professionally cleaned and delivered at your scheduled time.</td></tr></table></div>');
				}else{
					//alert('Not Mobile');
			}	
			</script>
	
		");
	}
	if(isset($_POST['driver_referals'])){
		$plsth = $db->prepare("select direct_commission, indirect_commission from prices limit 1");
		$plsth->execute();
		$plresult = $plsth->fetchALL(PDO::FETCH_ASSOC);
		$direct_commission = ($plresult[0]['direct_commission']*100);
		$indirect_commission = ($plresult[0]['indirect_commission']*100);
		die('
			<h1 style = "width:100%;margin-left:20%;">DRIVER REFERAL REWARDS PROGRAM</h1>
			<div>
			<table style = "width:80%;margin-left:20%;">	
			<tr >
			<td colspan = "2" style = "width:100%;" hidden id = "mdiagram">
				<img src="http://protected-peak-28587.herokuapp.com/css/images/human-links-with-dollar-currency.svg" style = "width:80%;height:80%;" class="ui-li-icon ui-corner-none">
			</td>
			</tr>
			<tr>
			<td style = "width:40%;" id = "breakdown">
			<p>LAUNDER IT understands that drivers play a vital role in bringing in customers. In order to properly compensate drivers, we have developed a Referal Rewards Program* for drivers that complete 10 pickups or deliveries a month.</p>
			<h3>Driver Rewards</h4>
			<ul>
				<li>
					Share your LAUNDER IT invitation code.
				</li>
				<br>
				<li>
					For every customer that you refer that uses your code, you will receive '.$direct_commission.'% of the net revenue after cleaner fees EVERY TIME that customer orders.<br>
				</li>
				<br>
				<li>
					In additon, for every customer that customer refers, you will receive '.$indirect_commission.'% of the net revenue after cleaner fees EVERY TIME that customer orders.
				</li>
			</ul>
			</td>
			<td style = "vertical-align:center;" id = "diagram">
				<img src="http://protected-peak-28587.herokuapp.com/css/images/human-links-with-dollar-currency.svg" style = "width:80%;height:80%;" class="ui-li-icon ui-corner-none">
			</td>
			</tr>
			</table>
			</div>
			<script>
				if(isMobile.any()){	
					$("#diagram").hide();
					$("#mdiagram").show();
					$("#breakdown").attr( "width", "90%");

				}

			</script>
			
			
		');

	}
	if(isset($_POST['drive'])){
		$body = '<div style = "width:100%;padding:0px;margin-left:auto;margin:right:auto;"><table><tr><td><img src="http://protected-peak-28587.herokuapp.com/css/images/smartphone-call.svg" style = "width:20%;height:100px;" class="ui-li-icon ui-corner-none"><img src="http://protected-peak-28587.herokuapp.com/css/images/android-logo.svg" style = "width:20%;height:100px;" class="ui-li-icon ui-corner-none"><img src="http://protected-peak-28587.herokuapp.com/css/images/apple.svg" style = "width:20%;height:100px;" class="ui-li-icon ui-corner-none"></td></tr><tr><td><h2>Start</h2></td></tr><tr><td>Download our app available on android and ios and Schedule a pickup and delivery window.</td></tr></table></div><div style = "border:0px solid black;width:100%;padding:0px;margin-left:auto;margin:right:auto;"><table style = "border:0px solid red;"><tr><td><img src="http://protected-peak-28587.herokuapp.com/css/images/blackcourier.svg" style = "width:20%;height:100px;" class="ui-li-icon ui-corner-none"></td></tr><tr><td><h2>Pickup</h2></td></tr><tr><td>Our driver will arrive within your scheduled time to collect your garments.</td></tr></table></div><div style = "width:100%;margin-left:auto;margin:right:auto;"><table style = "border:0px solid red;padding:0px;"><tr><td><img src="http://protected-peak-28587.herokuapp.com/css/images/delivery-truck-with-circular-clock.svg" style = "width:20%;height:100px;" class="ui-li-icon ui-corner-none"></td></tr><tr><td><h2>Delivery</h2></td></tr><tr><td>Your garments are professionally cleaned and delivered at your scheduled time.</td></tr></table></div>';
		echo('
			<div style = "text-align:center;margin-left:15%;margin-right:15%;border-width:0px;border-color:black;border-style:solid;">
				<h1>What is LAUNDER IT?</h1>
				<p>LAUNDER IT is an on demand dry cleaning pickup and delivery service. We match customers with local rideshare drivers and drivers with cleaner partners.</p>
			<div>
			<div class="ui-grid-c" id = "why">
				<h1 style = "text-align:center;margin-left:auto;margin-right:auto;">Why LAUNDER IT?</h1>
				<div class="ui-block-a">
					<table style = "border:0px solid red;">
						<tr>
							<td>
									<img src="http://protected-peak-28587.herokuapp.com/css/images/give_money.svg" style = "width:40%;height:100px;" class="ui-li-icon ui-corner-none">
									
							</td>
						</tr>
						<tr>
							<td>
								<h2>Earn Tips</h2>
							</td>
						</tr>
						<tr>
							<td style = "padding:10px;">
								100% of customer tips are split between the pickup and delivery drivers for each order.
							</td>
						</tr>
					</table>
				</div>
				<div class="ui-block-b">
					<table style = "border:0px solid red;">
						<tr>
							<td>
									<img src="http://protected-peak-28587.herokuapp.com/css/images/human-links-with-dollar-currency.svg" style = "width:40%;height:100px;" class="ui-li-icon ui-corner-none">
									
							</td>
						</tr>
						<tr>
							<td>
								<h2>Grow With Us</h2>
							</td>
						</tr>
						<tr>
							<td style = "padding:10px;">
								Recieve commisions on every customer you play a role in bringing to LAUNDER IT. View our <a href = "#" onclick = "window.location.hash = '."'driver_referals'".'">Driver Referal Rewards Program</a>
							</td>
						</tr>
					</table>
				</div>
				<div class="ui-block-c">
					<table style = "border:0px solid red;">
						<tr>
							<td>
									<img src="http://protected-peak-28587.herokuapp.com/css/images/dollars.svg" style = "width:40%;height:100px;" class="ui-li-icon ui-corner-none">
									
							</td>
						</tr>
						<tr>
							<td>
								<h2>Earn More</h2>
							</td>
						</tr>
						<tr>
							<td style = "padding:10px;">
								Pickup & Delivery drivers split 75% of the net revenue on each order regardles of miles.
							</td>
						</tr>
					</table>
				</div>
				<div class="ui-block-d">
					<table style = "border:0px solid red;">
						<tr>
							<td>
									<img src="http://protected-peak-28587.herokuapp.com/css/images/worker-money-time.svg" style = "width:40%;height:100px;" class="ui-li-icon ui-corner-none">
									
							</td>
						</tr>
						<tr>
							<td>
								<h2>Flexible</h2>
							</td>
						</tr>
						<tr>
							<td style = "padding:10px;">
								Work when you want.
							</td>
						</tr>
					</table>
				</div>
			</div><!-- /grid-c -->
			<div>
				<br>
				<h3 style = "margin-left:auto;margin-right:auto;width:100%;text-align:center;">For LAUNDER IT updates and BETA access</h3><h2>Subscribe to our driver mailing list!</h2>
				<p id = "serror_text" style = "color:red;text-align:center;"></p>
				<div data-role="fieldcontain" class = "ui-hide-label" data-theme = "b"  style = "width:90%;margin-left:auto;margin-right:auto;">
    					<label for="sfname">Text Input:</label>
    					<input type="text" name="sfname" id="sfname" value="" placeholder = "FIRST NAME (Required)" />
					<br>
					<label for="slname">Text Input:</label>
    					<input type="text" name="slname" id="slname" value="" placeholder = "LAST NAME (Required)" />
					<br>
					<label for="semail">Text Input:</label>
    					<input type="email" name="sename" id="semail" value="" placeholder = "EMAIL ADDRESS (Required)" />
					<br>
					<label for="sphone_number">Text Input:</label>
    					<input type="text" name="sphone_number" id="sphone_number" value="" placeholder = "PHONE NUMBER (optional) 8041234567" />
					<br>
					<label for="szipcode">Text Input:</label>
    					<input type="text" name="szipcode" id="szipcode" value="" placeholder = "ZIP CODE (Required) 12345" />
						
					<br>
					<label for="dsubscribe">Text Input:</label>
    					<input type="button" data-theme = "b" name="dsubscribe" id="dsubscribe" value="Subscribe" />
				</div>
			</div>
			');
		echo("
			<script>
				//alert('mobi check');
				
				try{
					if(isMobile.any()){	
				$('#why').html('<div style = ".'"<div style = "width:100%;padding:0px;margin-left:auto;margin:right:auto;"'."><table style = ".'"border:0px solid red;"'."><tr><td><img src=".'"http://protected-peak-28587.herokuapp.com/css/images/give_money.svg"'." style = ".'"width:40%;height:100px;"'." class=".'"ui-li-icon ui-corner-none"'."></td></tr><tr><td><h2>Earn Tips</h2></td></tr><tr><td style = ".'"padding:10px;"'.">100% of customer tips are split between the pickup and delivery drivers for each order.</td></tr></table></div><br><br><div style = ".'"border:0px solid black;width:100%;padding:0px;margin-left:auto;margin:right:auto;"'."><table style = ".'"border:0px solid red;"'."><tr><td><img src=".'"http://protected-peak-28587.herokuapp.com/css/images/human-links-with-dollar-currency.svg"'." style = ".'"width:40%;height:100px;"'." class=".'"ui-li-icon ui-corner-none"'."></td></tr><tr><td><h2>Grow With Us</h2></td></tr><tr><td style = ".'"padding:10px;"'.">Recieve commisions on every customer you play a role in bringing to LAUNDER IT. View our <a href = ".'"#"'." id = ".'"referals"'.">Driver Referal Rewards Program</a></td></tr></table></div><br><br><div style = ".'"width:100%;margin-left:auto;margin:right:auto;"'."><table style = ".'"border:0px solid red;"'."><tr><td><img src=".'"http://protected-peak-28587.herokuapp.com/css/images/dollars.svg"'." style = ".'"width:40%;height:100px;"'." class=".'"ui-li-icon ui-corner-none"'."></td></tr><tr><td><h2>Earn More</h2></td></tr><tr><td style = ".'"padding:10px;"'.">Pickup & Delivery drivers split 75% of the net revenue on each order regardles of miles.</td></tr></table></div><br><br><div style = ".'"width:100%;margin-left:auto;margin:right:auto;"'."><table style = ".'"border:0px solid red;"'."><tr><td><img src=".'"http://protected-peak-28587.herokuapp.com/css/images/worker-money-time.svg"'." style = ".'"width:40%;height:100px;"'." class=".'"ui-li-icon ui-corner-none"'."></td></tr><tr><td><h2>Flexible</h2></td></tr><tr><td style = ".'"padding:10px;"'.">Work when you want.</td></tr></table></div>');
				}else{
			}
				}catch(err){
	
				alert(err.message);	
	
				}

				$('#referals').on('click', function (e) {
				
					window.location.hash = 'driver_referals';
				});

		");	
		die('
				$("#dsubscribe").on("click", function (e) {
				function pricing_btn(){
				//alert("check1");
				try{
					$.post("https://protected-peak-28587.herokuapp.com/results.php",
					{
						fname: $("#sfname").val(),
						lname: $("#slname").val(),
						email: $("#semail").val(),
						phone_number: $("#sphone_number").val(),
						zipcode: $("#szipcode").val(),
						interest: "Driver"
					
					},
					function(data, status){
						
						//alert(data);
						$resp = data.split("_");
						if($resp[0] == "fail"){
						$("#serror_text").html($resp[1]).enhanceWithin();
						}else if ($resp[0] == "success"){
							$("#sfname").val("");
							$("#slname").val("");
							$("#semail").val("");
							$("#sphone_number").val("");
							$("#szipcode").val("");
							$("#interest").val($("#interest").prop("defaultSelected"));	
							$("#serror_text").html("<p style ='."'color:green;'".'>Thanks for subscribing. We will keep you posted of any updates!</p>").enhanceWithin();
						}else if ($resp[0] == "query fail"){
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
				
			</script>	
		
		');
		
		
	}
	if(isset($_POST['contact'])){
		die('
			<div>
				<br>
				<h4 style = "margin-left:auto;margin-right:auto;width:75%;text-align:center;font-weight:bold;">Contact LAUNDER IT</h4>
				<p style = "margin-left:auto;margin-right:auto;width:75%;text-align:center;">Complete the form below and we will be in touch.</p>
				<p id = "cerror_text" style = "color:red;text-align:center;"></p>
				<div data-role="fieldcontain" class = "ui-hide-label" data-theme = "b"  style = "width:70%;margin-left:auto;margin-right:auto;">
				<div class="ui-grid-a ui-hide-label">
		<div class="ui-block-a ui-hide-label" style = "padding-right:2px;">
						<label for="cname">Text Input:</label>
    						<input type="text" name="cname" id="cname" value="" placeholder = "Name" />
					</div>
					<div class="ui-block-b ui-hide-label" style = "padding-left:2px;">
						<label for="cemail">Text Input:</label>
    						<input type="email" name="cemail" id="cemail" value="" placeholder = "Email" />
					</div>
				</div><!-- /grid-a -->
					<label for="subject">Text Input:</label>
    					<input type="text" name="subject" id="subject" value="" placeholder = "Subject" />
					<br>
					<label for="comment">Text Input:</label>
    					<textarea name="comment" id="comment" value="" placeholder = "Comment" ></textarea>
					<br>
					<label for="submit">Text Input:</label>
    					<input type="button" data-theme = "b" name="submit" id="submit" value="Submit" />
				
				</div>
				<!--
				<table>
					<tr>
						<td>
							<label for="sfname">Text Input:</label>
    							<input type="text" name="sfname" id="sfname" value="" placeholder = "Name" />
						</td>
						<td>
							<label for="slname">Text Input:</label>
    							<input type="email" name="slname" id="slname" value="" placeholder = "Email" />		
						</td>
					</tr>
					<tr>
						<td colspan = "2">
							<label for="semail">Text Input:</label>
    							<input type="text" name="sename" id="semail" value="" placeholder = "Subject" />
						</td>
					</tr>
					<tr>
						<td colspan = "2">
							<label for="semail">Text Input:</label>
    							<input type="textarea" name="sename" id="semail" value="" placeholder = "Comment" />
						</td>
					</tr>
					<tr>
						<td colspan = "2">
							<label for="sisubscribe">Text Input:</label>
    							<input type="button" data-theme = "b" name="sisubscribe" id="sisubscribe" value="Subscribe" />
						</td>
					</tr>
				</table>
				</div>
				<div data-role="fieldcontain" class = "ui-hide-label" data-theme = "b"  style = "width:70%;margin-left:auto;margin-right:auto;">
    					<label for="sfname">Text Input:</label>
    					<input type="text" name="sfname" id="sfname" value="" placeholder = "FIRST NAME (Required)" />
					<br>
					<label for="slname">Text Input:</label>
    					<input type="text" name="slname" id="slname" value="" placeholder = "LAST NAME (Required)" />
					<br>
					<label for="semail">Text Input:</label>
    					<input type="email" name="sename" id="semail" value="" placeholder = "EMAIL ADDRESS (Required)" />
					<br>
					<label for="sphone_number">Text Input:</label>
    					<input type="text" name="sphone_number" id="sphone_number" value="" placeholder = "PHONE NUMBER (optional) 8041234567" />
					<br>
					<label for="szipcode">Text Input:</label>
    					<input type="text" name="szipcode" id="szipcode" value="" placeholder = "ZIP CODE (Required) 12345" />
					<br>
					<label for="interest">Select Day</label>
    					<select name="interest" id="interest" data-theme = "b">
      						<option value="" style = "background-color:black;color:white;">Interest(Required)</option>
      						<option value="Customer" style = "background-color:black;color:white;">Customer</option>
      						<option value="Driver" style = "background-color:black;color:white;">Driver</option>
    					</select>	
					<br>
					<label for="sisubscribe">Text Input:</label>
    					<input type="button" data-theme = "b" name="sisubscribe" id="sisubscribe" value="Subscribe" />
				</div>
			</div>		
			-->
			<script>
				$("#submit").on("click", function (e) {
				function pricing_btn(){
				//alert("check1");
				try{
					$.post("https://protected-peak-28587.herokuapp.com/results.php",
					{
						cname: $("#cname").val(),
						cemail: $("#cemail").val(),
						subject: $("#subject").val(),
						comment: $("#comment").val()
					
					},
					function(data, status){
						
						//alert(data);
						$resp = data.split("_");
						if($resp[0] == "fail"){
						$("#cerror_text").html($resp[1]).enhanceWithin();
						}else if ($resp[0] == "success"){
							$("#cname").val("");
							$("#cemail").val("");
							$("#subject").val("");
							$("#comment").val("");
								
							$("#cerror_text").html("<p style ='."'color:green;'".'>Thanks, We will get back to you!</p>").enhanceWithin();
						}else if ($resp[0] == "query fail"){
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


			</script>
			
			
			
		');

	}
	if(isset($_POST['stayinformed'])){
		die('
			<div>
				<br>
				<h2 style = "margin-left:auto;margin-right:auto;width:75%;text-align:center;">For the latest LAUNDER IT news, sign up below!</h2>
				<p id = "serror_text" style = "color:red;text-align:center;"></p>
				<div data-role="fieldcontain" class = "ui-hide-label" data-theme = "b"  style = "width:70%;margin-left:auto;margin-right:auto;">
    					<label for="sfname">Text Input:</label>
    					<input type="text" name="sfname" id="sfname" value="" placeholder = "FIRST NAME (Required)" />
					<br>
					<label for="slname">Text Input:</label>
    					<input type="text" name="slname" id="slname" value="" placeholder = "LAST NAME (Required)" />
					<br>
					<label for="semail">Text Input:</label>
    					<input type="email" name="sename" id="semail" value="" placeholder = "EMAIL ADDRESS (Required)" />
					<br>
					<label for="sphone_number">Text Input:</label>
    					<input type="text" name="sphone_number" id="sphone_number" value="" placeholder = "PHONE NUMBER (optional) 8041234567" />
					<br>
					<label for="szipcode">Text Input:</label>
    					<input type="text" name="szipcode" id="szipcode" value="" placeholder = "ZIP CODE (Required) 12345" />
					<br>
					<label for="interest">Select Day</label>
    					<select name="interest" id="interest" data-theme = "b">
      						<option value="" style = "background-color:black;color:white;">Interest(Required)</option>
      						<option value="Customer" style = "background-color:black;color:white;">Customer</option>
      						<option value="Driver" style = "background-color:black;color:white;">Driver</option>
    					</select>	
					<br>
					<label for="sisubscribe">Text Input:</label>
    					<input type="button" data-theme = "b" name="sisubscribe" id="sisubscribe" value="Subscribe" />
				</div>
			</div>		
			<script>
				$("#sisubscribe").on("click", function (e) {
				function pricing_btn(){
				//alert("check1");
				try{
					$.post("https://protected-peak-28587.herokuapp.com/results.php",
					{
						fname: $("#sfname").val(),
						lname: $("#slname").val(),
						email: $("#semail").val(),
						phone_number: $("#sphone_number").val(),
						zipcode: $("#szipcode").val(),
						interest: $("#interest option:selected").val()
					
					},
					function(data, status){
						
						//alert(data);
						$resp = data.split("_");
						if($resp[0] == "fail"){
						$("#serror_text").html($resp[1]).enhanceWithin();
						}else if ($resp[0] == "success"){
							$("#sfname").val("");
							$("#slname").val("");
							$("#semail").val("");
							$("#sphone_number").val("");
							$("#szipcode").val("");
							$("#interest").val($("#interest").prop("defaultSelected"));	
							$("#serror_text").html("<p style ='."'color:green;'".'>Thanks for subscribing. We will keep you posted of any updates!</p>").enhanceWithin();
						}else if ($resp[0] == "query fail"){
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


			</script>
			
			
			
		');	
	
	}
	if(isset($_POST['cname'])){
		if($_POST['cname'] == null || $_POST['cemail'] == null || $_POST['subject'] == null || $_POST['comment'] == null){
			die("fail_Please complete all fields.");
		}else if(!filter_var($_POST['cemail'], FILTER_VALIDATE_EMAIL)){
			
			die("fail_Please provide a valid email.");
		}else{
			
			$subject = sanitize($_POST['subject']);
			$comment = sanitize($_POST['comment']);
			$message = ('
				<table style = "margin-left:auto;margin-right:auto;width:80%;">
					<tr>
						<th colspan = "2" style = "background-color:black;color:white;">
							<h1>Customer Feedback</h1>
						</th>
					</tr>
					<tr>
						<td style = "padding:0px;width:15%;background-color:black;color:white;">
							<h2>Name:</h2>
						</td>
						<td>
							'.sanitize($_POST['cname']).'
						</td>
					</tr>
					<tr>
						<td style = "padding:0px;width:15%;background-color:black;color:white;">
							<h2>Email:</h2>
						</td>
						<td>
							<a href="mailto:'.filter_var($_POST['cemail'], FILTER_SANITIZE_EMAIL).'?subject='.$subject.'">'.filter_var($_POST['cemail'], FILTER_SANITIZE_EMAIL).'</a>
						</td>
					</tr>
					<tr>
						<td style = "padding:0px;width:15%;background-color:black;color:white;">
							<h2>Comment:</h2>
						</td>
						<td>
							'.$comment.'
						</td>
					</tr>
				</table>
			');
			$sent = send_email(array(
    				'to' => 'info@getlaunderit.com',
    					'from' => 'nuwordurt@mymail.vcu.edu',
    					'subject' => $subject,
    					'text_body' => "LAUNDER IT: Hi ". ucfirst(strtolower($_POST['fname'])) .", thanks for subscribing. We will keep you posted of any new updates.",
    					'html_body' => $message
				), $response, $http_code);


				die("success");
			
		}
	}
	if(isset($_POST['fname'])){
		$interest = ($_POST['interest'] == null)? 'Customer' : $_POST['interest'];
		if($_POST['fname'] == null || $_POST['lname'] == null || $_POST['email'] == null || $_POST['zipcode'] == null){
			die("fail_Please complete all required fields.");
		}else if(isset($_POST['interest']) && $_POST['interest'] == null){

			die("fail_Please complete all required fields.");
		}else if(!filter_var($_POST['email'], FILTER_VALIDATE_EMAIL)){
			
			die("fail_Please provide a valid email.");
		}else if((!is_numeric($_POST['phone_number']) || strlen($_POST['phone_number']) != 10) && $_POST['phone_number'] != null){
			
			die("fail_Please provide a valid phone number. Format:8041234567");
		}else if(!is_numeric($_POST['zipcode']) || strlen($_POST['zipcode']) != 5){
			
			die("fail_Please provide a valid zipcode. Format:12345");
		}else{
			
			
			
			
			$psth = $db->prepare("insert into prospects ( first_name, last_name, email, phone_number, zipcode, interest) values (?, ?, ?, ?, ?, ?)");
			$psth->bindValue(1, ucfirst(strtolower($_POST['fname'])));
			$psth->bindValue(2, ucfirst(strtolower($_POST['lname'])));
			$psth->bindValue(3, $_POST['email']);
			$psth->bindValue(4, "+1".$_POST['phone_number']);
			$psth->bindValue(5, $_POST['zipcode']);
			$psth->bindValue(6, $interest);
			$psth->execute();
			$pnum_row = $psth->rowCount();
			if($pnum_row > 0){		
				if($_POST['phone_number'] != null){
				$tsth = $db->prepare("select * from twillio_numbers where status = 'available'");
				$tsth->execute();
				$tresult = $tsth->fetchALL(PDO::FETCH_ASSOC);
				$tnum_row = $tsth->rowCount();

				$cust_num = "+1".$_POST['phone_number'];
				$message = $client->account->messages->sendMessage(
				$tresult[0]['number'], // From a valid Twilio number
				$cust_num, // Text this number
				"LAUNDER IT: Hi ". ucfirst(strtolower($_POST['fname'])) .", thanks for subscribing. We will keep you posted of any new updates."
				);
				}

				$update = ('
				<table style = "width:100%;margin-left:auto;margin-right:auto;text-align:center;">
					<tr style = "background-color:black;color:white;">
						<th>
							<h1>LAUNDER IT</h1>
						</th>
					</tr>
					<tr>
						<td>
							<h3 style = "color:black;">
							Hi '. ucfirst(strtolower($_POST['fname'])) .', thanks for subscribing. We will keep you posted of any new updates.		
							</h3>
						</td>
					</tr>
				
				</table>	
				
				
				');

				$sent = send_email(array(
    				'to' => $_POST['email'],
    					'from' => 'nuwordurt@mymail.vcu.edu',
    					'subject' => 'Launder IT',
    					'text_body' => "LAUNDER IT: Hi ". ucfirst(strtolower($_POST['fname'])) .", thanks for subscribing. We will keep you posted of any new updates.",
    					'html_body' => $update
				), $response, $http_code);


				die("success");	
			}
			//die('query fail');
		}
		
		
		
	}
	if(isset($_POST['faqs'])){
			try{
			
			$fsth = $db->prepare("select * from faqs");
			$fsth->execute();
			$fresult = $fsth->fetchALL(PDO::FETCH_ASSOC);
			$fnumrow = $fsth->rowCount();

			}catch(PDOException $e) {
  			die($e->getMessage());
			}
			echo('
				<div style = "width:80%;margin-left:auto;margin-right:auto;">
				<div data-role="collapsible-set" data-filter="true" data-content-theme="d">
					<!--
					<div data-role="collapsible">
					<ul data-role="listview" data-theme="a" data-divider-theme="b"	style = "width:60%;margin-left:auto;margin-right:auto;">
					-->
			
			');
			for($i=0; $i<$fnumrow; $i++){
				echo('
				<div data-role="collapsible" data-theme="b" data-filtertext="'.$fresult[$i]['question'].'">
            			<h3>'.$fresult[$i]['question'].'</h3>
            			<ul data-role="listview" data-theme="a" data-inset="false">
                			<li>'.$fresult[$i]['answer'].'</li>
            			</ul>
      				</div>			
					
					
				
					
				');
			
			}
			echo('
					<!--
					</ul>
					</div>
					-->
				</div>
				</div>
				
				
			');


	}

	if(isset($_POST['prices'])){
	try{
			/*
			$isth = $db->prepare("select residents.firstname, residents.lastname, orders.special_instructions from orders inner join residents on residents.r_id = orders.r_id where orders.o_id = ? ");
			$isth->bindValue(1, $_POST['inventory_info_id']);
			$isth->execute();
			$iresult = $isth->fetchALL(PDO::FETCH_ASSOC);
			$inum_row = $isth->rowCount();
			
			$nsth = $db->prepare("select notes from tickets where o_id = ? ");
			$nsth->bindValue(1, $_POST['inventory_info_id']);
			$nsth->execute();
			$nresult = $nsth->fetchALL(PDO::FETCH_ASSOC);
			$nnum_row = $nsth->rowCount();

			$tsth = $db->prepare("select ifnull(sum(shirts),0) as shirts,  ifnull(sum(blouses),0) as blouses, ifnull(sum(dress),0) as dresses, ifnull(sum(longcoat),0) as longcoats, ifnull(sum(jacket),0) as jackets, ifnull(sum(pants),0) as pants, ifnull(sum(shorts),0) as shorts, ifnull(sum(skirt),0) as skirts, ifnull(sum(sweater),0) as sweaters, ifnull(sum(scarfs),0) as scarfs, ifnull(sum(ties),0) as ties, ifnull(sum(vests),0) as vests, ifnull(sum(labcoats),0) as labcoats, ifnull(sum(others),0) as others, (ifnull(sum(blankets), 0)) as blankets, (ifnull(sum(comforters),0)) as comforters from tickets where o_id = ?");
			$tsth->bindValue(1, $_POST['inventory_info_id']);
			$tsth->execute();
			$tresult = $tsth->fetchALL(PDO::FETCH_ASSOC);
			$tnum_row = $tsth->rowCount();
			*/
			$plsth = $db->prepare("select * from prices limit 1");
			$plsth->execute();
			$plresult = $plsth->fetchALL(PDO::FETCH_ASSOC);

			}catch(PDOException $e) {
  			die($e->getMessage());
			} 
			
			//echo($_POST['inventory_info_id']);
			//print_r($iresult);
	echo('
				<div style = "margin-left:auto;margin-right:auto;text-align:center;width:100%;font-weight:bold;" data-theme = "b">
					<h1>OUR PRICING</h1>
				</div>
				<br>
				<p style = "margin-left:auto;margin-right:auto;text-align:center;width:100%;font-weight:bold;">
					Any Garment Dry Cleaned and Pressed for $4.00
				</p>
				<br>
					<!--
					<table style = "margin-left:auto;margin-right:auto;border:3px solid black;border-radius:20px;width:80%;">
							<tr style = "text-align:center;font-weight:bold;">
								<td colspan = "2" >
									
								</td>
								
							</tr>
							<tr style = "text-align:center;font-weight:bold;">
								<td colspan = "2" id = "rname">
								</td>
								
							</tr>
							<tr>
								<td style = "text-align:left;font-weight:bold;">
								CUSTOMER
								</td>
								<td id = "paddress" style = "text-align:right;">
								'.ucfirst($iresult[0]['firstname']).' '.ucfirst($iresult[0]['lastname']).'
								</td>
							</tr>
							<tr>
								<td style = "text-align:left;font-weight:bold;">
								ORDER#
								</td>
								<td id = "order_num" style = "text-align:right;">
								'.$_POST['inventory_info_id'].'
								</td>
							</tr>
							
							<tr>
								<td style = "text-align:left;font-weight:bold;">
								NOTES
								</td>
								<td id = "info_notes" style = "text-align:right;">
								'.$nresult[0]['notes'].'	
								</td>
							</tr>
							</table>
							-->
							<ul data-role="listview" data-theme="a" data-divider-theme="b"	style = "width:80%;margin-left:auto;margin-right:auto;">
							
							');
							echo('
								<li data-role = "list-divider" >Laundry </li>
								
							');


							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/lshirt.svg" class="ui-li-icon ui-corner-none">Laundered Shirt <span class="ui-li-count">$'.$plresult[0]['lshirt'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Vest
								</td>
								<td id = "info_notes">
								'.$tresult[0]['vests'].'	
								</td>
								</tr>
								-->
								
							');

							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/blouse.svg" class="ui-li-icon ui-corner-none">Laundered Blouse <span class="ui-li-count">$'.$plresult[0]['blouse'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Blouse
								</td>
								<td id = "info_notes">
								'.$tresult[0]['blouses'].'	
								</td>
								</tr>
								-->
								
							');

							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/jeans.svg" class="ui-li-icon ui-corner-none">Laundered Pants <span class="ui-li-count">$'.$plresult[0]['lpants'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Vest
								</td>
								<td id = "info_notes">
								'.$tresult[0]['vests'].'	
								</td>
								</tr>
								-->
								
							');

							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/lab-coat.svg" class="ui-li-icon ui-corner-none">Lab Coat <span class="ui-li-count">$'.$plresult[0]['lpants'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Lab Coat
								</td>
								<td id = "info_notes">
								'.$tresult[0]['labcoats'].'	
								</td>
								</tr>
								-->
								
							');

							echo('
								<li data-role = "list-divider" >Dry Cleaning </li>
								
							');
							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/shirt.svg" class="ui-li-icon ui-corner-none">Shirt <span class="ui-li-count">$'.$plresult[0]['shirt'].'</span></li>
								
							');

							

							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/blouse.svg" class="ui-li-icon ui-corner-none">Blouse <span class="ui-li-count">$'.$plresult[0]['blouse'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Blouse
								</td>
								<td id = "info_notes">
								'.$tresult[0]['blouses'].'	
								</td>
								</tr>
								-->
								
							');

							

							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/dress.svg" class="ui-li-icon ui-corner-none">Dress <span class="ui-li-count">$'.$plresult[0]['dress'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Dress
								</td>
								<td id = "info_notes">
								'.$tresult[0]['dresses'].'	
								</td>
								</tr>
								-->
								
							');

							

							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/long coat.svg" class="ui-li-icon ui-corner-none">Long Coat <span class="ui-li-count">$'.$plresult[0]['long_coat'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Long Coat
								</td>
								<td id = "info_notes">
								'.$tresult[0]['longcoats'].'	
								</td>
								</tr>
								-->
								
							');

							

							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/jacket.svg" class="ui-li-icon ui-corner-none">Jacket <span class="ui-li-count">$'.$plresult[0]['jacket'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Jacket
								</td>
								<td id = "info_notes">
								'.$tresult[0]['jackets'].'	
								</td>
								</tr>
								-->
								
							');

							
							
							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/jeans.svg" class="ui-li-icon ui-corner-none">Pants <span class="ui-li-count">$'.$plresult[0]['pants'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Pants
								</td>
								<td id = "info_notes">
								'.$tresult[0]['pants'].'	
								</td>
								</tr>
								-->
								
							');

							

							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/Shorts.svg" class="ui-li-icon ui-corner-none">Shorts <span class="ui-li-count">$'.$plresult[0]['shorts'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Shorts
								</td>
								<td id = "info_notes">
								'.$tresult[0]['shorts'].'	
								</td>
								</tr>
								-->
								
							');

							
							
							
							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/skirt.svg" class="ui-li-icon ui-corner-none">Skirts <span class="ui-li-count">$'.$plresult[0]['skirt'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Skirts
								</td>
								<td id = "info_notes">
								'.$tresult[0]['skirts'].'	
								</td>
								</tr>
								-->
								
							');
							

							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/sweater.svg" class="ui-li-icon ui-corner-none">Sweater <span class="ui-li-count">$'.$plresult[0]['sweater'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Sweater
								</td>
								<td id = "info_notes">
								'.$tresult[0]['sweaters'].'	
								</td>
								</tr>
								-->
								
							');

							
							
							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/scarf.svg" class="ui-li-icon ui-corner-none">Scarfs <span class="ui-li-count">$'.$plresult[0]['scarf'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Scarfs
								</td>
								<td id = "info_notes">
								'.$tresult[0]['scarfs'].'	
								</td>
								</tr>
								-->
								
							');

							

							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/tie.svg" class="ui-li-icon ui-corner-none">Tie <span class="ui-li-count">$'.$plresult[0]['tie'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Tie
								</td>
								<td id = "info_notes">
								'.$tresult[0]['ties'].'	
								</td>
								</tr>
								-->
								
							');

							

							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/vest.svg" class="ui-li-icon ui-corner-none">Vest <span class="ui-li-count">$'.$plresult[0]['vest'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Vest
								</td>
								<td id = "info_notes">
								'.$tresult[0]['vests'].'	
								</td>
								</tr>
								-->
								
							');

							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/blanket.svg" class="ui-li-icon ui-corner-none">Blanket <span class="ui-li-count">$'.$plresult[0]['blanket'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Blanket
								</td>
								<td id = "info_notes">
								'.$tresult[0]['blankets'].'	
								</td>
								</tr>
								-->
								
							');

							
							
							echo('
								<li><img src="http://murmuring-dusk-3953.herokuapp.com/css/images/comforter.svg" class="ui-li-icon ui-corner-none">Comforter <span class="ui-li-count">$'.$plresult[0]['comforter'].'</span></li>
								<!--
								<tr>
								<td style = "text-align:center;font-weight:bold;">
								Comforter
								</td>
								<td id = "info_notes">
								'.$tresult[0]['comforters'].'	
								</td>
								</tr>
								-->
								
							');

							

		echo('</ul><br><br>');

	}

?>
