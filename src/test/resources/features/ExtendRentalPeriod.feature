Feature: As a user i should be able to extend the book rental period
  @wip @ui
  Scenario: Extend rental period of book
    Given user on the login page
    When user enter valid user "user number" and password "password" in the input box
    Then user on the start page
    When user click the Jugendbibliothek
    And user navigate to the Katalog page
    And user click the verlängern checkbox on the data table
    And user click the Markierte verlängern button



