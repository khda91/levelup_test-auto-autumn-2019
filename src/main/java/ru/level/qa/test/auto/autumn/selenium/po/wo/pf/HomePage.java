package ru.level.qa.test.auto.autumn.selenium.po.wo.pf;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    private WebElement enterButton;

    private WebElement userButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        enterButton = driver.findElement(By.xpath("//a//span[text()='Войти']"));
        // Так не нужно делать
//        userButton = driver.findElement(By.cssSelector(".dropdown-toggle"));
    }

    public void enterButtonClick() {
        enterButton.click();
    }

    public WebElement getUserButton() {
        return driver.findElement(By.cssSelector(".dropdown-toggle"));
    }

    public boolean isUserButtonDisplayed() {
        return driver.findElement(By.cssSelector(".dropdown-toggle")).isDisplayed();
    }


    public String getUserButtonText() {
        return driver.findElement(By.cssSelector(".dropdown-toggle")).getText();
    }

    public void userButtonClick() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", userButton);
    }
}
