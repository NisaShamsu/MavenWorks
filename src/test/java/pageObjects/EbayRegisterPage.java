package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.EbayBase;

public class EbayRegisterPage extends EbayBase
{
	
	//WebDriver driver;
	public EbayRegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//a[normalize-space()='register']")
	WebElement lnk_Register;
	
	@FindBy(xpath ="//button[@id='personalaccount-radio']")
	WebElement btnPersonal;
	
	@FindBy(xpath ="//input[@id='firstname']")
	WebElement txtFirstname;
		
	@FindBy(xpath ="//input[@id='lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath ="//input[@id='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath ="//input[@id='password']")
	WebElement txtPassword;
			
/*	@FindBy(xpath ="//button[@id='EMAIL_REG_FORM_SUBMIT']")
	WebElement btnCreateAccount;*/
	
	@FindBy(xpath ="//button[normalize-space()='Create personal account'])[1]")
	WebElement btnCreateAccount;
	
	
	public void register()
	{
		lnk_Register.click();
	}
	
	public void personalBtnClick() {
		btnPersonal.click();
	}
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String paswd)
	{
		txtPassword.sendKeys(paswd);
	}
	
	public void createPersonalAccount()
	{
		btnPersonal.click();	
		
		/*
		Actions act=new Actions(driver);
		act.moveToElement(btnCreateAccount).click().perform();
		btnCreateAccount.submit();
		*/
	}
	
}
