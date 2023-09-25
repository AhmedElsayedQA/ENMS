package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import java.time.Duration;

public class BaseTests {
    private WebDriver driver;
    private String baseURL="http://192.168.125.30:8080/#/";
//    private WebDriverWait wait;
    protected LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        driver= new EdgeDriver();
        driver.navigate().to(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        loginPage=new LoginPage(driver);


    }

    public WebDriver getDriver() {
        return driver;
    }
    //    @AfterMethod
//    void tearDown(){
//        driver.quit();
//    }
}
