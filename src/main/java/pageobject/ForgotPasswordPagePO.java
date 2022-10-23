package pageobject;

import org.openqa.selenium.By;

public class ForgotPasswordPagePO extends HomePagePO
{
    public By resetPassword = By.xpath(".//a[text() = 'Восстановить пароль']");
    public By resetPasswordLoginButton = By.xpath(".//a[text() = 'Войти']");

}
