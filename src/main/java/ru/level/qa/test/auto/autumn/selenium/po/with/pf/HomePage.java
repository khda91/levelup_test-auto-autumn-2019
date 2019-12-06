package ru.level.qa.test.auto.autumn.selenium.po.with.pf;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    private WebDriver driver;

    @FindBy(xpath = "//a//span[text()='Войти']")
    private WebElement enterButton;

    @FindBy(css = ".dropdown-toggle")
    private WebElement userButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterButtonClick() {
        enterButton.click();
    }

    public WebElement getUserButton() {
        return userButton;
    }

    public boolean isUserButtonDisplayed() {
        return userButton.isDisplayed();
    }

    public String getUserButtonText() {
        return userButton.getText();
    }

    public void userButtonClick() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", userButton);
    }
}
