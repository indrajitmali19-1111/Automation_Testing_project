Feature: Student Registration form


	Scenario: Verify name, surname and email inserted
		Given Practise form should launch "https://demo.automationtesting.in/Register.html"
		When enter name  , surname and email
		Then name , surname and email should inserted successfull.