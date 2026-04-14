package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	 */
	
	@FindBy(xpath="//input[@placeholder='Username']")WebElement userName; //Locating WebElements using PageFactory
	
	@FindBy(xpath="//input[@placeholder='Password']")WebElement pwd;
	
	@FindBy(xpath="//button[text()='Sign In']")WebElement signIn;

	public WebDriver driver; //Making driver global
	
	public LoginPage(WebDriver driver) 
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this); //initElements() - Used to initialise the WebElements
	}

	//All the methods defined in LoginPage Class will be invoked in LoginTest Class
	public void enterUserName(String usernameValue)
	{
		
		userName.sendKeys(usernameValue); 
		//userName - WebElement name given in @FindBy Annotation, Passing the argument as usernameValue - the value is given in the method inside LoginTest.
		
	}
	
	public void enterPassword(String passwordValue)
	{
		
		pwd.sendKeys(passwordValue);
		//pwd - WebElement name given in @FindBy Annotation, Passing the argument as passwordValue - the value is given in the method inside LoginTest.
		
	}
	
	public void clickonSignInButton()
	{
		
		signIn.click();
		
	}
}
