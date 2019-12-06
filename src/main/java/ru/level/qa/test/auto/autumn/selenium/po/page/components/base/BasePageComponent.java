package ru.level.qa.test.auto.autumn.selenium.po.page.components.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePageComponent {

    protected WebDriver driver;

    protected BasePageComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
