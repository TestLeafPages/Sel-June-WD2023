Feature: LeafTap Application

Scenario: positive data

Given Launch the browser and Load the url and Maximize screen
And Enter the username
And Enter the password
When Click on the loginbutton
Then verify that login passed
