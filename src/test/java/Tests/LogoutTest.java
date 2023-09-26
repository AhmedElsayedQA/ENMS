package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.logging.Handler;

public class LogoutTest extends BaseTests{

    @Test
    public void testValidLogout(){
        driver = getDriver();
        loginPage.setUsernameField("AhmedElsayed");
        loginPage.setPasswordField("12345678");
        homePage = loginPage.clickLoginButton();
        Assert.assertTrue(homePage.isAdminButtonExists());
        homePage.clickAdminDropdown();
        homePage.clickLogoutButton();
        String actualMessage=loginPage.welcomeMessage();
        String expectedMessage="Welcome to Capacity Monitoring System";
        Assert.assertTrue(actualMessage.contains(expectedMessage));




    }
}
