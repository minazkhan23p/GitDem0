Feature: Application Login


Scenario Outline: E2E Login validation

Given inititialize the driver with chrome 
And navigate to "http://www.qaclickacademy.com/" site
When user clicks on Login in homepage and user has provided <username> and <password>
And clicks on login button
Then user is landed to the homepage
And close browser

Examples: 
|username		|password		|
|minaz			|test@123		|
|khan				|mxosni			|
