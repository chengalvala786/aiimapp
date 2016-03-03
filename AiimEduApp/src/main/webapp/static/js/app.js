'use strict';


var App = angular.module('myApp', ['ngRoute', 'ngAnimate', 'ui.bootstrap', 'ngFileUpload', 'base64', 'rorymadden.date-dropdowns' , 'ui.grid', 'vcRecaptcha','creditCardInput', 'ui.grid.selection', 'ui.grid.exporter' ]).
config(['$routeProvider', function($routeProvider) {
	
	
	
	$routeProvider


	// route for the about page
	.when('/personalInfo', {
		templateUrl : 'templates/personal_info.html?id=v22',
		controller  : 'UserController'
	})
	.when('/', {
		templateUrl : 'templates/login.html?id=v22',
		controller  : 'UserController'
	})
	.when('/eductionInfo', {
		templateUrl : 'templates/eduction_info.html?id=v22',
		controller  : 'UserController'
	}).when('/createUser', {
		templateUrl : 'templates/user_register.html?id=v22',
		controller  : 'UserController'
	})
	// route for the about page
	.when('/workInfo', {
		templateUrl : 'templates/work_info.html?id=v22',
		controller  : 'UserController'
	})// route for the about page
	.when('/additionalInfo', {
		templateUrl : 'templates/additional_info.html?id=v22',
		controller  : 'UserController'
	}).when('/review', {
		templateUrl : 'templates/review.html?id=v22',
		controller  : 'UserController'
	}).when('/resultpage', {
		templateUrl : 'templates/resultpage.html?id=v22',
		controller  : 'UserController'
	}).when('/adminMain', {
		templateUrl : 'templates/admin_main.html?id=v22',
		controller  : 'AdminController'
	}).when('/regUsers', {
		templateUrl : 'templates/admin_reguser.html?id=v22',
		controller  : 'RegController'
	}).when('/completedApps', {
		templateUrl : 'templates/admin_completedapps.html?id=v22',
		controller  : 'AppCmplController'
	}).when('/cardInfo', {
		templateUrl : 'templates/creditcard.html?id=v22',
		controller  : 'UserController'
	}).when('/incompleteApps', {
		templateUrl : 'templates/admin_incompleteapps.html?id=v22',
		controller  : 'AdminController'
	}).when('/pswd', {
		templateUrl : 'templates/forgotpassword.htm?id=v22',
		controller  : 'UserController'
	});
	
	
}]);

//create angular controller
App.controller('loginCntrl', function($scope) {


  
}).run(function($rootScope) {
	$rootScope.application = {}; 
	$rootScope.application.personalInfo={};
	$rootScope.application.eductionalInfo={};
	$rootScope.application.workInfo={};
	$rootScope.application.workInfo.empDetails=[];
	var empTempl={
	        we_from_month: "",
	        we_from_year: "",
	        we_to_month: "",
	        we_to_year: "",
	        totalMonths: "",
	        cmpName: "",
	        cmpAd1: "",
	        cmpAd2: "",
	        cmpState: "",
	        cmpCity: "",
	        cmpPinCode: "",
	        designation: "",
	        roles: "",
	        ctc: ""
	      };
	$rootScope.application.workInfo.empDetails.push(empTempl);
	
	
	$rootScope.application.additionalInfo={};
	$rootScope.application.additionalInfo.activity={};
	$rootScope.application.additionalInfo.decleration={};
	$rootScope.application.eductionalInfo={};
	$rootScope.application.eductionalInfo.gd={};
	$rootScope.application.eductionalInfo.gdAdd=[];
	$rootScope.application.eductionalInfo.pgAdd=[];
	$rootScope.application.eductionalInfo.pqAdd=[];
	$rootScope.application.eductionalInfo.pg={};
	$rootScope.application.eductionalInfo.admissionTest={};
	$rootScope.application.eductionalInfo.highschool={};
	$rootScope.application.eductionalInfo.school={};
	$rootScope.userForm={};
	$rootScope.application.additionalInfo.srcTags=[];
	$rootScope.application.personalInfo.languages =[ { value: ''}];
	$rootScope.isUserCreated = false;
});






App.run(function($templateCache ,$http) {
	  $http.get('templates/personal_info.html?id=v22', {cache:$templateCache});
	  $http.get('templates/eduction_info.html?id=v22', {cache:$templateCache});
	  $http.get('templates/work_info.html?id=v22', {cache:$templateCache});
	  $http.get('templates/user_register.html?id=v22', {cache:$templateCache});
	  $http.get('templates/additional_info.html?id=v22', {cache:$templateCache});
	  $http.get('templates/review.html?id=v22', {cache:$templateCache});
	  $http.get('templates/resultpage.html?id=v22', {cache:$templateCache});
	  $http.get('templates/admin_main.html?id=v22', {cache:$templateCache});
	  $http.get('templates/admin_reguser.html?id=v22', {cache:$templateCache});
	  $http.get('templates/admin_completedapps.html?id=v22', {cache:$templateCache});
	  $http.get('templates/admin_incompleteapps.html?id=v22', {cache:$templateCache});
	  $http.get('templates/companydetails_tmp.htm', {cache:$templateCache});
	  $http.get('templates/profqual_tmp.htm', {cache:$templateCache});
	  $http.get('templates/graduate_tmp.htm', {cache:$templateCache});
	  $http.get('templates/postgrad_tmp.htm', {cache:$templateCache});
	  $http.get('templates/forgotpassword.htm?id=v22', {cache:$templateCache});
		  
	  
	  
		});

App.directive('fileModel', ['$parse', function ($parse) {
    return {
       restrict: 'A',
       link: function(scope, element, attrs) {
          var model = $parse(attrs.fileModel);
          var modelSetter = model.assign;
          
          element.bind('change', function(){
             scope.$apply(function(){
                modelSetter(scope, element[0].files[0]);
             });
          });
       }
    };
 }]);

App.service('fileUpload', ['$http', function ($http) {
    this.uploadFileToUrl = function(fd, uploadUrl){
      
       $http.post(uploadUrl, fd, {
          transformRequest: angular.identity,
          headers: {'Content-Type': undefined}
       })
    
       .success(function(){
       })
    
       .error(function(){
       });
    }
 }]);


