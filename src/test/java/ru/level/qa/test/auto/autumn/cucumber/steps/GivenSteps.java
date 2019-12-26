package ru.level.qa.test.auto.autumn.cucumber.steps;

import cucumber.api.java.en.Given;
import java.util.List;
import java.util.Map;
import ru.level.qa.test.auto.autumn.cucumber.TestContext;
import ru.level.qa.test.auto.autumn.cucumber.data.User;
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

    @Given("I login as user '([^\"]*)' with password '([^\"]*)' in the Main page")
    public void iLoginAsUserWithPasswordOnTheMainPage(String username, String password) {
        HomePage hp = new HomePage(TestContext.getDriver());
        hp.enterButtonClick();
        LoginRegistrationPage lrp = new LoginRegistrationPage(TestContext.getDriver());
        lrp.getLoginComponent().fillLoginTextField(username);
        lrp.getLoginComponent().fillPasswordTextField(password);
        lrp.getLoginComponent().authButtonClick();
    }

    @Given("I login as user on the Main page")
    public void iLoginAsUserWithPasswordOnTheMainPage(List<Map<String, String>> userData) {
        Map<String, String> user = userData.get(0);
        HomePage hp = new HomePage(TestContext.getDriver());
        hp.enterButtonClick();
        LoginRegistrationPage lrp = new LoginRegistrationPage(TestContext.getDriver());
        lrp.getLoginComponent().fillLoginTextField(user.get("username"));
        lrp.getLoginComponent().fillPasswordTextField(user.get("password"));
        lrp.getLoginComponent().authButtonClick();
    }

    @Given("I login as user object on the Main page")
    public void iLoginAsUserObjectOnTheMainPage(List<User> userData) {
        User user = userData.get(0);
        System.out.println(user);
        HomePage hp = new HomePage(TestContext.getDriver());
        hp.enterButtonClick();
        LoginRegistrationPage lrp = new LoginRegistrationPage(TestContext.getDriver());
        lrp.getLoginComponent().fillLoginTextField(user.getUsername());
        lrp.getLoginComponent().fillPasswordTextField(user.getPassword());
        lrp.getLoginComponent().authButtonClick();
    }
}
