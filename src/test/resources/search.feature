Feature: Testing github functionality

  Scenario Outline: User visit Github page as guest and search repo and do click on About page
    Given User visited the Github portal
    When User search with "<repoName>"
    Then User verify with "<repoExpectName>"
    And  User click on the About page
    Examples:
      | repoName         | repoExpectName            |
      | create-react-app | facebook/create-react-app |



