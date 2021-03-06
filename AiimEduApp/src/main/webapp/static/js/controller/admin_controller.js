'use strict';
App.controller('AppCmplController', ['$scope', 'regService','UserService','$rootScope','$log' ,'$location', 'Upload' , '$base64', '$routeParams','fileUpload',function($scope, regService,UserService,$rootScope,$log, $location, Upload,$base64,$routeParams,fileUpload) {
	$scope.myData=[];
	$scope.startDt="";
	$scope.endDt="";
	
	$scope.today = function() {
		$scope.dt = new Date();
	};	
	$scope.today();

	$scope.clear = function () {
		$scope.dt = null;
	};

	// Disable weekend selection
	$scope.disabled = function(date, mode) {
		return ( mode === 'day' && ( date.getDay() === 0 || date.getDay() === 6 ) );
	};

	$scope.toggleMin = function() {
		$scope.minDate = $scope.minDate ? null : new Date();
	};
	$scope.toggleMin();
	$scope.maxDate = new Date(2020, 5, 22);

	$scope.open1 = function($event) {
		$scope.status1.opened = true;
	};
	$scope.open2 = function($event) {
		$scope.status2.opened = true;
	};
	$scope.setDate = function(year, month, day) {
		$scope.dt = new Date(year, month, day);
	};



	$scope.status1 = {
			opened: false
	};

	$scope.status2 = {
			opened: false
	};


	$scope.searchApp = function (){
		$('#main').block({ 
			message: '<h1>Processing</h1>', 
			css: { border: '3px solid #a00' } 
		}); 
		
		$.ajax({
			url: 'listCompltedApps',
			dataType: 'text',
			contentType: false,
			type: 'GET',
			data: { status:$scope.status ,  emailId : $scope.emailId  ,starDate: $scope.startDt , endDate:$scope.endDt},
			success: function(data){
				//  $('#result').html(data+ " uploaded by FormData!");
				console.log("Result # "+ JSON.parse(data));
				$('#main').unblock();
				$scope.myData=JSON.parse(data);

				if (!$scope.$$phase) {
		            $scope.$apply();
		        }

			}
		});

	};
	


	$scope.viewApp = function (row){
	
		console.log(row.entity);
		
		$rootScope.application =row.entity;
				
		

	};



	$scope.gridOptions = {
						 enableSorting: true,
			             showFooter: true,
			             columnDefs: [
							            { name:'Reg No.', field: 'personalInfo.regno'  ,  width: 100,  cellTemplate:'<div class="grid-action-cell"><a href="#review"ng-click="grid.appScope.viewApp(row)">{{COL_FIELD}}</a></div>'},
							             { name:'First Name', field: 'personalInfo.fName' ,  width: 100 },
							             { name:'Middle Name', field: 'personalInfo.mName',  width: 100 },
							             { name:'Last Name', field: 'personalInfo.lName',  width: 100  },
							             { name:'Email', field: 'personalInfo.emailId' ,  width: 200 },
							             { name:'Age', field: 'personalInfo.dob',  width: 50, cellFilter :'ageFilter'},
							             { name:'Sex', field: 'personalInfo.gender' ,  width: 50 },
							             { name:'Total experience', field: 'workInfo.total_wexp' ,  width: 50 },
							             { name:'Accept Date', field: 'acceptedDate' ,  width: 100 , cellFilter: "date:'dd-MM-yyyy'"},
							             { name:'Completed', field: 'additionalInfo.decleration' ,  width: 50,cellFilter :'appstatus' },
							             { name:'State', field: 'personalInfo.state' ,  width: 100 },
							             { name:'Mobile', field: 'personalInfo.mobileNumber' ,  width: 100 },
							             { name:'Page', field: 'pageNo' ,  width: 50 },
							             { name:'Transaction Id', field: 'tranId' ,  width: 100 },    
							             
							             ],
							             sortInfo: {
							            	 fields: ['dt_created'],
							            	 directions: ['dsc']
							             },
			             data :'myData' 
	};

	

}]);

//Admin User Controllers

