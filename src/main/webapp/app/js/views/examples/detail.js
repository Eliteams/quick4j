define([
  'jquery',
  'underscore',
  'backbone',
  'models/example_model',
  'text!templates/examples/detail.html'
], function($, _, Backbone, exampleModel, exampleDetailTemplate){

	var exampleDetailView = Backbone.View.extend({
		el: $('#page'),
		initialize: function(){
			this.model = new exampleModel;
		},
		show: function(id){
			this.model.id = id;
			this.model.deferred = this.model.fetch();
			this.render();
		},
		render: function(){
			var data = {},
					_this = this;

			this.model.deferred.done(function(){
				data.example = _this.model;
				_this.$el.html( _.template( exampleDetailTemplate, data ) );
			})
		}
	});

  return new exampleDetailView;
});