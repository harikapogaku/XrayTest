package com.attestr.pages;

import com.attestr.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckXPage extends TestBase {



    @FindBy(xpath="//*[text()='Bank Account Check']")
    WebElement BankAccount;

    @FindBy(xpath="//h4[text()='IFSC Validation']")
    WebElement IFSCValidation;

    @FindBy(xpath="//h4[text()='UPI Verification']")
    WebElement UPIVerification;

    @FindBy(xpath="//h4[text()='Email Validation']")
    WebElement EmailValidation;

    @FindBy(xpath="//h4[text()='Mobile Validation']")
    WebElement MobileValidation;

    @FindBy(xpath="//h4[text()='PAN Validation']")
    WebElement PanValidation;

    @FindBy(xpath="//h4[text()='GST Verification']")
    WebElement GSTVerification;

    public CheckXPage()
    {
        PageFactory.initElements(driver,this);
    }


    public String verifyTitle()
    {

        return driver.getTitle();
    }

    public BankAccountPage clickOnBankAccount()
    {
        BankAccount.click();
        return new BankAccountPage();

    }


}
