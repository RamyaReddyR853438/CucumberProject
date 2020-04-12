@Flipkart
Feature: Flipkart Shopping
@tc_01_login
Scenario Outline: validating login
Given I launch Chrome Browser
 When enter "<username>" and "<password>" in the field
 Then click submit button
 Then  Takes Screenshot
 Examples:
 |username  |                         |password|
 |7386670356|                         |ramya448|  
 
 

@tc_02_Search
Scenario Outline: validating search
Given I launch chrome Browser
When  I enter  "<username>" and "<password>" in the field
Then  click on submit button
Then  click on offerzone
Then Takes screenshot
 Examples:
 |username  |                         |password|              
 |7386670356|                         |ramya448|    
 
 
 @tc_03_Selection
Scenario Outline: validating selection
Given I launch chrome browser
When  Now enter  "<username>" and "<password>" in the field
Then  click on Submit button
Then  Go to offerzone
Then  click on viewall
Then takes screenshot


 Examples:
 |username  |                         |password|              
 |7386670356|                         |ramya448|     
 
 
  @tc_04_Display
Scenario Outline: validating ProductDisplay
Given I launch Chrome browser
When  Enter  "<username>" and "<password>" in the field
Then  click on Submit Button
Then  Go to Offerzone
Then  Select the type of item from fashion and deals
Then takes Screenshot

 Examples:
 |username  |                         |password|              
 |7386670356|                         |ramya448|          
 
 
 
 
 
 

