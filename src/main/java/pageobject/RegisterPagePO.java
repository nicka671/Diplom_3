package pageobject;

import org.openqa.selenium.By;
import pages.BasePage;

public class RegisterPagePO extends HomePagePO
{

    public By registerNewUser = By.xpath(".//a[text() = 'Зарегистрироваться']");
    public  By registerName = By.xpath(".//fieldset[1]/div/div/input");
    public  By registerEmail = By.xpath(".//fieldset[2]/div/div/input");
    public  By registerPassword = By.xpath(".//fieldset[3]/div/div/input");
    public  By registerButton = By.xpath(".//button[text() = 'Зарегистрироваться']");

    public  By errorMessage = By.xpath(".//p[text() = 'Некорректный пароль']");


}
