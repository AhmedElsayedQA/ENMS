package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
   private WebDriver driver;
   private By adminDropdown= By.id("logout") ;
    private By logoutButton=By.xpath("//a[ text()=\" Logout\"]");

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

}
