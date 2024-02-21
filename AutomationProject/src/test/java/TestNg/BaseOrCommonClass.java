package TestNg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;


public class BaseOrCommonClass {

	public WebDriver driver;

	public void browserLaunching(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {

			driver = new SafariDriver();
		}
	}

	public void urlLaunching(String URL) {

		driver.get(URL);
	}

	public void maximizeWindow() {

		driver.manage().window().maximize();
	}

	public void browserClosing() {

		driver.quit();
	}

	public void waitingTime() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
	}

//	public void takeScreenshot(String screenShot) throws IOException {
//
//		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(screenshot, new File("C:\\Users\\himaj\\git\\05thOct2023\\AutomationProject\\src\\test\\java\\Screenshots\\"+screenShot+".png"));
//	}
}
