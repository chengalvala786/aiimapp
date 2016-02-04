'use strict';

App.factory('UserService', ['$http', '$q' ,'$location' , function($http, $q,$location){

	return {
		
			
		    
		    createUser: function(user){
					return $http.post($location.protocol() + '://'+ $location.host() +':'+  $location.port() +"/AiimEduApp/createUser", user)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while creating user');
										return $q.reject(errResponse);
									}
							);
		    }, login: function(user){
				return $http.post($location.protocol() + '://'+ $location.host() +':'+  $location.port() +"/AiimEduApp/login", user)
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
