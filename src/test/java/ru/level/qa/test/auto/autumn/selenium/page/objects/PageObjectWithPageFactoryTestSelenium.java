package ru.level.qa.test.auto.autumn.selenium.page.objects;

import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ru.level.qa.test.auto.autumn.selenium.AbstractSeleniumBaseTest;
import ru.level.qa.test.auto.autumn.selenium.po.with.pf.HomePage;
import ru.level.qa.test.auto.autumn.selenium.po.with.pf.LoginRegistrationPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Feature("Page Object feature")
public class PageObjectWithPageFactoryTestSelenium extends AbstractSeleniumBaseTest {

    @Test(testName = "Login success")
    @Story("Login success story")
    public void loginSuccessTest() {
        driver.get("http://users.bugred.ru/");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(driver);

        homePage.enterButtonClick();

        loginRegistrationPage.fillLoginTextField("test.user@email.com");
        loginRegistrationPage.fillPasswordTextField("test");
        loginRegistrationPage.authButtonClick();

        Allure.step("Check user button should be displayed");
        assertThat("Кнопка пользователя не отображается", homePage.isUserButtonDisplayed());
        assertThat(homePage.getUserButtonText(), equalTo("test user"));
    }

    @Test(testName = "Registration success")
    @Story("Registration success story")
    public void registrationSuccessTest() {
        driver.get("http://users.bugred.ru/");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(driver);

        homePage.enterButtonClick();

        loginRegistrationPage.fillRegistrationUserNameTextField("asdqwfebjvbdskvbsd");
        loginRegistrationPage.fillRegistrationEmailTextField("test.user578643254ft@email.com");
        loginRegistrationPage.fillRegistrationPasswordTextField("test");
        loginRegistrationPage.registrationButtonClick();

        assertThat("Кнопка пользователя не отображается", homePage.isUserButtonDisplayed());
        assertThat(homePage.getUserButtonText(), equalTo("asdqwfebjvbdskvbsd"));
    }

    @Test(testName = "Registration failed")
    @Story("Registration failed story")
    public void registrationFailedTest() {
        driver.get("http://users.bugred.ru/");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(driver);

        homePage.enterButtonClick();

        loginRegistrationPage.fillRegistrationUserNameTextField("uquyiy");
        loginRegistrationPage.fillRegistrationEmailTextField("test.user578643254ft@email.com");
        loginRegistrationPage.fillRegistrationPasswordTextField("test");
        loginRegistrationPage.registrationButtonClick();

        assertThat(loginRegistrationPage.getRegistrationErrorMessageText(),
                equalTo("register_not_correct_field (email)"));
    }
}
