package pages;

import org.openqa.selenium.WebDriver;
import pageobject.ConstructorPagePO;

public class ConstructorPage extends ConstructorPagePO
{


    private WebDriver driver;

    public ConstructorPage(WebDriver driver)
    {
        this.driver = driver;
    }


    public void clickOnSauceButton() {
        driver.findElement(sauceButton).click();
    }

    public void clickOnLoafButton() {
        driver.findElement(loafButton).click();
    }

    public void clickOnFillingButton() {
        driver.findElement(fillingButton).click();
    }


}
