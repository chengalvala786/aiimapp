'use strict';


var App = angular.module('myApp', ['ngRoute', 'ngAnimate', 'ui.bootstrap', 'ngFileUpload', 'base64', 'rorymadden.date-dropdowns']).
config(['$routeProvider', function($routeProvider) {
	
	
	
	$routeProvider


	// route for the about page
	.when('/personalInfo', {
		templateUrl : 'templates/personal_info.html?id=v6',
		controller  : 'UserController'
	})
	.when('/', {
		templateUrl : 'templates/login.html?id=v6',
		controller  : 'UserController'
	})
	.when('/eductionInfo', {
		templateUrl : 'templates/eduction_info.html?id=v6',
		controller  : 'UserController'
	}).when('/createUser', {
		templateUrl : 'templates/user_register.html?id=v6',
		controller  : 'UserController'
	})
	// route for the about page
	.when('/workInfo', {
		templateUrl : 'templates/work_info.html?id=v6',
		controller  : 'UserController'
	})// route for the about page
	.when('/additionalInfo', {
		templateUrl : 'templates/additional_info.html?id=v6',
		controller  : 'UserController'
	}).when('/review', {
		templateUrl : 'templates/review.html?id=v6',
		controller  : 'UserController'
	}).when('/resultpage', {
		templateUrl : 'templates/resultpage.html?id=v6',
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
	$rootScope.application.additionalInfo.src ={};
	$rootScope.application.additionalInfo.src.selected={tags: []};
	$rootScope.application.personalInfo.languages =[ { value: ''}];
	$rootScope.isUserCreated = false;
});



