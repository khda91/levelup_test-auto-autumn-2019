package ru.level.qa.test.auto.autumn.selenium.po.page.components.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.level.qa.test.auto.autumn.selenium.po.page.components.base.BasePageComponent;

public class RegistrationComponent extends BasePageComponent {

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

    public RegistrationComponent(WebDriver driver) {
        super(driver);
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

}
