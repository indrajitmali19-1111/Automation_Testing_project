Feature: Open cart register and logout


	Scenario: verify after entering all data Registration successfull  
	
		Given website should be launch
		When enter username,first name,lastname , email , country , password
		And click Register 
		
		Then User should be registered successfully
		
		
	Scenario:verify after enter the valid credential to login successfull
		Given Login page should be launch 
		When enter email and password
		

		
		
		
		