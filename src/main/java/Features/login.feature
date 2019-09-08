Feature: Sharekhan Login Feature 

#without examples keyword
#Scenario: Sharekhan Login Test scenario 
#
#	Given user is already on Login Page 
#	When title of login page is Sharekhan Online Trading Account Login 
#	Then user enters "JALAJ8772" and "FORAM@28" 
#	Then user clicks on login button 
#	Then user is on homepage
#	Then close the browser

#with examples keyword
Scenario Outline: Sharekhan Login Test scenario 

	Given user is already on Login Page 
	When title of login page is Sharekhan Online Trading Account Login 
	Then user enters "<username>" and "<password>" 
	Then user clicks on login button 
	Then user is on homepage 
	Then close the browser 
	
	Examples: 
		| username  | password |
		| JALAJ8772 | FORAM@28 |
		| ajhwuiu89 | ljiasi78 |
		