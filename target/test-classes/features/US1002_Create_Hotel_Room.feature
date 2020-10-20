Feature:US1002_Create Hotel Room
  @hotel_Room_Test
  Scenario: TC01_Testing_hotel_room_creation

    Given user is on the kaolaMain page
    And user clicks on the kaolaMainLogin button
    And user sends username
    And user sends password
    And user clicks on the kaolaLogin button
    And user clicks on the hotelManagement
    And user clicks on the hotelRooms
    And user clicks on the addHotelRoomButton
    And user select Hotel
    And user sends code
    And user sends name
    And user sends Location
    And user sends Description
    And user sends price
    And user chooses room type
    And user sends maxAdultCount
    And user sends maxChildrenCount
    And user clicks Approved
    And user clicks save button
    And user see successMessage
    Then user clicks ok button


