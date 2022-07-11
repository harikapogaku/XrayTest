package com.attestr.runners;

import com.attestr.base.TestBase;
import com.attestr.pages.CheckXPage;
import com.attestr.pages.HomePage;
import com.attestr.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

LoginPage loginPage;
HomePage homePage;
CheckXPage checkxPage;

public HomePageTest()
{
    super();
}

@BeforeMethod

    public void setup()
{
    initialization();
    loginPage=new LoginPage();
    homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));



}

/*@Test

    public void verifyTitle()
{
    String title=homePage.verifyTitle();
    Assert.assertEquals(title,"hello","title not matched");



}*/

@Test

public void homePageTest()
{

    checkxPage = homePage.clickonCheckX() ;
}



@AfterMethod

    public void tearDown()
{
    driver.quit();
}


}
