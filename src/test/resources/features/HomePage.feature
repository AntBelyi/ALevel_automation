Feature: Home Page Verification

  Scenario: Verify Help Center page title
    Given User is on the Home Page
    When User clicks on the Help Center link
    Then Verify user is navigated to the Help Center page
    And Verify page title is "Найактуальніше" on Help Center page

  Scenario: Verify empty cart
    Given User is on the Home Page
    When User clicks on the cart icon
    Then User should see a page with title containing 'Кошик порожній'
    And User should see an image on the cart page

  Scenario: Verify error message for invalid package number
    Given User is on the Home Page
    When User navigates to the package tracking page
    When User enters an invalid package number
    When User clicks the track button
    Then User should see an error message