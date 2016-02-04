'use strict';

App.factory('UserService', ['$http', '$q' ,'$location' , function($http, $q,$location){

	return {
		
			fetchAllUsers: function() {
					return $http.get('http://localhost:10200/Spring4MVCAngularJSExample/user/')
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while fetching users');
										return $q.reject(errResponse);
									}
							);
			},
		    
		    createUser: function(user){
					return $http.post($location.protocol() + '://'+ $location.host() +':'+  $location.port() +"/AiimEduApp/createUser/", user)
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
				return $http.post($location.protocol() + '://'+ $location.host() +':'+  $location.port() +"/AiimEduApp/login/", user)
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
		    
		    updateUser: function(user, id){
					return $http.put('http://localhost:10200/Spring4MVCAngularJSExample/user/'+id, user)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while updating user');
										return $q.reject(errResponse);
									}
							);
			}
		
	};

}]);
