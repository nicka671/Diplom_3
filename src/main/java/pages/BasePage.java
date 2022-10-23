package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;
    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterText(By by, String string)
    {
        driver.findElement(by).click();
        driver.findElement(by).sendKeys(string);
    }
}
