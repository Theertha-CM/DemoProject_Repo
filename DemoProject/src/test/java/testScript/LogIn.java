package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogIn extends Base {
	
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
		userName.sendKeys("admin2");
		
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
		pwd.sendKeys("admin3");
		
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
