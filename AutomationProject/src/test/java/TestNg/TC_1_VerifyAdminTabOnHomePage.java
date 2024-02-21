package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC_1_VerifyAdminTabOnHomePage {

	public WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {

		driver = new ChromeDriver();

		System.out.println("i am in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

		driver.manage().window().maximize();

		System.out.println("i am in @BeforeClass method");

	}

	@BeforeMethod
	public void waitForanApplicaton() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));

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
	public void verifyAdminTab() {
		
		WebElement adminTab = driver.findElement(By.xpath("//span[text()='Admin']"));
		
		if(adminTab.isDisplayed()) {
			
			System.out.println("Admin tab is displayed on the HomePage");
		}
		else {
			
			System.out.println("Admin tab is not displayed on the HomePage");
		}
				
		System.out.println("i am in @Test verifyAdminTab method");
	}
	
	@AfterMethod
	public void waitForanAppn() {

		System.out.println("i am in @aftermethod method");
	}

	@AfterSuite
	public void closeBrowser() {

		driver.quit();

		System.out.println("i am in @afteruite method");
	}

}
