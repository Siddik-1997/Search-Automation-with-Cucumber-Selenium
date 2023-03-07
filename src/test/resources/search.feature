Feature: Testing github functionality

  Scenario Outline: User visits Github site as a guest for doing some actions
    Given User visited the Github portal
    When User search with "<repoName>"
    Then User verify with "<repoExpectName>"
    And  User click on the About page
    Examples:
      | repoName         | repoExpectName            |
      | create-react-app | facebook/create-react-app |



