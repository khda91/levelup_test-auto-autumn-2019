package ru.level.qa.test.auto.autumn.selenium.po.fluent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(xpath = "//a//span[text()='Войти']")
    private WebElement enterButton;

    @FindBy(css = ".dropdown-toggle")
    private WebElement userButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginRegistrationPage enterButtonClick() {
        enterButton.click();
        return new LoginRegistrationPage(driver);
    }

    public boolean isUserButtonDisplayed() {
        return userButton.isDisplayed();
    }

    public String getUserButtonText() {
        return userButton.getText();
    }
}