App.controller('RegController', ['$scope', 'regService','UserService','$rootScope','$log' ,'$location', 'Upload' , '$base64', '$routeParams','fileUpload',function($scope, regService,UserService,$rootScope,$log, $location, Upload,$base64,$routeParams,fileUpload) {
	$scope.myData=[];

	$scope.selectPage = function (){

		$location.path("/" + $scope.selection);
	};
	
					  
	$scope.loadUsers = function (){
		$('#main').block({ 
			message: '<h1>Processing</h1>', 
			css: { border: '3px solid #a00' } 
		});
		
		$.ajax({
			url: 'listAllUsers',
			dataType: 'text',
			contentType: false,
			type: 'GET',
			success: function(data){
				//  $('#result').html(data+ " uploaded by FormData!");
				console.log("Result # "+ JSON.parse(data));
				$('#main').unblock();
				$scope.myData=JSON.parse(data);

				if (!$scope.$$phase) {
		            $scope.$apply();
		        }

			}
		});

	};



	
	
	$scope.pagingOptions = {
			pageSizes: [25, 50, 100],
			pageSize: 25,
			totalServerItems: 0,
			currentPage: 1
	};
	 $scope.setPagingData = function(data, page, pageSize) {
		    var pagedData = data.slice((page - 1) * pageSize, page * pageSize);
		    $scope.myData = pagedData;
		    $scope.pagingOptions.totalServerItems = data.length;
		    if (!$scope.$$phase) {
		      $scope.$apply();
		    }
		  };

		  $scope.getPagedDataAsync = function(pageSize, page) {
		    setTimeout(function() {      
		        
		          $scope.setPagingData($scope.myData, page, pageSize);
		      
		    }, 100);
		  };

		  $scope.$watch('pagingOptions', function() {
		    $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
		  }, true);


	$scope.gridOptions = {
						 enableSorting: true,
			             enablePaging: true,	
			             pagingOptions: $scope.pagingOptions,	
			             showFooter: true,
			             columnDefs: [
							            { name:'Reg No.', field: 'regno'  ,  width: 100 },
							             { name:'First Name', field: 'fName' ,  width: 100 },
							             { name:'Middle Name', field: 'mName',  width: 100 },
							             { name:'Last Name', field: 'lName',  width: 100  },
							             { name:'Email', field: 'emailId' ,  width: 200 },
							             { name:'Age', field: 'dob',  width: 100, cellFilter :'ageFilter'},
							             { name:'Sex', field: 'gender' ,  width: 50 },
							             { name:'Mobile', field: 'mobileNumber' ,  width: 100 },
							             { name:'Activation', field: 'status' ,  width: 100 },
							             { name:'Date Registered', field: 'dt_created' ,  width: 100 , cellFilter: "date:'dd-MM-yyyy'"}
							             ],
							             sortInfo: {
							            	 fields: ['dt_created'],
							            	 directions: ['dsc']
							             },
			             data :'myData' 
	};

	$scope.loadUsers();

}]);
//Main Page. 

App.controller('AdminController', ['$scope', 'regService','UserService','$rootScope','$log' ,'$location', 'Upload' , '$base64', '$routeParams','fileUpload',function($scope, regService,UserService,$rootScope,$log, $location, Upload,$base64,$routeParams,fileUpload) {
	$scope.myData=[];

	$scope.selectPage = function (){

		$location.path("/" + $scope.selection);
	};
		  
	

}]);



App.filter('ageFilter', function () {
    function calculateAge (birthday) { // birthday is a date
        var date = new Date(birthday);
        var ageDifMs = Date.now() - date.getTime();
        var ageDate = new Date(ageDifMs); // miliseconds from epoch
        return Math.abs(ageDate.getUTCFullYear() - 1970);
    }

    return function (birthdate) {
        return calculateAge(birthdate);
    };
});

App.filter('appstatus', function () {
    function setAppstat (status) { // birthday is a date
       if (status === '1'){
    	   return 'A';
       }else{
    	   return '';
       }
    	
      
    }

    return function (status) {
        return setAppstat(status);
    };
});
