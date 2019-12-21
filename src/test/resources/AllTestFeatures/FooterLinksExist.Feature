Feature: Footer Link Exist
  As a user I can see the Footer links

  Background: User on HOme Page
    Given User is on MCT home page

  Scenario: User can see the footer links
    Then User can see the footer links table
      | About Us           |
      | FAQ                |
      | Help               |
      | Site Feedback      |
      | Terms & Conditions |
      | Contact Us         |
      | Combo Products     |
      | New Products       |
      | Featured Products  |
      | Categories         |
      | View Cart          |
      | Gift Certificate   |
      | Affiliates         |
      | Sellers            |
      | Home               |
      |                    |
      |                    |
