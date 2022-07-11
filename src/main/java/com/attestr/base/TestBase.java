package com.attestr.base;

import com.attestr.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class TestBase {

   public static  WebDriver driver ;
   public static Properties prop;

            public TestBase()
            {
             try{

                 prop=new Properties();
                 FileInputStream is=new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/attestr/config/config.properties");
                prop.load(is);

                }

                catch(FileNotFoundException e)
                {
                    e.printStackTrace();



            }
            catch(IOException e)
            {
                e.printStackTrace();
            }




            }

public static void initialization()
{
    String browserName=prop.getProperty("browser");
    if(browserName.equals("chrome"))
    {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Harika\\ChromeDriver\\chromedriver.exe");
      driver =new ChromeDriver();
    }
    else if(browserName.equals("ff"))
    {
        System.setProperty("webdriver.gecko.driver","/Users/hpogaku/geckoDriver/geckodriver");
        driver =new FirefoxDriver();
    }
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.Implicit_wait));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
   // driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
   // driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait,TimeUnit.SECONDS);
    driver.get(prop.getProperty("url"));
}

}
