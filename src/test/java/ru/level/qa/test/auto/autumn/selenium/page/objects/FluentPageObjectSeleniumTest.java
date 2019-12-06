package ru.level.qa.test.auto.autumn.selenium.page.objects;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ru.level.qa.test.auto.autumn.selenium.AbstractSeleniumBaseTest;
import ru.level.qa.test.auto.autumn.selenium.po.fluent.HomePage;
import ru.level.qa.test.auto.autumn.selenium.po.fluent.LoginRegistrationPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FluentPageObjectSeleniumTest extends AbstractSeleniumBaseTest {

    @Test
    public void simpleTest() {
        driver.get("http://users.bugred.ru/");
        LoginRegistrationPage loginRegistrationPage = new HomePage(driver)
                .enterButtonClick();

        HomePage homePage = loginRegistrationPage
//                new HomePage(driver)
//                        .enterButtonClick()
                .fillLoginTextField("test.user@email.com")
                .fillPasswordTextField("test")
                .authButtonClick();

        assertThat("Кнопка пользователя не отображается", homePage.isUserButtonDisplayed());
        assertThat(homePage.getUserButtonText(), equalTo("test user"));
    }

    @Test
    public void registrationSuccessTest() {
        driver.get("http://users.bugred.ru/");
        LoginRegistrationPage loginRegistrationPage = new HomePage(driver)
                .enterButtonClick();

        HomePage homePage = loginRegistrationPage
                .fillRegistrationUserNameTextField("vashSJKDSALDHASK")
                .fillRegistrationEmailTextField("test.user182yhgasghasg@email.com")
                .fillRegistrationPasswordTextField("test")
                .successRegistrationButtonClick();

        assertThat("Кнопка пользователя не отображается", homePage.isUserButtonDisplayed());
        assertThat(homePage.getUserButtonText(), equalTo("vashSJKDSALDHASK"));
    }

    @Test
    public void registrationFailedTest() {
        driver.get("http://users.bugred.ru/");
        LoginRegistrationPage loginRegistrationPage = new HomePage(driver)
                .enterButtonClick()
                .fillRegistrationUserNameTextField("uquyiy")
                .fillRegistrationEmailTextField("test.user")
                .fillRegistrationPasswordTextField("test")
                .failedRegistrationButtonClick();

        assertThat(loginRegistrationPage.getRegistrationErrorMessageText(),
                equalTo("register_not_correct_field (email)"));
    }
}
