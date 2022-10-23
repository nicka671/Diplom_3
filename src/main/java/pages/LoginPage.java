package pages;

import User.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobject.LoginPagePO;

public class LoginPage extends LoginPagePO
{

    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterText(By by, String string)
    {
        driver.findElement(by).click();
        driver.findElement(by).sendKeys(string);
    }


    public void clickOnLogInButton()
    {
        driver.findElement(logIntoAccount).click();

    }

    public void clickOnPersonalAccountButton()
    {

        driver.findElement(pesonalAccountButton).click();
    }

    public void loginIntoAccount(User user)
    {

        driver.findElement(loginEmail).click();
        enterText(loginEmail, user.email);
        driver.findElement(loginPassword).click();
        enterText(loginPassword, user.password);
        driver.findElement(loginButton).click();


    }

    public void logOut()
    {
        driver.findElement(logoutButton).click();
    }

    public void clickOnConstructorButton() {
        driver.findElement(constructorButton).click();
    }


}
