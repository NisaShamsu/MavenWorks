package pageObjects;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.EbayBase;
public class EbayToyPage extends EbayBase
{
	WebDriver driver;
	public EbayToyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
   	@FindBy(xpath="//li[@id='item5e5efbac5b']//div[@class='s-item__title']")
	WebElement ToyId;	
	
	@FindBy(xpath ="//*[@id=\"atcBtn_btn_1\"]/span/span") 
	WebElement btn_AddCart;	

	//window handle
	
	public void windowHandle() throws InterruptedException
	{
		String parentWindow=driver.getWindowHandle();
		
		ToyId.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Set<String> allWindows=driver.getWindowHandles();
		for(String handle:allWindows)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				btn_AddCart.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.close();		    
			}
			driver.switchTo().window(parentWindow);
			Thread.sleep(5000);
		}
	}	
}
