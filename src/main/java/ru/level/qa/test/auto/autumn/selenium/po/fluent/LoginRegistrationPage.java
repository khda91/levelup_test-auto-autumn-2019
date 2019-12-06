package ru.level.qa.test.auto.autumn.selenium.po.fluent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginRegistrationPage {

    private WebDriver driver;

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

    public LoginRegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginRegistrationPage fillLoginTextField(String username) {
        loginTextField.sendKeys(username);
        return this;
    }

    public LoginRegistrationPage fillPasswordTextField(String password) {
        passwordTextField.sendKeys(password);
        return this;
    }

    public HomePage authButtonClick() {
        authButton.click();
        return new HomePage(driver);
    }

    public LoginRegistrationPage fillRegistrationUserNameTextField(String username) {
        registrationUserNameTextField.sendKeys(username);
        return this;
    }

    public LoginRegistrationPage fillRegistrationPasswordTextField(String password) {
        registrationPasswordTextField.sendKeys(password);
        return this;
    }

    public LoginRegistrationPage fillRegistrationEmailTextField(String email) {
        registrationEmailTextField.sendKeys(email);
        return this;
    }

    public HomePage successRegistrationButtonClick() {
        registrationButton.click();
        return new HomePage(driver);
    }

    public LoginRegistrationPage failedRegistrationButtonClick() {
        registrationButton.click();
        return this;
    }

    public String getRegistrationErrorMessageText() {
        return registrationErrorMessage.getText();
    }
}
