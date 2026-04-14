package testScript;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base{
	
	@Test
	public void verifyTheUserIsAbletoLoginWithValidCredentials()
	{
		String usernameValue = "admin";
		String passwordValue = "admin";
		
		LoginPage loginpage = new LoginPage(driver); //Creating an object of LoginPAge Class to call the methods here.
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickonSignInButton();
		
	}
	
	@Test
	public void verifyTheUserIsAbletoLoginWithInvalidCredentials1()
	{
		String usernameValue = "admin";
		String passwordValue = "admin2";
		
		LoginPage loginpage = new LoginPage(driver); //Creating an object of LoginPAge Class to call the methods here.
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickonSignInButton();
		
	}
	
	@Test
	public void verifyTheUserIsAbletoLoginWithInvalidCredentials2()
	{
		String usernameValue = "user3";
		String passwordValue = "admin";
		
		LoginPage loginpage = new LoginPage(driver); //Creating an object of LoginPAge Class to call the methods here.
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickonSignInButton();
		
	}
	
	@Test
	public void verifyTheUserIsAbletoLoginWithInvalidCredentials3()
	{
		String usernameValue = "user4";
		String passwordValue = "admin4";
		
		LoginPage loginpage = new LoginPage(driver); //Creating an object of LoginPAge Class to call the methods here.
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickonSignInButton();
		
	}
	
	

}
