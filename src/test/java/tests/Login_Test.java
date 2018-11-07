package tests;

import constants.Titles;
import constants.UrlOfPages;
import constants.Users;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.Login_Page;
import pages.MyProfile_Page;

public class Login_Test extends BaseTest {
    Login_Page login_page;
    BasePage basePage;
    MyProfile_Page myProfile_page;

    @BeforeMethod
    public void setUp() {
        login_page = new Login_Page(driver);
        basePage = new BasePage(driver);
        myProfile_page = new MyProfile_Page(driver);
    }

    @Test
    public void testCarerLogin(){
        // Open login page
        driver.get(UrlOfPages.loginPage);

        // Check correct url
        String indexPageURL = basePage.getAssertUrl();
        Assert.assertEquals(indexPageURL, UrlOfPages.loginPage);

        // Check title
        String title = basePage.getTitle();
        Assert.assertEquals(title, Titles.login);

        // Login the site
        login_page.login(Users.email,Users.password);
        login_page.submitButtonClick();

        // Check name of logged in user
        String userName = myProfile_page.checkRegisteredName();
        Assert.assertEquals(userName,Users.carerName);
    }
}