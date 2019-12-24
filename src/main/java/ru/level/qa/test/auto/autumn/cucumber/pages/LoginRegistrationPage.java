package ru.level.qa.test.auto.autumn.cucumber.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.level.qa.test.auto.autumn.selenium.po.page.components.elements.LoginComponent;

public class LoginRegistrationPage extends AbstractBasePage{

    @FindBy(name = "login")
    private WebElement loginTextField;

    @FindBy(xpath = "//form[contains(@action, 'login')]//input[@name='password']")
    private WebElement passwordTextField;

    @FindBy(xpath = "//input[@value='Авторизоваться']")
    private WebElement authButton;

    @FindBy(name = "name")
    private WebElement registrationUserNameTextField;

    @FindBy(name = "email")
    private WebElement registrationEmailTextField;

    @FindBy(xpath = "//div[@id='uLogin']//..//input[@name='password']")
    private WebElement registrationPasswordTextField;

    @FindBy(name = "act_register_now")
    private WebElement registrationButton;

    @FindBy(xpath = "//form[contains(@action, 'register')]/p")
    private WebElement registrationErrorMessage;

    private LoginComponent loginComponent;

    public LoginRegistrationPage(WebDriver driver) {
        super(driver);
        loginComponent = new LoginComponent(driver);
    }

    @Step("Enter username '{0}'")
    public void fillLoginTextField(String username) {
        loginTextField.sendKeys(username);
    }

    @Step("Enter password '{0}'")
    public void fillPasswordTextField(String password) {
        passwordTextField.sendKeys(password);
    }

    @Step("Click login button")
    public void authButtonClick() {
        authButton.click();
    }

    public void fillRegistrationUserNameTextField(String username) {
        registrationUserNameTextField.sendKeys(username);
    }

    public void fillRegistrationPasswordTextField(String password) {
        registrationPasswordTextField.sendKeys(password);
    }

    public void fillRegistrationEmailTextField(String email) {
        registrationEmailTextField.sendKeys(email);
    }

    public void registrationButtonClick() {
        registrationButton.click();
    }

    public String getRegistrationErrorMessageText() {
        return registrationErrorMessage.getText();
    }

    public LoginComponent getLoginComponent() {
        return loginComponent;
    }
}
