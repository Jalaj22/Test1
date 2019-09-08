Feature: Sharekhan WatchList Feature 

#with examples keyword
Scenario Outline: Sharekhan Watchlist Test scenario 

	Given user is already on Login Page 
	When title of login page is Sharekhan Online Trading Account Login 
	Then user enters "<username>" and "<password>" 
	Then user clicks on login button 
	Then user is on homepage 
	Then click on MarketWatch 
	Then click on Create Watchlist 
	Then enter "<watchlist>" name 
	Then click on OK button 
	Then click on Close button
	Then close the browser 
	
	Examples: 
		| username  | password | watchlist |
		| JALAJ8772 | FORAM@28 | IT        |