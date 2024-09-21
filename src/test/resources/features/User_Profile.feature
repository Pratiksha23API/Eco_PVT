Feature: Test the User Profile Modeule

@Login
Scenario: Edit and Update the user profile
	Given User launch the browser
	When User opens URL "https://staging.ecolibrium.io/" 
	And User enters Username as "Mrinal.Patil" 
	And User enters Password as "@Eco123456" 
	And Click on the Login 
	Then Page Title should be "SmartSense"
	Then User cliks on user name button 
	And User wait for 1 seconds
  When User click on the user profile button
  And Get user "Unedited" details 
  Then User cliks on Edit profile details button
	And User Update Name As "New Test"
  And User Update Contact Number As "9876543210"
	Then User clicks on Number Format dropdown 
  And User verify "Number Format" bellow options should be displayed 
  |India - en-IN|
  |US/UK - en-US|
  Then User clicks on Delivery Mode dropdown 
  And User verify "Delivery Mode" bellow options should be displayed 
  |SMS|
  |Whatsapp|
  Then User clicks on update profile details button
  And User wait for 2 seconds
  And Get user "Edited" details  
  And User verify Edited details should be displayed as bellow
  |New Test|
  |mrinal.patil@ecolibrium.io|
  |9876543210|
  |US/UK - en-US|
  |Whatsapp|
  And User wait for 1 seconds
                            
  Then User cliks on Edit profile details button
  When User try  to edit name as "test" without space Then verify user should get notification as "Name should have one space" 
  When user enter name as per requirement i.e with one space as "QA 12" it update successfully
  Then User cliks on Edit profile details button
  When user try to edit contatNumber with less than 10 digit as "9456734" Then verify user should get notification as "Phone number should be 10 digit"
  When user enter contactNumber as per requirement i.e with ten digit  as "9922341615" it update successfully
  And User wait for 2 seconds
  And Get user "Edited" details  
  And User verify Edited details should be displayed as bellow
 |QA 12|
 |mrinal.patil@ecolibrium.io|
 |9922341615|
 |US/UK - en-US|
 |Whatsapp|
