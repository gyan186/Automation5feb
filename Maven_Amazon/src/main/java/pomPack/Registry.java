package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registry {
	
	@FindBy (xpath = "//a[text()='Registry']")
	private WebElement registry ;
	@FindBy (xpath = "//input[@name='name']")
	private WebElement registrantName ;
	@FindBy (xpath = "//span[@id='a-autoid-0-announce']")
	private WebElement listOfGift ;
	@FindBy (xpath = "//a[@id='dropdown1_4']")
	private WebElement holidayGiftList;
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement search ;
	@FindBy (xpath = "//a[text() = 'Christmas List']")
	private WebElement christmasList ;
	
	public Registry(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickRegistry()
	{
		registry.click();
	}
	public void sendRegistrantName()
	{
		registrantName.sendKeys("Gyan");
	}
	public void clickListofGift()
	{
		listOfGift.click();
	}
	public void clickHolidayGiftList()
	{
		holidayGiftList.click();
	}
	public void clickSearch()
	{
		search.click();
	}
	public void clickChristmasList()
	{
		christmasList.click();
	}

}
