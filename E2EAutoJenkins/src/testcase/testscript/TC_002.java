package testcase.testscript;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testcase.MasterFile.Base;
import testcase.pageobject.EuroStarLoginPage;

public class TC_002 extends Base{

	EuroStarLoginPage euroLoginPage;
	Logger logger;

	@BeforeTest
	public void M1() {

		logger = Logger.getLogger("EuroStarTest1");
		PropertyConfigurator.configure("log4j.properties");

		euroLoginPage = PageFactory.initElements(driver, EuroStarLoginPage.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@Test
	public void login() {
		System.out.println("*******************");
		System.out.println("Launching Eurostar Application in Chrome browser");

		euroLoginPage.loginToEuroStarAccount();
		logger.info("Launched Euro Star Application");

	}
	
	@AfterTest
	public void afterTest() {

		driver.close();
		logger.info("Close the browser!!");

	}

}
