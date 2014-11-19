var YQL = require('yql');
var location = process.argv[2];
var query = new YQL('select * from weather.forecast where woeid in (select woeid from geo.places(1) where text="'+location+'") AND u="c"');

query.exec(function(err, data) {
  var location = data.query.results.channel.location;
  var condition = data.query.results.channel.item.condition;
  var description = data.query.results.channel.item.description;
  var longitude = data.query.results.channel.item.long;
  var latitude = data.query.results.channel.item.lat;
  console.log('The current weather in ' + location.city + ', ' + location.region + ' is ' + condition.temp + ' degrees.');
  console.log('Longitude: '+longitude+", latitude: "+latitude);
  console.log('Forcast:');
  console.log(description);
});