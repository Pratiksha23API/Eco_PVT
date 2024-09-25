Feature: Login 

@Login
Scenario: Successful Login with Valid Credentials 
	Given User launch the browser
#	When User opens URL "https://demo.ecolibrium.io/" 
	When User opens URL "https://smartsense.ecolibrium.io/" 
	And User enters Username as "qa12" 
	And User enters Password as "qa12" 
	And Click on the Login 
	Then Page Title should be "SmartSense" 
  #When User click on Log out button 
  #Then Page Title should be "SmartSense" 
  #And close browser