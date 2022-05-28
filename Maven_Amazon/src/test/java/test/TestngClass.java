package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPack.BuyAgainTab;
import pomPack.GiftCardTab;
import pomPack.Login;
import pomPack.Registry;

public class TestngClass {
	
	WebDriver driver ;
	Login login;
	BuyAgainTab buyAgain;
	GiftCardTab giftCard ;
	Registry registry ;
	
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
	@BeforeMethod
	public void loginAmazon()
	{
		driver.get("https://www.amazon.com/"); 
		login = new Login(driver);
		login.moveCursor();
		login.clickOnSignin();
		login.sendPhoneno();
		login.clickOnContinueButton();
		login.sendPassword();
		login.clickSignInButton();
	}
	@Test
	public void buyAgainTab() throws InterruptedException
	{
		buyAgain = new BuyAgainTab(driver);
		Thread.sleep(3000);
		buyAgain.clickBuyAgain();
		buyAgain.sendSearchTab();
		buyAgain.clickSearchOrder();
	}
	@Test
	public void giftCardTab()
	{
		giftCard = new GiftCardTab(driver);
		giftCard.clickGiftCardTab();
		giftCard.clickWedding();
		giftCard.clickGiftBox();
	}
	@Test
	public void registrytab()
	{
		registry = new Registry(driver);
		registry.clickRegistry();
		registry.sendRegistrantName();
		registry.clickListofGift();
		registry.clickHolidayGiftList();
		registry.clickSearch();
		registry.clickChristmasList();
	}
	@AfterMethod
	public void logout()
	{
		login.moveCursor();
		login.clickOnSignOut();
	}
	@AfterClass()
	public void close()
	{
		driver.close();
		System.out.println("Afterclass");
	}

}
