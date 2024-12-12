package testCases;

import org.testng.annotations.Test;
import pageObjects.EbayRegisterPage;
import testBase.EbayBase;

public class EbayRegisterTest extends EbayBase
{
	@Test
	public void testRegister()
	{
		EbayRegisterPage register=new EbayRegisterPage(driver);
		register.register();
		register.personalBtnClick();
		register.setFirstName(randomString().toUpperCase());
		register.setLastName(randomString().toUpperCase());   	
		register.setEmail(randomString()+"@gmail.com");  //random generated data by user 	    
		register.setPassword(randomPassword());
		register.createPersonalAccount();
	}

}
