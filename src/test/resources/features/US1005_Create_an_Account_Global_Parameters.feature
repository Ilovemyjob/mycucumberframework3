
Feature:US1005_Create_an_Account_Global_Parameters
  @hooks
  Scenario:TC_001_Testing_Create_an_Account_On_Global
    Given user is on the global trader page
    And user click on Seller Join Now  Button
    And user click on Company Seller box
    And user type a Company Name "emre"
    And user type a Company  Mobile "1111111111"
    And user type an Company Address "kasfdl"
    And user type a Name "sadf"
    And user type an Email "abcd@gmail.com"
    And user type a Sub Domain "dgfgfd"
    And user type a Mobile Number "1211111111"
    And user choose a Country
    And user type a State "sadf"
    And user type a City "sadf"
    And user type an Address "afsda"
    And user type an Postal Code "12345"
    And user choose a Categories
    And user type a Password "12313"
    And user click on Registration Box
    And user get message"Thank you to join our team. You are Registered Successfully."
