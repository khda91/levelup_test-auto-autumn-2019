package ru.level.qa.test.auto.autumn.cucumber.steps;

import cucumber.api.java.en.Given;
import ru.level.qa.test.auto.autumn.cucumber.TestContext;
import ru.level.qa.test.auto.autumn.cucumber.pages.HomePage;
import ru.level.qa.test.auto.autumn.cucumber.pages.LoginRegistrationPage;

public class GivenSteps {

    @Given("I login as 'test.user@email.com:test' in the Main page")
    public void iLoginAsUserOnTheMainPage() {
        HomePage hp = new HomePage(TestContext.getDriver());
        hp.enterButtonClick();
        LoginRegistrationPage lrp = new LoginRegistrationPage(TestContext.getDriver());
        lrp.getLoginComponent().fillLoginTextField("test.user@email.com");
        lrp.getLoginComponent().fillPasswordTextField("test");
        lrp.getLoginComponent().authButtonClick();
    }
}
