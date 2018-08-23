package testcode;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_1 {
    public String baseUrl = "https://demo.openmrs.org/openmrs/login.htm";
    String driverPath = "C:\\ChromeDriver.exe";
    public WebDriver driver ; 
    

     
     @BeforeTest                            //Jumbled
      public void launchBrowser() {
          System.out.println("launching Chrome browser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
          driver = new ChromeDriver();
          driver.get(baseUrl);
      }
     
      @Test                                //Jumbled
      public void verifyHomepageTitle() {
          String expectedTitle = "Login";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
     }
      
      @AfterTest                            //Jumbled
      public void terminateBrowser(){
          driver.close();
      }
}