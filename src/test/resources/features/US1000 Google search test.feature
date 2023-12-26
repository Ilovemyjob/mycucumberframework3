@smoke
Feature: US1000 Google search test
  Background: User is on the google page
    Given user is on the google page


  Scenario: TC01 Verify iphone search
    When user search for "school bag"
    Then verify the result has "school bag"
  @teapot
  Scenario: TC02 Verify tea pot search
    When user search for "tea pot"
    Then verify the result has "tea pot"
  Scenario: TC03 Verify flower search
    When user search for "flower"
    Then verify the result has "flower"
  Scenario: TC04 Verify bmw search
    When user search for "bmw"
    Then verify the result has "bmw"
