
    <Connector port="8082Feature:Login and Logout Functionality
Description:This feature verifies the login and logout functionality
Scenario:Verify the login functionality

Given I launch the Chrome Browser
And I navigate the Application url
When I enter the username in username text field
And I enter the password in password text feild
And I click on login button
Then I find the HomePage
And I minimize the flyout window

Scenario:Verify the Create user
And I click on user button
And I click on add user
When I enter the first name in First Name text field
And I enter the last name in Last Name text field
And I enter the email in Email text feild
And I enter the username in Username text field
And I enter the password in Password text field
And I enter the passwordcopy in Retype Password text field
When I click on create user button

Scenario:Verify the modify user

And I click modify password button
And I click on newuser password button
And I click on Retype password button
When I click on save changes button

Scenario:Verify the logout functionality
Given I find the HomePage
When I click on logout link
Then I find the login Page 