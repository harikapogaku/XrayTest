package com.attestr.pages;

import com.attestr.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {




    @FindBy(xpath="//input[@id='email']")
    WebElement email;
    @FindBy(xpath="//input[@id='password']")
    WebElement password;
    @FindBy(xpath="//button[@type='submit']")
    WebElement login;


    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }



    public String validateTitle()
    {
        return driver.getTitle();
    }

    public HomePage login(String em,String pwd)
    {

        email.sendKeys(em);
        password.sendKeys(pwd);
        login.click();
        return new HomePage();

    }
}
