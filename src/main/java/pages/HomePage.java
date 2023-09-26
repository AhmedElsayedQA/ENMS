package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
   private WebDriver driver;
   private By adminDropdown= By.id("logout") ;
    private By logoutButton=By.xpath("//a[ text()=\" Logout\"]");

    private By addDashboardDropdown=By.id("addDashboard");
    private By addDashboardButton=By.xpath("//a[text()='Dashboard']");

   public  HomePage(WebDriver driver){
       this.driver=driver;
   }
   public boolean isAdminButtonExists(){
        return driver.findElement(adminDropdown).isDisplayed();

   }
   public void clickAdminDropdown(){
       driver.findElement(adminDropdown).click();

   }
   public void clickLogoutButton(){
       driver.findElement(logoutButton).click();
   }


   public void openAddDashboardDropdown(){
       driver.findElement(addDashboardDropdown).click();

   }
   public AddDashboardPage clickAddDashboardButton(){
       driver.findElement(addDashboardButton).click();
       return new AddDashboardPage(driver);
   }
}
