@Acceptance
Feature: http://users.bugred.ru/ feature background

  Background: Login
    Given I login as user object on the Main page
      | username            | password |
      | test.user@email.com | test     |

  @test1
  Scenario: Create user with parameters
    When I click on the 'Добавить пользователя' button on the Main page
    And I fill name text field with random string length 29 on the Add User page
    And I fill email text field with random string length 22 on the Add User page
    And I fill password text field with random string length 23 on the Add User page
    And I click on the 'Добавить пользователя' button on the Add User page
    Then Created user should be the 1-st in the user table on the Main page

  Scenario: Create user with parameters
    When I click on the 'Добавить пользователя' button on the Main page
    And I fill name text field with random string length 29 on the Add User page
    And I fill email text field with random string length 22 on the Add User page
    And I fill password text field with random string length 23 on the Add User page
    And I click on the 'Добавить пользователя' button on the Add User page
    Then Created user should be the 1-st in the user table on the Main page