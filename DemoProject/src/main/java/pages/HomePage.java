package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")WebElement admin; //Locating WebElements using PageFactory

	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logout;
	
	@FindBy(xpath="(//div[@id='sidebar-overlay']//preceding::i[@class='fas fa-arrow-circle-right'])[7]")WebElement manageNewsMoreInfo; 
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) 
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this); //initElements() - Used to initialise the WebElements
	}
	
	
	public ManageNewsPage clickOnManageNewsMoreInfoButton()
	{
	
		//WaitUtility waitutility = new WaitUtility();
		//waitutility.waitForElementToBeClickable(driver, signIn);
		manageNewsMoreInfo.click();
		return new ManageNewsPage(driver);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void clickOnAdmin()
	{
		
		admin.click();
		
	}
	
	public void clickOnLogout()
	{
		
		logout.click();
		
	}
		
}
