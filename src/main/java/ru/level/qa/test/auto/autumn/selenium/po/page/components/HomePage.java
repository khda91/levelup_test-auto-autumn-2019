package ru.level.qa.test.auto.autumn.selenium.po.page.components;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.level.qa.test.auto.autumn.selenium.po.page.components.base.BasePage;

public class HomePage extends BasePage {

    @FindBy(css = ".dropdown-toggle")
    private WebElement userButton;

    public HomePage(WebDriver driver) {
        super(driver);
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
