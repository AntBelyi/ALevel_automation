Feature: Home Page Verification

  Scenario: Verify Help Center page title
    Given I am on the Home Page
    When I click on the Help Center link
    Then I am navigated to the Help Center page
    And the page title should be 'Найактуальніше'

  Scenario: Verify empty cart
    Given I am on the Home Page
    When I click on the cart icon
    Then I should see a page with title containing 'Кошик порожній'
    And I should see an image on the cart page

  Scenario: Verify error message for invalid package number
    Given I am on the Home Page
    When I navigate to the package tracking page
    And I enter an invalid package number
    And I click the track button
    Then I should see an error message