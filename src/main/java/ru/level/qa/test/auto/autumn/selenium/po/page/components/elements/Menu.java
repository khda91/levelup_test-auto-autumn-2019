package ru.level.qa.test.auto.autumn.selenium.po.page.components.elements;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.level.qa.test.auto.autumn.selenium.po.page.components.base.BasePageComponent;

public class Menu extends BasePageComponent {

    @FindBy(xpath = "//div[@id='main-menu']//li/a")
    private List<WebElement> menuItems;

    public Menu(WebDriver driver) {
        super(driver);
    }

    public void clickMenuItem(final String menuItemName) {
        for (WebElement menuItem : menuItems) {
            if (menuItem.getText().equalsIgnoreCase(menuItemName)) {
                menuItem.click();
                break;
            }
        }
    }
}
