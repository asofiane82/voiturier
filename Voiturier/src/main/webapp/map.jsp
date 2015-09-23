<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>

<!doctype html>
<html lang="fr">
	<head>
		<meta charset="utf-8">
		<title>Voiturier | Geolocalisation de service de voiturier</title>
		<meta name="viewport" content="width=device-width,initial-scale=1.0">
		<meta name="author" content="POEC JAVA">
		<style>
        html,
body,
#google_canvas {
	height:100%;
}
#google_canvas h1 {
	font-size:16px;
}
#google_canvas h2 {
	font-size:14px;
	font-weight:300;
}
        </style>

	</head>
	<body>

		<div id="google_canvas"></div>

		<script src="http://maps.googleapis.com/maps/api/js?v=3.exp&sensor=true"></script>

	    <script>
	    (function() {

	    	if(!!navigator.geolocation) {

	    		var map;

		    	var mapOptions = {
		    		zoom: 17,
		    		mapTypeId: google.maps.MapTypeId.ROADMAP
		    	};

		    	map = new google.maps.Map(document.getElementById('google_canvas'), mapOptions);

	    		navigator.geolocation.getCurrentPosition(function(position) {

		    		var geolocate = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);

		    		var marker = new google.maps.Marker({
		    			map: map,
		    			position: geolocate,
		    			content:
		    				'<h1>Location pinned from HTML5 Geolocation!</h1>' +
		    				'<h2>Latitude: ' + position.coords.latitude + '</h2>' +
		    				'<h2>Longitude: ' + position.coords.longitude + '</h2>'
		    		});

		    		map.setCenter(geolocate);

	    		});

	    	} else {
	    		document.getElementById('google_canvas').innerHTML = 'No Geolocation Support.';
	    	}

	    })();
	    </script>


	</body>
</html>
