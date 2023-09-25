package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTests{


    @Test
    public void testValidLogin(){
        loginPage.setUsernameField("AhmedElsayed");
        loginPage.setPasswordField("12345678");
        HomePage homePage=loginPage.clickLoginButton();

        Assert.assertTrue(homePage.isAdminButtonExists());
    }
@Test
    public void testInvalidUsernameLogin(){
    loginPage.setUsernameField("invalidName");
    loginPage.setPasswordField("12345678");
    loginPage.clickLoginButton();
    String actualMessage=loginPage.getFailMessage();
    String expectedMessage="Login Failed!";

    Assert.assertTrue(actualMessage.contains(expectedMessage));



}
@Test
    public void testInvalidPasswordLogin(){
        loginPage.setUsernameField("AhmedElsayed");
        loginPage.setPasswordField("invalidPassword");
        loginPage.clickLoginButton();
    String actualMessage=loginPage.getFailMessage();
    String expectedMessage="Login Failed!";

    Assert.assertTrue(actualMessage.contains(expectedMessage));


}}
