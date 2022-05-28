package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyAgainTab {
	
	@FindBy (xpath = "//a[text()='Buy Again']")
	private WebElement buyAgain;
	@FindBy (xpath = "//input[@id='search-orders-query']")
	private WebElement searchTab ;
	@FindBy (xpath = "//input[@aria-labelledby='a-autoid-0-announce']")
	private WebElement searchOrder ;
	
	public BuyAgainTab(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickBuyAgain()
	{
		buyAgain.click();
	}
	public void sendSearchTab()
	{
		searchTab.sendKeys("RRB NTPC Book for mains");
	}
	public void clickSearchOrder()
	{
		searchOrder.click();
	}

}
