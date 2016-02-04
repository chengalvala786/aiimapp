'use strict';

App.controller('UserController', ['$scope', 'regService','UserService','$rootScope','$log' ,'$location', 'Upload' , '$base64', '$routeParams','fileUpload'  , 'vcRecaptchaService' ,function($scope, regService,UserService,$rootScope,$log, $location, Upload,$base64,$routeParams,fileUpload ,vcRecaptchaService) {

	$("a").on('click',  function(event){

		$( "form" ).addClass( "submitted" );

	});
	$scope.canSubmit = true; 
	if ($routeParams.cs === false){
		$scope.canSubmit = $routeParams.cs;	
	}
	
	
	
	
	$scope.upload = function (file, tranType) {
		var oMyForm = new FormData();



		oMyForm.append("file", file);
		oMyForm.append("email", $rootScope.application.personalInfo.emailId);
		oMyForm.append("rowId", $rootScope.application.app_rw_id);
		oMyForm.append("imageType", tranType);



		$.ajax({
			url: 'upload',
			data: oMyForm,
			dataType: 'text',
			processData: false,
			contentType: false,
			type: 'POST',
			success: function(data){
				//  $('#result').html(data+ " uploaded by FormData!");
				console.log("Result # "+ data);

			}
		});






	};	

	$scope.today = function() {
		$scope.dt = "";
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

	$scope.open = function($event) {
		$scope.status.opened = true;
	};

	$scope.setDate = function(year, month, day) {
		return new Date(year, month, day);
	};



	$scope.status = {
			opened: false
	};





	var url = $location.url();


	if (window.location.search.indexOf('transactionId')> -1){
		$location.path("resultpage");
	}
	if (window.location.search.indexOf('status=Ok')> -1){
		$scope.status=$.urlParam('status');
	}

	if (window.location.search.indexOf('status=F')> -1){
		$scope.status=$.urlParam('status');
	}

	if (window.location.search.indexOf('transactionId')> -1){

		$scope.transactionId=$.urlParam('transactionId');
	}





//	Click of review button
	$scope.review = function( ) {



		var pref1 = $scope.application.additionalInfo.pref1;
		var pref2 = $scope.application.additionalInfo.pref2;
		$scope.pref1=false;
		$scope.pref2=false;	
		$scope.locationSame =false;
		if ($scope.additionalInfoForm.$invalid) { 
			$scope.pref1 = $scope.additionalInfoForm.pref1.$error.required;
			$scope.pref2 = $scope.additionalInfoForm.pref2.$error.required;
		}else if ( pref1===pref2){
			$scope.locationSame = true;
		}else{
			$location.path("review");
		}
	};

	$scope.getImage = function( ) {
		return $location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/AiimEduApp/getImg?email='+$rootScope.application.personalInfo.emailId+"&rowId="+$rootScope.application.app_rw_id;
	};

	$scope.getCard = function( ) {
		return $location.protocol() + '://'+ $location.host() +':'+  $location.port() + '/AiimEduApp/getImg?email='+$rootScope.application.personalInfo.emailId+"&rowId="+$rootScope.application.app_rw_id+"&imageType=scoreCard";
	};

	//Click of save button
	$scope.saveOnly = function(page) {
		$rootScope.application.pageNo=page;
		console.log("Application"+ appl);


		var appl= $rootScope.application;
		regService.saveAndExit(appl)
		.then(
				function(data){

				} ,
				function(errResponse){

				}	
		);
	};

	//Click of save button
	$scope.saveAndExit = function(page) {
		$rootScope.application.pageNo=page;
		console.log("Application"+ appl);
		$('#main').block({ 
			message: '<h1>Processing</h1>', 
			css: { border: '3px solid #a00' } 
		}); 

		var appl= $rootScope.application;
		regService.saveAndExit(appl)
		.then(
				function(data){
					console.log('Data saved while creating User.'+ data);
					$('#main').unblock();
					$location.path("/");
				} ,
				function(errResponse){
					$('#main').unblock();
					console.error('Error while creating User.');
				}	
		);
	};
	//Click of save button
	$scope.save = function(page) {
		$scope.saveOnly(4);
		if (page==='add'){

			var pref1 = $scope.application.additionalInfo.pref1;
			var pref2 = $scope.application.additionalInfo.pref2;
			$scope.pref1=false;
			$scope.pref2=false;	
			$scope.locationSame =false;
			if ($scope.additionalInfoForm.$invalid) { 
				$scope.pref1 = $scope.additionalInfoForm.pref1.$error.required;
				$scope.pref2 = $scope.additionalInfoForm.pref2.$error.required;
			}else if ( pref1===pref2){
				$scope.locationSame = true;
			}else{
				console.log("Application"+ appl);
				$('#main').block({ 
					message: '<h1>Processing</h1>', 
					css: { border: '3px solid #a00' } 
				}); 

				var appl= $rootScope.application;
				regService.registerAppl(appl)
				.then(
						function(data){
							console.log('Data saved while creating User.'+ data);
							$('#main').unblock();
							$location.path("resultpage");
						} ,
						function(errResponse){
							$('#main').unblock();
							console.error('Error while creating User.');
						}	
				);
			}
		}
		if (page==='review'){
			console.log("Application"+ appl);
			$('#main').block({ 
				message: '<h1>Processing</h1>', 
				css: { border: '3px solid #a00' } 
			}); 

			var appl= $rootScope.application;
			regService.registerAppl(appl)
			.then(
					function(data){
						console.log('Data saved while creating User.'+ data);
						$('#main').unblock();
						$location.path("resultpage");
					} ,
					function(errResponse){
						$('#main').unblock();
						console.error('Error while creating User.');
					}	
			);
		}	
	};

	$scope.personalInfo={};
	$scope.login = function() {
		console.log("Application"+ $scope.personalInfo);
		$('#main').block({ 
			message: '<h1>Login...</h1>', 
			css: { border: '3px solid #a00' } 
		}); 
		UserService.login($scope.personalInfo)
		.then(
				function(data){
					$('#main').unblock();
					if (data != ""){

						$rootScope.application=data;
						var  pageNo = $rootScope.application.pageNo;

						if ($rootScope.application.personalInfo.dob!=null){
							var dob = $rootScope.application.personalInfo.dob;
							dob  = dob.substring(0, dob.indexOf("T"));
							$rootScope.application.personalInfo.dob = new Date(dob);

						}

						if($rootScope.application.eductionalInfo.admissionTest!=null && $rootScope.application.eductionalInfo.admissionTest.adm_test_name!=null ){
							$rootScope.application.eductionalInfo.admissionTest.status="1";
							var doe = 	$rootScope.application.eductionalInfo.admissionTest.doe;
							doe  = doe.substring(0, doe.indexOf("T"));
							$rootScope.application.eductionalInfo.admissionTest.doe = new Date(doe);
						}



						var newRecord = {
								id:  1,
								value: ''
						};
						if ($rootScope.application.personalInfo.languages ==null){
							$rootScope.application.personalInfo.languages.push(newRecord);
						}
						
					if ($rootScope.application.acceptedDate === ""){	
						if (pageNo==="1"){
							$location.path("personalInfo");
						}else if (pageNo==="2"){
							$location.path("eductionInfo");
						}else if (pageNo==="3"){
							$location.path("workInfo");
						}else if (pageNo==="4"){
							$location.path("additionalInfo");
						}else{
							$location.path("personalInfo");
						}
					}else{
						if ($rootScope.application.tranId !=null){
							$location.path("review").search({cs: false});
						}else{
							$location.path("resultpage");
						}
					}	





					}else{
						$scope.failedLogin=true;

					}
				} ,
				function(errResponse){
					$('#main').unblock();
					console.error('Error while creating User.');
				}	
		);
	};
	$scope.captchaValid =false;
	$scope.validateCaptcha = function(){
		if(vcRecaptchaService.getResponse() === ""){ //if string is empty
			$scope.userInfoForm.$invalid = true;
			$scope.captchaErr =true;
			return false;
		}else {
			var post_data = {  //prepare payload for request
					'response':vcRecaptchaService.getResponse()   //send g-captcah-response to our server
			}


			$.ajax({
				url: 'validateCapcha',
				data: post_data,
				type: 'POST',
				async: false,
				success: function(response){
					if(response.success != true){
						$scope.userInfoForm.$invalid = true;
						$scope.captchaErr =true;
						vcRecaptchaService.reset();
						return false;
					}else{
						
						$scope.captchaValid=true;
					}
				}
			});



		}

	};

	$scope.createUser = function() {
		console.log("Application"+ $scope.personalInfo);
		if ($scope.captchaValid === false){
			$scope.validateCaptcha();
			
		}

		$scope.personalInfo.dob=$scope.dt;
		if($scope.personalInfo.password != $scope.password  ){
			$scope.isPswdMacthFail =true;
			$scope.userInfoForm.$invalid = true;
		}
		if($scope.personalInfo.emailId!= $scope.emailId  ){
			$scope.isEmailMacthFail =true;
			$scope.userInfoForm.$invalid = true;
		}
		if ($scope.userInfoForm.$invalid ) { 
			$scope.isFormError =$scope.userInfoForm.$invalid;
			$scope.isEmptyEmail = $scope.userInfoForm.email_id.$error.required;
			$scope.isInvalidEmail = $scope.userInfoForm.email_id.$error.email;
			$scope.isFName = $scope.userInfoForm.first_name.$error.required;
			$scope.isLName = $scope.userInfoForm.last_name.$error.required;
			$scope.isFNamePtrErr = $scope.userInfoForm.first_name.$error.pattern;
			$scope.isMNamePtrErr = $scope.userInfoForm.middle_name.$error.pattern;
			$scope.isLNamePtrErr = $scope.userInfoForm.last_name.$error.pattern;
			$scope.isGender = $scope.userInfoForm.gender.$error.required;
			$scope.isdob = $scope.userInfoForm.dob.$error.required;
			$scope.isMobile = $scope.userInfoForm.mobile_number.$error.required;
			$scope.isMobile_number = $scope.userInfoForm.mobile_number.$error.number;
			$scope.isMobile_min = $scope.userInfoForm.mobile_number.$error.minlength;
			$scope.isMobile_max = $scope.userInfoForm.mobile_number.$error.maxlength;
		}else{
			$('#main').block({ 
				message: '<h1>Creating User</h1>', 
				css: { border: '3px solid #a00' } 
			}); 
			UserService.createUser($scope.personalInfo)
			.then(
					function(data){
						console.log('Data saved while creating User.'+ data);
						$('#main').unblock();
						$rootScope.isUserCreated = true;
						$location.path("/");
					} ,
					function(errResponse){
						$('#main').unblock();
						$scope.isUserCreateFailed =true;
						console.error('Error while creating User.');
					}	
			);

		}
	};

	//Add language 
	$scope.languages = $rootScope.application.personalInfo.languages;
	$scope.counter =0 ;
	$scope.addLang = function() {
		if ($scope.counter < 5){
			var newRecord = {
					id:  $scope.counter,
					value: ''
			};
			$scope.counter++;
			$scope.languages.push(newRecord);
		}
	}
	//Next of personal info



	$scope.personalInfoNext = function() {
		$scope.saveOnly(1);
		if ($scope.personalInfoForm.$invalid) { 
			$scope.isFormError =$scope.personalInfoForm.$invalid;
			$scope.isEmptyEmail = $scope.personalInfoForm.email_id.$error.required;
			$scope.isInvalidEmail = $scope.personalInfoForm.email_id.$error.email;
			$scope.isFName = $scope.personalInfoForm.first_name.$error.required;
			$scope.isLName = $scope.personalInfoForm.last_name.$error.required;
			$scope.isFNamePtrErr = $scope.personalInfoForm.first_name.$error.pattern;
			$scope.isMNamePtrErr = $scope.personalInfoForm.middle_name.$error.pattern;
			$scope.isLNamePtrErr = $scope.personalInfoForm.last_name.$error.pattern;
			$scope.isGender = $scope.personalInfoForm.gender.$error.required;
			$scope.isMartial_status = $scope.personalInfoForm.martial_status.$error.required;
			$scope.nationality_pattern = $scope.personalInfoForm.nationality.$error.pattern;
			$scope.isNationality = $scope.personalInfoForm.nationality.$error.required;
			$scope.isCategory = $scope.personalInfoForm.category.$error.required;
			$scope.isdob = $scope.personalInfoForm.dob.$error.required;
			$scope.isLanguage = $scope.personalInfoForm.langForm_0.language_0.$error.required;
			for (var index=0; index <= $scope.counter ; index++ ){
				if(index == 0){
					$scope.lang_pattern_0 = $scope.personalInfoForm.langForm_0.language_0.$error.pattern;
				}
				if(index == 1){
					$scope.lang_pattern_1 = $scope.personalInfoForm.langForm_1.language_1.$error.pattern;
				}
				if(index == 2){
					$scope.lang_pattern_2 = $scope.personalInfoForm.langForm_2.language_2.$error.pattern;
				}
				if(index == 3){
					$scope.lang_pattern_3 = $scope.personalInfoForm.langForm_3.language_3.$error.pattern;
				}
				if(index == 4){
					$scope.lang_pattern_4 = $scope.personalInfoForm.langForm_4.language_4.$error.pattern;
				}
			}
			$scope.isCountry = $scope.personalInfoForm.your_country.$error.required;
			$scope.isAddress_line1 = $scope.personalInfoForm.address_line1.$error.required;
			$scope.isAddress_line2 = $scope.personalInfoForm.address_line2.$error.required;
			$scope.isState = $scope.personalInfoForm.state.$error.required;
			$scope.isStatePtrn =$scope.personalInfoForm.state.$error.pattern;
			$scope.isCity = $scope.personalInfoForm.city.$error.required;
			$scope.isCityPtrnErr= $scope.personalInfoForm.city.$error.pattern;
			$scope.isMobile = $scope.personalInfoForm.mobile_number.$error.required;
			$scope.isMobile_number = $scope.personalInfoForm.mobile_number.$error.pattern;
			$scope.isMobile_min = $scope.personalInfoForm.mobile_number.$error.minlength;
			$scope.isMobile_max = $scope.personalInfoForm.mobile_number.$error.maxlength;
			$scope.isPinCode = $scope.personalInfoForm.pinCode.$error.required;
			$scope.isPinCode_number = $scope.personalInfoForm.pinCode.$error.pattern;
		}else{
			$rootScope.application.personalInfo.languages = $scope.languages;
			$location.path("eductionInfo");
		}
	}

	$scope.pSelected = false;
	$scope.gSelected = false;
	$scope.selected= function(dType){
		if (dType==='g'){
			$scope.pSelected = false;
		}else{
			$scope.gSelected = false;
		}
	}


	$scope.addgrad= function(){
		var gradTempl= {
				id: 1, 	
				obtained: "",
				subject: "",
				college: "",
				university: "",
				from_month: "",
				from_year: "",
				to_month: "",
				to_year: "",
				marks: "",
				maxmarks: "",
				division: ""
		};


		$rootScope.application.eductionalInfo.gdAdd.push(gradTempl);
	}



	$scope.addpg= function(){
		var gradTempl= {
				id: 1, 	
				obtained: "",
				subject: "",
				college: "",
				university: "",
				from_month: "",
				from_year: "",
				to_month: "",
				to_year: "",
				marks: "",
				maxmarks: "",
				division: ""
		};
		$rootScope.application.eductionalInfo.pgAdd.push(gradTempl);
	}



	$scope.addCmp= function(){
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

	}


	$scope.addpq= function(){
		var pqTempl= {		
				obtained: "",
				college: "",
				from_month: "",
				from_year: "",
				marks: "",
				division: ""
		}
		$rootScope.application.eductionalInfo.pqAdd.push(pqTempl);
	}


	$scope.eductionalInfoNext = function() {
		$scope.saveOnly(2);
		if ($scope.eductionalInfoForm.$invalid) { 
			$scope.sch_dt_req=false;
			$scope.hsch_dt_req=false;
			$scope.isFormError =$scope.eductionalInfoForm.$invalid;
			//Start of School validation 
			$scope.school_board_name = $scope.eductionalInfoForm.school_board_name.$error.required;
			var sch_mn_req = $scope.eductionalInfoForm.school_to_month.$error.required;
			var sch_yr_req = $scope.eductionalInfoForm.school_to_year.$error.required;
			if (sch_mn_req || sch_yr_req){
				$scope.sch_dt_req =true;
			}
			$scope.school_board_digits=$scope.eductionalInfoForm.school_board_name.$error.pattern;
			$scope.std_percentage = $scope.eductionalInfoForm.std_percentage.$error.required;
			$scope.std_percentPtrnErr=  $scope.eductionalInfoForm.std_percentage.$error.pattern;
			$scope.std_division = $scope.eductionalInfoForm.std_division.$error.required;
			//End of School validation 
			$scope.school12_board_name = $scope.eductionalInfoForm.school12_board_name.$error.required;
			$scope.stream12_name = $scope.eductionalInfoForm.stream12_name.$error.required;
			$scope.stream12_nametextE=$scope.eductionalInfoForm.stream12_name.$error.pattern;
			$scope.std12_percentage = $scope.eductionalInfoForm.std12_percentage.$error.required;
			$scope.std12_percentPtrnErr=$scope.eductionalInfoForm.std12_percentage.$error.pattern;
			$scope.std12_division = $scope.eductionalInfoForm.std12_division.$error.required;
			$scope.school12_board_name_digits =$scope.eductionalInfoForm.school12_board_name.$error.pattern;
			var hsch_mn_req = $scope.eductionalInfoForm.highschool_to_month.$error.required;
			var hsch_yr_req = $scope.eductionalInfoForm.highschool_to_year.$error.required;
			if (hsch_mn_req || hsch_yr_req){
				$scope.hsch_dt_req =true;
			}
			//Start of GD 
			$scope.gd_obtained = $scope.eductionalInfoForm.gd_obtained.$error.required;
			$scope.gd_subject = $scope.eductionalInfoForm.gd_subject.$error.required;
			$scope.gd_college = $scope.eductionalInfoForm.gd_college.$error.required;
			$scope.gd_university = $scope.eductionalInfoForm.gd_university.$error.required;
			$scope.gd_from_month = $scope.eductionalInfoForm.gd_from_month.$error.required;
			$scope.gd_from_year = $scope.eductionalInfoForm.gd_from_year.$error.required;
			$scope.gd_to_month = $scope.eductionalInfoForm.gd_to_month.$error.required;
			$scope.gd_to_year = $scope.eductionalInfoForm.gd_to_year.$error.required;
			$scope.gd_marks = $scope.eductionalInfoForm.gd_marks.$error.required;
			$scope.gd_maxmarks = $scope.eductionalInfoForm.gd_maxmarks.$error.required;
			$scope.isGDMarksErr=$scope.eductionalInfoForm.gd_marks.$error.pattern;
			$scope.isGDMaxMarksErr=$scope.eductionalInfoForm.gd_maxmarks.$error.pattern;
			$scope.gd_division = $scope.eductionalInfoForm.gd_division.$error.required;
			$scope.isDegreeObtainedErr = $scope.eductionalInfoForm.gd_obtained.$error.pattern;
			$scope.isSubjectErr= $scope.eductionalInfoForm.gd_subject.$error.pattern;
			$scope.isCollegeErr= $scope.eductionalInfoForm.gd_college.$error.pattern;
			$scope.isUniversityErr=$scope.eductionalInfoForm.gd_university.$error.pattern;
			$scope.pq_marksPercentPtrnErr=$scope.eductionalInfoForm.pq_marks.$error.pattern;
			$scope.adm_marksPercentPtrnErr=$scope.eductionalInfoForm.adm_percentage.$error.pattern;
			$scope.adm_test_name = $scope.eductionalInfoForm.adm_test_name.$error.required;
			$scope.doe = $scope.eductionalInfoForm.doe.$error.required;
		}else{
			$location.path("workInfo");
		}
	}
	$scope.isDisabled= false;
	$scope.accept = (function(){      
		$scope.isDisabled= false;
	});
	$scope.reject = (function(){      
		$scope.isDisabled= true;
	});


	$scope.workInfoNext = function() {
		$scope.saveOnly(3);
		if ($scope.workInfoForm.$invalid) {
			$scope.total_wexp  = $scope.workInfoForm.total_wexp.$error.pattern;
			$scope.we_desig  = $scope.workInfoForm.we_desig.$error.pattern;
			$scope.isCityPtrnErr= $scope.workInfoForm.we_city.$error.pattern;
			$scope.isPinCode_number = $scope.workInfoForm.we_pincode.$error.pattern;
		}else{
			$rootScope.application.additionalInfo.decleration="1";
			$location.path("additionalInfo");
		}
	}
	$scope.proceedPay= function() {
		var personalInfo = $rootScope.application.personalInfo;
		$('#main').block();
		regService.createToken(personalInfo)
		.then(
				function(data){
					console.log('Data saved while creating User.'+ data);
					$('#main').unblock();
					var ttype = data.merchant.response.param[0].content;
					var tempTxnId= data.merchant.response.param[1].content;
					var token = data.merchant.response.param[2].content;
					var txnStage= data.merchant.response.param[3].content;
					var payUrl= "https://payment.atomtech.in/paynetz/epi/fts?ttype="+ttype+"&tempTxnId="+tempTxnId + "&token=" + token + "&txnStage="+txnStage;
					window.location= payUrl;
				} ,
				function(errResponse){
					$('#main').unblock();
					console.error('Error while creating User.');
				}	
		);


	}

	

	$scope.srcInfoType= [  "News Paper",  "Internet Search", "Institute Website", "Email" ,"SMS" ,"Social Media","College Seminar", "Current Student" , "Adani Employee" , "Institute Alumni", "Faculty", "Friend","Relative" , "Education Portal" , "Other" ];

	$scope.years=["1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015"];


	$scope.toggleTag = function(tag){
		if ( $rootScope.application.additionalInfo.srcTags ===undefined){
			$rootScope.application.additionalInfo.srcTags=[];

		}
		var idx = $rootScope.application.additionalInfo.srcTags.indexOf(tag);
		if (idx > -1){
			$rootScope.application.additionalInfo.srcTags.splice(idx, 1);
		}else{
			$rootScope.application.additionalInfo.srcTags.push(tag);
		}
	}


}]);


$.urlParam = function(name, url) {
	if (!url) {
		url = window.location.href;
	}
	var results = new RegExp('[\\?&]' + name + '=([^&#]*)').exec(url);
	if (!results) { 
		return undefined;
	}
	return results[1] || undefined;
}

function vcRecaptchaApiLoaded(){
	
	$('#main').unblock();
	
}


