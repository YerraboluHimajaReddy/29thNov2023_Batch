package TestNgAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import TestNg.BaseOrCommonClass;

public class Soft_Assertion extends BaseOrCommonClass {

	@BeforeSuite
	public void launchBrowser() {

		browserLaunching("chrome");

		System.out.println("i am in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() {

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

		maximizeWindow();

		System.out.println("i am in @BeforeClass method");

	}

	@BeforeMethod
	public void waitForanApplicaton() {

		waitingTime();

		System.out.println("i am in @Beforemethod method");
	}

	@Test(priority = 1)
	public void enterUsername() {

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		System.out.println("i am in @Test enterUsername method");
	}

	@Test(priority = 2)
	public void enterPassword() {

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

		System.out.println("i am in @Test enterPassword method");
	}

	@Test(priority = 3)
	public void clickLogin() {

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println("i am in @Test clickLogin method");		
		
		SoftAssert sa = new SoftAssert();
		
		String actual = driver.getTitle();
		
		String expected = "LiveTech";
		
		sa.assertEquals(actual, expected, "TestNG Annotation Class");
		
		System.out.println("Both actual and expected are same");
		
		System.out.println("Hi Team");
		
		System.out.println("Good morning");			
	}

	@Test(priority = 4)
	public void verifyAndClickAdminTab() {

		WebElement adminTab = driver.findElement(By.xpath("//span[text()='Admin']"));

		if (adminTab.isDisplayed()) {

			System.out.println("Admin tab is displayed on the HomePage");

			adminTab.click();
		} else {

			System.out.println("Admin tab is not displayed on the HomePage");
		}

		System.out.println("i am in @Test verifyAndClickAdminTab method");
	}
	

	@AfterMethod
	public void waitForanAppn() {

		System.out.println("i am in @aftermethod method");
	}

	@AfterSuite
	public void closeBrowser() {

		browserClosing();

		System.out.println("i am in @afteruite method");
	}

}
