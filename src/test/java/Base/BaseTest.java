package Base;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver"); //si estamos con win hay que poner .exe en el 2º valor
        driver = new ChromeDriver();

        //Vamos a la URL y maximizamos
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        //System.out.println(driver.getTitle()); //me imprime el titulo

        homePage = new HomePage(driver);

        //busca cuantos enlaces hay y me da el número
      //  List<WebElement> links = (List<WebElement>) driver.findElement(By.tagName("a"));
      //  System.out.println(links.size());


        // Encuentra el enlace de un elemento
     //   WebElement inputsLink = driver.findElement(By.linkText("Inpunts"));
     //   inputsLink.click();
    }

    @AfterClass
    public void tearDown(){
        driver.quit(); //me cierra el navegador
    }


    public static void main(String args[]){
        BaseTest test = new BaseTest();
        test.setUp();
    }

}
