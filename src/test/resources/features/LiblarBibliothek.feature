
Feature:As a user I should be able to reservation a book which i want to.
  @wip @ui
  Scenario: Login with valid credentials
    Given user on the login page
    When user enter valid user "user number" and password "password" in the input box
    Then user on the start page

    Scenario: Search a book
      Given Then user on the start page
      When user click the Jugendbibliothek
      And user navigate to the Katalog page
      And user enter the "book name" in teh search box
      And user click the enter
      Then user should be able to see the search result

      Scenario:Book the book I'm looking for
        Given user on the search result page
        When user click the vormerkung bestätigung button
        And user should be able to see the "book name" on the reservation table

