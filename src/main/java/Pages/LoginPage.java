package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Elementos pagina login
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By LoginButton = By.cssSelector("#login button");

    //Acciones sobre elementos
    public void setUsernameField(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(LoginButton).click();
        return new SecureAreaPage(driver);
    }
}
