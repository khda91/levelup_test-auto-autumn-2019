package ru.level.qa.test.auto.autumn.selenium.po.wo.pf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginRegistrationPage {

    private WebDriver driver;

    private WebElement loginTextField;

    private WebElement passwordTextField;

    private WebElement authButton;

    public LoginRegistrationPage(WebDriver driver) {
        this.driver = driver;
        loginTextField = driver.findElement(By.name("login"));
        passwordTextField = driver
                .findElement(By.xpath("//form[contains(@action, 'login')]//input[@name='password']"));
        authButton = driver.findElement(By.xpath("//input[@value='Авторизоваться']"));
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
