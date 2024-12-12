package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.EbayBase;

public class EbayHomePage extends EbayBase
{
	WebDriver driver;
	public EbayHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	@FindBy(xpath="//input[@id='gh-ac']")
	WebElement SearchBar;	
	
	@FindBy(xpath="//input[@id='gh-btn']")
	WebElement btn_Search;
			
	public void searchToy(String toys)
	{
		SearchBar.sendKeys(toys);
		
	}
	public void searchBtnClick() {
		btn_Search.click();
		
	}

}
