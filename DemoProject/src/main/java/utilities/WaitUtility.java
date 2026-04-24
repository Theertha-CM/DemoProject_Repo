package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	
	/* Wait Utility is used to handle the delay loading of the elements in a webpage. 
	 * Selenium runs faster than the application. Waits ensure the script waits until elements are ready before interacting.
	 * 
	 * Implicit Wait - Given in the Base Class after loading the url. And the wait is applicable to all the elements.
		Applied globally to the driver.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Waits for element to be present in DOM
		Applies to all findElement() calls
		Not condition-based
		
	 * Explicit Wait - Specifically given to where it is required.
	 	Condition Based
	 	
	 * Fluent Wait - Advanced explicit wait with polling and exception handling.
	    Condition Based
	 	Used for Slow loading / unstable elements
	 */
	
	public static final int IMPLICITWAIT = 5;
	
	public static final int EXPLICITWAIT = 10;
	
	public void waitForElementToBeClickable(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForElementToBeSelected(WebDriver driver, WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
//	public void hgf(WebDriver driver, WebElement element)
//	{
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
//		wait.until(ExpectedConditions.element)
//		
//		
//	}

}
