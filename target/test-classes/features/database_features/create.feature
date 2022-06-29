Feature: create_new_hotel


  @db
  Scenario: TC01_Create_Hotel_Test
    Given user connects to the database
    When user creates a new hotel with this values "'3000','Royal King Hotel','LA Downtown','8889900','royalla@testemail.com','2021-10-10 19:40:47.597', 4"
    Then verify the creation is successful