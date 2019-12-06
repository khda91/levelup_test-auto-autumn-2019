package ru.level.qa.test.auto.autumn.selenium.po.page.components;

import org.openqa.selenium.WebDriver;
import ru.level.qa.test.auto.autumn.selenium.po.page.components.base.BasePage;
import ru.level.qa.test.auto.autumn.selenium.po.page.components.elements.LoginComponent;
import ru.level.qa.test.auto.autumn.selenium.po.page.components.elements.RegistrationComponent;

public class LoginRegistrationPage extends BasePage {

    private LoginComponent loginComponent;

    private RegistrationComponent registrationComponent;

    public LoginRegistrationPage(WebDriver driver) {
        super(driver);
        loginComponent = new LoginComponent(driver);
        registrationComponent = new RegistrationComponent(driver);
    }

    public LoginComponent getLoginComponent() {
        return loginComponent;
    }

    public RegistrationComponent getRegistrationComponent() {
        return registrationComponent;
    }
}
