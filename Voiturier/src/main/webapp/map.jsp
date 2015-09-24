<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Voiturier | Geolocalisation de service de voiturier</title>
		<meta name="viewport" content="width=device-width,initial-scale=1.0">
		<meta name="author" content="POEC JAVA">
		<style>
        html,
body,
#map {
	height:100%;
}
#map h1 {
	font-size:16px;
}
#map h2 {
	font-size:14px;
	font-weight:300;
}
        </style>

	</head>
	<body>

		<div id="map"></div>

		<script src="http://maps.googleapis.com/maps/api/js?v=3.exp&sensor=true"></script>

	    <script>
            
	    	var tableauMarqueurs = [
				{ lat:48.80377370000001 , lng:2.330455700000016 },
				{ lat:48.802114, lng:2.327223 },
				{ lat:48.799944, lng:2.329701 },
				{ lat:48.802764, lng:2.327845 },
				{ lat:48.800425, lng:2.325238 }
			];
			var maCarte;
			var zoneMarqueurs = new google.maps.LatLngBounds();

			function initialisation() {
				var optionsCarte = {
					zoom: 8,
					center: new google.maps.LatLng( 48.801202, 2.328725 ),
            
					mapTypeId: google.maps.MapTypeId.ROADMAP
				}
				maCarte = new google.maps.Map( document.getElementById("map"), optionsCarte );
				for( var i = 0, I = tableauMarqueurs.length; i < I; i++ ) {
					ajouteMarqueur( tableauMarqueurs[i] );
				}
				maCarte.fitBounds( zoneMarqueurs );
                
navigator.geolocation.getCurrentPosition(function(position) {
// Modification du marker pour la self-geolocalisation                      
   var myMarkerImage = new google.maps.MarkerImage('img/icon.png');
                    
// Coordonnées de Géolocalisation
                    var geolocate = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);

    
		    		var marker = new google.maps.Marker({
		    			map: maCarte,
		    			position: geolocate,
                        icon: myMarkerImage
		    		});

		    		map.setCenter(geolocate);

	    		});                
                
                
			}

			function ajouteMarqueur( latlng ) {
				var latitude = latlng.lat;
				var longitude = latlng.lng;
				var optionsMarqueur = {
					map: maCarte,
					position: new google.maps.LatLng( latitude, longitude )
				};
				var marqueur = new google.maps.Marker( optionsMarqueur );
				zoneMarqueurs.extend( marqueur.getPosition() );
			}
            
			
			 google.maps.event.addDomListener( window, 'load', initialisation );

        </script>

	</body>
</html>
