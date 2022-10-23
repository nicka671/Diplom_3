package pages;

import User.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobject.ForgotPasswordPagePO;

public class ForgotPasswordPage extends ForgotPasswordPagePO
{

    private WebDriver driver;

    public ForgotPasswordPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterText(By by, String string)
    {
        driver.findElement(by).click();
        driver.findElement(by).sendKeys(string);
    }



    public void loginInForgotPasswordPage()
    {

        driver.findElement(pesonalAccountButton).click();
        driver.findElement(resetPassword).click();
        driver.findElement(resetPasswordLoginButton).click();


    }


}
