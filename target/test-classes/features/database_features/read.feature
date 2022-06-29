@db_read
Feature: read_the_hotel_reservation_information_from_the_database
  @db_hotel_room_price
  Scenario: TC01_Read_hotel_room_information
    Given user connects to the database
    And user gets the "Price" from "tHOTELROOM" table
    And user reads all of the "Price" column data
    Then close the connection


    @db_hotel_name
  Scenario: TC02_Read_hotel_information
    Given user connects to the database
    And user gets the "Name" from "tHOTEL" table
    And user reads all of the "Name" column data
      Then close the connection


  @db_hotel_address
  Scenario: TC03_Read_hotel_address_information
    Given user connects to the database
    And user gets the "Address" from "tHOTEL" table
    And user reads all of the "Address" column data
#    THIS GIVES 5 STEP DEFINITIONS
#  When I parameteterize the feature file then I can use that step for all others
#   And user gets the "COLUMN" from "TABLE" table
#    And user gets the "Price" from "tHOTEL" table
#    And user gets the "Address" from "tHOTEL" table
#    And user gets the "Phone" from "tHOTEL" table
#    And user gets the "Price" from "tHOTELROOM" table
#    And user gets the "Name" from "tHOTELROOM" table