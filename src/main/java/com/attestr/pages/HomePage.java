package com.attestr.pages;

import com.attestr.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage extends TestBase {



    @FindBy(xpath="//div[text()='Attestr CheckX']")
    WebElement Checkx;

    @FindBy(xpath="//div[text()='Attestr Studio']")
    WebElement Studio;

    @FindBy(xpath="//div[text()='Attestr RiskX']")
    WebElement RiskX;

    @FindBy(xpath="//div[text()='Attestr FactX']")
    WebElement FactX;

    @FindBy(xpath="//div[text()='Manage Team']")
    WebElement ManageTeam;

    @FindBy(xpath="//div[text()='Usage Reports']")
    WebElement UsageReports;

    @FindBy(xpath="//div[text()='Purchase Credits']")
    WebElement PurchaseCredits;

    @FindBy(xpath="//span[text()='Payments']")
    WebElement Payments;

    @FindBy(xpath="//span[text()='Tickets']")
    WebElement Tickets;

    @FindBy(xpath="//*[@id=\"txTable\"]/tfoot/tr/td/a")
    WebElement ViewRecharge;

    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }

    public String verifyTitle()
    {
        return driver.getTitle();
    }

    public CheckXPage clickonCheckX()

    {
        //WebDriverWait wait= new WebDriverWait(driver,20);
       // WebDriverWait wait=new WebDriverWait(driver,20);


        Checkx.click();
        return new CheckXPage();
    }



}
