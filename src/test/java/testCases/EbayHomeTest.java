package testCases;
import org.testng.annotations.Test;
import pageObjects.EbayHomePage;
import pageObjects.EbayToyPage;
import testBase.EbayBase;

public class EbayHomeTest extends EbayBase
{
	@Test
	public void testSearch() throws InterruptedException
	{
	EbayHomePage hp=new EbayHomePage(driver);
	hp.searchToy("Toys");
	hp.searchBtnClick();
	EbayToyPage toy=new EbayToyPage(driver);
	toy.windowHandle();
	}
}
	


