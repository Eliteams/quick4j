define([
  'jquery',
  'underscore',
  'backbone',
  'collections/example_collection',
  // Using the Require.js text! plugin, we are loaded raw text
  // which will be used as our views primary template
  'text!templates/examples/list.html'
], function($, _, Backbone, examplesCollection, examplesListTemplate){

	var exampleListView = Backbone.View.extend({
		el: $('#page'),
		initialize: function(){
			this.collection = new examplesCollection;
		},
		render: function(){
			// Using Underscore we can compile our template with data
			// (We can use any other string-based template engine if we want! e.g: Handlebars)
			var data = {},
					_this = this;
			// We can use deferred load of elements just to wait for them to be loaded and show the app properly
			this.collection.deferred.done(function(){
				data.examples = _this.collection.models;
				_this.$el.html( _.template( examplesListTemplate, data ) );
			})
		}
	});

  return new exampleListView;
});