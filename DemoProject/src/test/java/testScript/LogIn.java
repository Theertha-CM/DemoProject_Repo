package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogIn extends Base {
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
	 * */
	
	@Test
	public void login1()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwd.sendKeys("admin");
		
		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();
		
	}

	@Test
	public void login2()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwd.sendKeys("admin2");
		
		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();
		
	}
	
	@Test
	public void login3()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("user3");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwd.sendKeys("admin");
		
		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();
		
	}
	
	@Test
	public void login4()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("user4");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwd.sendKeys("admin4");
		
		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();
		
	}
}
