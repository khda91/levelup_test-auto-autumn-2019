package ru.level.qa.test.auto.autumn.selenium.po.page.components.base;

import org.openqa.selenium.WebDriver;
import ru.level.qa.test.auto.autumn.selenium.po.page.components.elements.Menu;

public abstract class BasePage extends BasePageComponent {

    private Menu menu;

    protected BasePage(WebDriver driver) {
        super(driver);
        menu = new Menu(driver);
    }

    public void selectMenu(final String menuItemName) {
        menu.clickMenuItem(menuItemName);
    }
}
