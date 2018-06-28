function yqlCallback(data) {
    //var wind = data.query.results.channel.wind;
    //alert(wind.chill);
	var text ;
	  var location = data.query.results.channel.location;
	  var condition = data.query.results.channel.item.condition;
      var description = data.query.results.channel.item.description;
	  var longitude = data.query.results.channel.item.long;
	var latitude = data.query.results.channel.item.lat;
  text = 'The current weather in ' + location.city + ', ' + location.region + ' is ' + condition.temp + ' degrees.' +'<br>';
  //text += 'Longitude: '+longitude+", latitude: "+latitude+'<br>';
  text += description+'<br>';
	document.getElementById('weather-description').innerHTML = text;
};

