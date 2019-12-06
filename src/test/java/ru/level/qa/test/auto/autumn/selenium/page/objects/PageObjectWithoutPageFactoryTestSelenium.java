package ru.level.qa.test.auto.autumn.selenium.page.objects;

import org.testng.annotations.Test;
import ru.level.qa.test.auto.autumn.selenium.AbstractSeleniumBaseTest;
import ru.level.qa.test.auto.autumn.selenium.po.wo.pf.HomePage;
import ru.level.qa.test.auto.autumn.selenium.po.wo.pf.LoginRegistrationPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PageObjectWithoutPageFactoryTestSelenium extends AbstractSeleniumBaseTest {

    @Test
    public void simpleTest() {
        driver.get("http://users.bugred.ru/");
        HomePage homePage = new HomePage(driver);

        homePage.enterButtonClick();
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(driver);

        loginRegistrationPage.fillLoginTextField("test.user@email.com");
        loginRegistrationPage.fillPasswordTextField("test");
        loginRegistrationPage.authButtonClick();

//        assertThat(homePage.getUserButton().getText(), equalTo("test user"));
        assertThat("Кнопка пользователя не отображается", homePage.isUserButtonDisplayed());
        assertThat(homePage.getUserButtonText(), equalTo("test user"));
    }
}
