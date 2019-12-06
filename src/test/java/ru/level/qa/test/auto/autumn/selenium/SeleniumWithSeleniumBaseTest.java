package ru.level.qa.test.auto.autumn.selenium;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.level.qa.test.auto.autumn.selenium.listeners.TestListener;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

@Listeners({TestListener.class})
public class SeleniumWithSeleniumBaseTest extends AbstractSeleniumBaseTest {

    @Test
    public void registrationTest() {
        driver.get("http://users.bugred.ru/");

        driver.findElement(By.xpath("//a//span[text()='Войти']")).click();

        driver.findElement(By.name("name")).sendKeys("test user");
        driver.findElement(By.name("email")).sendKeys("test.user@email.com");
        driver.findElement(By.xpath("//div[@id='uLogin']//..//input[@name='password']   ")).sendKeys("test");
        driver.findElement(By.name("act_register_now")).click();

        WebElement userButton = driver.findElement(By.cssSelector(".dropdown-toggle"));
        assertThat("Кнопка пользователя не отображается", userButton.isDisplayed());
        assertThat(userButton.getText(), equalTo("test user"));
    }

    @Test
    public void epamMainWithExplicitWaitTest() {
        driver.get("https://www.epam.com/");

        WebElement ourWorkLink = driver.findElement(By.linkText("Our Work".toUpperCase()));
        Actions actions = new Actions(driver);
        actions.moveToElement(ourWorkLink).build().perform();

        WebDriverWait wait = new WebDriverWait(driver, 15, 2000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("top-navigation__flyout")));

        wait.until(new ExpectedCondition<Boolean>() {
            @NullableDecl
            @Override
            public Boolean apply(@NullableDecl WebDriver webDriver) {
                return driver.findElement(By.className("top-navigation__flyout")).isDisplayed();
            }
        });

        driver.findElement(By.linkText("Energy & Utilities".toUpperCase())).click();

        assertThat(driver.getTitle(), containsString("Energy & Utilities Software Solutions"));
    }

    @Test
    public void epamMainWithoutExplicitWaitTest() throws IOException {
        driver.get("https://www.epam.com/");

        WebElement ourWorkLink = driver.findElement(By.linkText("Our Work".toUpperCase()));
        Actions actions = new Actions(driver);
        actions.moveToElement(ourWorkLink).build().perform();

//        WebDriverWait wait = new WebDriverWait(driver, 15, 2000);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("top-navigation__flyout1")));

        driver.findElement(By.linkText("Energy & Utilities".toUpperCase())).click();

        assertThat(driver.getTitle(), containsString("Energy & Utilities Software Solutions"));

        // screen shot
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, 400);");

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("my.png"));
    }

    @Test
    public void logoutTest() {
        driver.get("http://users.bugred.ru/");

//        driver.findElement(By.xpath("//a//span[text()='Войти']")).click();
        WebElement loginButton = driver.findElement(By.xpath("//a//span[text()='Войти']"));
        loginButton.click();

        driver.findElement(By.name("login")).sendKeys("test.user@email.com");
        driver.findElement(By.xpath("//form[contains(@action, 'login')]//input[@name='password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();

        WebElement userButton = driver.findElement(By.cssSelector(".dropdown-toggle"));
        assertThat("Кнопка пользователя не отображается", userButton.isDisplayed());
        assertThat(userButton.getText(), equalTo("test user"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", userButton);

        WebElement logoutButton = driver.findElement(By.linkText("Выход"));
        logoutButton.click();

//        assertThat("Кнопка войти не отбражается", driver.findElement(By.xpath("//a//span[text()='Войти']")).isDisplayed());
        assertThat("Кнопка войти не отбражается", loginButton.isDisplayed());
    }

    @Test
    public void setDateTest() throws InterruptedException {
        driver.get("http://users.bugred.ru/");

        driver.findElement(By.name("date_start")).sendKeys("11/23/2019");

        Thread.sleep(5000);
    }


}
