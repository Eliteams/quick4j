/**
 * 加载库
 */
require.config({
    shim : {
        'underscore' : {
            exports : '_'
        },
        'backbone' : {
            deps : [ 'underscore', 'jquery' ],
            exports : 'Backbone'
        }
    },
    paths : {
        jquery : '../lib/jquery/jquery',
        underscore : '../lib/underscore/underscore',
        backbone : '../lib/backbone/backbone',
        text : '../lib/requirejs/text',
        templates : 'templates'
    }
});

/**
 * 加载APP
 */
require([ 'my-app', ], function(App) {
    console.log(App);
    console.log($, '\n', _, '\n', Backbone);
});