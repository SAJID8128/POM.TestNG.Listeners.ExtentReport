package google.Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import google.Base.TestBase;
import google.Pages.BasePage;
import google.Pages.SignInPage;

public class SignInPageTest extends TestBase{
	
	private WebDriver driver;
	private SignInPage signInPage;
	private BasePage basePage;

	@BeforeMethod
	@BeforeClass
	public void setUp() {
		//Get driver
		driver = getDriver();
	}
 
	@Test(priority = 1)
	public void verifySignInFunction() {
		System.out.println("Sign In functionality details...");
		basePage = new BasePage(driver);
		signInPage = basePage.clickSignInBtn();
		Assert.assertTrue(signInPage.verifySignInPageTitle(), "Sign In page title doesn't match");
		Assert.assertTrue(signInPage.verifySignInPageText(), "Page text not matching");
		Assert.assertTrue(signInPage.verifySignIn(), "Unable to sign in");
	}

	@Test(priority = 2)
	public void SignInPageTestOne() {
		System.out.println("Hey im in example test One");
	}

	@Test(priority = 3)
	public void SignInPageTestTwo() {
		System.out.println("Hey im in example test two");
	}

	@Test(priority = 4)
	public void SignInPageTestThree() {
		System.out.println("Hey im in example test three");
	}

}
