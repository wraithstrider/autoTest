@googleSearch
Feature: Search for fruit
  I want to search fruit in google

  @search
  Scenario Outline: Search fruit in google
    Given I am user
    When I go to website <website>
    And I search for <fruit>
    Then I should be on the search page
    And I should see <fruit> in the result page

    Examples: 
      | name  | website                | fruit    |
      | name1 | https://www.google.com | aratiles |