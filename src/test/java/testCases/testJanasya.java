package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class testJanasya extends BaseClass
{
	@Test
	public void testSite() throws InterruptedException 
	{
		HomePage hp=new HomePage(driver);
		hp.popclose();
		hp.mouseHoverNew();
		hp.selectOptions();
		hp.selectProduct();
		hp.scrollDown();
		hp.moveWishList();
		hp.scrollUp();
		hp.iconWishList();
		//hp.moveCart();
		hp.wishListPop();
		//hp.cart();
	}

}
