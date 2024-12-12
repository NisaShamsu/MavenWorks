package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	  
	@FindBy(xpath="//*[name()='path' and @id='close-path']")
	WebElement pop1_close;	
		
	@FindBy(xpath ="//iframe[@id='iframe-kp']") 
	WebElement frame1;
	
	@FindBy(xpath="/html/body/iframe[5]")
	WebElement frame2;
	//   /html/body/iframe[5]
	
	//*[@id="wishlist-move-cart-0"]
	
	
	@FindBy(xpath="//button[@class='sewp-close']//*[name()='svg']")
	WebElement pop2_close;
	
	@FindBy(id="sewp-engine-popup")
	WebElement wishPop;
	
	
	@FindBy(xpath ="//summary[normalize-space()='New']")
	WebElement lnk_New;
	
	@FindBy(xpath="//a[@class='link-faded'][normalize-space()='Ambara']")
	WebElement Amabara;
	
	@FindBy(xpath="//img[@alt='Light Blue Cotton Floral Panelled A-Line Kurta Set']")
	WebElement product;
	
	//scroll down code till element is visible
	
	@FindBy(xpath="//*[@id=\"product-form-8011907203242-template--16434568396970__main\"]/div/buy-buttons/button")
	WebElement scroll_down;

	@FindBy(xpath="//div[@class='wishlist-engine-button wishlist-button-border']")
	WebElement MoveWishList;
	
	
	@FindBy(xpath="//*[@id=\"shopify-section-sections--16434563743914__header\"]/height-observer/x-header/nav[2]/a[3]/span")
	WebElement icon_WishList;
		
	@FindBy(xpath="//*[@id=\"wishlist-move-cart-0\"]")   
	WebElement btn_MoveToCart;	
	
	
	@FindBy(xpath="//*[@id=\"shopify-section-sections--16434563743914__header\"]/height-observer/x-header/nav[2]/a[2]/svg")
	WebElement cart;
	
	//a[@class='relative']//*[name()='svg']
	
	
	public void popclose() 
	{ 
		driver.switchTo().frame(frame1);  //switch to frame passed frame as web element
		pop1_close.click();	
		driver.switchTo().defaultContent();   //go back to page	   
			
	}
	
	
	public void wishListPop()
	{
		driver.switchTo().frame(5);  //switch to frame passed frame as web element
		//pop2_close.click();
		driver.switchTo().defaultContent(); 
		
	}
	/*
	public void pop2Close()
	{
		driver.switchTo().frame(frame2);
		pop2_close.click();
		 //moveCart() ;
		driver.switchTo().defaultContent();
	}*/
	
	public void mouseHoverNew()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(lnk_New).perform();
	}
	
	public void selectOptions()
    {		
		Amabara.click();
	}
	
	public void selectProduct()
	{
		product.click();
	}
	
	public void scrollDown() throws InterruptedException 
	{	
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		//js.executeScript("arguments[0].scrollIntoView(true);",scroll_down);
		//scroll_down.click();		
		
		//Actions actions = new Actions(driver);
		//actions.moveToElement(scroll_down);
		//actions.perform();
		//Thread.sleep(5000);
		
		
	}
	
	public void scrollUp()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-900)");
	}
	
	public void moveWishList() 
	{
		MoveWishList.click();
	}
	
	public void iconWishList() 
	{
		icon_WishList.click();
	}	
	public void moveCart() 
	{
		btn_MoveToCart.click();
	}
	
	public void popClose()
	{
		pop2_close.click();
	}
	
	public void cart() {
		cart.click();
	}

}
