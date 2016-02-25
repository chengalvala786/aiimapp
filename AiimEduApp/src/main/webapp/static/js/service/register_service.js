'use strict';

App.factory('regService', ['$http', '$q', '$location', function($http, $q , $location){

	return {
     	registerAppl: function(application){
			
			var appli=  angular.toJson(application)
				
		
			return $http.post($location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/AiimEduApp/register', appli)
			.then(
					function(response){
						return response.data;
					}, 
					function(errResponse){
						console.error('Error while creating user');
						return $q.reject(errResponse);
					}
			);
		},
		createToken: function(application){
			var appli=  angular.toJson(application)
			return $http.post($location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/AiimEduApp/createToken', appli)
			.then(
					function(response){
						return response.data;
					}, 
					function(errResponse){
						console.error('Error while creating user');
						return $q.reject(errResponse);
					}
			);
		},createCardToken: function(application){
			var appli=  angular.toJson(application)
			return $http.post($location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/AiimEduApp/createCardToken', appli)
			.then(
					function(response){
						return response.data;
					}, 
					function(errResponse){
						console.error('Error while creating user');
						return $q.reject(errResponse);
					}
			);
		},
		saveAndExit: function(application){
			var appli=  angular.toJson(application)
			return $http.post($location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/AiimEduApp/saveAndExit', appli)
			.then(
					function(response){
						return response.data;
					}, 
					function(errResponse){
						console.error('Error while creating user');
						return $q.reject(errResponse);
					}
			);
		}


	};

}]);
