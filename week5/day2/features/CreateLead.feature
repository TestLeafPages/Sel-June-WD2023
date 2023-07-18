Feature: CreateLead Application

Scenario Outline: Login with Different set of data for CreateLead
Given Launch the browser and Load the url and Maximize screen
And Enter the username as DemoCsr
And Enter the password as crmsfa
When Click on the loginbutton
Then verify my page sucessfully login
When Click on CRMSFA link
And Click on Leads link
And Click on CreateLead link
Given Enter Companyname as <companyname>
And Enter Firstname as <firstname>
And Enter Lastname as <lastname>
When Click on Submit Button
Then ViewLeads page should be displayed as <companyname>
Examples:
|companyname|firstname|lastname|
|TestLeaf|Dilip|V R|
|TestLeaf|Gokul|s|
