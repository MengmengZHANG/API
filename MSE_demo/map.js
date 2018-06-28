
function initialize(longitude, latitude) {
	var map;
  var mapOptions = {
    zoom: 8,
    center: new google.maps.LatLng(latitude, longitude)
  };
  map = new google.maps.Map(document.getElementById('map-canvas'),
      mapOptions);
	  return map;
}

