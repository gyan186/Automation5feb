package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardTab {
	
	@FindBy (xpath = "//a[text() ='Gift Cards']")
	private WebElement giftCardsTab;
	@FindBy (xpath = "//a[@aria-label='Wedding gift cards']")
	private WebElement wedding ;
	@FindBy (xpath = "//span[text() = 'Gift Box']")
	private WebElement giftBox ;
	
	
	public GiftCardTab(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickGiftCardTab()
	{
		giftCardsTab.click();
	}
	public void clickWedding()
	{
		wedding.click();
	}
	public void clickGiftBox()
	{
		giftBox.click();
	}

}
