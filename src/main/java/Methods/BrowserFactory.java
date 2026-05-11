package Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BrowserFactory {

	public static WebDriver driver;

	public static WebDriver LaunchBrowser(String BrowserName) {
		switch (BrowserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox": 
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break; 

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
			
		

		case "safari":
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
			
		default:
			System.err.println("Invalid broswer name!!!");
			break;
		}
		driver.manage().window().maximize();
		return driver;
	}

}
