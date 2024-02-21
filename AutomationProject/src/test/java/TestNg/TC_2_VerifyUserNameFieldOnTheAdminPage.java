package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC_2_VerifyUserNameFieldOnTheAdminPage extends BaseOrCommonClass {

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
	}
	
	@Test(priority = 4)
	public void verifyAndClickAdminTab() {
		
		WebElement adminTab = driver.findElement(By.xpath("//span[text()='Admin']"));
		
		if(adminTab.isDisplayed()) {
			
			System.out.println("Admin tab is displayed on the HomePage");
			
			adminTab.click();
		}
		else {
			
			System.out.println("Admin tab is not displayed on the HomePage");
		}
				
		System.out.println("i am in @Test verifyAndClickAdminTab method");
	}
	
	@Test(priority = 5)
	public void verifyAndEnterTextToTheUserNameTextbox() {
		
		WebElement userName_TextBox = driver.findElement(By.xpath("//div[@class='oxd-input-group__label-wrapper']//following-sibling::div//input[@class='oxd-input oxd-input--active']"));
		
		if(userName_TextBox.isDisplayed()) {
			
			System.out.println("userName_TextBox is displayed on the Admin Page");
			
			userName_TextBox.sendKeys("Livetech");
		}
		else {
			
			System.out.println("userName_TextBox is not displayed on the Admin Page");
		}
				
		System.out.println("i am in @Test verifyAndEnterTextToTheUserNameTextbox method");
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
