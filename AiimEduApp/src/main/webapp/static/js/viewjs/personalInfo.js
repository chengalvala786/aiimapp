
$.noConflict();


// start of Validation 

jQuery( document ).ready(function() {

	
	
	jQuery( "#date_of_birth" ).datepicker();

	 
	 
	// validate the comment form when it is submitted
	
	
	// validate signup form on keyup and submit
	jQuery("#personalInfoForm").validate({
		rules: {
			first_name: "required",
			middle_name: "required",
			last_name: "required",
			your_country: "required",
			address_line1: "required",
			address_line2: "required",
			state: "required",
			city: "required",
			date_of_birth : "required",
			pinCode:  {
				required: true,
				minlength: 10
				
			},
			mobile_number:  {
				required: true,
				minlength: 10
				
			},
			password: {
				required: true,
				minlength: 5
			},
			
			email_id: {
				required: true,
				email: true
			}
			
		},
		messages: {
			firstname: "Please enter your first name",
			lastname: "Please enter your last name",
			middle_name: "Please enter your last name",
			your_country: "Please enter the country name",
			email: "Please enter a valid email address",
			address_line1: "Please enter  Address Line 1",
			address_line2: "Please enter  Address Line 2",
			state:"Please enter the State",
			city:"Please enter the City",
			pinCode:"Please enter a valid Pincode"
			
			
		}
			
			
	});

//End of Validation

});