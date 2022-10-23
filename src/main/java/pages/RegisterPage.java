package pages;

import User.User;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobject.RegisterPagePO;
import static org.junit.Assert.*;
public class RegisterPage extends RegisterPagePO
{


    private WebDriver driver;

    public RegisterPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterText(By by, String string)
    {
        driver.findElement(by).click();
        driver.findElement(by).sendKeys(string);
    }



    public void registerNewUser(User user)
    {

        driver.findElement(pesonalAccountButton).click();
        driver.findElement(registerNewUser).click();
        enterText(registerName,user.name);
        enterText(registerEmail,user.email);
        enterText(registerPassword,user.password);
        driver.findElement(registerButton).click();
    }

    public void checkErrorMessage()
    {
        assertTrue("Регистрация с паролем меньше 6 символов прошла", driver.findElement(errorMessage).isDisplayed());


    }
    }

