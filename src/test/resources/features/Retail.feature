
 @retailCompelete @regression

 
Feature:   - for this feature you have to have an existing account

Background:
 
Given User is on Retail website now                                                                                 
And User click on MyAccount                                                                                          
When User click on Login                                                                                             
And User enter username userName and password                                                                   
And User click on Login button                                                                                       
Then User should be logged in to MyAccount dashboard                                                          
                                                                                                              
  
  


Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on Register for an Affiliate Account link 
And User fill affiliate form with below information
|company|website|taxID|
|bird|www.bird5.com|tax1292|
And User check on About us check box 
And User click on Continue button 
Then User should see a success message 

                                                                                                                                                                                                                                        
                                                                                                                       
        Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer                                                                 
      When User click on Edit your affiliate informationlink                                                                                                            
       	And user click on Bank Transfer radio buttonn                                                                                                                    
       And User fill Bank information with below information                                                                                                             
        |bankName|abaNumber|swiftCode|accountName|accountNumber|                                                                                                         
        |MBAP|51|9191|sado|1343365|                                                                                                                                             
        And User click on Continue button on page                                                                                                                        
        Then User should see a success message on page                                                                                                                   
                                                                                                                                                                         
                                                                                                                                                                         
                                                                                                                                                                                   
    Scenario: Edit your account Information                                                                                                                              
                                                                                                                                                                         
    When User click on Edit your account information link                                                                                                              
    And User modify below information                                                                                                                                    
    |firstname|lastName|email|telephone|                                                                                                                                 
    |Eman|Danish|mm113@gmail.com|334466|                                                                                                                                     
    And User click on continue buttonn                                                                                                                                   
    Then User should see a message ‘Success: Your account has been successfully updated.’                                                                                
                                                                                                                                                                         
                                                                                                                                                                          
                                                                                                                                                              
                                                                                                                                                              
                                                                                                                                                              
                                                                                                                                                                               
                                                                                                                                                              