package ru.level.qa.test.auto.autumn.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SeleniumTest {

    @Test
    public void registrationTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://users.bugred.ru/");

        driver.findElement(By.xpath("//a//span[text()='Войти']")).click();

        driver.findElement(By.name("name")).sendKeys("test user");
        driver.findElement(By.name("email")).sendKeys("test.user@email.com");
        driver.findElement(By.xpath("//div[@id='uLogin']//..//input[@name='password']   ")).sendKeys("test");
        driver.findElement(By.name("act_register_now")).click();

        WebElement userButton = driver.findElement(By.cssSelector(".dropdown-toggle"));
        assertThat("Кнопка пользователя не отображается", userButton.isDisplayed());
        assertThat(userButton.getText(), equalTo("test user"));

        driver.quit();
    }

    @Test
    public void setDateTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://users.bugred.ru/");

        driver.findElement(By.name("date_start")).sendKeys("11/23/2019");

        Thread.sleep(5000);

        driver.quit();
    }


}
