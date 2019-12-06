package ru.level.qa.test.auto.autumn.selenium.po.page.components.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.level.qa.test.auto.autumn.selenium.po.page.components.base.BasePageComponent;

public class LoginComponent extends BasePageComponent {

    @FindBy(name = "login")
    private WebElement loginTextField;

    @FindBy(xpath = "//form[contains(@action, 'login')]//input[@name='password']")
    private WebElement passwordTextField;

    @FindBy(xpath = "//input[@value='Авторизоваться']")
    private WebElement authButton;

    public LoginComponent(WebDriver driver) {
        super(driver);
    }

    public void fillLoginTextField(String username) {
        loginTextField.sendKeys(username);
    }

    public void fillPasswordTextField(String password) {
        passwordTextField.sendKeys(password);
    }

    public void authButtonClick() {
        authButton.click();
    }
}
