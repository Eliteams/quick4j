define([ 'jquery', 'underscore', 'backbone', 'views/home/main' ], function($,
        _, Backbone, homeMainView) {
    var AppRouter = Backbone.Router.extend({
        routes : {
            '*actions' : 'defaultAction'
        },
        defaultAction : function(actions) {
            homeMainView.render();
        }
    });

    var initialize = function() {
        var app_router = new AppRouter();
        Backbone.history.start();
    };

    return {
        initialize : initialize
    };
});