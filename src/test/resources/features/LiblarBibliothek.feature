@wip
Feature:As a user I should be able to reservation a book which i want to.

  Scenario: Login with valid credentials
    Given User on the "login page"
    When User enter valid "credentials" in the input box
    And user click the enter
    Then user on the "Starseite Page"

    Scenario: Search a book
      Given user on the "Starseite Page"
      When user click the Jugendbibliothek
      And user navigate to the Katalog page
      And user enter the "book name" in teh search box
      And user click the enter
      Then user should be able to see the search result

      Scenario:Book the book I'm looking for
        Given user on the "search result page"
        When user click the "vormerkung bestätigen" button
        And user should be able to see the "book name" on the reservation table

