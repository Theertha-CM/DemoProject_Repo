package testScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.WaitUtility;

public class Base {
		
		//Webdriver is an interface in Selenium which provides different methods to interact with WebPage
		
			public WebDriver driver; //Creating reference variable for the Interface WebDriver
			
			//To implement cross browser Testing, Selenium uses the annotation @Parameters
			@Parameters("browser")
			@BeforeMethod(alwaysRun = true) //To run this method always.
			public void browserInitialisation(String browser) throws Exception
			{
				
				if(browser.equalsIgnoreCase("Chrome"))
				{
					driver = new ChromeDriver();	
				}
				
				else if(browser.equalsIgnoreCase("Firefox"))
				{
					driver = new FirefoxDriver();
				}
				
				else if(browser.equalsIgnoreCase("Edge"))
				{
					driver = new EdgeDriver();
				}
				
				else 
				{
					throw new Exception("Invalid Browser");
				}
				
				System.out.println("Initialising Browser");
				driver.get("https://groceryapp.uniqassosiates.com/admin"); //To launch the url
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITWAIT));
				driver.manage().window().maximize(); //To maximise the window
			}
			
			//@AfterMethod(alwaysRun = true)
			public void browserQuitandClose()
			{
				//driver.close(); //Closes only the parent window.
				driver.quit(); //Closes all the windows which are opened during execution. Useful when we uses multiple windows and tabs.
			}

	

}
