Feature:Movies end point

  Scenario: Send post http protocol
    Given the user set uri
    And the user sends post request with "/movies" end point
      | title           | Stranger |
      | year            | 1999     |
      | plot            | MrtFth   |
      | duration        | 123      |
      | audio_qualities |          |
      | video_qualities |          |
      | genres          |          |

#ctrl+alt+L to organize the feature



    When Verify the status code is 200
    And Verify the content type is "application/json; charset=utf-8"
    Then print the response body

  Scenario: Send put http protocol
    Given the user set uri
    And the user sends put request with "/movies" end point
      | id              | 1459   |
      | title           | Dallas |
      | year            | 2012   |
      | plot            | Volkan |
      | duration        | 1111   |
      | audio_qualities |        |
      | video_qualities |        |
      | genres          |        |
    When Verify the status code is 200
    Then Verify the response body is updated
