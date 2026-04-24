package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class LoginPage {
	
	/*Page design technique - POM with Page Factory
	 * POM - Page Object Model
	 * Automating pages - Each one by one
	 * Each page will be having a Page Class and a Test Class
	 * Page Class - WebElements and methods interacting with them (Created in src/main/java)
	 * Test Class - Test Cases, Credentials and Validations (Created in src/test/java)
	 * Project Structure (important)
		src
 		├── base
 		│     └── BaseTest.java
 		├── pages
 		│     └── LoginPage.java
 		└── tests
       		└── LoginTest.java
       		
     * We implement Page Object Model using Page Factory where each page is a class containing web elements defined with @FindBy and user actions as methods. 
     * Test classes only call these methods, which improves maintainability, reusability, and readability
	 */
	
	@FindBy(xpath="//input[@placeholder='Username']")WebElement userName; //Locating WebElements using PageFactory
	
	@FindBy(xpath="//input[@placeholder='Password']")WebElement pwd;
	
	@FindBy(xpath="//button[text()='Sign In']")WebElement signIn;
	
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath="//div[contains(@class, 'alert-dismissible')]")WebElement alertmsg;

	public WebDriver driver; //Making driver global
	
	public LoginPage(WebDriver driver) 
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this); //initElements() - Used to initialise the WebElements
	}

	//All the methods defined in LoginPage Class will be invoked in LoginTest Class
	public LoginPage enterUserName(String usernameValue)
	{
		
		userName.sendKeys(usernameValue); 
		//userName - WebElement name given in @FindBy Annotation, Passing the argument as usernameValue - the value is given in the method inside LoginTest.
		return this;
		
	}
	
	public LoginPage enterPassword(String passwordValue)
	{
		
		pwd.sendKeys(passwordValue);
		//pwd - WebElement name given in @FindBy Annotation, Passing the argument as passwordValue - the value is given in the method inside LoginTest.
		return this;
		
	}
	
	public HomePage clickonSignInButton()
	{
	
		//WaitUtility waitutility = new WaitUtility();
		//waitutility.waitForElementToBeClickable(driver, signIn);
		signIn.click();
		return new HomePage(driver);
		
	}
	
	public boolean isHomePageDisplayed() //Method used to validate whether dashboard is displayed.
	{
		
		return dashboard.isDisplayed();
		
	}
	
	public boolean isAlertMsgDisplayed() //Method used to validate whether dashboard is displayed.
	{
		
		return alertmsg.isDisplayed();
		
	}
//	public void dropDown()
//	{
//		PageUtility pageutility = new PageUtility();
//		pageutility.selectByVisibleTextmethod(country, "India"); //For example we have given. We need to give the webElement of dropdown and the visibleText should be given accordingly.
//	}
}
