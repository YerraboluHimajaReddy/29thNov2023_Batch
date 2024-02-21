package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_Edge {

	public static void main(String[] args) {

		// interface object = new class();
		
		//System.setProperty("webdriver.chrome.driver", "path of the chrome driver here");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.manage().window().maximize();
		
	
	}

}
