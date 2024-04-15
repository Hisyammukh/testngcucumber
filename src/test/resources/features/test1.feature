@smoke
Feature: Google Test
  Scenario: Validates google website title
    Given Website as "https://google.com/"
    # When I get title
    Then I validate is "Google"