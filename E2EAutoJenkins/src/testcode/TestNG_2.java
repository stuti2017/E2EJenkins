package testcode;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_2 {
    public String baseUrl = "https://demo.openmrs.org/openmrs/login.htm";
    String driverPath = "C:\\ChromeDriver.exe";
    public WebDriver driver ; 
    

     
     @BeforeTest
      public void launchBrowser() {
          System.out.println("launching Chrome browser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
          driver = new ChromeDriver();
          driver.get(baseUrl);
      }
     
      @Test
      public void verifyHomepageTitle() {
          String expectedTitle = "Login";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
     }
      
      @AfterTest
      public void terminateBrowser(){
          driver.close();
      }
}