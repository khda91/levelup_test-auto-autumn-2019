@Acceptance
Feature: http://users.bugred.ru/ feature

  Scenario: Create user
    Given I login as 'test.user@email.com:test' in the Main page
    When I click on the 'Добавить пользователя' button on the Main page
    And I set 'test name' as name on the Add User page
    And I set 'test.mail@mail.com' as email on the Add User page
    And I set 'test' as password on the Add User page
    And I click on the 'Добавить пользователя' button on the Add User page
    Then Created user should be first in the user table on the Main page

  @test2
  Scenario: Create user2
    * I login as 'test.user@email.com:test' in the Main page
    * I click on the 'Добавить пользователя' button on the Main page
    * I set 'test name' as name on the Add User page
    * I set 'test.mail@mail.com' as email on the Add User page
    * I set 'test' as password on the Add User page
    * I click on the 'Добавить пользователя' button on the Add User page
    * Created user should be first in the user table on the Main page

  Scenario: Create user with parameters
    Given I login as user 'test.user@email.com' with password 'test' in the Main page
    When I click on the 'Добавить пользователя' button on the Main page
    And I fill name text field with random string length 8 on the Add User page
    And I fill email text field with random string length 11 on the Add User page
    And I fill password text field with random string length 22 on the Add User page
    And I click on the 'Добавить пользователя' button on the Add User page
    Then Created user should be the 1-st in the user table on the Main page

  @test3
  Scenario: Create user with parameters
    Given I login as user 'khda91@email.com' with password 'test' in the Main page
    When I click on the 'Добавить пользователя' button on the Main page
    And I fill name text field with random string length 29 on the Add User page
    And I fill email text field with random string length 22 on the Add User page
    And I fill password text field with random string length 23 on the Add User page
    And I click on the 'Добавить пользователя' button on the Add User page
    Then Created user should be the 4-th in the user table on the Main page

  Scenario Outline: Create user with parameters
    Given I login as user '<username>' with password '<password>' in the Main page
    When I click on the 'Добавить пользователя' button on the Main page
    And I fill name text field with random string length <username_length> on the Add User page
    And I fill email text field with random string length <email_length> on the Add User page
    And I fill password text field with random string length <password_length> on the Add User page
    And I click on the 'Добавить пользователя' button on the Add User page
    Then Created user should be the 1-st in the user table on the Main page

    Examples:
      | username            | password | username_length | email_length | password_length |
      | test.user@email.com | test     | 29              | 10           | 10              |
      | test.user@email.com | test     | 4               | 8            | 12              |
      | khda91@email.com    | test     | 33              | 5            | 10              |
      | khda91@email.com    | test     | 29              | 10           | 10              |
      | test.user@email.com | test     | 29              | 10           | 10              |

  Scenario: Create user with parameters
    Given I login as user on the Main page
      | username            | password |
      | test.user@email.com | test     |
    When I click on the 'Добавить пользователя' button on the Main page
    And I fill name text field with random string length 29 on the Add User page
    And I fill email text field with random string length 22 on the Add User page
    And I fill password text field with random string length 23 on the Add User page
    And I click on the 'Добавить пользователя' button on the Add User page
    Then Created user should be the 1-st in the user table on the Main page

  Scenario: Create user with parameters
    Given I login as user object on the Main page
      | username            | password |
      | test.user@email.com | test     |
    When I click on the 'Добавить пользователя' button on the Main page
    And I fill name text field with random string length 29 on the Add User page
    And I fill email text field with random string length 22 on the Add User page
    And I fill password text field with random string length 23 on the Add User page
    And I click on the 'Добавить пользователя' button on the Add User page
    Then Created user should be the 1-st in the user table on the Main page

  Scenario: Login test
    Given I open ''
    When I click 'Enter' button
    And I set email 'test'
    And I set password 'passwd'
    And I click 'Auth' button
    Then user button should be displayed
    And user button should have text 'text'