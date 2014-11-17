var Pusher = require('pusher');

var pusher = new Pusher({
  appId: '96612',
  key: '13711bc23c1e5b584fff',
  secret: 'f5195e1de73f48b3cf18'
});

pusher.trigger('test_channel', 'my_event', {
  "message": "hello world"
});