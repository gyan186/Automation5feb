package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseClass {
	
	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		return driver ;
	}
	public static WebDriver openFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Mozila Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver ;
	}
	public static WebDriver openEdgeBrowser()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver ;
	}
	public static WebDriver openOperaBrowser()
	{
		System.setProperty("webdriver.opera.driver", "C:\\Selenium\\Opera Driver\\msedgedriver.exe");
		WebDriver driver = new OperaDriver();
		return driver ;
	}

}
