package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy (xpath = "//span[text() = 'Account & Lists']")
	private WebElement account;
	@FindBy (xpath = "(//span[text() = 'Sign in'])[1]")
	private WebElement signin;
	@FindBy (xpath = "//input[@name='email']")
	private WebElement phoneNo ;
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement continueButton ;
	@FindBy (xpath = "//input[@name='password']")
	private WebElement password ;
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement signinButton ;
	@FindBy (xpath = "//span[text()='Sign Out']")
	private WebElement signOut;
	
	WebDriver driver ;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}
	public void moveCursor()
	{
		Actions move = new Actions(driver);
		move.moveToElement(account).build().perform();
	}
	public void clickOnSignin()
	{
		signin.click();
	}
	public void sendPhoneno()
	{
		phoneNo.sendKeys("+917667295489");
	}
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	public void sendPassword()
	{
		password.sendKeys("password");
	}
	public void clickSignInButton()
	{
		signinButton.click();
	}
	public void clickOnSignOut()
	{
		signOut.click();
	}

}
