Feature:As a user I should be able to reservation a book which i want to.
@wip @ui
  Scenario: Login with valid credentials
    Given user on the login page
    When user enter valid user "user number" and password "password" in the input box
    Then user on the start page
    When user click the Jugendbibliothek
    And user navigate to the Katalog page
    And user enter the "book name" in the search box
    Then user should be able to see the search result
    When user click the vormerkung bestätigung button
    Then user should be able to see the "book name" on the reservation table

