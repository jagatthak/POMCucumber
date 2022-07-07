@cat
Feature: Category
  Background:
    Given User is on homepage

  Scenario Outline: User should be able to navigate to desired category page successfully from top header menu

    When User clicks on "<category_name>" link from top header menu
    Then User should be able to navigate successfully to "<category_url>" page

    Examples:
      | category_name     | category_url                                   |
      | Computers         | https://demo.nopcommerce.com/computers         |
      | Electronics       | https://demo.nopcommerce.com/electronics       |
      | Apparel           | https://demo.nopcommerce.com/apparel           |
      | Digital downloads | https://demo.nopcommerce.com/digital-downloads |
      | Books             | https://demo.nopcommerce.com/books             |
      | Jewelry           | https://demo.nopcommerce.com/jewelry           |
      | Gift Cards        | https://demo.nopcommerce.com/gift-cards        |


