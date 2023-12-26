
Feature:US1005_Create_an_Account_Global_Parameters

  ~@hooks
  Scenario Outline: TC_001_Testing_Create_an_Account_On_Global
    Given user is on the global trader page
    When user click on Seller Join Now  Button
    And user click on Company Seller box
    And user type a Company Name <string>
    And user type a Company  Mobile <string1>
    And user type an Company Address <string2>
    And user type a Name <string3>
    And user type an Email <string4>
    And user type a Sub Domain <string5>
    And user type a Mobile Number <string6>
    And user choose a Country
    And user type a State <string7>
    And user type a City <string8>
    And user type an Address <string9>
    And user type an Postal Code <string10>
    And user choose a Categories
    And user type a Password <string11>
    And user click on Registration Box
    Then user get message"Thank you to join our team. You are Registered Successfully."
    Examples:
      | string | string1      | string2  | string3 | string4          | string5  | string6      | string7 | string8 | string9 | string10 | string11 |
      | "emre" | "1111111115" | "kasfdl" | "aaa"   | "abcdeaa@gmail.com" | "dgfgfd" | "4211141111" | "sadf"  | "aa"    | "dd"    | "12345"  | "12313"  |
      | "emre" | "1111111114" | "kasfdl" | "aaa"   | "abcdaes@gmail.com" | "dgfgfd" | "4211151111" | "sadf"  | "aa"    | "dd"    | "12345"  | "12313"  |
      | "emre" | "1111111115" | "kasfdl" | "aaa"   | "abcdfae@gmail.com" | "dgfgfd" | "4211161111" | "sadf"  | "aa"    | "dd"    | "12345"  | "12313"  |
      | "emre" | "1111111115" | "kasfdl" | "aaa"   | "abcdafe4@gmail.com" | "dgfgfd" | "4211141111" | "sadf"  | "aa"    | "dd"    | "12345"  | "12313"  |
