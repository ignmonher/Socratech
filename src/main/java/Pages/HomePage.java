package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage (WebDriver driver) {
        this.driver = driver;
    }
    //Elementos HomePage
    private By formAuthenticationLink = By.linkText("Form Authentication");
    //private By inputsLink = By.linkText("Inputs");



    //Acciones sobre HomePage
    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}
