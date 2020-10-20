Feature:US1005_Create_an_Account_Global
 ~ @hooks
  Scenario:TC_001_Testing_Create_an_Account_On_Global
    Given user is on the global trader page
    And user click on Seller Join Now  Button
    And user click on Company Seller box
    And user type a Company Name
    And user type a Company Mobile
    And user type an Company Address
    And user type a Name
    And user type an Email
    And user type a Sub Domain
    And user type a Mobile Number
    And user choose a Country
    And user type a State
    And user type a City
    And user type an Address
    And user type an Postal Code
    And user choose a Categories
    And user type a Password
    And user click on Registration Box
    And user get message"Thank you to join our team. You are Registered Successfully."
