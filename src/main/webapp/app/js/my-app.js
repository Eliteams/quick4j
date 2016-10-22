/**
 * 应用程序起点
 */
define([ 'jquery', 'underscore', 'backbone', 'router'], function($, _,
        Backbone, Router) {
    var initialize = function() {
        Router.initialize();
    }
    return {
        initialize : initialize
    };
});