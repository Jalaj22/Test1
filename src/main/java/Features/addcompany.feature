Feature: Add Company into Watchlist 

Scenario: Add Company feature Test 

	Given user is already on Login Page 
	When title of login page is Sharekhan Online Trading Account Login 
	Then user enters username and password 
	| JALAJ8772 | FORAM@28 |
	Then user clicks on login button 
	Then user is on homepage 
	Then click on MarketWatch 
	Then click on Create Watchlist 
	Then enter watchlist name
	|  IT  |
	Then click on OK button 
	Then click on Close button
	Then enter interested company name
	| company |
	| TCS |
	| RELIANCE |
	| WIPRO |
	| TATAMOTORS |
	| BSOFT |
	| HPL |
	Then click on ADD button
	Then close the browser