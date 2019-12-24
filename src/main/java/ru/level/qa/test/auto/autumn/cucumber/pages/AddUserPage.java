package ru.level.qa.test.auto.autumn.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends AbstractBasePage {

    @FindBy(name = "noibiz_name")
    private WebElement nameTextField;

    @FindBy(name = "noibiz_email")
    private WebElement emailTextField;

    @FindBy(name = "noibiz_password")
    private WebElement passwordTextField;

    @FindBy(name = "act_create")
    private WebElement addUserButton;

    public AddUserPage(WebDriver driver) {
        super(driver);
    }

    public void setNameTextField(String name) {
        this.nameTextField.sendKeys(name);
    }

    public void setEmailTextField(String email) {
        this.emailTextField.sendKeys(email);
    }

    public void setPasswordTextField(String password) {
        this.passwordTextField.sendKeys(password);
    }

    public void clickAddUserButton() {
        this.addUserButton.click();
    }
}
