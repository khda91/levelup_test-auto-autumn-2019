package ru.level.qa.test.auto.autumn.cucumber.pages;

import io.qameta.allure.Step;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractBasePage {

    @FindBy(xpath = "//a//span[text()='Войти']")
    private WebElement enterButton;

    @FindBy(css = ".dropdown-toggle")
    private WebElement userButton;

    @FindBy(linkText = "Добавить пользователя")
    private WebElement addUserButton;

    @FindBy(xpath = "//tbody[@class='ajax_load_row']//tr//td")
    private List<WebElement> tableRows;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Click enter button")
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

    public void addUserButtonClick() {
        addUserButton.click();
    }

    public String getUserEmailFromTable(int index) {
        return tableRows.get(index).getText();
    }
}
