package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddDashboardPage {

    private By pageTitle= By.className("title-text");
    private By dashboardNameField=By.name("name");
    private By dashboardDescField=By.name("description");
    private By submitButton=By.cssSelector(".submitForm-btn");
    private By cancelButton=By.cssSelector(".cancelForm-btn");
    private WebDriver driver;
    public AddDashboardPage(WebDriver driver){
        this.driver=driver;
    }

    public String getPageTitle(){
        return driver.findElement(pageTitle).getText();
    }

    public void setDashboardNameField(String dashboardName){
        driver.findElement(dashboardNameField).sendKeys(dashboardName);

    }
    public void setDashboardDescField(String dashboardField){
        driver.findElement(dashboardDescField).sendKeys(dashboardField);
    }
    public HomePage clickSubmit(){
        driver.findElement(submitButton).click();
        return new HomePage(driver);

    }

}
