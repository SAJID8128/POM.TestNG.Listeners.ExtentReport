package google.Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.Status;

import google.Base.ExtentTestManager;
import google.Base.TestBase;
import google.Pages.BasePage;

public class BasePageTest extends TestBase {
	
	private WebDriver driver;

	@BeforeMethod
	@BeforeClass
	public void setUp() {
		driver = getDriver();
	}

	@Test(priority = 1)
	public void verifyHomePage() {
		System.out.println("Home page test...");
		BasePage basePage = new BasePage(driver);
		Assert.assertTrue(basePage.verifyBasePageTitle(), "Home page title doesn't match");
	}

	@Test(priority = 2)
	public void baseTest1() {
		ExtentTestManager.getTest().log(Status.INFO, "Hellooo started base test1");
		System.out.println("Hey im in test1 test");
		ExtentTestManager.getTest().log(Status.INFO, "Hey im in base test1 1");
		ExtentTestManager.getTest().log(Status.INFO, "Hey im in base test1 2");
		ExtentTestManager.getTest().log(Status.INFO, "Hey im in base test1 3");
		ExtentTestManager.getTest().log(Status.INFO, "Hey im in base test1 4");
	}

	@Test(priority = 3)
	public void baseTest2() throws InterruptedException {
		ExtentTestManager.getTest().log(Status.INFO, "Hellooo started base test2");
		System.out.println("Hey im in test2 test");
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(Status.INFO, "Hey im in base test2 1");
		ExtentTestManager.getTest().log(Status.INFO, "Hey im in base test2 2");
	}

	@Test(priority = 4)
	public void baseTest3() {
		ExtentTestManager.getTest().log(Status.INFO, "Hellooo started base test3");
		System.out.println("Hey im in test3 test");
		ExtentTestManager.getTest().log(Status.INFO, "Hey im in base test3 1");
		ExtentTestManager.getTest().log(Status.INFO, "Hey im in base test3 2");
	}


}
