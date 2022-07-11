package com.attestr.pages;

import com.attestr.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankAccountPage extends TestBase {


    @FindBy(xpath="//input[@type='text'and @id='acc']")
    WebElement Account;
    @FindBy(xpath="//input[@type='text'and @id='ifsc']")
    WebElement IfscCode;
    @FindBy(xpath="//button[@type='submit']")
    WebElement Search;
    @FindBy(xpath="//button[@type='reset']")
    WebElement Reset;



    public BankAccountPage()
    {
        PageFactory.initElements(driver,this);
    }


    public void Search(String acc,String ifsc)
    {
        Account.sendKeys(acc);
        IfscCode.sendKeys(ifsc);
        Search.click();

    }



}
