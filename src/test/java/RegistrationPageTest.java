import User.User;
import com.google.common.annotations.VisibleForTesting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.RegisterPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RegistrationPageTest
{
    private WebDriver driver;

    User user = new User("name","password88", "dddddd@yandex.ru");
    User userWithShortPassword = new User("name","pass", "dddddd@yandex.ru");

    @Before
    public void testSetup() {

        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:/WebDriver/bin/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/");

    }


    @Test
    public void successfulRegistration()
    {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.registerNewUser(user);

    }

    @Test
    public void unsuccessfulRegistration()
    {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.registerNewUser(userWithShortPassword);
        registerPage.checkErrorMessage();
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }



}
