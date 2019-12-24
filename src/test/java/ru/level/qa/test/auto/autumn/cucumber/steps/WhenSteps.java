package ru.level.qa.test.auto.autumn.cucumber.steps;

import cucumber.api.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import ru.level.qa.test.auto.autumn.cucumber.TestContext;
import ru.level.qa.test.auto.autumn.cucumber.pages.AddUserPage;
import ru.level.qa.test.auto.autumn.cucumber.pages.HomePage;

public class WhenSteps {

    @When("I click on the 'Добавить пользователя' button on the Main page")
    public void iClickAddUserButtonMainPage() {
        HomePage hp = new HomePage(TestContext.getDriver());
        hp.addUserButtonClick();
    }

    @When("I set 'test name' as name on the Add User page")
    public void iSetNameAddUserPage() {
        AddUserPage aup = new AddUserPage(TestContext.getDriver());
        aup.setNameTextField(RandomStringUtils.randomAlphabetic(7));
    }


    @When("I set 'test.mail@mail.com' as email on the Add User page")
    public void iSetEmailAddUserPage() {
        AddUserPage aup = new AddUserPage(TestContext.getDriver());
        String email = RandomStringUtils.randomAlphabetic(9) + "@mail.com";
        aup.setEmailTextField(email);
        TestContext.setTestData("user_email", email);
    }

    @When("I set 'test' as password on the Add User page")
    public void iSetPasswordAddUserPage() {
        AddUserPage aup = new AddUserPage(TestContext.getDriver());
        aup.setPasswordTextField("test");
    }

    @When("I click on the 'Добавить пользователя' button on the Add User page")
    public void IClickAddUserButtonAddUserPage() {
        AddUserPage aup = new AddUserPage(TestContext.getDriver());
        aup.clickAddUserButton();
    }
}
