package com.attestr.runners;

import com.attestr.base.TestBase;
import com.attestr.pages.BankAccountPage;
import com.attestr.pages.CheckXPage;
import com.attestr.pages.HomePage;
import com.attestr.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankAccountPageTest extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    CheckXPage checkxPage;
    BankAccountPage bankAccPage;

    public BankAccountPageTest()
    {
        super();

    }

    @BeforeMethod

    public void setup()
    {

        initialization();
        loginpage=new LoginPage();
        homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
        checkxPage=homepage.clickonCheckX();
        bankAccPage=checkxPage.clickOnBankAccount();


    }

    @Test

    public void verifySearch()
    {

        bankAccPage.Search("50100023681821","HDFC0000314");
    }

    @AfterMethod

        public void tearDown()
    {
            driver.quit();
    }


}
