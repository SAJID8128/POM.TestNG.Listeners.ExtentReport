package google.Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import google.Base.TestBase;
import google.Pages.BasePage;
import google.Pages.CreateAccountPage;
import google.Pages.SignInPage;

public class CreateAccountTest extends TestBase {
	
	private WebDriver driver;
	private SignInPage signInPage;
	private BasePage basePage;
	private CreateAccountPage createAccountPage;

	@BeforeMethod
	@BeforeClass
	public void setUp() {
		driver = getDriver();
	}

	@Test(priority = 1)
	public void verifyCreateAnAccountPage() {
		System.out.println("Create An Account page test...");
		basePage = new BasePage(driver);
		signInPage = basePage.clickSignInBtn();
		createAccountPage = signInPage.clickonCreateAnAccount();
		Assert.assertTrue(createAccountPage.verifyPageTitle(), "Page title not matching");
		Assert.assertTrue(createAccountPage.verifyCreateAccountPageText(), "Page text not matching");
	}

	@Test(priority = 2)
	public void createAccountExample1() {
		System.out.println("Hey im in example1 test");
	}

	@Test(priority = 3)
	public void createAccountExample2() {
		System.out.println("Hey im in Example2 test");
	}

}
