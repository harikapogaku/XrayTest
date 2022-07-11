package com.attestr.runners;

import com.attestr.base.TestBase;
import com.attestr.pages.HomePage;
import com.attestr.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginpage;
    HomePage homepage;

    public LoginPageTest()
    {
        super();
    }

    @BeforeMethod

    public void setup()
    {
        initialization();
         loginpage = new LoginPage();

    }

@AfterMethod

    public void tearDown()
{
    driver.quit();
}

@Test(priority = 1)

    public void loginPageTitleTest()
{
   String title= loginpage.validateTitle();
    Assert.assertEquals(title,"SIGNIN - ATTESTR");

}

@Test(priority = 2)
    public void loginTest()
{
    homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
}

}
