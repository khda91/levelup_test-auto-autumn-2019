package ru.level.qa.test.auto.autumn.selenium.page.objects;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ru.level.qa.test.auto.autumn.selenium.AbstractSeleniumBaseTest;
import ru.level.qa.test.auto.autumn.selenium.po.page.components.HomePage;
import ru.level.qa.test.auto.autumn.selenium.po.page.components.LoginRegistrationPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PageObjectWithPageComponentsSeleniumTest extends AbstractSeleniumBaseTest {

    @Test
    public void loginSuccessTest() {
        driver.get("http://users.bugred.ru/");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(driver);

        homePage.selectMenu("Войти");

        loginRegistrationPage.getLoginComponent().fillLoginTextField("test.user@email.com");
        loginRegistrationPage.getLoginComponent().fillPasswordTextField("test");
        loginRegistrationPage.getLoginComponent().authButtonClick();

        assertThat("Кнопка пользователя не отображается", homePage.isUserButtonDisplayed());
        assertThat(homePage.getUserButtonText(), equalTo("test user"));
    }

    @Test
    public void registrationSuccessTest() {
        driver.get("http://users.bugred.ru/");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(driver);

        homePage.selectMenu("Войти");

        loginRegistrationPage.getRegistrationComponent().fillRegistrationUserNameTextField("asdqwfebjvbdskvbsd");
        loginRegistrationPage.getRegistrationComponent().fillRegistrationEmailTextField("test.user578643254ft@email.com");
        loginRegistrationPage.getRegistrationComponent().fillRegistrationPasswordTextField("test");
        loginRegistrationPage.getRegistrationComponent().registrationButtonClick();

        assertThat("Кнопка пользователя не отображается", homePage.isUserButtonDisplayed());
        assertThat(homePage.getUserButtonText(), equalTo("asdqwfebjvbdskvbsd"));
    }

    @Test
    public void registrationFailedTest() {
        driver.get("http://users.bugred.ru/");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(driver);

        homePage.selectMenu("Войти");

        loginRegistrationPage.getRegistrationComponent().fillRegistrationUserNameTextField("uquyiy");
        loginRegistrationPage.getRegistrationComponent().fillRegistrationEmailTextField("test.user578643254ft@email.com");
        loginRegistrationPage.getRegistrationComponent().fillRegistrationPasswordTextField("test");
        loginRegistrationPage.getRegistrationComponent().registrationButtonClick();

        assertThat(loginRegistrationPage.getRegistrationComponent().getRegistrationErrorMessageText(),
                equalTo("register_busy (email)"));
    }
}
