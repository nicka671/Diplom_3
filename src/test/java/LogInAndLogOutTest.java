import User.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LogInAndLogOutTest
{

    private WebDriver driver;

    User user = new User("name","password88", "dddddd@yandex.ru");

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:/WebDriver/bin/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/");

    }

    @Test
    public void loginUsingPersonalAccountButton()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnPersonalAccountButton();
        loginPage.loginIntoAccount(user);
    }


    @Test
    public void loginUsingLogInButton()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnLogInButton();
        loginPage.loginIntoAccount(user);
    }

    @Test
    public void logOut()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnLogInButton();
        loginPage.loginIntoAccount(user);
        loginPage.logOut();
    }


    @After
    public void tearDown()
    {
        driver.quit();
    }

    }
