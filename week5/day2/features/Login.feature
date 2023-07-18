Feature:  Login to LeafTaps Applications

#Background:
#Given Launch the browser and Load the url and Maximize screen

#tags

@smoke @dilip
Scenario: Login to Positive Data

And Enter the username as demoCsr
And Enter the password as crmsfa
When Click on the loginbutton
Then verify my page sucessfully login

@dilip
Scenario: Login to Positive Data

And Enter the username as demosalesManager
And Enter the password as crmsfa
When Click on the loginbutton
Then verify my page sucessfully login 


@regression @dilip
Scenario: Login to Negative Data

And Enter the username as demoCsr1
And Enter the password as crmsfa
When Click on the loginbutton
But verify my page not sucessfully login


#Scenario Outline: Login with Different set1 of data
#And Enter the username as <username>
#And Enter the password as <password>
#When Click on the loginbutton
#Then verify my page sucessfully login 
#But verify my page not sucessfully login
#Examples:
#|username|password|
#|DemosalesManager|crmsfa|
#|demo1|crmsfa|


#Scenario Outline: Login with Different set2 of data
#And Enter the username as <username>
#And Enter the password as <password>
#When Click on the loginbutton
#Then verify my page sucessfully login 
#But verify my page not sucessfully login
#Examples:
#|username|password|
#|DemoCsr2|crmsfa|
#|demo2|crmsfa|









