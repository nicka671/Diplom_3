package pageobject;

import org.openqa.selenium.By;

public class LoginPagePO extends HomePagePO
{
    public  By loginEmail = By.xpath(".//fieldset[1]/div/div/input");
    public  By loginPassword = By.xpath(".//fieldset[2]/div/div/input");
    public  By loginButton = By.xpath(".//button[text() = 'Войти']");

    public  By logoutButton = By.xpath(".//button[text() = 'Выход']");

    public  By constructorButton = By.xpath(".//p[text() = 'Конструктор']");

}
