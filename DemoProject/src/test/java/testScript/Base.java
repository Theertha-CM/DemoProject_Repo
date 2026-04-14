package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base {
		
		//Webdriver is an interface in Selenium which provides different methods to interact with WebPage
		
			public WebDriver driver; //Creating reference variable for the Interface WebDriver
			
			@BeforeMethod
			public void browserInitialisation()
			{
				System.out.println("Initialising Browser");
				/*WebDriver*/ driver = new ChromeDriver(); //To initialise the browser to a reference variable of WebDriver Interface. We can choose any browser
				driver.get("https://groceryapp.uniqassosiates.com/admin"); //To launch the url
				driver.manage().window().maximize(); //To maximise the window		
				
			}
			
			//@AfterMethod
			public void browserQuitandClose()
			{
				//driver.close(); //Closes only the parent window.
				driver.quit(); //Closes all the windows which are opened during execution. Useful when we uses multiple windows and tabs.
			}

	

}
