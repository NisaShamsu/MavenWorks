package testCases;

import org.testng.annotations.Test;

import pageObjects.EbayToyPage;
import testBase.EbayBase;

public class EbayToyTest extends EbayBase
{
	@Test
	public void toyCart() throws InterruptedException {
		EbayToyPage toy=new EbayToyPage(driver);
		toy.windowHandle();
		
	}

}
