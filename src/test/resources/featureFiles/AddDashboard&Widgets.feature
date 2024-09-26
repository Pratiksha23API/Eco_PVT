Feature: create dashboard Module

		@Login	
		Scenario: Login to Eco app
		Given User launch the browser
#		When  User opens URL "https://staging.ecolibrium.io/" 
		When  User opens URL "https://smartsense.ecolibrium.io/" 
		And   User enters Username as "qa12" 
		And   User enters Password as "qa12" 
		And   Click on the Login 
		Then  Page Title should be "SmartSense"

 Scenario: Create dashboard and add widget successfully
 Given User is on Smartsense page and add dashboard as "widgets"
 When User Add widget as "Pie Chart" then Verify after refresh preview widget is dispayed compulsory
 When Clone dispayed the widget it gets clone succefully after that delete that clone widget
 When User again Add widget as "Sensor Health" then Verify after refresh preview widget is dispayed compulsory
 
 
 Scenario: Verify user able to download dashboard file
 When User Download the widget data as img 
 Then Verify downloaded file of data is avaliable in project folder with "smartsense_image.png" name
 When User Download the widget data as pdf 
 Then Verify downloaded file of data is avaliable in project folder with "smartsense.pdf" name
 And Finally user Setting up the dashboard with unified date picker and update it
 Then Delete the dashboard and user will get messg as "Dashboard Deleted"
