@Acceptance
Feature: http://users.bugred.ru/ feature

  @test1
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


  Scenario: Login test
    Given I open ''
    When I click 'Enter' button
    And I set email 'test'
    And I set password 'passwd'
    And I click 'Auth' button
    Then user button should be displayed
    And user button should have text 'text'