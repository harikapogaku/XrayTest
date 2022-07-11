package com.attestr.runners;

import com.attestr.base.TestBase;
import com.attestr.pages.BankAccountPage;
import com.attestr.pages.CheckXPage;
import com.attestr.pages.HomePage;
import com.attestr.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckXPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homepage;
    CheckXPage checkXPage;
    BankAccountPage bankAccPage;


    public CheckXPageTest()
    {
        super();
    }



    @BeforeMethod

    public void setup()
    {
        initialization();
        loginPage=new LoginPage();
        homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
        checkXPage=homepage.clickonCheckX();
    }

   /* @Test
    public void verifyTitle()
    {
       String checkTitle= checkXPage.verifyTitle();
       Assert.assertEquals(checkTitle,"attestr-title","wrong title");
    }*/

    @Test

    public void clickOnBankAccount()
    {
        bankAccPage=checkXPage.clickOnBankAccount();

    }

    @AfterMethod

    public void tearDown()
    {
        driver.quit();
    }






}
