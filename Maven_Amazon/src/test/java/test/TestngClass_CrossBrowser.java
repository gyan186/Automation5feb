package test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pomPack.BuyAgainTab;
import pomPack.GiftCardTab;
import pomPack.Login;
import pomPack.Registry;

public class TestngClass_CrossBrowser extends BaseClass{
	WebDriver driver ;
	Login login;
	BuyAgainTab buyAgain;
	GiftCardTab giftCard ;
	Registry registry ;
	
	@BeforeTest
	@Parameters("Browsers")  //On the basis of Browser we decide which browser will be going to open
	public void launchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("ChromeBrowser"))
		{
//			If we don't write extends(use inheritance) then we have to write below line.
//			driver = BaseClass.openChromeBrowser(); 
			driver = openChromeBrowser();
		}
		if(browser.equalsIgnoreCase("FirefoxBrowser"))
		{
			driver = openFirefoxBrowser();
		}
		if(browser.equalsIgnoreCase("EdgeBrowser"))
		{
			driver = openEdgeBrowser();
		}
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
	@BeforeClass
	public void objectCreation()
	{
		login = new Login(driver);
		buyAgain = new BuyAgainTab(driver);
		giftCard = new GiftCardTab(driver);
		registry = new Registry(driver);
	}
	@BeforeMethod
	public void loginAmazon() throws InterruptedException
	{
		driver.get("https://www.amazon.com/"); 
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		buyAgain.clickBuyAgain();
		buyAgain.sendSearchTab();
		buyAgain.clickSearchOrder();
	}
	@Test
	public void giftCardTab() throws InterruptedException
	{
		Thread.sleep(3000);
		giftCard.clickGiftCardTab();
		giftCard.clickWedding();
		giftCard.clickGiftBox();
	}
	@Test
	public void registrytab() throws InterruptedException
	{
		Thread.sleep(3000);
		registry.clickRegistry();
		registry.sendRegistrantName();
		registry.clickListofGift();
		registry.clickHolidayGiftList();
		registry.clickSearch();
		registry.clickChristmasList();
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(3000);
		login.moveCursor();
		login.clickOnSignOut();
	}
	@AfterClass()
	public void clearPOMObject()  //set all Object of POM Class as Null
	{
		login = null ;   //It set the references as null. After this there is no reference of login page
		buyAgain = null ;
		giftCard = null ;
		
	}
	@AfterTest()
	public void closeBrowserSetDriverNull()
	{
		driver.close();
		driver = null ;
		System.gc();   //Garbage collector (gc is use to completely erase the memory of object which is set as null)
		               
		
	}


}
