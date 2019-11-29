package ru.level.qa.test.auto.autumn.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SimpleTest {

    @Test
    public void openTestSitePageTest() {
//        System.setProperty("webdriver.chrome.driver", this.getClass().getClassLoader()
//                .getResource("drivers/chromedriver").getPath());
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://users.bugred.ru/");
        assertThat(driver.getTitle(), equalTo("Users"));
        driver.close();
    }

    @Test
    public void windowHandlesWithClose() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://users.bugred.ru/");

        WebElement enterButton = driver.findElement(By.xpath("//a/span[contains(text(), 'Войти')]"));
        new Actions(driver).keyDown(Keys.COMMAND)
                .click(enterButton)
                .build()
                .perform();

        Thread.sleep(1000);

        Set<String> browserWindowHandles = driver.getWindowHandles();
        System.out.println(browserWindowHandles);
        System.out.println("=======");

        WebElement usersButton = driver.findElement(By.xpath("//a/span[contains(text(), 'Пользователи')]"));
        new Actions(driver).keyDown(Keys.COMMAND)
                .click(usersButton)
                .build()
                .perform();

        browserWindowHandles = driver.getWindowHandles();
        System.out.println(browserWindowHandles);
        System.out.println("=======");

        Thread.sleep(1000);

        driver.close();
    }

    @Test
    public void windowHandlesWithQuit() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://users.bugred.ru/");

        WebElement enterButton = driver.findElement(By.xpath("//a/span[contains(text(), 'Войти')]"));
        new Actions(driver).keyDown(Keys.COMMAND)
                .click(enterButton)
                .build()
                .perform();

        Thread.sleep(1000);

        Set<String> browserWindowHandles = driver.getWindowHandles();
        System.out.println(browserWindowHandles);
        System.out.println("=======");

        WebElement usersButton = driver.findElement(By.xpath("//a/span[contains(text(), 'Пользователи')]"));
        new Actions(driver).keyDown(Keys.COMMAND)
                .click(usersButton)
                .build()
                .perform();

        browserWindowHandles = driver.getWindowHandles();
        System.out.println(browserWindowHandles);
        System.out.println("=======");

        Thread.sleep(1000);

        driver.quit();
    }
}
