package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
    protected WebDriver driver;
    private By welcomeMessage=By.xpath("//*[@class=\"welcome-text break-word\"]");

    private By usernameField= By.name("username");
    private By passwordField=By.name("password");

    private By loginButton=By.xpath(
            "//button[@class=\"submitForm-btn btn btn-primary\"]" );
    private By showPasswordButton=By.xpath("//*[@class=\"ev ev-eye\"]");
    private By forgetPasswordLink=By.className("evc-default-link");

    private By failMessage=By.xpath("//strong");

    public  LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setUsernameField(String username){
        driver.findElement(usernameField).sendKeys(username);

    }
    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public HomePage clickLoginButton(){
//        Actions acts=new Actions(driver);

       driver.findElement(loginButton).click();
        return new HomePage(driver);
    }
    public String getFailMessage(){
       return driver.findElement(failMessage).getText();
    }
public String welcomeMessage(){
        return driver.findElement(welcomeMessage).getText();

}



}
