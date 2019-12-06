package ru.level.qa.test.auto.autumn.selenium.page.objects;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ru.level.qa.test.auto.autumn.selenium.AbstractSeleniumBaseTest;
import ru.level.qa.test.auto.autumn.selenium.po.with.pf.HomePage;
import ru.level.qa.test.auto.autumn.selenium.po.with.pf.LoginRegistrationPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PageObjectWithPageFactoryTestSelenium extends AbstractSeleniumBaseTest {

    @Test
    public void loginSuccessTest() {
        driver.get("http://users.bugred.ru/");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(driver);

        homePage.enterButtonClick();

        loginRegistrationPage.fillLoginTextField("test.user@email.com");
        loginRegistrationPage.fillPasswordTextField("test");
        loginRegistrationPage.authButtonClick();

        assertThat("Кнопка пользователя не отображается", homePage.isUserButtonDisplayed());
        assertThat(homePage.getUserButtonText(), equalTo("test user"));
    }

    @Test
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

    @Test
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
