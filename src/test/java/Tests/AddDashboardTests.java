package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddDashboardPage;
import pages.HomePage;

public class AddDashboardTests extends BaseTests {

    @Test
    public void testValidAddDashboard(){
        driver = getDriver();
        loginPage.setUsernameField("AhmedELsayed");
        loginPage.setPasswordField("12345678");
        homePage=loginPage.clickLoginButton();
        homePage.openAddDashboardDropdown();
        addDashboardPage=homePage.clickAddDashboardButton();
        String actualTitle=addDashboardPage.getPageTitle();
        String expectedTitle="New Dashboard";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        addDashboardPage.setDashboardNameField("Name");
        addDashboardPage.setDashboardDescField("Desc");
        homePage=addDashboardPage.clickSubmit();
        Assert.assertTrue(homePage.isAdminButtonExists());



    }
}
