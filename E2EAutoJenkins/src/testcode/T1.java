package testcode;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class T1 {
    public String baseUrl = "https://demo.openmrs.org/openmrs/login.htm";
    String driverPath = "C:\\ChromeDriver.exe";
    public WebDriver driver ; 
     
  @Test
  public void verifyHomepageTitle() {
       
      System.out.println("launching Chrome browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Login";
      String actualTitle = driver.getTitle();
      System.out.println(actualTitle);
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}